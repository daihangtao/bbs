package com.bbs.bean;

import java.sql.Timestamp;

/**
 * Notice entity. @author MyEclipse Persistence Tools
 */

public class Notice implements java.io.Serializable {

	// Fields

	private Integer NId;
	private String NTitle;
	private String NContent;
	private Timestamp NAddtime;
	private Timestamp NChangetime;
	private Integer NState;

	// Constructors

	/** default constructor */
	public Notice() {
	}

	/** full constructor */
	public Notice(String NTitle, String NContent, Timestamp NAddtime,
			Timestamp NChangetime, Integer NState) {
		this.NTitle = NTitle;
		this.NContent = NContent;
		this.NAddtime = NAddtime;
		this.NChangetime = NChangetime;
		this.NState = NState;
	}

	// Property accessors

	public Integer getNId() {
		return this.NId;
	}

	public void setNId(Integer NId) {
		this.NId = NId;
	}

	public String getNTitle() {
		return this.NTitle;
	}

	public void setNTitle(String NTitle) {
		this.NTitle = NTitle;
	}

	public String getNContent() {
		return this.NContent;
	}

	public void setNContent(String NContent) {
		this.NContent = NContent;
	}

	public Timestamp getNAddtime() {
		return this.NAddtime;
	}

	public void setNAddtime(Timestamp NAddtime) {
		this.NAddtime = NAddtime;
	}

	public Timestamp getNChangetime() {
		return this.NChangetime;
	}

	public void setNChangetime(Timestamp NChangetime) {
		this.NChangetime = NChangetime;
	}

	public Integer getNState() {
		return this.NState;
	}

	public void setNState(Integer NState) {
		this.NState = NState;
	}

}