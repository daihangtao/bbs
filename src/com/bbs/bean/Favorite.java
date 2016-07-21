package com.bbs.bean;

import java.sql.Timestamp;

/**
 * Favorite entity. @author MyEclipse Persistence Tools
 */

public class Favorite implements java.io.Serializable {

	// Fields

	private Integer faId;
	private Forum forum;
	private UserInfo userInfo;
	private Timestamp faTime;
	private Integer faState;

	// Constructors

	/** default constructor */
	public Favorite() {
	}

	/** full constructor */
	public Favorite(Forum forum, UserInfo userInfo, Timestamp faTime,
			Integer faState) {
		this.forum = forum;
		this.userInfo = userInfo;
		this.faTime = faTime;
		this.faState = faState;
	}

	// Property accessors

	public Integer getFaId() {
		return this.faId;
	}

	public void setFaId(Integer faId) {
		this.faId = faId;
	}

	public Forum getForum() {
		return this.forum;
	}

	public void setForum(Forum forum) {
		this.forum = forum;
	}

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public Timestamp getFaTime() {
		return this.faTime;
	}

	public void setFaTime(Timestamp faTime) {
		this.faTime = faTime;
	}

	public Integer getFaState() {
		return this.faState;
	}

	public void setFaState(Integer faState) {
		this.faState = faState;
	}

}