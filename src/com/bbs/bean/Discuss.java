package com.bbs.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Discuss entity. @author MyEclipse Persistence Tools
 */

public class Discuss implements java.io.Serializable {

	// Fields

	private Integer DId;
	private Forum forum;
	private Discuss discuss;
	private Integer DMainuserId;
	private String DMainuserName;
	private Integer DSlaveuserId;
	private String DSlaveuserName;
	private String DContent;
	private Timestamp DTime;
	private Integer DWords;
	private Integer DState;
	private Set discusses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Discuss() {
	}

	/** full constructor */
	public Discuss(Forum forum, Discuss discuss, Integer DMainuserId,
			String DMainuserName, Integer DSlaveuserId, String DSlaveuserName,
			String DContent, Timestamp DTime, Integer DWords, Integer DState,
			Set discusses) {
		this.forum = forum;
		this.discuss = discuss;
		this.DMainuserId = DMainuserId;
		this.DMainuserName = DMainuserName;
		this.DSlaveuserId = DSlaveuserId;
		this.DSlaveuserName = DSlaveuserName;
		this.DContent = DContent;
		this.DTime = DTime;
		this.DWords = DWords;
		this.DState = DState;
		this.discusses = discusses;
	}

	// Property accessors

	public Integer getDId() {
		return this.DId;
	}

	public void setDId(Integer DId) {
		this.DId = DId;
	}

	public Forum getForum() {
		return this.forum;
	}

	public void setForum(Forum forum) {
		this.forum = forum;
	}

	public Discuss getDiscuss() {
		return this.discuss;
	}

	public void setDiscuss(Discuss discuss) {
		this.discuss = discuss;
	}

	public Integer getDMainuserId() {
		return this.DMainuserId;
	}

	public void setDMainuserId(Integer DMainuserId) {
		this.DMainuserId = DMainuserId;
	}

	public String getDMainuserName() {
		return this.DMainuserName;
	}

	public void setDMainuserName(String DMainuserName) {
		this.DMainuserName = DMainuserName;
	}

	public Integer getDSlaveuserId() {
		return this.DSlaveuserId;
	}

	public void setDSlaveuserId(Integer DSlaveuserId) {
		this.DSlaveuserId = DSlaveuserId;
	}

	public String getDSlaveuserName() {
		return this.DSlaveuserName;
	}

	public void setDSlaveuserName(String DSlaveuserName) {
		this.DSlaveuserName = DSlaveuserName;
	}

	public String getDContent() {
		return this.DContent;
	}

	public void setDContent(String DContent) {
		this.DContent = DContent;
	}

	public Timestamp getDTime() {
		return this.DTime;
	}

	public void setDTime(Timestamp DTime) {
		this.DTime = DTime;
	}

	public Integer getDWords() {
		return this.DWords;
	}

	public void setDWords(Integer DWords) {
		this.DWords = DWords;
	}

	public Integer getDState() {
		return this.DState;
	}

	public void setDState(Integer DState) {
		this.DState = DState;
	}

	public Set getDiscusses() {
		return this.discusses;
	}

	public void setDiscusses(Set discusses) {
		this.discusses = discusses;
	}

}