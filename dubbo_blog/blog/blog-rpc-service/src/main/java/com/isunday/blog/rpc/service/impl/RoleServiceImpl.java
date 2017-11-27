package com.isunday.blog.rpc.service.impl;

import com.isunday.blog.mapper.UpmsRoleMapper;
import com.isunday.blog.mapper.UpmsUserRoleMapper;
import com.isunday.blog.model.UpmsRole;
import com.isunday.blog.model.UpmsUserRole;
import com.isunday.blog.model.UpmsUserRoleExample;
import com.isunday.blog.rpc.api.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {

    @Autowired
    private UpmsRoleMapper roleMapper;
    @Autowired
    private UpmsUserRoleMapper userRoleMapper;
    /**
     *
     * @param userId
     * @return
     */
    public List<UpmsRole> findRolesBy(int userId) {
        UpmsUserRoleExample example = new UpmsUserRoleExample();
        UpmsUserRoleExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<UpmsUserRole> userRoles = userRoleMapper.selectByExample(example);
        List<UpmsRole> list = new ArrayList<UpmsRole>();

        for (UpmsUserRole i : userRoles ) {
            UpmsRole upmsRole = roleMapper.selectByPrimaryKey(i.getRoleId());
            list.add(upmsRole);
        }

        return list;
    }
}
