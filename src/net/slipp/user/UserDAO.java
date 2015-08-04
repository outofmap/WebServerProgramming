package net.slipp.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

	public Connection getConnection() {
		String url = "jdbc:mysql://127.0.0.1:3307/slipp";
		String id = "root";
		String pw = "1234";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url,id,pw);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		
	}

	public void addUser(User user) throws SQLException {
		String sql = "insert into USERS values(?,?,?,?)";
		PreparedStatement pstmt = getConnection().prepareStatement(sql);
		pstmt.setString(1, user.getUserId());
		pstmt.setString(2, user.getPassword());
		pstmt.setString(3, user.getName());
		pstmt.setString(4, user.getEmail());
		
		pstmt.executeUpdate();
	}

	public User findByUserId(String userId) throws SQLException {
		String sql = "select * from USERS where userId = ?";
		PreparedStatement pstmt = getConnection().prepareStatement(sql);
		pstmt.setString(1, userId);
		
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			User user = new User(rs.getString("userId"),rs.getString("password"),rs.getString("name"),rs.getString("email"));
			return user;
		}
		return null;
	}

	public void removeUser(String userId) throws SQLException {
		String sql = "delete from USERS where userId = ?";
		PreparedStatement pstmt = getConnection().prepareStatement(sql);
		pstmt.setString(1, userId);
		pstmt.executeUpdate();
	}

}
