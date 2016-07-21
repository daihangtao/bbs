package com.bbs.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Classes entity. @author MyEclipse Persistence Tools
 */

public class Classes implements java.io.Serializable {

	// Fields

	private Integer CId;
	private String CName;
	private Timestamp CCreatetime;
	private Integer CState;
	private Set forums = new HashSet(0);
	private Set boards = new HashSet(0);

	// Constructors

	/** default constructor */
	public Classes() {
	}

	/** full constructor */
	public Classes(String CName, Timestamp CCreatetime, Integer CState,
			Set forums, Set boards) {
		this.CName = CName;
		this.CCreatetime = CCreatetime;
		this.CState = CState;
		this.forums = forums;
		this.boards = boards;
	}

	// Property accessors

	public Integer getCId() {
		return this.CId;
	}

	public void setCId(Integer CId) {
		this.CId = CId;
	}

	public String getCName() {
		return this.CName;
	}

	public void setCName(String CName) {
		this.CName = CName;
	}

	public Timestamp getCCreatetime() {
		return this.CCreatetime;
	}

	public void setCCreatetime(Timestamp CCreatetime) {
		this.CCreatetime = CCreatetime;
	}

	public Integer getCState() {
		return this.CState;
	}

	public void setCState(Integer CState) {
		this.CState = CState;
	}

	public Set getForums() {
		return this.forums;
	}

	public void setForums(Set forums) {
		this.forums = forums;
	}

	public Set getBoards() {
		return this.boards;
	}

	public void setBoards(Set boards) {
		this.boards = boards;
	}

}