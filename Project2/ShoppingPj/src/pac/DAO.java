package pac;

import java.sql.*;
import java.util.ArrayList;

public class DAO {

	java.sql.Connection conn = null;
	
	Statement statement = null;
	
	ResultSet rsall = null;
	ResultSet rstop = null;
	ResultSet rsbottom = null;
	ResultSet rsouter = null;
	ResultSet rsacc = null;
	
	public DAO() {
		
		String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
		
		String user = "c##cban";
		
		String pwd = "1234";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			try {
				conn = DriverManager.getConnection(url, user, pwd);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void dbClose() {
		try {
			if (rsall != null)
				rsall.close();
			if (rstop != null)
				rstop.close();
			if (rsbottom != null)
				rsbottom.close();
			if (rsouter != null)
				rsouter.close();
			if (rsacc != null)
				rsacc.close();
			if (statement != null)
				statement.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Data> readDataallitem() {
		
		ArrayList<Data> arrall = new ArrayList<Data>();
		
		try {
			statement = conn.createStatement();
			
			rsall = statement.executeQuery("select * from Top");
			
			while(rsall.next()) {
				arrall.add(new Data(rsall.getString(1), rsall.getInt(2), rsall.getString(4)));
			}
			
			rsall = statement.executeQuery("select * from Bottoms");
			
			while(rsall.next()) {
				arrall.add(new Data(rsall.getString(1), rsall.getInt(2), rsall.getString(4)));
			}
			
			rsall = statement.executeQuery("select * from Outer");
			
			while(rsall.next()) {
				arrall.add(new Data(rsall.getString(1), rsall.getInt(2), rsall.getString(4)));
			}
			
			rsall = statement.executeQuery("select * from Acc");
			
			while(rsall.next()) {
				arrall.add(new Data(rsall.getString(1), rsall.getInt(2), rsall.getString(4)));
			}
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			dbClose();
		}
		return arrall;

	}
	
	
	public ArrayList<Data> readDatatop() {
	
		ArrayList<Data> arrtop = new ArrayList<Data>();
		
		try {
			statement = conn.createStatement();
			
			rstop = statement.executeQuery("select * from Top");
			
			while(rstop.next()) {
				arrtop.add(new Data(rstop.getString(1), rstop.getInt(2), rstop.getString(4)));
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			dbClose();
		}
		return arrtop;
	}
	
	
	public ArrayList<Data> readDatabottoms() {
		
		ArrayList<Data> arrbottom = new ArrayList<Data>();
	
		try {
			statement = conn.createStatement();
		
			rsbottom = statement.executeQuery("select * from Bottoms");
		
			while(rsbottom.next()) {
				arrbottom.add(new Data(rsbottom.getString(1), rsbottom.getInt(2), rsbottom.getString(4)));
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			dbClose();
		}
		return arrbottom;

	}	

	public ArrayList<Data> readDataouter() {
	
		ArrayList<Data> arrouter = new ArrayList<Data>();
		
		try {
			statement = conn.createStatement();
		
			rsouter = statement.executeQuery("select * from Outer");
		
			while(rsouter.next()) {
				arrouter.add(new Data(rsouter.getString(1), rsouter.getInt(2), rsouter.getString(4)));
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			dbClose();
		}
		return arrouter;
	}
	
	
	public ArrayList<Data> readDataacc() {
		
		ArrayList<Data> arracc = new ArrayList<Data>();
		
		try {
			statement = conn.createStatement();
		
			rsacc = statement.executeQuery("select * from Acc");
		
			while(rsacc.next()) {
				arracc.add(new Data(rsacc.getString(1), rsacc.getInt(2), rsacc.getString(4)));
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			dbClose();
		}
		return arracc;
	}
}
