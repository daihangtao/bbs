package com.bbs.service.inter;

import com.bbs.bean.UserInfo;

public interface IUserInfoService{

	//用户登录
	UserInfo login(String username, String password);

}
