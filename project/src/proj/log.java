package proj;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.RootPaneContainer;
import javax.swing.border.EmptyBorder;

import pac.*;
import payment.*;


public class log extends JFrame implements ActionListener  {
	
	
	JFrame frame;
	private JLabel Label1;
	private JLabel Label2;
	private JTextField id;
	private JPasswordField password;
	private JLabel Label3;
	private JLabel Label4;
	private JButton btn1;
	private JButton btn2;
	private JPanel contentPane;
	private static ShopPage sp;
	

 

	
	public static void main(String[] args) {
		log lo = new log("");
	}		
	

	public log (String title) {
		
		
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(370, 150); // 창이 가운데 나오게 하기
		setSize(813, 550);
		setResizable(false);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		Label1 = new JLabel("oasis closet");
		Label1.setForeground(new Color(173, 216, 230));
		Label1.setFont(new Font("Cambria Math", Font.BOLD, 50));
		Label1.setBounds(241, 28, 283, 46);
	
		
		Label2 = new JLabel("Login");
		Label2.setFont(new Font("Cambria Math", Font.BOLD, 26));
		Label2.setBounds(213, 145, 154, 46);
		
		
		id = new JTextField();
		id.setFont(new Font("Arial", Font.PLAIN, 20));
		id.setBounds(213, 190, 336, 46);
		id.setColumns(10);
	
		
		password = new JPasswordField();
		password.setBounds(215, 256, 334, 46);
	
		
		Label3 = new JLabel("문의전화 : 1004-7942(평일 09:00-18:00, 유로)");
		Label3.setFont(new Font("HY신명조", Font.PLAIN, 13));
		Label3.setBounds(248, 426, 370, 27);
		
		
		Label4 = new JLabel("@ oasis Entertainment.");
		Label4.setBounds(329, 463, 140, 27);
		
		
		btn1 = new JButton("로그인");
		btn1.setBackground(SystemColor.inactiveCaption);
		btn1.setForeground(SystemColor.WHITE);
		btn1.setFont(new Font("나눔바른고딕볼드체", Font.BOLD, 20));
		btn1.setBounds(213, 312, 154, 51);
		btn1.addActionListener(this);
		
		
		btn2 = new JButton("회원가입");
		btn2.setForeground(Color.WHITE);
		btn2.setFont(new Font("나눔바른고딕볼드체", Font.BOLD, 20));
		btn2.setBackground(SystemColor.inactiveCaption);
		btn2.setBounds(395, 312, 154, 51);
		btn2.addActionListener(this);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 805, 513);
		
		
		getContentPane().add(Label1);
		getContentPane().add(Label2);
		getContentPane().add(id);
		getContentPane().add(password);
		getContentPane().add(Label3);
		getContentPane().add(Label4);
		getContentPane().add(btn1);
		getContentPane().add(btn2);
		getContentPane().add(panel);
		
		setVisible(true);
		
	
	}

	 @Override
     public void actionPerformed(ActionEvent e) {
		 Object obj = e.getSource();
		 
		 try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","cban","1111");
			 
			 String ID = id.getText();
			 String PW = password.getText();
			 
			 Statement stm = con.createStatement();
			 
			 String sql = "select * from log where ID='"+ ID +"'and PW='"+PW+"'";
			 ResultSet rs = stm.executeQuery(sql);
			 if(obj == btn2){
					join frame = new join("");
			 
		 		}else if(id.getText().equals("")&&Arrays.equals(password.getPassword(),"".toCharArray())){
				 JOptionPane.showMessageDialog(this, "아이디 또는 비밀번호를 입력하세요");
				 
				}else if(rs.next()) {
				 
				 dispose();
				}else {
				 JOptionPane.showMessageDialog(this, "아이디 혹은 비밀번호가 틀렸습니다.");
				 id.setText("");
				 password.setText("");
				 
			 }if(obj == btn1){
				sp = new ShopPage("");
			 }
			 con.close();
			 
		 }catch(Exception e1) {
			 System.out.println(e1.getMessage());
	 }
	 }
}