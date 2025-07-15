package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLConnectExample {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/springgroup?serverTimezone=Asia/Seoul";
		String user = "root";
		String password = "1234";

		try {
			// JDBC 드라이버 로드 (MySQL 8.0 이상은 생략 가능)
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 연결 시도
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("MySQL 연결 성공!");

			// 쿼리 실행
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM busan");
			
			while (rs.next()) {
				System.out.println("데이터: " + rs.getString(1)); // 첫 번째 컬럼 값 출력
			}

			// 자원 해제
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println("연결 실패: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
