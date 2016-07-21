package com.bbs.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * UserInfo entity. @author MyEclipse Persistence Tools
 */

public class UserInfo implements java.io.Serializable {

	// Fields

	private Integer UId;
	private Role role;
	private Question question;
	private String UName;
	private String UPwd;
	private String UGender;
	private Timestamp UBirthday;
	private String UPhone;
	private String UEmail;
	private String UAddr;
	private String UFace;
	private String USign;
	private Timestamp UCreatetimes;
	private String UAnswer;
	private Timestamp ULastLogintime;
	private Integer ULevel;
	private Integer UCredit;
	private Timestamp UAddtime;
	private Integer UFlag;
	private String UActiveCode;
	private Integer UState;
	private Set friendsForFriUsermasterid = new HashSet(0);
	private Set attentionsForAUsermasterid = new HashSet(0);
	private Set friendsForFriUserslavesid = new HashSet(0);
	private Set attentionsForAUserslavesid = new HashSet(0);
	private Set favorites = new HashSet(0);
	private Set forums = new HashSet(0);

	// Constructors

	/** default constructor */
	public UserInfo() {
	}

	/** full constructor */
	public UserInfo(Role role, Question question, String UName, String UPwd,
			String UGender, Timestamp UBirthday, String UPhone, String UEmail,
			String UAddr, String UFace, String USign, Timestamp UCreatetimes,
			String UAnswer, Timestamp ULastLogintime, Integer ULevel,
			Integer UCredit, Timestamp UAddtime, Integer UFlag,
			String UActiveCode, Integer UState, Set friendsForFriUsermasterid,
			Set attentionsForAUsermasterid, Set friendsForFriUserslavesid,
			Set attentionsForAUserslavesid, Set favorites, Set forums) {
		this.role = role;
		this.question = question;
		this.UName = UName;
		this.UPwd = UPwd;
		this.UGender = UGender;
		this.UBirthday = UBirthday;
		this.UPhone = UPhone;
		this.UEmail = UEmail;
		this.UAddr = UAddr;
		this.UFace = UFace;
		this.USign = USign;
		this.UCreatetimes = UCreatetimes;
		this.UAnswer = UAnswer;
		this.ULastLogintime = ULastLogintime;
		this.ULevel = ULevel;
		this.UCredit = UCredit;
		this.UAddtime = UAddtime;
		this.UFlag = UFlag;
		this.UActiveCode = UActiveCode;
		this.UState = UState;
		this.friendsForFriUsermasterid = friendsForFriUsermasterid;
		this.attentionsForAUsermasterid = attentionsForAUsermasterid;
		this.friendsForFriUserslavesid = friendsForFriUserslavesid;
		this.attentionsForAUserslavesid = attentionsForAUserslavesid;
		this.favorites = favorites;
		this.forums = forums;
	}

	// Property accessors

	public Integer getUId() {
		return this.UId;
	}

	public void setUId(Integer UId) {
		this.UId = UId;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public String getUName() {
		return this.UName;
	}

	public void setUName(String UName) {
		this.UName = UName;
	}

	public String getUPwd() {
		return this.UPwd;
	}

	public void setUPwd(String UPwd) {
		this.UPwd = UPwd;
	}

	public String getUGender() {
		return this.UGender;
	}

	public void setUGender(String UGender) {
		this.UGender = UGender;
	}

	public Timestamp getUBirthday() {
		return this.UBirthday;
	}

	public void setUBirthday(Timestamp UBirthday) {
		this.UBirthday = UBirthday;
	}

	public String getUPhone() {
		return this.UPhone;
	}

	public void setUPhone(String UPhone) {
		this.UPhone = UPhone;
	}

	public String getUEmail() {
		return this.UEmail;
	}

	public void setUEmail(String UEmail) {
		this.UEmail = UEmail;
	}

	public String getUAddr() {
		return this.UAddr;
	}

	public void setUAddr(String UAddr) {
		this.UAddr = UAddr;
	}

	public String getUFace() {
		return this.UFace;
	}

	public void setUFace(String UFace) {
		this.UFace = UFace;
	}

	public String getUSign() {
		return this.USign;
	}

	public void setUSign(String USign) {
		this.USign = USign;
	}

	public Timestamp getUCreatetimes() {
		return this.UCreatetimes;
	}

	public void setUCreatetimes(Timestamp UCreatetimes) {
		this.UCreatetimes = UCreatetimes;
	}

	public String getUAnswer() {
		return this.UAnswer;
	}

	public void setUAnswer(String UAnswer) {
		this.UAnswer = UAnswer;
	}

	public Timestamp getULastLogintime() {
		return this.ULastLogintime;
	}

	public void setULastLogintime(Timestamp ULastLogintime) {
		this.ULastLogintime = ULastLogintime;
	}

	public Integer getULevel() {
		return this.ULevel;
	}

	public void setULevel(Integer ULevel) {
		this.ULevel = ULevel;
	}

	public Integer getUCredit() {
		return this.UCredit;
	}

	public void setUCredit(Integer UCredit) {
		this.UCredit = UCredit;
	}

	public Timestamp getUAddtime() {
		return this.UAddtime;
	}

	public void setUAddtime(Timestamp UAddtime) {
		this.UAddtime = UAddtime;
	}

	public Integer getUFlag() {
		return this.UFlag;
	}

	public void setUFlag(Integer UFlag) {
		this.UFlag = UFlag;
	}

	public String getUActiveCode() {
		return this.UActiveCode;
	}

	public void setUActiveCode(String UActiveCode) {
		this.UActiveCode = UActiveCode;
	}

	public Integer getUState() {
		return this.UState;
	}

	public void setUState(Integer UState) {
		this.UState = UState;
	}

	public Set getFriendsForFriUsermasterid() {
		return this.friendsForFriUsermasterid;
	}

	public void setFriendsForFriUsermasterid(Set friendsForFriUsermasterid) {
		this.friendsForFriUsermasterid = friendsForFriUsermasterid;
	}

	public Set getAttentionsForAUsermasterid() {
		return this.attentionsForAUsermasterid;
	}

	public void setAttentionsForAUsermasterid(Set attentionsForAUsermasterid) {
		this.attentionsForAUsermasterid = attentionsForAUsermasterid;
	}

	public Set getFriendsForFriUserslavesid() {
		return this.friendsForFriUserslavesid;
	}

	public void setFriendsForFriUserslavesid(Set friendsForFriUserslavesid) {
		this.friendsForFriUserslavesid = friendsForFriUserslavesid;
	}

	public Set getAttentionsForAUserslavesid() {
		return this.attentionsForAUserslavesid;
	}

	public void setAttentionsForAUserslavesid(Set attentionsForAUserslavesid) {
		this.attentionsForAUserslavesid = attentionsForAUserslavesid;
	}

	public Set getFavorites() {
		return this.favorites;
	}

	public void setFavorites(Set favorites) {
		this.favorites = favorites;
	}

	public Set getForums() {
		return this.forums;
	}

	public void setForums(Set forums) {
		this.forums = forums;
	}

}