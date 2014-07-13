package com.xleon.cms.entity;

import java.io.Serializable;
import java.util.Date;

public class Category implements Serializable {
//	  字段名 category_id			数据类型 INT			约束 PRIMARY KEY , NOT NULL , AUTO_INCREMENT		备注 分类编号
//	  字段名 category_name		数据类型 VARCHAR(100)	约束  											备注 分类名称，不能重复，需要业务检查
//	  字段名 category_flag		数据类型 INT 			约束 DEFAULT 0  									备注 分类标识，缺省显示为0，隐藏为-1
//	  字段名 category_level		数据类型 INT			约束 DEFAULT 0									备注 分类级别0为初级
//	  字段名 category_father_id	数据类型 INT			约束 											备注 父辈分类id
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int category_id ; 
	private String category_name;
	private int category_flag;
	private int category_level;
	private int category_father_id;
	private Date category_date;
	
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public int getCategory_flag() {
		return category_flag;
	}
	public void setCategory_flag(int category_flag) {
		this.category_flag = category_flag;
	}
	public int getCategory_level() {
		return category_level;
	}
	public void setCategory_level(int category_level) {
		this.category_level = category_level;
	}
	public int getCategory_father_id() {
		return category_father_id;
	}
	public void setCategory_father_id(int category_father_id) {
		this.category_father_id = category_father_id;
	}
	public Date getCategory_date() {
		return category_date;
	}
	public void setCategory_date(Date category_date) {
		this.category_date = category_date;
	}
}
