package day26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStudentTable {

	public static void main(String[] args) throws ClassNotFoundException {
		// MySQL 資料連線設定
		String dbUrl = "jdbc:mysql://localhost:3306/demo?allowPublicKeyRetrieval=true&serverTimezone=Asia/Taipei";
		String username = "root";
		String password = "12345678";
		String driverName = "com.mysql.cj.jdbc.Driver";
		
		// 建立 student 資料表的 sql
		String sql = "create table if not exists student ("
				+ "id int not null AUTO_INCREMENT, "
				+ "score1 int, "
				+ "score2 int, "
				+ "score3 int, "
				+ "score4 int, "
				+ "primary key (id)"
				+ ")";
		
		// 1. 註冊 driver (JDBC 4.0之後可以不用寫)
		Class.forName(driverName);
		
		
		try(Connection conn = DriverManager.getConnection(dbUrl, username, password);
			Statement stmt = conn.createStatement();) {
			// 執行一個新增資料表的 sql, 使用 executeUpdate
			int result = stmt.executeUpdate(sql);
			System.out.println("result = " + result);
			System.out.println("Student 資料表新增成功");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
