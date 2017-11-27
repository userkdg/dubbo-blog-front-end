package com.isunday.blog.controller;

import com.baidu.unbiz.fluentvalidator.FluentValidator;
import com.baidu.unbiz.fluentvalidator.Result;
import com.isunday.blog.common.utils.WebUtils;
import com.isunday.blog.common.validator.NotNullValidator;
import com.isunday.blog.model.UpmsUser;
import com.isunday.blog.rpc.api.IUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static com.baidu.unbiz.fluentvalidator.ResultCollectors.toSimple;

@Controller
@RequestMapping("/sso")
public class SSOController {
    private static final Logger _log = LoggerFactory.getLogger(SSOController.class);

    @Autowired
    private IUserService userService;


    @RequestMapping(value = "/login",method = RequestMethod.POST)
    //@ResponseBody
    public String login(HttpServletRequest request
            ,Model model
            ,@RequestParam(name = "username",required = false,defaultValue = "") String username
            ,@RequestParam(name = "password",required = false,defaultValue = "")String password){

        String json = request.getParameter("json");
        String json2 = WebUtils.getStrParam("json");

        //UpmsUser isNull = (UpmsUser) SecurityUtils.getSubject().getSession().getAttribute("umpsuser");
        List<UpmsUser> users = userService.findUsersBy(username);
        Result result = FluentValidator.checkAll()
                .on(username, new NotNullValidator("用户"))
                .on(password, new NotNullValidator("密码"))
                .doValidate()
                .result(toSimple());

        if(!result.isSuccess()) {
            _log.info("用户{}不存在或格式不对,后台用户{}",users);
            return "page/login";
        }
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        try {
            subject.login(token);

            model.addAttribute("upmsUser",users.get(0));
        }catch (AuthenticationException e) {
            e.printStackTrace();
            return "page/login";
        }

        return "page/index";
    }

}
