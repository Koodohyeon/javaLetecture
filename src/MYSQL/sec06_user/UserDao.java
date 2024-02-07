package MYSQL.sec06_user;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class UserDao {
	private String connStr;
	private String user;
	private String password;
	private Connection conn;
	
	public UserDao() {
		String path = "/Users/gudohyeon/eclipse-workspace/lesson/src/MYSQL/mysql.properties";
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
	
	public User getUserBYUid(String Uid) {
		String sql = "select * from users where uid=?";
		User user = new User();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, Uid);
			
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				user.setUid(rs.getString(1));
				user.setPwd(rs.getString(2));
				user.setUname(rs.getString(3));
//				String modTime = rs.getString(4);	
//				System.out.println(modTime);
//				user.setModTime(LocalDateTime.parse(modTime.replace(" ", "T"))); 
				user.setIsDeleted(rs.getInt(5));
		}
		rs.close(); pstmt.close();
		}  catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	public List<User> getUserList(int num, int offset) {
		String sql = "select * from users where idDeleted=0"
				+ "order by regDate desc limit ? offset ?";
		return null;
	}
	
	public void insertUser(User user) {
		String sql = "insert users values (?, ?, ?, ?, default, default)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUid());
			pstmt.setString(2, user.getPwd());
			
			pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateUser(User user) {
		String sql = "update users set pwd=?, uname=?, email=?  where uid=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUid());
			pstmt.setString(2, user.getPwd());
			pstmt.setString(3, user.getUname());
			
			pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteUser(String uid) {
		String sql = "update users set isDeleted=1 where uid=?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, uid);
			
			pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
