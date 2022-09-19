package payment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Coupon extends JFrame implements ActionListener, ItemListener{
	
	public Vector v;
	public Vector cols;
	public DefaultTableModel model;
	public JPanel panel1;
	public JPanel panel2;
	public JButton btncouponapply;
	public CouponList cl;
	public JTable table;
	public CouponListVO vo;
	private CouponList couponlist = new CouponList();
	private List<JRadioButton> couponRBtnList = new ArrayList<JRadioButton>();
	private List<CouponSaleInfo> couponSaleInfoList = new ArrayList<CouponSaleInfo>();
	private String couponNo;
	private String couponSale;
	private OrderMain ordermain;
	
	
	public Coupon (String title, int width, int height,OrderMain orderMain) {
		this.ordermain = orderMain;
		setTitle(title);
		setLocation(100, 300);
		setSize(width, height);
		
		setPanel1();
		setPanel2();
		
		setVisible(true);
	}
	
	
	
	private void setPanel1() {	
		panel1 = new JPanel();		

		List<CouponListVO> list = couponlist.getCouponList();

		ButtonGroup group = new ButtonGroup();
		for (CouponListVO i : list) {
			CouponSaleInfo csi = new CouponSaleInfo();
			JRadioButton jcb = new JRadioButton(i.getCouponName()+" "+i.getCouponLimit());
			
			csi.setCouponNO(i.getCouponNo());
			csi.setSale(i.getSale());
			
			group.add(jcb);
			jcb.addItemListener(this);
			couponRBtnList.add(jcb);
			couponSaleInfoList.add(csi);
			panel1.add(jcb);
		}
		panel1.setBackground(new Color(255,239,213));
		add(panel1);
	}



	private void setPanel2() {	
		panel2 = new JPanel();
		btncouponapply = new JButton("적용"); 
		btncouponapply.addActionListener(this);
		
		panel2.add(btncouponapply);
		panel2.setBackground(new Color(255,239,213));
		add(panel2, BorderLayout.SOUTH);
		
	}


	private Color Color(int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		double changePrice;
		if(obj == btncouponapply) { // 쿠폰적용버튼
			List<JLabel> productinfoList = ordermain.ProductInfoJLabelList;
			for(JLabel i : productinfoList) {
				if(couponSale.length()<=2) {
					// 쿠폰세일 텍스트의 길이가 2보다 작다면 나누고 빼기
					double percent = Double.parseDouble(i.getText().split("/")[1])*(Double.parseDouble(couponSale)/100);
					changePrice = Double.parseDouble(i.getText().split("/")[1]) - percent;
				}else {
					changePrice = Double.parseDouble(i.getText().split("/")[1]) - Double.parseDouble(couponSale);
					// 쿠폰세일 텍스트의 길이가 2보다 크다면 빼기
					
				}
				i.setText(i.getText().split("/")[0]+Double.toString(changePrice));
			}
			couponlist.deleteCoupon(couponNo); // 쿠폰목록에서 쿠폰적용하면 목록에서 사라짐
			dispose();
		}
	}


	@Override
	public void itemStateChanged(ItemEvent e) {                           		
		for (int i = 0; i < couponRBtnList.size(); i++) {
			if(e.getItem() == couponRBtnList.get(i)) {
				couponNo = couponSaleInfoList.get(i).getCouponNO();
				couponSale = couponSaleInfoList.get(i).getSale();
			}
		}
	}
	

}