package com.bbs.houtai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 管理员对于一级版块，二级版块的一些操作，关闭，打开论坛、审核创建版块的请求等等，查看帖子的评论等
 * @author wjh
 *
 */
@Controller
@RequestMapping("/classboardMan")
public class ClassesAndBoardMan {
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
	

	@RequestMapping("/listClassAndBoard")
	public void listClassAndBoard(){
		//TODO 填写需要的代码
	}
	

	@RequestMapping("/changeNameOfBoard")
	public void changeNameOfBoard(){
		//TODO 填写需要的代码
	}
	

	@RequestMapping("/listDetailByBoardID")
	public void listDetailByBoardID(){
		//TODO 填写需要的代码
	}
	

	@RequestMapping("/addClassesOrBoard")
	public void addClassesOrBoard(){
		//TODO 填写需要的代码
	}
	

	@RequestMapping("/listApplyOfBoard")
	public void listApplyOfBoard(){
		//TODO 填写需要的代码
	}
	

	@RequestMapping("/check")
	public void check(){
		//TODO 填写需要的代码
	}
	

	@RequestMapping("/delClassOrBoardByID")
	public void delClassOrBoardByID(){
		//TODO 填写需要的代码
	}
}
