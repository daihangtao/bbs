package com.bbs.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Forum entity. @author MyEclipse Persistence Tools
 */

public class Forum implements java.io.Serializable {

	// Fields

	private Integer FId;
	private UserInfo userInfo;
	private Topic topic;
	private Classes classes;
	private Board board;
	private String UName;
	private String FTitle;
	private String FContent;
	private Timestamp FCreatetime;
	private Timestamp FLastchangetime;
	private Integer FHits;
	private String FIp;
	private Integer FState;
	private Integer FReplys;
	private Integer FWordsnum;
	private Set records = new HashSet(0);
	private Set discusses = new HashSet(0);
	private Set favorites = new HashSet(0);

	// Constructors

	/** default constructor */
	public Forum() {
	}

	/** full constructor */
	public Forum(UserInfo userInfo, Topic topic, Classes classes, Board board,
			String UName, String FTitle, String FContent,
			Timestamp FCreatetime, Timestamp FLastchangetime, Integer FHits,
			String FIp, Integer FState, Integer FReplys, Integer FWordsnum,
			Set records, Set discusses, Set favorites) {
		this.userInfo = userInfo;
		this.topic = topic;
		this.classes = classes;
		this.board = board;
		this.UName = UName;
		this.FTitle = FTitle;
		this.FContent = FContent;
		this.FCreatetime = FCreatetime;
		this.FLastchangetime = FLastchangetime;
		this.FHits = FHits;
		this.FIp = FIp;
		this.FState = FState;
		this.FReplys = FReplys;
		this.FWordsnum = FWordsnum;
		this.records = records;
		this.discusses = discusses;
		this.favorites = favorites;
	}

	// Property accessors

	public Integer getFId() {
		return this.FId;
	}

	public void setFId(Integer FId) {
		this.FId = FId;
	}

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public Topic getTopic() {
		return this.topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public Classes getClasses() {
		return this.classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	public Board getBoard() {
		return this.board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public String getUName() {
		return this.UName;
	}

	public void setUName(String UName) {
		this.UName = UName;
	}

	public String getFTitle() {
		return this.FTitle;
	}

	public void setFTitle(String FTitle) {
		this.FTitle = FTitle;
	}

	public String getFContent() {
		return this.FContent;
	}

	public void setFContent(String FContent) {
		this.FContent = FContent;
	}

	public Timestamp getFCreatetime() {
		return this.FCreatetime;
	}

	public void setFCreatetime(Timestamp FCreatetime) {
		this.FCreatetime = FCreatetime;
	}

	public Timestamp getFLastchangetime() {
		return this.FLastchangetime;
	}

	public void setFLastchangetime(Timestamp FLastchangetime) {
		this.FLastchangetime = FLastchangetime;
	}

	public Integer getFHits() {
		return this.FHits;
	}

	public void setFHits(Integer FHits) {
		this.FHits = FHits;
	}

	public String getFIp() {
		return this.FIp;
	}

	public void setFIp(String FIp) {
		this.FIp = FIp;
	}

	public Integer getFState() {
		return this.FState;
	}

	public void setFState(Integer FState) {
		this.FState = FState;
	}

	public Integer getFReplys() {
		return this.FReplys;
	}

	public void setFReplys(Integer FReplys) {
		this.FReplys = FReplys;
	}

	public Integer getFWordsnum() {
		return this.FWordsnum;
	}

	public void setFWordsnum(Integer FWordsnum) {
		this.FWordsnum = FWordsnum;
	}

	public Set getRecords() {
		return this.records;
	}

	public void setRecords(Set records) {
		this.records = records;
	}

	public Set getDiscusses() {
		return this.discusses;
	}

	public void setDiscusses(Set discusses) {
		this.discusses = discusses;
	}

	public Set getFavorites() {
		return this.favorites;
	}

	public void setFavorites(Set favorites) {
		this.favorites = favorites;
	}

}