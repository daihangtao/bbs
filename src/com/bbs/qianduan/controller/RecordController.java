package com.bbs.qianduan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 用户对于自己的浏览记录的管理，acid
 * @author wjh
 *
 */
@Controller
@RequestMapping("/record")
public class RecordController {
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
	

	@RequestMapping("/listMyBrowserRecord")
	public void listMyBrowserRecord(){
		//TODO 填写需要的代码
	}
	

	@RequestMapping("/delBrowserRecordByID")
	public void delBrowserRecordByID(){
		//TODO 填写需要的代码
	}
	

	@RequestMapping("/cleanBrowserRecord")
	public void cleanBrowserRecord(){
		//TODO 填写需要的代码
	}
}
