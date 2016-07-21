package com.bbs.houtai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 管理员对于帖子的一些操作，包括显示不可显示，禁止、审核等等的一些问题
 * @author wjh
 *
 */
@Controller
@RequestMapping("/forumMan")
public class ForumManController {

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
	@RequestMapping("/listForum")
	public void listForum(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/setVisibilityOfForum")
	public void setVisibilityOfForum(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/delForumById")
	public void delForumById(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/cleanAllForumByBoardID")
	public void cleanAllForumByBoardID(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/setBanDiscussOfForum")
	public void setBanDiscussOfForum(){
		//TODO 填写需要的代码
	}
}
