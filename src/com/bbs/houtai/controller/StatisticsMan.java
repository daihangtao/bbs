package com.bbs.houtai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 管理员对于一些bbs统计信息的分析，图标模板等等的
 * @author wjh
 *
 */
@Controller
@RequestMapping("/statiticsMan")
public class StatisticsMan {
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
	
	@RequestMapping("/statisticsBoard")
	public void statisticsBoard(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/statisticsForum")
	public void statisticsForum(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/statisticsUsers")
	public void statisticsUsers(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/statisticsThroughput")
	public void statisticsThroughput(){
		//TODO 填写需要的代码
	}
	
	@RequestMapping("/statisticsDiscuss")
	public void statisticsDiscuss(){
		//TODO 填写需要的代码
	}
}
