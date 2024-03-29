package MYSQL.sec07_bbs.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.Properties;

import MYSQL.sec07_bbs.entity.Reply;

public class ReplyDao {
	private String connStr;
	private String user;
	private String password;
	private Connection conn;
	
	public ReplyDao() {
		String path = "/Users/gudohyeon/eclipse-workspace/lesson/src/MYSQL/sec07_bbs/mysql.properties";
		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream(path));
			
			String host = prop.getProperty("host");
			String port = prop.getProperty("port");
			String database = prop.getProperty("database");
			this.connStr = "jdbc:mysql://" + host + ":" + port + "/" + database;
			this.user = prop.getProperty("user");
			this.password = prop.getProperty("password");
			this.conn = DriverManager.getConnection(connStr, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Reply getReply(int rid) {
		
		return null;
	}
	
	public List<Reply> getReplyList(int bid) {
		
		return null;
	}
	
	public void insertReply(Reply reply) {
		
	}

}