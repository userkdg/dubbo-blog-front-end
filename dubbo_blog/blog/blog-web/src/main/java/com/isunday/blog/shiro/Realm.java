package com.isunday.blog.shiro;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.isunday.blog.common.exception.MyException;
import com.isunday.blog.common.utils.MD5Util;
import com.isunday.blog.model.UpmsRole;
import com.isunday.blog.model.UpmsUser;
import com.isunday.blog.rpc.api.IRoleService;
import com.isunday.blog.rpc.api.IUserService;
import org.apache.commons.lang.ObjectUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

import static org.apache.shiro.web.filter.mgt.DefaultFilter.user;

/**
 * 
 * @author kdg
 *
 */
public class Realm extends AuthorizingRealm{

	private static final Logger _log = LoggerFactory.getLogger(Realm.class);

	@Autowired
	private IUserService userService;
	@Autowired
	private IRoleService roleService;
	/**
	 * 权限
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

		String username = (String) principals.getPrimaryPrincipal();

		List<UpmsUser> users = userService.findUsersBy(username);
		_log.info("相同的用户名称{}不止一个！",users);

		if(users.size() >= 1)
			new MyException("相同的用户名称不止一个！");

		List<UpmsRole> roles = roleService.findRolesBy(users.get(0).getUserId());
		Set userRoleSet = new HashSet();
		for (Object role : roles) {
			userRoleSet.add(role);
		}

		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		//用户觉得
		authorizationInfo.setRoles(userRoleSet);
		//用户权限
		authorizationInfo.setStringPermissions(userRoleSet);
		_log.info("用户角色{},用户权限{}",userRoleSet,users);
		return authorizationInfo;
	}

	/**
	 * user身份验证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

		String username = (String) token.getPrincipal();
        String password = new String((char[]) token.getCredentials());
		UpmsUser user = userService.findUsersBy(username).get(0);

        if (null == user) {
            _log.warn("用户账号为空{}",user);
            throw new UnknownAccountException();
        }

//        if (!user.getPassword().equals(MD5Util.MD5(password + user.getSalt()))) {
//            _log.warn("用户{}密码不对",user);
//            throw new IncorrectCredentialsException();
//        }
        if (user.getLocked() == 1) {
            _log.warn("用户{}账号已被锁住",user);
            throw new LockedAccountException();
        }
        _log.info("用户{}通过身份验证",user);
        AuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user, password, username);

        return authenticationInfo;
	}
	

}
