package com.xleon.cms.entity;

import java.util.Date;

public class Content {
//	  字段名 content_id			数据类型 INT				约束 PRIMARY KEY , NOT NULL , AUTO_INCREMENT		备注 内容编号
//	  字段名 content_intro		数据类型 VARCHAR(500)		约束 											备注 内容索引
//	  字段名 content_author		数据类型 INT				约束 											备注 内容作者
//	  字段名 content_date			数据类型 DATETIME			约束 											备注 内容创建时间
//	  字段名 content_tag			数据类型 VARCHAR(100)		约束 											备注 内容标签
//	  字段名 content_text			数据类型 TEXT				约束 											备注 内容
//	  字段名 content_visitcount	数据类型 INT				约束 											备注 内容浏览计数
//	  字段名 content_flag			数据类型 INT				约束 DEFAULT 0 									备注 内容标识，缺省现实为0，隐藏为-1
//	  字段名 content_category		数据类型 INT				约束 											备注 内容所属分类
	
	private int content_id;
	private String content_intro;
	private int content_author;
	private Date content_date;
	private String content_tag;
	private String content_text;
	private int content_visitcount;
	private int content_flag;
	private int content_category;
	
	public int getContent_id() {
		return content_id;
	}
	public void setContent_id(int content_id) {
		this.content_id = content_id;
	}
	public String getContent_intro() {
		return content_intro;
	}
	public void setContent_intro(String content_intro) {
		this.content_intro = content_intro;
	}
	public int getContent_author() {
		return content_author;
	}
	public void setContent_author(int content_author) {
		this.content_author = content_author;
	}
	public Date getContent_date() {
		return content_date;
	}
	public void setContent_date(Date content_date) {
		this.content_date = content_date;
	}
	public String getContent_tag() {
		return content_tag;
	}
	public void setContent_tag(String content_tag) {
		this.content_tag = content_tag;
	}
	public String getContent_text() {
		return content_text;
	}
	public void setContent_text(String content_text) {
		this.content_text = content_text;
	}
	public int getContent_visitcount() {
		return content_visitcount;
	}
	public void setContent_visitcount(int content_visitcount) {
		this.content_visitcount = content_visitcount;
	}
	public int getContent_flag() {
		return content_flag;
	}
	public void setContent_flag(int content_flag) {
		this.content_flag = content_flag;
	}
	public int getContent_category() {
		return content_category;
	}
	public void setContent_category(int content_category) {
		this.content_category = content_category;
	}
	
}
