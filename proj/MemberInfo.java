package proj;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JTree;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.Font;
import java.awt.Frame;
import java.awt.LayoutManager;

public class MemberInfo extends JFrame implements ActionListener, MouseListener{
	
	JFrame frmae;
	private JPanel contentPane;
	private JLabel label1;
	private JButton exitbtn;
	private JPanel panel2;
	private JList list1;
	private JPanel panel3;
	private JPanel panel4;
	private JLabel label2;
	private JLabel namelbl;
	private JLabel genderlbl;
	private JLabel agelbl;
	private JLabel heightlbl;
	private JLabel weightlbl;
	private JTextField nametf;
	private JTextField gendertf;
	private JTextField agetf;
	private JTextField Htf;
	private JTextField Wtf;
	private JButton btn1;
	private JPanel panel5;
	private JLabel label3;
	private JPanel panel1;
	private JPanel panel0;
	private JTable table;
	private JPanel tablepanel;

	public static void main(String[] args) {
		MemberInfo info = new MemberInfo("");
	}
	
	public MemberInfo(String title) {
		
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(350, 100);
		setResizable(false);
		setSize(900, 670);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		

		
		label1 = new JLabel("My Page");
		label1.setFont(new Font("Cambria Math", Font.PLAIN, 20));
		label1.setBounds(390, 12, 80, 37);
		getContentPane().add(label1);
		
		exitbtn = new JButton("New button");
		exitbtn.setIcon(new ImageIcon("C:\\Users\\최은경\\Downloads\\ccc.jpg"));
		exitbtn.setBounds(0, 0, 53, 51);
		getContentPane().add(exitbtn);
		exitbtn.addMouseListener(this);
		
		
		
	
		btn1 = new JButton("New button");
		btn1.setBounds(20, 65, 210, 248);
		getContentPane().add(btn1);
		btn1.setIcon(new ImageIcon("C:\\Users\\최은경\\Downloads\\프로필.jpg"));

		
		
		
		label2 = new JLabel("기본정보");
		label2.setFont(new Font("나눔바른고딕볼드체", Font.BOLD, 20));
		label2.setBounds(512, 70, 124, 34);
		getContentPane().add(label2);
		
		namelbl = new JLabel("이름");
		namelbl.setFont(new Font("나눔바른고딕볼드체", Font.PLAIN, 20));
		namelbl.setBounds(315, 106, 52, 34);
		getContentPane().add(namelbl);
		
		genderlbl = new JLabel("성별");
		genderlbl.setFont(new Font("나눔바른고딕볼드체", Font.PLAIN, 20));
		genderlbl.setBounds(550, 106, 52, 34);
		getContentPane().add(genderlbl);
		
		agelbl = new JLabel("나이");
		agelbl.setFont(new Font("나눔바른고딕볼드체", Font.PLAIN, 20));
		agelbl.setBounds(760, 106, 52, 34);
		getContentPane().add(agelbl);
		
		heightlbl = new JLabel("키");
		heightlbl.setFont(new Font("나눔바른고딕볼드체", Font.PLAIN, 20));
		heightlbl.setBounds(329, 211, 31, 34);
		getContentPane().add(heightlbl);
		
		weightlbl = new JLabel("몸무게");
		weightlbl.setFont(new Font("나눔바른고딕볼드체", Font.PLAIN, 20));
		weightlbl.setBounds(542, 211, 65, 34);
		getContentPane().add(weightlbl);
		
		nametf = new JTextField("이지혜");
		nametf.setBackground(new Color(245, 245, 245));
		nametf.setForeground(new Color(240, 255, 240));
		nametf.setBounds(279, 150, 127, 34);
		getContentPane().add(nametf);
	
		
		gendertf = new JTextField("여자");
		gendertf.setBackground(new Color(245, 245, 245));
		gendertf.setForeground(new Color(245, 245, 245));
		gendertf.setBounds(509, 150, 127, 34);
		getContentPane().add(gendertf);
		
		agetf = new JTextField("24");
		agetf.setBackground(new Color(245, 245, 245));
		agetf.setBounds(721, 150, 127, 34);
		getContentPane().add(agetf);
		
		Htf= new JTextField("159cm");
		Htf.setBackground(new Color(245, 245, 245));
		Htf.setBounds(279, 258, 127, 34);
		getContentPane().add(Htf);
		
		Wtf = new JTextField("49kg");
		Wtf.setBackground(new Color(245, 245, 245));
		Wtf.setBounds(509, 258, 127, 34);
		getContentPane().add(Wtf);
		
		
		label3 = new JLabel(" coupon");
		label3.setBounds(12, 335, 117, 44);
		getContentPane().add(label3);
		label3.setFont(new Font("Cambria Math", Font.ITALIC, 30));
	
		tablepanel = new JPanel();
		tablepanel.setBackground(SystemColor.inactiveCaptionBorder);
		tablepanel.setBounds(12, 400, 863, 217);
		String[][] data = new String[][] {{"1","2"},{"4","5"}};
		String[] headers = new String[] {"coupon name","coupon"};
		table = new JTable(data,headers);
		table.setRowHeight(30);
		table.setFont(new Font("Canbria Math", Font.BOLD, 15 ));
		table.setAlignmentX(0);
		table.setSize(800, 180);
		table.setPreferredScrollableViewportSize(new Dimension(800, 180));
		tablepanel.add(new JScrollPane(table));
		
		getContentPane().add(tablepanel);
		
		
		panel4 = new JPanel();
		panel4.setBackground(SystemColor.controlHighlight);
		panel4.setBounds(0, 330, 886, 54);
		getContentPane().add(panel4);
		panel4.setLayout(null);
		
		panel3 = new JPanel();
		panel3.setBackground(Color.WHITE);
		panel3.setBounds(248, 65, 627, 248);
		getContentPane().add(panel3);
		panel3.setLayout(null);
		
		panel2 = new JPanel();
		panel2.setBackground(SystemColor.inactiveCaptionBorder);
		panel2.setBounds(0, 51, 886, 582);
		getContentPane().add(panel2);
		panel2.setLayout(null);
		
		panel1 = new JPanel();
		panel1.setBackground(Color.WHITE);
		panel1.setBounds(0, 0, 886, 49);
		getContentPane().add(panel1);
		panel1.setLayout(null);
	
		
		setVisible(true);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 Object obj = e.getSource();
		 
		 try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","shop","manager");
			 
			 String NAME = nametf.getText();
			 String GENDER = gendertf.getText();
			 String AGE = agetf.getText();
			 String HEIGhT = Htf.getText();
			 String WEIGHT = Wtf.getText();
			 
			 Statement stm = con.createStatement();
			 
			 String sql = "select * from log where NAME='"+ NAME +"'and GENDER='"+GENDER+"'"
			 		+ "and AGE='"+AGE+"'and HEIGHT='"+HEIGHT+"'and WEIGHT='"+WEIGHT+"'";
			
			 ResultSet rs = stm.executeQuery(sql);
			 
			 if(obj == exitbtn){
				
			 }
			 while(rs.next()) {
				 String nametf = rs.getString("");
			 }
	con.close();
	
		 }catch(Exception e1) {
			 System.out.println(e1.getMessage());
	 }
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//ShopPage sp = new ShopPage();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}}
