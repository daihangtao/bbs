package com.bbs.qianduan.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bbs.bean.UserInfo;
import com.bbs.service.inter.IUserInfoService;
import com.bbs.utils.MD5keyBean;

/**
 * 用户的一些基本行为，积分，登录，注册，修改密码，忘记密码等等的一些问题
 * @author wjh
 *
 */
@Controller
@RequestMapping("/userinfo")
public class UserInfoController {
	
	/**
	 * 这里是你要用的的service，
	 * 申明的格式如下：
	 * @Autowired
	 *	private IUserInfoService userInfoService;
	 */
	@Autowired
	private IUserInfoService userInfoService;
	
	
	/**
	 * 这一块区域是你的方法，需要什么就写什么，写的时候每个人把自己的名字注释到方法前边
	 */
	
	//修改密码
	@RequestMapping("/changeMyPasswd")
	public void changeMyPasswd(){
		//TODO 填写需要的代码
	}
	
	//找回密码，发送邮件
	@RequestMapping("/findMyPasswd")
	public void findMyPasswd(){
		//TODO 填写需要的代码
	}
	
	//跳转到编辑自己的个人信息
	@RequestMapping("/editMyInfo")
	public String editMyInfo(HttpServletRequest request){
		//TODO 填写需要的代码
		return null;
	}
	
	

	//跳转到登录
	@RequestMapping("/toLogin")
	public ModelAndView toLogin(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("qianduan/login");
		return modelAndView;
	}
	
	//登录
	@RequestMapping("/login")
	public String login(HttpServletRequest request){
		//创建modelAndView
		//ModelAndView modelAndView = new ModelAndView();
		String url=(String) request.getSession().getAttribute("URL");
		//获取登录的类型
		String type = request.getParameter("type");
		//获取登录名和密码
		String username = request.getParameter("username");
		String password = request.getParameter("password"); 
		//密码加密
		password = new MD5keyBean().getkeyBeanofStr(password);
		//后台验证用户信息
		if("0".equals(type)){ //用户登录
			UserInfo user = userInfoService.login(username,password);
			if(user!=null){
				//登录成功，跳转到上一次操作的页面
				request.getSession().setAttribute("user", user);
				request.getSession().setAttribute("state", 0);
				if(url==null){
					url="/userinfo/index";
				}
			}else {
				//登录失败，提醒重新登陆
				url="/userinfo/toLogin";
			}
		}else {  //管理员登录
			UserInfo admin = userInfoService.login(username,password);
			if(admin!=null){
				//登录成功，跳转到上一次操作的页面
				request.getSession().setAttribute("user", admin);
				request.getSession().setAttribute("state", 1);
				if(url==null){
					url="/userinfo/toMyInfo";
				}
			}else {
				//登录失败，提醒重新登陆
				url="/userinfo/toLogin";
			}
		}
		return "forward:"+url;
	}
	
	//登录
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request){
		String url = "/userinfo/toIndex";
		request.getSession().setAttribute("user", null);
		request.getSession().setAttribute("URL", null);
		request.getSession().setAttribute("state", null);
		return "forward:"+url;
	}
	
	//注册
	@RequestMapping("/register")
	public void register(){
		//TODO 填写需要的代码
	}
	
	//跳转到注册
	@RequestMapping("/toRegister")
	public ModelAndView toRegister(){
		//TODO 填写需要的代码
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("qianduan/register");
		return modelAndView;
	}
	
	
	//跳转到首页
	@RequestMapping("/toIndex")
	public ModelAndView toIndex(HttpServletRequest request){
		Integer statepanduan = 1; 
		if(statepanduan == request.getSession().getAttribute("state")){
			request.getSession().setAttribute("user", null);
			request.getSession().setAttribute("URL", null);
			request.getSession().setAttribute("state", null);
		}
		//创建modelAndView对象
		ModelAndView modelAndView = new ModelAndView();
		//获取对象
		//TODO：做一些必要的操作
		//返回modelAndView
		return modelAndView;
	}
}
