package com.bbs.bean;

import java.sql.Timestamp;

/**
 * Attention entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class Attention implements java.io.Serializable {

	// Fields

	private Integer AId;
	private UserInfo userInfoByAUsermasterid;
	private UserInfo userInfoByAUserslavesid;
	private String AUsermastername;
	private String AUserslavesname;
	private Timestamp ATime;
	private Integer AState;

	// Constructors

	/** default constructor */
	public Attention() {
	}

	/** full constructor */
	public Attention(UserInfo userInfoByAUsermasterid,
			UserInfo userInfoByAUserslavesid, String AUsermastername,
			String AUserslavesname, Timestamp ATime, Integer AState) {
		this.userInfoByAUsermasterid = userInfoByAUsermasterid;
		this.userInfoByAUserslavesid = userInfoByAUserslavesid;
		this.AUsermastername = AUsermastername;
		this.AUserslavesname = AUserslavesname;
		this.ATime = ATime;
		this.AState = AState;
	}

	// Property accessors

	public Integer getAId() {
		return this.AId;
	}

	public void setAId(Integer AId) {
		this.AId = AId;
	}

	public UserInfo getUserInfoByAUsermasterid() {
		return this.userInfoByAUsermasterid;
	}

	public void setUserInfoByAUsermasterid(UserInfo userInfoByAUsermasterid) {
		this.userInfoByAUsermasterid = userInfoByAUsermasterid;
	}

	public UserInfo getUserInfoByAUserslavesid() {
		return this.userInfoByAUserslavesid;
	}

	public void setUserInfoByAUserslavesid(UserInfo userInfoByAUserslavesid) {
		this.userInfoByAUserslavesid = userInfoByAUserslavesid;
	}

	public String getAUsermastername() {
		return this.AUsermastername;
	}

	public void setAUsermastername(String AUsermastername) {
		this.AUsermastername = AUsermastername;
	}

	public String getAUserslavesname() {
		return this.AUserslavesname;
	}

	public void setAUserslavesname(String AUserslavesname) {
		this.AUserslavesname = AUserslavesname;
	}

	public Timestamp getATime() {
		return this.ATime;
	}

	public void setATime(Timestamp ATime) {
		this.ATime = ATime;
	}

	public Integer getAState() {
		return this.AState;
	}

	public void setAState(Integer AState) {
		this.AState = AState;
	}

}