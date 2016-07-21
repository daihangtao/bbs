package com.bbs.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Question entity. @author MyEclipse Persistence Tools
 */

public class Question implements java.io.Serializable {

	// Fields

	private Integer QId;
	private String QContent;
	private Set userInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Question() {
	}

	/** full constructor */
	public Question(String QContent, Set userInfos) {
		this.QContent = QContent;
		this.userInfos = userInfos;
	}

	// Property accessors

	public Integer getQId() {
		return this.QId;
	}

	public void setQId(Integer QId) {
		this.QId = QId;
	}

	public String getQContent() {
		return this.QContent;
	}

	public void setQContent(String QContent) {
		this.QContent = QContent;
	}

	public Set getUserInfos() {
		return this.userInfos;
	}

	public void setUserInfos(Set userInfos) {
		this.userInfos = userInfos;
	}

}