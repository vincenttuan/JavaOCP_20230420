package day26;

public class CreateStudentTable {

	public static void main(String[] args) {
		// MySQL 資料連線設定
		String dbUrl = "jdbc:mysql://localhost:3306/demo?useSSL=false&serverTimezone=Asia/Taipei";
		String username = "root";
		String password = "12345678";
		String driverName = "com.mysql.cj.jdbc.Driver";
		
		// 建立 student 資料表的 sql
		String sql = "create table if not exists student ("
				+ "id int not null, "
				+ "score1 int, "
				+ "score2 int, "
				+ "score3 int, "
				+ "score4 int, "
				+ "primary key (id)"
				+ ")";
		
		// 1. 註冊 driver (JDBC 4.0之後可以不用寫)
		Class.forName(driverName);
			
		try() {
			
		}

	}

}
