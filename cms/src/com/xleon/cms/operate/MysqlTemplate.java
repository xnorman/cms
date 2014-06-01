package com.xleon.cms.operate;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

public abstract class MysqlTemplate {
	private String dbdriver = null;
	private String dbhost = null;
	private String dbsocket = null;
	private String dbname = null;
	private String dbuser = null;
	private String dbpwd = null;
	private String dburl = null;
	private String sql = null;
	private Object[] args = null;
	
	private Connection conn = null;
	private PreparedStatement pst = null;
	private ResultSet rs = null;
	
	private static Logger log = org.apache.log4j.Logger.getLogger(MysqlTemplate.class.getName());
	
	abstract void insideOperate() throws SQLException;
	
	public void DBOperate() throws SQLException{
		Properties properties = new Properties();
		String config = "/common.properties";
		InputStream is = MysqlTemplate.class.getResourceAsStream(config);
		
		try {
			properties.load(is);
			
			dbdriver = properties.getProperty("jdbc.driver");
			dbhost = properties.getProperty("jdbc.host");
			dbsocket = properties.getProperty("jdbc.socket");
			dbname = properties.getProperty("jdbc.dbname");
			dbuser = properties.getProperty("jdbc.dbuser");
			dbpwd = properties.getProperty("jdbc.dbpwd");
			
		} catch (IOException e) {
			log.error("properties file is not found !");
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				log.error("properties InputStream close error !");
				e.printStackTrace();
			}
		}
		
		dburl = "jdbc:mysql://" + dbhost + ":" + dbsocket + "/" + dbname;
		
		log.debug("dbdriver:"+dbdriver);
		log.debug("dbhost:"+dbhost);
		log.debug("dbsocket:"+dbsocket);
		log.debug("dbname:"+dbname);
		log.debug("dbuser:"+dbuser);
		log.debug("dbpwd:"+dbpwd);
		log.debug("dburl:"+dburl);
		
		try {
			Class.forName(dbdriver);
		} catch (ClassNotFoundException e) {
			log.error("mysql db driver is error !");
			e.printStackTrace();
		}
		
		try {
			conn = DriverManager.getConnection(dburl, dbuser, dbpwd);
			log.debug("db connection is ");
			
			conn.setAutoCommit(false);
			log.debug("auto commit set off !");
			
			pst = conn.prepareStatement(sql);
			log.debug("create PreparedStatement !");
			
			if(args != null){
				for (int i = 0; i < args.length; i++) {
					pst.setObject(i + 1, args[i]);
					log.debug("args["+i+"]:" + args[i]);
				}
			}
			
			this.insideOperate();
			
		} catch (SQLException e) {
			log.error("db operate is error !");
			e.printStackTrace();
			throw e;
		} finally {
			if(rs != null){
				rs.close();
				log.debug("ResultSet is close !");
			}
			
			if(pst != null){
				pst.close();
				log.debug("PreparedStatement is close !");
			}
			
			if(conn != null){
				conn.setAutoCommit(true);
				log.debug("auto commit set on !");
				conn.close();
				log.debug("Connection is close !");
			}
		}
	}

	public ResultSet getRs() {
		return rs;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public void setArgs(Object[] args) {
		this.args = args;
	}
	
//	public static void main(String[] args) throws SQLException {
//		String dbhost = "localhost";
//		String dbsocket = "3306";
//		String dbname = "cms_demo";
//		String dbuser = "xleon";
//		String dbpwd = "123123";
//		
//		Connection conn = null;
//		PreparedStatement pst = null;
//		
//		String url = "jdbc:mysql://" + dbhost + ":" + dbsocket + "/" + dbname;
//		log.debug("url:"+url);
//		log.debug("dbuser:"+dbuser);
//		log.debug("dbpwd:"+dbpwd);
//		
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			
//			conn = DriverManager.getConnection(url, dbuser, dbpwd);
//			log.debug("创建数据库连接");
//			
//			conn.setAutoCommit(false);
//			log.debug("取消自动提交");
//			
//			String sql = "insert into cms_customer(customer_name , customer_sex , customer_email , customer_date , customer_level , customer_flag , customer_pwd ) values (? , ? , ? , ? , ? , ? , ?)";
//			log.debug("sql:"+sql);
//			
//			pst = conn.prepareStatement(sql);
//			log.debug("创建预处理");
//			
//			pst.setString(1, "xleon");
//			pst.setInt(2, 1);;
//			pst.setString(3, "xleon@test.com");
//			pst.setString(4, "2014-05-24 13:26:37");
//			pst.setInt(5, 10000);
//			pst.setInt(6, 0);
//			pst.setString(7, "xleon");
//			
//			pst.executeUpdate();
//			log.debug("执行预处理");
//			
//			conn.commit();
//			log.debug("提交预处理");
//			conn.setAutoCommit(true);
//			log.debug("恢复自动提交");
//			
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//			log.error(e);
//		} catch (SQLException e) {
//			e.printStackTrace();
//			log.error(e);
//			if(conn != null){
//				try {
//					conn.rollback();
//					log.debug("回滚预处理");
//					conn.setAutoCommit(true);
//					log.debug("恢复自动提交");
//				} catch (SQLException e1) {
//					e1.printStackTrace();
//					log.error(e1);
//					throw e1;
//				}
//			}
//			throw e;
//		} finally{
//			if(pst != null){
//				pst.close();
//				log.debug("关闭预处理");
//			}
//			if(conn != null){
//				conn.setAutoCommit(true);
//				log.debug("恢复自动提交");
//				conn.close();
//				log.debug("关闭数据库连接");
//			}
//			
//		}
//	}
}
