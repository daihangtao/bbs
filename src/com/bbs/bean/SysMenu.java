package com.bbs.bean;

/**
 * SysMenu entity. @author MyEclipse Persistence Tools
 */

public class SysMenu implements java.io.Serializable {

	// Fields

	private Integer smId;
	private String menuModule;
	private String menuPrivilege;
	private Integer sort;
	private String menuName;
	private String title;
	private String url;
	private String target;
	private String icon;
	private String remark;

	// Constructors

	/** default constructor */
	public SysMenu() {
	}

	/** minimal constructor */
	public SysMenu(String menuModule, String menuPrivilege) {
		this.menuModule = menuModule;
		this.menuPrivilege = menuPrivilege;
	}

	/** full constructor */
	public SysMenu(String menuModule, String menuPrivilege, Integer sort,
			String menuName, String title, String url, String target,
			String icon, String remark) {
		this.menuModule = menuModule;
		this.menuPrivilege = menuPrivilege;
		this.sort = sort;
		this.menuName = menuName;
		this.title = title;
		this.url = url;
		this.target = target;
		this.icon = icon;
		this.remark = remark;
	}

	// Property accessors

	public Integer getSmId() {
		return this.smId;
	}

	public void setSmId(Integer smId) {
		this.smId = smId;
	}

	public String getMenuModule() {
		return this.menuModule;
	}

	public void setMenuModule(String menuModule) {
		this.menuModule = menuModule;
	}

	public String getMenuPrivilege() {
		return this.menuPrivilege;
	}

	public void setMenuPrivilege(String menuPrivilege) {
		this.menuPrivilege = menuPrivilege;
	}

	public Integer getSort() {
		return this.sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getTarget() {
		return this.target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}