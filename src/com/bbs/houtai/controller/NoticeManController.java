package com.bbs.houtai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 管理员对公告的一些管理
 * @author wjh
 *
 */
@Controller
@RequestMapping("/noticeMan")
public class NoticeManController {
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
	@RequestMapping("/listNoticeInfo")
	public void listNoticeInfo(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/delNoticeInfo")
	public void delNoticeInfo(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/toAddNoticePage")
	public void toAddNoticePage(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/addNoticeInfo")
	public void addNoticeInfo(){
		//TODO 填写需要的代码
	}
}
