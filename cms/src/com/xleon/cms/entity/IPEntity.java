package com.xleon.cms.entity;

public class IPEntity {
//	  字段名 ip					数据类型 INT				约束 PRIMARY KEY , NOT NULL						备注 ip十进制格式
//	  字段名 country				数据类型 VARCHAR(45)		约束 											备注 国家名称
//	  字段名 country_id			数据类型 VARCHAR(45)		约束 											备注 国家编号
//	  字段名 area					数据类型 VARCHAR(45)		约束 											备注 省名称
//	  字段名 area_id				数据类型 VARCHAR(45)		约束 											备注 省编号
//	  字段名 region				数据类型 VARCHAR(45)		约束 											备注 地区名称
//	  字段名 region_id			数据类型 VARCHAR(45)		约束 											备注 地区编号
//	  字段名 city					数据类型 VARCHAR(45)		约束 											备注 城市名称
//	  字段名 city_id				数据类型 VARCHAR(45)		约束 											备注 城市编号
//	  字段名 county				数据类型 VARCHAR(45)		约束 											备注 乡镇名称
//	  字段名 county_id			数据类型 VARCHAR(45)		约束 											备注 乡镇编号
//	  字段名 isp					数据类型 VARCHAR(45)		约束 											备注 isp名称
//	  字段名 isp_id				数据类型 VARCHAR(45)		约束 											备注 isp编号
	
	private int ip;
	private String country;
	private String country_id;
	private String area;
	private String area_id;
	private String region;
	private String region_id;
	private String city;
	private String city_id;
	private String county;
	private String county_id;
	private String isp;
	private String isp_id;
	
	public int getIp() {
		return ip;
	}
	public void setIp(int ip) {
		this.ip = ip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCountry_id() {
		return country_id;
	}
	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getArea_id() {
		return area_id;
	}
	public void setArea_id(String area_id) {
		this.area_id = area_id;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getRegion_id() {
		return region_id;
	}
	public void setRegion_id(String region_id) {
		this.region_id = region_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCity_id() {
		return city_id;
	}
	public void setCity_id(String city_id) {
		this.city_id = city_id;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getCounty_id() {
		return county_id;
	}
	public void setCounty_id(String county_id) {
		this.county_id = county_id;
	}
	public String getIsp() {
		return isp;
	}
	public void setIsp(String isp) {
		this.isp = isp;
	}
	public String getIsp_id() {
		return isp_id;
	}
	public void setIsp_id(String isp_id) {
		this.isp_id = isp_id;
	}
	
}
