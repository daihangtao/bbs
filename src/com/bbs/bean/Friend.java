package com.bbs.bean;

import java.sql.Timestamp;

/**
 * Friend entity. @author MyEclipse Persistence Tools
 */

public class Friend implements java.io.Serializable {

	// Fields

	private Integer friId;
	private UserInfo userInfoByFriUserslavesid;
	private UserInfo userInfoByFriUsermasterid;
	private String friUsermastername;
	private String friUserslavesname;
	private Timestamp friTime;
	private Integer friState;

	// Constructors

	/** default constructor */
	public Friend() {
	}

	/** full constructor */
	public Friend(UserInfo userInfoByFriUserslavesid,
			UserInfo userInfoByFriUsermasterid, String friUsermastername,
			String friUserslavesname, Timestamp friTime, Integer friState) {
		this.userInfoByFriUserslavesid = userInfoByFriUserslavesid;
		this.userInfoByFriUsermasterid = userInfoByFriUsermasterid;
		this.friUsermastername = friUsermastername;
		this.friUserslavesname = friUserslavesname;
		this.friTime = friTime;
		this.friState = friState;
	}

	// Property accessors

	public Integer getFriId() {
		return this.friId;
	}

	public void setFriId(Integer friId) {
		this.friId = friId;
	}

	public UserInfo getUserInfoByFriUserslavesid() {
		return this.userInfoByFriUserslavesid;
	}

	public void setUserInfoByFriUserslavesid(UserInfo userInfoByFriUserslavesid) {
		this.userInfoByFriUserslavesid = userInfoByFriUserslavesid;
	}

	public UserInfo getUserInfoByFriUsermasterid() {
		return this.userInfoByFriUsermasterid;
	}

	public void setUserInfoByFriUsermasterid(UserInfo userInfoByFriUsermasterid) {
		this.userInfoByFriUsermasterid = userInfoByFriUsermasterid;
	}

	public String getFriUsermastername() {
		return this.friUsermastername;
	}

	public void setFriUsermastername(String friUsermastername) {
		this.friUsermastername = friUsermastername;
	}

	public String getFriUserslavesname() {
		return this.friUserslavesname;
	}

	public void setFriUserslavesname(String friUserslavesname) {
		this.friUserslavesname = friUserslavesname;
	}

	public Timestamp getFriTime() {
		return this.friTime;
	}

	public void setFriTime(Timestamp friTime) {
		this.friTime = friTime;
	}

	public Integer getFriState() {
		return this.friState;
	}

	public void setFriState(Integer friState) {
		this.friState = friState;
	}

}