package com.bbs.bean;

import java.sql.Timestamp;

/**
 * Record entity. @author MyEclipse Persistence Tools
 */

public class Record implements java.io.Serializable {

	// Fields

	private Integer recordId;
	private Forum forum;
	private Integer recordUsermasterid;
	private String recordUsermastername;
	private Timestamp recordTime;

	// Constructors

	/** default constructor */
	public Record() {
	}

	/** full constructor */
	public Record(Forum forum, Integer recordUsermasterid,
			String recordUsermastername, Timestamp recordTime) {
		this.forum = forum;
		this.recordUsermasterid = recordUsermasterid;
		this.recordUsermastername = recordUsermastername;
		this.recordTime = recordTime;
	}

	// Property accessors

	public Integer getRecordId() {
		return this.recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	public Forum getForum() {
		return this.forum;
	}

	public void setForum(Forum forum) {
		this.forum = forum;
	}

	public Integer getRecordUsermasterid() {
		return this.recordUsermasterid;
	}

	public void setRecordUsermasterid(Integer recordUsermasterid) {
		this.recordUsermasterid = recordUsermasterid;
	}

	public String getRecordUsermastername() {
		return this.recordUsermastername;
	}

	public void setRecordUsermastername(String recordUsermastername) {
		this.recordUsermastername = recordUsermastername;
	}

	public Timestamp getRecordTime() {
		return this.recordTime;
	}

	public void setRecordTime(Timestamp recordTime) {
		this.recordTime = recordTime;
	}

}