package day26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectStudent {
	public static void main(String[] args) {
		// MySQL 資料連線設定
		String dbUrl = "jdbc:mysql://localhost:3306/demo?allowPublicKeyRetrieval=true&serverTimezone=Asia/Taipei";
		String username = "root";
		String password = "12345678";
		String driverName = "com.mysql.cj.jdbc.Driver";
		
		// 查詢 student 資料
		String sql = "select id, score1, score2, score3, score4 from student";
		
		try(Connection conn = DriverManager.getConnection(dbUrl, username, password);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql)) {
			
			
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
		
	}
}
