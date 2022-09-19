package pac;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SearchItem extends JFrame{

	private JPanel searchPanel;
	
	private JPanel searchpanel1;
	private JPanel panel1Top;
	private JPanel panel1Center;
	private JPanel panel1Center2;
	private JPanel panel1Bottom;
	
	private JPanel searchpanel2;
	private JPanel panel2Top;
	private JPanel panel2Center;
	private JPanel panel2Center2;
	private JPanel panel2Bottom;
	
	private JPanel searchpanel3;
	private JPanel panel3Top;
	private JPanel panel3Center;
	private JPanel panel3Center2;
	private JPanel panel3Bottom;
	
	private JPanel searchpanel4;
	
	//옷 이미지 들어갈 버튼
	private JLabel imglbl1;
	private JLabel imglbl2;
	private JLabel imglbl3;
		
	//옷 이미지
	private ImageIcon imgicon1;
	private ImageIcon imgicon2;
	private ImageIcon imgicon3;
	
	//옷 이름
	private JLabel namelbl1;
	private JLabel namelbl2;
	private JLabel namelbl3;
		
	//옷 가격
	private JLabel pricelbl1;
	private JLabel pricelbl2;
	private JLabel pricelbl3;
	
	//장바구니
	private JButton cartbtn;
	
public SearchItem(String title) {
		
		setTitle(title);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(200, 200);
		setSize(1300, 400);
		
		searchPanel();
		
		setVisible(true);
	}

	private void searchPanel() {
		searchPanel = new JPanel();
		searchPanel.setBackground(Color.black);
		searchPanel.setLayout(new GridLayout(1, 4));
		
		searchpanel1 = new JPanel();
		searchpanel2 = new JPanel();
		searchpanel3 = new JPanel();
		searchpanel4 = new JPanel();
		
		searchPanel1();
		searchPanel2();
		searchPanel3();
		searchPanel4();
		
		searchPanel.add(searchpanel1);
		searchPanel.add(searchpanel2);
		searchPanel.add(searchpanel3);
		searchPanel.add(searchpanel4);
		add(searchPanel);
		
	
	}

	private void searchPanel1() {
		searchpanel1 = new JPanel();
		searchpanel1.setBackground(Color.BLACK);
		searchpanel1.setLayout(new FlowLayout());
		
		panel1Top = new JPanel();
		panel1Center = new JPanel();
		panel1Center2 = new JPanel();
		panel1Bottom = new JPanel();
		
		imgicon1 = new ImageIcon("images/new1.jpg");
		imglbl1 = new JLabel(imgicon1);
		imglbl1.setBackground(new Color(255,245,238));
		namelbl1 = new JLabel("오프숄더 블라우스");
		namelbl1.setFont(new Font("EF_Diary", Font.ITALIC, 20));
		
		pricelbl1 = new JLabel("가격 : 22000원");
		pricelbl1.setFont(new Font("EF_Diary", Font.ITALIC, 15));
		cartbtn = new JButton("장바구니");
		cartbtn.setFont(new Font("EF_Diary", Font.ITALIC, 10));
		
		panel1Top.setPreferredSize(new Dimension(300, 250));
		panel1Top.setBackground(new Color(255,245,238));
		panel1Center.setPreferredSize(new Dimension(300, 30));
		panel1Center2.setPreferredSize(new Dimension(300, 30));
		panel1Bottom.setPreferredSize(new Dimension(300, 30));
		
		panel1Center.setBackground(Color.WHITE);
		panel1Center2.setBackground(Color.WHITE);
		panel1Bottom.setBackground(Color.WHITE);
		
		panel1Top.add(imglbl1);
		panel1Center.add(namelbl1);
		panel1Center2.add(pricelbl1);
		panel1Bottom.add(cartbtn);
		
		searchpanel1.add(panel1Top); 
		searchpanel1.add(panel1Center); 
		searchpanel1.add(panel1Center2); 
		searchpanel1.add(panel1Bottom); 
		
	}

	private void searchPanel2() {
		searchpanel2 = new JPanel();
		searchpanel2.setBackground(Color.blue);
		panel2Top = new JPanel();
		panel2Center = new JPanel();
		panel2Center2 = new JPanel();
		panel2Bottom = new JPanel();
		
		imgicon2 = new ImageIcon("images/new2.jpg");
		imglbl2 = new JLabel(imgicon2);
		imglbl2.setBackground(new Color(255,245,238));
		namelbl2 = new JLabel("베이직 슬림 롱스커트");
		namelbl2.setFont(new Font("EF_Diary", Font.ITALIC, 20));
		
		pricelbl2 = new JLabel("가격 : 15000원");
		pricelbl2.setFont(new Font("EF_Diary", Font.ITALIC, 15));
		cartbtn = new JButton("장바구니");
		cartbtn.setFont(new Font("EF_Diary", Font.ITALIC, 10));
		
		panel2Top.setPreferredSize(new Dimension(300, 250));
		panel2Top.setBackground(new Color(255,245,238));
		panel2Center.setPreferredSize(new Dimension(300, 30));
		panel2Center2.setPreferredSize(new Dimension(300, 30));
		panel2Bottom.setPreferredSize(new Dimension(300, 30));
		
		panel2Center.setBackground(Color.WHITE);
		panel2Center2.setBackground(Color.WHITE);
		panel2Bottom.setBackground(Color.WHITE);
		
		panel2Top.add(imglbl2);
		panel2Center.add(namelbl2);
		panel2Center2.add(pricelbl2);
		panel2Bottom.add(cartbtn);
		
		searchpanel2.add(panel2Top); 
		searchpanel2.add(panel2Center); 
		searchpanel2.add(panel2Center2); 
		searchpanel2.add(panel2Bottom); 
	}

	private void searchPanel3() {
		searchpanel3 = new JPanel();
		searchpanel3.setBackground(Color.BLACK);
		
		panel3Top = new JPanel();
		panel3Center = new JPanel();
		panel3Center2 = new JPanel();
		panel3Bottom = new JPanel();
		
		imgicon3 = new ImageIcon("images/new3.jpg");
		imglbl3 = new JLabel(imgicon3);
		imglbl3.setBackground(new Color(255,245,238));
		namelbl3 = new JLabel("빈티지 반팔티");
		namelbl3.setFont(new Font("EF_Diary", Font.ITALIC, 20));
		
		pricelbl3 = new JLabel("가격 : 13000원");
		pricelbl3.setFont(new Font("EF_Diary", Font.ITALIC, 15));
		cartbtn = new JButton("장바구니");
		cartbtn.setFont(new Font("EF_Diary", Font.ITALIC, 10));
		
		panel3Top.setPreferredSize(new Dimension(300, 250));
		panel3Top.setBackground(new Color(255,245,238));
		panel3Center.setPreferredSize(new Dimension(300, 30));
		panel3Center2.setPreferredSize(new Dimension(300, 30));
		panel3Bottom.setPreferredSize(new Dimension(300, 30));
		
		panel3Center.setBackground(Color.WHITE);
		panel3Center2.setBackground(Color.WHITE);
		panel3Bottom.setBackground(Color.WHITE);
		
		panel3Top.add(imglbl3);
		panel3Center.add(namelbl3);
		panel3Center2.add(pricelbl3);
		panel3Bottom.add(cartbtn);
		
		searchpanel3.add(panel3Top); 
		searchpanel3.add(panel3Center); 
		searchpanel3.add(panel3Center2); 
		searchpanel3.add(panel3Bottom); 
	}

	private void searchPanel4() {
		searchpanel4 = new JPanel();
		
	}
	
	public static void main(String[] args) {
	      
	      SearchItem sp = new SearchItem("Oasis closet");
	   }
}
