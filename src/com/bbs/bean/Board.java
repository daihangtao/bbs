package com.bbs.bean;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Board entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings("serial")
public class Board implements java.io.Serializable {

	// Fields

	private Integer BId;
	private Classes classes;
	private String BName;
	private Integer BMasterMain;
	private Integer BMasterSlave1;
	private Integer BMasterSlave2;
	private String BImage;
	private Integer BTotalarticle;
	private Integer BTotaluser;
	private Timestamp BLasttime;
	private Integer BState;
	private Integer BForumnum;
	private Set forums = new HashSet(0);

	// Constructors

	/** default constructor */
	public Board() {
	}

	/** full constructor */
	public Board(Classes classes, String BName, Integer BMasterMain,
			Integer BMasterSlave1, Integer BMasterSlave2, String BImage,
			Integer BTotalarticle, Integer BTotaluser, Timestamp BLasttime,
			Integer BState, Integer BForumnum, Set forums) {
		this.classes = classes;
		this.BName = BName;
		this.BMasterMain = BMasterMain;
		this.BMasterSlave1 = BMasterSlave1;
		this.BMasterSlave2 = BMasterSlave2;
		this.BImage = BImage;
		this.BTotalarticle = BTotalarticle;
		this.BTotaluser = BTotaluser;
		this.BLasttime = BLasttime;
		this.BState = BState;
		this.BForumnum = BForumnum;
		this.forums = forums;
	}

	// Property accessors

	public Integer getBId() {
		return this.BId;
	}

	public void setBId(Integer BId) {
		this.BId = BId;
	}

	public Classes getClasses() {
		return this.classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

	public String getBName() {
		return this.BName;
	}

	public void setBName(String BName) {
		this.BName = BName;
	}

	public Integer getBMasterMain() {
		return this.BMasterMain;
	}

	public void setBMasterMain(Integer BMasterMain) {
		this.BMasterMain = BMasterMain;
	}

	public Integer getBMasterSlave1() {
		return this.BMasterSlave1;
	}

	public void setBMasterSlave1(Integer BMasterSlave1) {
		this.BMasterSlave1 = BMasterSlave1;
	}

	public Integer getBMasterSlave2() {
		return this.BMasterSlave2;
	}

	public void setBMasterSlave2(Integer BMasterSlave2) {
		this.BMasterSlave2 = BMasterSlave2;
	}

	public String getBImage() {
		return this.BImage;
	}

	public void setBImage(String BImage) {
		this.BImage = BImage;
	}

	public Integer getBTotalarticle() {
		return this.BTotalarticle;
	}

	public void setBTotalarticle(Integer BTotalarticle) {
		this.BTotalarticle = BTotalarticle;
	}

	public Integer getBTotaluser() {
		return this.BTotaluser;
	}

	public void setBTotaluser(Integer BTotaluser) {
		this.BTotaluser = BTotaluser;
	}

	public Timestamp getBLasttime() {
		return this.BLasttime;
	}

	public void setBLasttime(Timestamp BLasttime) {
		this.BLasttime = BLasttime;
	}

	public Integer getBState() {
		return this.BState;
	}

	public void setBState(Integer BState) {
		this.BState = BState;
	}

	public Integer getBForumnum() {
		return this.BForumnum;
	}

	public void setBForumnum(Integer BForumnum) {
		this.BForumnum = BForumnum;
	}

	public Set getForums() {
		return this.forums;
	}

	public void setForums(Set forums) {
		this.forums = forums;
	}

}