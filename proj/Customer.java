package proj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Customer {

	public static void main(String[] args) {
		createTable();
		ArrayList<String> list = getCustomers();
		for(String item: list) {
			System.out.println(item);
		}
	}
	
	public static ArrayList<String> getCustomers(){
		try {
			Connection con = getConnection();
			PreparedStatement statement = con.prepareStatement("Select id, pw, name, mail, number FROM customer");
			ResultSet results = statement.executeQuery();
			ArrayList<String> list = new ArrayList<String>();
			while(results.next()	) {
				list.add("id : " + results.getString("id")+
						"pw : " + results.getString("pw") +
						"name : " + results.getString("name")+
						"mail : " + results.getString("mail") +
						"number :" + results.getString("number"));
			}
			System.out.println("데이터를 전부 다 불러왔습니다");
			return list;
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public static void createCustomer(String idlbl, String pwlbl, String namelbl, String maillbl, String numberlbl) {
		try {
			Connection con = getConnection();
			PreparedStatement  insert = con.prepareStatement(""
					+ "INSERT INTO customer"
					+ "(idlbl, pwlbl, namelbl, maillbl, numberlbl"
					+ "VALUE"
					+ "('"+idlbl+"','"+pwlbl+"','"+namelbl+"','"+maillbl+"','"+numberlbl+"')");
			insert.executeUpdate();
		}catch(Exception e) {
			
		}
	}
	public static void createTable() {
		try {
			Connection con = getConnection();
			PreparedStatement create  = con.prepareStatement(
					"CEATAE TABLE IF NOT EXITS"
					+ "customer(id int NOT NULL, AUTO_INCREMENT,"
					+ "id varChar(255),"
					+ "pw varChar(255),"
					+ "name varChar(255),"
					+ "mail varChar(255),"
					+ "number varChar(255),"
					+ "PRIMARY KEY(id)");
			
			create.execute();
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static Connection getConnection() {
		try {
			 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","shop","manager");
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 
			 return con;
			 
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}
