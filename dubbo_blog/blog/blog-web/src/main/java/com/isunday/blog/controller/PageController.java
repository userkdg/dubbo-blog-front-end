package com.isunday.blog.controller;


import com.isunday.blog.common.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 页面控制类
 */
@Controller
@RequestMapping("/page")
public class PageController extends BaseController {
	
	/**
	 * 跳转page
	 * @return
	 */
	@RequestMapping(value = "/{page}",method = RequestMethod.GET)
	public String showpage(@PathVariable String page) {
		return page;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getByController(Model model) {
		System.out.print("..........登录页面");
		model.addAttribute("id", "ok");
		return "login";
	}
	
}
