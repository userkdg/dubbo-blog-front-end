package com.isunday.blog.controller;

import com.baidu.unbiz.fluentvalidator.FluentValidator;
import com.baidu.unbiz.fluentvalidator.Result;
import com.isunday.blog.common.ajaxResult.AjaxResult;
import com.isunday.blog.common.ajaxResult.ResultCode;
import com.isunday.blog.common.controller.BaseController;
import com.isunday.blog.common.utils.WebUtils;
import com.isunday.blog.common.validator.NotNullValidator;
import com.isunday.blog.model.UpmsUser;
import com.isunday.blog.rpc.api.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static com.baidu.unbiz.fluentvalidator.ResultCollectors.toSimple;
import static org.apache.shiro.web.filter.mgt.DefaultFilter.user;

/**
 * 用户管理类
 *
 */
@Api(description="用户管理控制器")
@Controller
@RequestMapping("/user")
public class UserController1 {

    private static final Logger _log = LoggerFactory.getLogger(UserController1.class);

    @Autowired
    private IUserService userService;

    @RequestMapping("/index")
    public String userIndex(){
        return "/user/create";
    }

    @RequestMapping(value = "/login2", method = RequestMethod.POST)
    @ResponseBody
    public String login2(HttpServletRequest request){

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        UpmsUser isNull = (UpmsUser)SecurityUtils.getSubject().getSession().getAttribute("user");
        List<UpmsUser> users = userService.findUsersBy(username);
        Result result = FluentValidator.checkAll()
                .on(username, new NotNullValidator("用户"))
                .on(password, new NotNullValidator("密码"))
                .doValidate()
                .result(toSimple());

        if(!result.isSuccess()) {
            _log.info("用户{}不存在或格式不对,后台用户{}",users);
            return "/page/login";
        }
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        try {
            subject.login(token);
        }catch (AuthenticationException e) {
            e.printStackTrace();
        }

        return "/blog/index";

    }

    @ApiOperation(value = "新增用户",notes = "新增用户")
    @ResponseBody
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public AjaxResult createUser(UpmsUser user){
        //流式风格Fluent
        Result isSuccess =FluentValidator.checkAll()
                .on(user.getPassword(),new NotNullValidator("密码")).when(user.getLocked() != -1)
                .on(user.getUsername(),new NotNullValidator("用户"))
                .doValidate()
                .result(toSimple());
        if(!isSuccess.isSuccess())
            return new AjaxResult(ResultCode.ParamException,"参数教研失败");
        boolean isSave = userService.save(user);
        if(!isSave){
            return new AjaxResult(ResultCode.DBException,"保存失败");
        }
        return new AjaxResult(ResultCode.SUCCESS,"1");
    }


    @RequestMapping("/logout")
    public String logout(){
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        _log.info("用户{}注销了...",subject.getSession().getAttribute("user"));
        return "page/login";
    }
}
