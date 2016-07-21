package com.bbs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbs.bean.UserInfo;
import com.bbs.dao.inter.IUserInfoDao;
import com.bbs.service.inter.IUserInfoService;
@Service
public class UserInfoServiceImpl implements IUserInfoService {

	/**
	 * 申明你要用到的dao
	 */
	@Autowired
	private IUserInfoDao userInfoDao;
	
	/**
	 * 方法实现
	 */
	
	//用户登录
	@Override
	public UserInfo login(String username, String password) {
		UserInfo user = new UserInfo();
		user.setUName(username);
		user.setUPwd(password);
		return user;
	}


}
