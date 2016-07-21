package com.bbs.qianduan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 用户对于帖子的一些操作，加入收藏夹，发表帖子，禁止评论，删除帖子、组队贴，投票贴等等
 * @author wjh
 *
 */
@Controller
@RequestMapping("/forum")
public class ForumController {
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
	@RequestMapping("/post")
	public void post(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/delForum")
	public void delForum(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/banDiscuss")
	public void banDiscuss(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/cancelBanDiscuss")
	public void cancelBanDiscuss(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/delDiscussByID")
	public void delDiscussByID(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/cleanDiscuss")
	public void cleanDiscuss(){
		//TODO 填写需要的代码
	}
	
}
