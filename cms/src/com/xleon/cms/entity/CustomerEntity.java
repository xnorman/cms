package com.xleon.cms.entity;

import java.util.Date;

public class CustomerEntity {
//	  字段名 customer_id			数据类型 INT				约束 PRIMARY KEY , NOT NULL , AUTO_INCREMENT		备注 用户编号
//	  字段名 customer_name		数据类型 VARCHAR(100)		约束 NOT NULL									备注 用户账号
//	  字段名 customer_sex			数据类型 INT				约束 											备注 用户性别，0为女，1为男，2为保密
//	  字段名 customer_email		数据类型 VARCHAR(200)		约束 NOT NULL									备注 用户email
//	  字段名 customer_date		数据类型 DATETIME			约束 											备注 用户注册时间
//	  字段名 customer_level		数据类型 INT				约束 DEFAULT 1									备注 用户级别，0为待审批用户，1为正常，10000为管理人员
//	  字段名 customer_flag		数据类型 INT				约束 DEFAULT 0									备注 用户标识，缺省正常0，屏蔽为-1
//	  字段名 customer_pwd			数据类型 VARCHAR(100)		约束 NOT NULL									备注 用户密码
	
	private int customer_id;
	private String customer_name;
	private int customer_sex;
	private String customer_email;
	private Date customer_date;
	private int customer_level;
	private int customer_flag;
	private String customer_pwd;
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public int getCustomer_sex() {
		return customer_sex;
	}
	public void setCustomer_sex(int customer_sex) {
		this.customer_sex = customer_sex;
	}
	public String getCustomer_email() {
		return customer_email;
	}
	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}
	public Date getCustomer_date() {
		return customer_date;
	}
	public void setCustomer_date(Date customer_date) {
		this.customer_date = customer_date;
	}
	public int getCustomer_level() {
		return customer_level;
	}
	public void setCustomer_level(int customer_level) {
		this.customer_level = customer_level;
	}
	public int getCustomer_flag() {
		return customer_flag;
	}
	public void setCustomer_flag(int customer_flag) {
		this.customer_flag = customer_flag;
	}
	public String getCustomer_pwd() {
		return customer_pwd;
	}
	public void setCustomer_pwd(String customer_pwd) {
		this.customer_pwd = customer_pwd;
	}
	
}
