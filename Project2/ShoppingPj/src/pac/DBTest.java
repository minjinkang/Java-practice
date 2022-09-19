package pac;

import java.sql.*;

public class DBTest {
	
	public static void main(String[] args) {

		java.sql.Connection conn = null;
		
		Statement statement = null;
		
		ResultSet rs = null;
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
			
			String user = "c##cban";
			
			String pwd = "1234";
			
			try {
				conn = DriverManager.getConnection(url, user, pwd);
				
				statement = conn.createStatement(); //쿼리생성
				
				rs = statement.executeQuery("select * from Top");
				
				while(rs.next()) {
					System.out.println(rs.getString(""));
				}
				
			} 
			catch (SQLException e) {
				System.out.println("url 이 이상해요");
				e.printStackTrace();
			}
			
		} 
		catch (ClassNotFoundException e) {
			System.out.println("드라이버를 못찾았어요");
			e.printStackTrace();
		}
		finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (conn != null) {
					conn.close();
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
