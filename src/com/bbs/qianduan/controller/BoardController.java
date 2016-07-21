package com.bbs.qianduan.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 用户对于二级版块的管理，包括创建版块，招版主，以及对于自己版块里边的帖子的管理，版面内帖子的置顶。取消，显示，不可显示等等
 * @author lenovo
 *
 */
@Controller
@RequestMapping("/board")
public class BoardController {
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
	
	@RequestMapping("/createBoard")
	public String createBoard(HttpServletRequest request){
		String url = "";
		return "forward:"+url;
	}
	
	@RequestMapping("/delBoard")
	public void delBoard(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/postForumOfMaster")
	public void postForumOfMaster(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/selectMaster")
	public void selectMaster(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/revocationPriority")
	public void revocationPriority(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/lookForumOfBoard")
	public void lookForumOfBoard(){
		//TODO 填写需要的代码
	}
	
	
	@RequestMapping("/stick")
	public void stick(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/cancelStick")
	public void cancelStick(){
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
	@RequestMapping("/listUsersOfAttention")
	public void listUsersOfAttention(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/listUsersOfPost")
	public void listUsersOfPost(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/shutHouse")
	public void shutHouse(){
		//TODO 填写需要的代码
	}
}
