package com.xleon.cms.entity;

import java.util.Date;

public class Visit {
//	  字段名 visit_id				数据类型 INT				约束 PRIMARY KEY , NOT NULL , AUTO_INCREMENT		备注 访问编号
//	  字段名 visit_date			数据类型 DATETIME			约束 											备注 访问时间
//	  字段名 visit_ip				数据类型 VARCHAR(20)		约束 											备注 访问ip
//	  字段名 visit_browser		数据类型 VARCHAR(45)		约束 											备注 访问浏览器
//	  字段名 visit_os				数据类型 VARCHAR(45)		约束 											备注 访问系统
//	  字段名 visit_flag			数据类型 INT				约束 DEFAULT 0									备注 访问标识，缺省普通为0
//	  字段名 visit_content		数据类型 VARCHAR(200)		约束 											备注 访问信息
//	  字段名 visit_url			数据类型 VARCHAR(200)		约束 											备注 访问url
//	  字段名 visit_user			数据类型 INT				约束 											备注 访问用户
	
	private int visit_id;
	private Date visit_date;
	private String visit_ip;
	private String visit_browser;
	private String visit_os;
	private int visit_flag;
	private String visit_content;
	private String visit_url;
	private int visit_user;
	
	public int getVisit_id() {
		return visit_id;
	}
	public void setVisit_id(int visit_id) {
		this.visit_id = visit_id;
	}
	public Date getVisit_date() {
		return visit_date;
	}
	public void setVisit_date(Date visit_date) {
		this.visit_date = visit_date;
	}
	public String getVisit_ip() {
		return visit_ip;
	}
	public void setVisit_ip(String visit_ip) {
		this.visit_ip = visit_ip;
	}
	public String getVisit_browser() {
		return visit_browser;
	}
	public void setVisit_browser(String visit_browser) {
		this.visit_browser = visit_browser;
	}
	public String getVisit_os() {
		return visit_os;
	}
	public void setVisit_os(String visit_os) {
		this.visit_os = visit_os;
	}
	public int getVisit_flag() {
		return visit_flag;
	}
	public void setVisit_flag(int visit_flag) {
		this.visit_flag = visit_flag;
	}
	public String getVisit_content() {
		return visit_content;
	}
	public void setVisit_content(String visit_content) {
		this.visit_content = visit_content;
	}
	public String getVisit_url() {
		return visit_url;
	}
	public void setVisit_url(String visit_url) {
		this.visit_url = visit_url;
	}
	public int getVisit_user() {
		return visit_user;
	}
	public void setVisit_user(int visit_user) {
		this.visit_user = visit_user;
	}
	
}
