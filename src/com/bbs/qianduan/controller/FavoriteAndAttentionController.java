package com.bbs.qianduan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 这是关于用户收藏bbs以及关注好友的一些操作
 * @author wjh
 *
 */

@Controller
@RequestMapping("/favoAtten")
public class FavoriteAndAttentionController {

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
	@RequestMapping("/addForumToFavorite")
	public void addForumToFavorite(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/cancelFavoriteByID")
	public void cancelFavoriteByID(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/listMyFavorites")
	public void listMyFavorites(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/attentionUser")
	public void attentionUser(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/cancelAttentionUser")
	public void cancelAttentionUser(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/listAttentionMe")
	public void listAttentionMe(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/listMyAttention")
	public void listMyAttention(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/sendPrivateInfo")
	public void sendPrivateInfo(){
		//TODO 填写需要的代码
	}
	
	
}
