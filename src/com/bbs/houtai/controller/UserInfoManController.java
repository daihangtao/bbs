package com.bbs.houtai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 管理员对于用户的一些管理，包括权限等的管理
 * @author wjh
 *
 */
@Controller
@RequestMapping("/userinfoMan")
public class UserInfoManController {
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
	
	@RequestMapping("/listUserInfo")
	public void listUserInfo(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/listUserInfoByID")
	public void listUserInfoByID(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/addUserInfo")
	public void addUserInfo(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/editUserInfo")
	public void editUserInfo(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/delUserInfo")
	public void delUserInfo(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/priorityUserInfo")
	public void priorityUserInfo(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/resetPwd")
	public void resetPwd(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/saveUserInfo")
	public void saveUserInfo(){
		//TODO 填写需要的代码
	}
	
}
