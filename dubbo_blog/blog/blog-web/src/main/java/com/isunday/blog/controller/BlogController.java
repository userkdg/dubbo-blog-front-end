package com.isunday.blog.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.baidu.unbiz.fluentvalidator.ComplexResult;
import com.baidu.unbiz.fluentvalidator.FluentValidator;
import com.baidu.unbiz.fluentvalidator.ResultCollectors;
import com.isunday.blog.common.ajaxResult.AjaxResult;
import com.isunday.blog.common.ajaxResult.ResultCode;
import com.isunday.blog.common.base.BaseResult;
import com.isunday.blog.common.controller.BaseController;
import com.isunday.blog.common.exception.MyException;
import com.isunday.blog.common.utils.StringUtil;
import com.isunday.blog.common.validator.LengthValidator;
import com.isunday.blog.common.validator.NotNullValidator;
import com.isunday.blog.model.CmsArticle;
import com.isunday.blog.model.UpmsUser;
import com.isunday.blog.rpc.api.IBlogService;
import com.isunday.blog.rpc.api.IUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 *文章管理类
 * 
 * @Description:
 */
@Controller
@RequestMapping("/blog")
public class BlogController extends BaseController {
	private static final Logger _log = LoggerFactory.getLogger(BlogController.class);

  	@Autowired
    private IBlogService blogService;
    @Autowired
    private IUserService userService;

    @RequestMapping("/index")
	public String blogIndex(){
    	System.out.println("......进入博客首页");
    	return "blog/index";
	}
    /**
     * 写博客
     * @param blog
     * @param request
     * @return
     */
    @ResponseBody
	@RequestMapping(value="/writeBlog",method=RequestMethod.POST)
	public Object createBlog(@RequestBody CmsArticle blog, HttpServletRequest request){
		//Integer userId=getNotNullUserId(request);
		//流式风格（Fluent Interface）
		ComplexResult result = FluentValidator.checkAll()
				.on(blog.getTitle(), new LengthValidator(1, 20, "标题"))
				.on(blog.getAuthor(), new NotNullValidator("作者"))
				.on(blog.getContent(), new NotNullValidator("内容"))
				.on(blog.getContent(), new LengthValidator(10,10000,"内容长度"))
				.doValidate()
				.result(ResultCollectors.toComplex());

		if(!result.isSuccess()){
			return new AjaxResult(ResultCode.InfoException,"文章内容不全");
		}
		if(StringUtil.isEmpty(blog.getTitle())||StringUtil.isEmpty(blog.getDescription())||StringUtil.isEmpty(blog.getContent())){
			throw new MyException("信息不全");
		}
		blogService.createBlog(blog);

		return new AjaxResult(ResultCode.SUCCESS,"1");
	}
	/**
	 * 该博客
	 * @param blog
	 * @param request
	 * @return
	 */
    @ResponseBody
	@RequestMapping(value="/updateBlog",method=RequestMethod.POST)
	public AjaxResult updateBlog(@RequestBody CmsArticle blog,HttpServletRequest request){
		if(StringUtil.isEmpty(blog.getTitle())||StringUtil.isEmpty(blog.getDescription())||StringUtil.isEmpty(blog.getContent())){
			throw new MyException("信息不全");
		}
		boolean	 isUpdate = blogService.updateBlog(blog);
		if(isUpdate)
			return new AjaxResult(ResultCode.SUCCESS,"1");
		return new AjaxResult(ResultCode.DBException);
	}
	/**
	 * 删除博客
	 * @param blogId
	 * @return
	 */
    @ResponseBody
	@RequestMapping(value="/deleteBlog",method=RequestMethod.POST)
	public AjaxResult deleteBlog(Integer blogId){
		boolean	isDel = blogService.deleteBlog(blogId);
		if (isDel)
			return new AjaxResult(ResultCode.SUCCESS);
		return new AjaxResult(ResultCode.DBException);
	}
	/**
	 * 获取博客列表
	 * @param
	 * @return
	 */
	@RequestMapping(value="/getBlogList/{start}/{end}",method=RequestMethod.POST)
	public AjaxResult getBlogList(@PathVariable(value = "start")int start, @PathVariable(value = "end") int end){
		UpmsUser currentUser = (UpmsUser)SecurityUtils.getSubject().getSession().getAttribute("currentUser");
		if(currentUser == null)
			return new AjaxResult(ResultCode.InfoException);
		List<CmsArticle> blogDetailsList = blogService.getBlogList(currentUser.getUserId(),start,end);
		return new AjaxResult(ResultCode.SUCCESS,blogDetailsList);
	}
	/**
	 * 获取博客列表2
	 * @param
	 * @return
	 */
	@RequestMapping(value="/getBlogList",method=RequestMethod.POST)
	public AjaxResult getBlogLis2(
            @RequestParam(required = false, defaultValue = "1", value = "page") int page){
	    int rows = 10;
		UpmsUser currentUser = (UpmsUser)SecurityUtils.getSubject().getSession().getAttribute("upmsuser");
		if(currentUser == null)
			return new AjaxResult(ResultCode.InfoException);
		List<CmsArticle> blogDetailsList = blogService.getBlogList2(currentUser.getUserId(),(page-1)*rows,rows);
		return new AjaxResult(ResultCode.SUCCESS,blogDetailsList);
	}
}

