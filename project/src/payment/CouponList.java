package payment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CouponList {
	
	public List<CouponListVO> getCouponList() {
		
		List<CouponListVO> list = new ArrayList<>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "cban", "1111");
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from CouponList order by CouponNo"); 
			
			
			while(rs.next()) {
				String CouponNo = (rs.getString("CouponNo"));
				String CouponName = (rs.getString("CouponName"));
				String CouponLimit = (rs.getString("CouponLimit"));
				String sale = (rs.getString("sale"));
//				System.out.println(CouponNo + "\t" + CouponName + "\t" + CouponLimit);
				
				CouponListVO clVO = new CouponListVO();
				clVO.setCouponNo(CouponNo);
				clVO.setCouponName(CouponName);
				clVO.setCouponLimit(CouponLimit);
				clVO.setSale(sale);
				
				list.add(clVO);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public void deleteCoupon(String CouponNo) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "cban", "1111");
			
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("delete from CouponList where CouponNo ='"+CouponNo+"'");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
