package com.bbs.qianduan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 这是惯例评论的一些操作，包括回复，盖楼时的一些信息,注意积分的变化
 * @author wjh
 *
 */
@Controller
@RequestMapping("/discuss")
public class DiscussController {
	/**
	 * 这是需要的service
	 */
	
	
	
	
	/**
	 * 这是你要写的方法
	 * 有两种形式：
	 * 	1	@RequestMapping("/register")
			public void register(){
				//TODO 填写需要的代码
			}
		2  @RequestMapping("/logout")
			public String logout(HttpServletRequest request){
				String url = "";
				return "forward:"+url;
			}
	 */
	
	@RequestMapping("/publishDiscuss")
	public void publishDiscuss(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/listMyDiscuss")
	public void listMyDiscuss(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/delMyDiscussById")
	public void delMyDiscussById(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/listDiscussToMe")
	public void listDiscussToMe(){
		//TODO 填写需要的代码
	}
}
