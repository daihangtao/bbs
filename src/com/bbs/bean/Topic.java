package com.bbs.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Topic entity. @author MyEclipse Persistence Tools
 */

public class Topic implements java.io.Serializable {

	// Fields

	private Integer TId;
	private String TName;
	private Integer TState;
	private Set forums = new HashSet(0);

	// Constructors

	/** default constructor */
	public Topic() {
	}

	/** full constructor */
	public Topic(String TName, Integer TState, Set forums) {
		this.TName = TName;
		this.TState = TState;
		this.forums = forums;
	}

	// Property accessors

	public Integer getTId() {
		return this.TId;
	}

	public void setTId(Integer TId) {
		this.TId = TId;
	}

	public String getTName() {
		return this.TName;
	}

	public void setTName(String TName) {
		this.TName = TName;
	}

	public Integer getTState() {
		return this.TState;
	}

	public void setTState(Integer TState) {
		this.TState = TState;
	}

	public Set getForums() {
		return this.forums;
	}

	public void setForums(Set forums) {
		this.forums = forums;
	}

}