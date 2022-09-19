package pac;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class ShopPage extends JFrame implements ActionListener, MouseListener {

   private JPanel toppanel;
   private JPanel centerpanel;
   private JPanel newitempanel;
   private JPanel normalitempanel;
   private JScrollPane normalscroll;
   
   private JPanel cartpanel;
   private JPanel searchpanel;
   private JPanel mypagepanel;
   
   private JToolBar toolbar;
   private JComboBox<String> combo;
   private Vector<String> vecCombo;
   
   private ImageIcon cart;
   private JButton cartbtn;
   private JTextField tf;
   private ImageIcon search;
   private JButton searchbtn;
   private ImageIcon mypage;
   private JButton mypagebtn;
   
   private JButton all;
   private JButton top;
   private JButton bottoms;
   private JButton outer;
   private JButton acc;
   
   private JPanel normalscrollpanel;
   private JPanel itembtnpanel;
   private JPanel itemimagepanel;
   private JPanel nullpnl1;
   private JPanel nullpnl2;
   private JPanel itemnullpnl1;
   private JPanel trueitempanel;
   private JPanel itemnullpnl2;
   
   private DAO dao;
   private ArrayList<Data> arr;
   private ArrayList<Data> arrall;
   private ImageIcon imageIcon;
   private JButton imgbtn;
   private JButton cartgo;
   private ItemPage ip;

   /////////////////////////////신상품 목록
   private JPanel panelWhole;
	
	//옷 하나당 패널 하나
	private JPanel panel1;
	private JPanel panel1Top;
	private JPanel panel1Center;
	private JPanel panel1Center2;
	
	private JPanel panel2;
	private JPanel panel2Top;
	private JPanel panel2Center;
	private JPanel panel2Center2;
	
	private JPanel panel3;
	private JPanel panel3Top;
	private JPanel panel3Center;
	private JPanel panel3Center2;
	
	private JPanel panel4;
	private JPanel panel4Top;
	private JPanel panel4Center;
	private JPanel panel4Center2;
	
	private JPanel panel5;
	private JPanel panel5Top;
	private JPanel panel5Center;
	private JPanel panel5Center2;
	
	private JPanel panel6;
	private JPanel panel6Top;
	private JPanel panel6Center;
	private JPanel panel6Center2;
	
	//옷 이미지 들어갈 버튼
	private JLabel imglbl1;
	private JLabel imglbl2;
	private JLabel imglbl3;
	private JLabel imglbl4;
	private JLabel imglbl5;
	private JLabel imglbl6;
	
	//옷 이미지
	private ImageIcon imgicon1;
	private ImageIcon imgicon2;
	private ImageIcon imgicon3;
	private ImageIcon imgicon4;
	private ImageIcon imgicon5;
	private ImageIcon imgicon6;
	
	//옷 이름
	private JLabel namelbl1;
	private JLabel namelbl2;
	private JLabel namelbl3;
	private JLabel namelbl4;
	private JLabel namelbl5;
	private JLabel namelbl6;
	
	//옷 가격
	private JLabel pricelbl1;
	private JLabel pricelbl2;
	private JLabel pricelbl3;
	private JLabel pricelbl4;
	private JLabel pricelbl5;
	private JLabel pricelbl6;
	
	private SearchDAO sd;
	private ArrayList<SearchData> searchArr;
	private JPanel allitempanel;
	private JPanel topitempanel;
	private JPanel bottomitempanel;
	private JPanel outeritempanel;
	private JPanel accitempanel;
	private ArrayList<Data> arracc;
	private JPanel panelOne;
	
	//////////////////////////////
   //Color(255,228,225); = 연핑크
   //Color(255,240,245); = 연핑크2
   
   //Color(255,239,213); = 살구색
   //Color(255,245,238); = 살구색2
   
   
   
   public ShopPage (String title) {

      setTitle(title);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocation(150, 0);
      setSize(1300, 900);
      setLayout(new GridBagLayout());
      
      dao = new DAO();
      
      sd = new SearchDAO();
      
      setLayout1(); //기본 바탕 레이아웃(장바구니 버튼, 검색창, 마이페이지 버튼)
      
      toppanelLayout(); //탑패널 꾸미기 (장바구니 버튼, 검색창, 마이페이지 버튼)
      
      setLayout2(); //centerpanel의 레이아웃(신상품 보러가기, 스크롤)

      newitempaneldec(); //신상품 보러가기 패널 꾸미기
      
      normalitempaneldec(); //버튼이랑 의류 목록 패널 넣는 프레임
      
      normalscrollpanelLayout(); //스크롤패널에 의류버튼과 의류 목록 레이아웃 설정 후 넣어주기
      
      itemimagepanel(); //itemimagepanel 틀 잡기
      
      trueitempanelLayout(); //trueitempanel 의상 정보 넣기
      
      setVisible(true);
   }






private void setLayout1() { //기초 레이아웃
	      
	      toppanel = new JPanel();
	      centerpanel = new JPanel();
	      
	      GridBagConstraints gbc = new GridBagConstraints();
	      gbc.fill = GridBagConstraints.BOTH;
	      gbc.weightx = 1.0;
	      gbc.weighty = 0.5;	//탑패널 세로길이 조정
	        
	      gbc.gridx = 0;
	      gbc.gridy = 0;
	      gbc.gridwidth = 1;
	      gbc.gridheight = 1;
	      add(toppanel, gbc);
	      
	      gbc.weighty = 45.0; //탑패널 세로길이 조정
	      gbc.gridx = 0;
	      gbc.gridy = 1;
	      gbc.gridwidth = 1;
	      gbc.gridheight = 1;
	      add(centerpanel, gbc);
	   }
	   
	   
	/////////////////////////////////////////////////////////////////////
	   
	   
	   private void toppanelLayout() { //(장바구니 버튼, 검색창, 마이페이지 버튼)
	      
	         toppanel.setLayout(new GridBagLayout());
	         
	         cartpanel = new JPanel();
	         searchpanel = new JPanel();
	         mypagepanel = new JPanel();
	         
	         GridBagConstraints gbc = new GridBagConstraints();
	         gbc.fill = GridBagConstraints.BOTH;
	         gbc.weightx = 1.0;
	         gbc.weighty = 1.0;
	         
	         gbc.gridx = 0;
	         gbc.gridy = 0;
	         gbc.gridwidth = 1;
	         gbc.gridheight = 1;
	         toppanel.add(cartpanel, gbc);
	         cartpanel.setBackground(new Color(255,245,238));
	         
	         gbc.weightx = 10.0;   //searchpanel 가로 길이 조절
	         gbc.gridx = 1;
	         gbc.gridy = 0;
	         gbc.gridwidth = 1;
	         gbc.gridheight = 1;
	         toppanel.add(searchpanel, gbc);
	         searchpanel.setBackground(new Color(255,245,238));
	         //173,216,230
	         
	         gbc.weightx = 1.0;
	         gbc.gridx = 2;
	         gbc.gridy = 0;
	         gbc.gridwidth = 1;
	         gbc.gridheight = 1;
	         toppanel.add(mypagepanel, gbc);
	         mypagepanel.setBackground(new Color(255,245,238));
	         toolbar = new JToolBar();
	            
	         vecCombo = new Vector<String>();
	         vecCombo.add("최근 검색");
	         
	         combo = new JComboBox<>(vecCombo);
	         combo.setBackground(new Color(255,245,238));
	         combo.addMouseListener(this);
	         
	         tf = new JTextField(85);
	         tf.setFont(new Font("EF_Diary", Font.ITALIC, 13));
	         tf.addActionListener(this);
	         
	          search = new ImageIcon("images/search2.png");      
	          searchbtn = new JButton(search);
	          searchbtn.setBackground(new Color(255,245,238));
	          searchbtn.addActionListener(this);
	          
	          toolbar.add(combo);
	          toolbar.add(tf);
	          toolbar.add(searchbtn);
	          toolbar.setBackground(new Color(255,245,238));
	             
	          cart = new ImageIcon("images/jang2.png");
	          cartbtn = new JButton(cart);
	          cartbtn.setBackground(new Color(255,245,238));
	          cartbtn.addActionListener(this);
	          
	          mypage = new ImageIcon("images/ma2.png");
	          mypagebtn = new JButton(mypage);
	          mypagebtn.setBackground(new Color(255,245,238));
	          mypagebtn.addActionListener(this);
	          
	          cartpanel.add(cartbtn);
	          searchpanel.add(toolbar);
	 //         searchpanel.setBackground(new Color(173, 216, 230));
	//          mypagepanel.setBackground(SystemColor.inactiveCaption); 
	          mypagepanel.add(mypagebtn);
	   }
	   
	  
	   ////////////////////////////////////////////////////////////////
	   

	   
	   
	   
	   
	/////////////////////////////////////////////////////////////////////
	   
	   private void setLayout2() { //centerpanel 안의 레이아웃
	      
	      centerpanel.setLayout(new GridBagLayout());
	         
	         newitempanel = new JPanel();
	         
	         panelWhole = new JPanel();
	         panelWhole.setBackground(Color.black);
	         panelWhole.setLayout(new GridLayout(1, 6));
	         
	         normalitempanel = new JPanel();
	         
	         GridBagConstraints gbc = new GridBagConstraints();
	         gbc.fill = GridBagConstraints.BOTH;
	         gbc.weightx = 1.0;
	         gbc.weighty = 1.0;
	         
	         gbc.gridx = 0;
	         gbc.gridy = 0;
	         gbc.gridwidth = 1;
	         gbc.gridheight = 1;
	         centerpanel.add(newitempanel, gbc);
	         
	         panel1 = new JPanel();
	         panel2 = new JPanel();
	         panel3 = new JPanel();
	         panel4 = new JPanel();
	         panel5 = new JPanel();
	         panel6 = new JPanel();
	         
	         Panel1();
	         Panel2();
	         Panel3();
	         Panel4();
	         Panel5();
	         Panel6();
	         
	         panelWhole.add(panel1);
	         panelWhole.add(panel2);
	         panelWhole.add(panel3);
	         panelWhole.add(panel4);
	         panelWhole.add(panel5);
	         panelWhole.add(panel6);
	         
	         panelWhole.setVisible(false);
	         panelWhole.setBackground(new Color(255,239,213));
	         centerpanel.add(panelWhole, gbc);
	         
	         gbc.weighty = 8.0;
	          gbc.gridx = 0;
	          gbc.gridy = 1;
	          gbc.gridwidth = 1;
	          gbc.gridheight = 1;
	          centerpanel.add(normalitempanel, gbc);
	          normalitempanel.setBackground(new Color(255,239,213));
	          
	   }
	   
	   private void Panel1() {
	         panel1 = new JPanel();
	         panel1.setLayout(new FlowLayout());
	         panel1.setBackground(new Color(255,245,238));
	         
	         panel1Top = new JPanel();
	         panel1Center = new JPanel();
	         panel1Center2 = new JPanel();
	         
	         imgicon1 = new ImageIcon("images/new1.jpg");
	         imglbl1 = new JLabel(imgicon1);
	         imglbl1.setBackground(new Color(255,245,238));
	         namelbl1 = new JLabel("오프숄더 블라우스 ");
	         namelbl1.setFont(new Font("EF_Diary", Font.ITALIC, 20));
	         
	         pricelbl1 = new JLabel("가격 : 22000원 ");
	         pricelbl1.setFont(new Font("EF_Diary", Font.ITALIC, 15));
	         
	         panel1Top.setPreferredSize(new Dimension(200, 250));
	         panel1Top.setBackground(new Color(255,245,238));
	         panel1Center.setPreferredSize(new Dimension(200, 30));
	         panel1Center2.setPreferredSize(new Dimension(200, 30));
	         
	         panel1Center.setBackground(Color.WHITE);
	         panel1Center2.setBackground(Color.WHITE);
	         
	         panel1Top.add(imglbl1);
	         panel1Center.add(namelbl1);
	         panel1Center2.add(pricelbl1);
	         
	         panel1.add(panel1Center); 
	         panel1.add(panel1Top); 
	         panel1.add(panel1Center2); 
	         
	      }

	      private void Panel2() {
	         panel2 = new JPanel();
	         panel2.setBackground(new Color(255,245,238));
	         
	         panel2Top = new JPanel();
	         panel2Center = new JPanel();
	         panel2Center2 = new JPanel();
	         
	         imgicon2 = new ImageIcon("images/new2.jpg");
	         imglbl2 = new JLabel(imgicon2);
	         imglbl2.setBackground(new Color(255,245,238));
	         namelbl2 = new JLabel("베이직 슬림 롱스커트 ");
	         namelbl2.setFont(new Font("EF_Diary", Font.ITALIC, 20));
	         
	         pricelbl2 = new JLabel("가격 : 15000원 ");
	         pricelbl2.setFont(new Font("EF_Diary", Font.ITALIC, 15));
	         
	         panel2Top.setPreferredSize(new Dimension(200, 250));
	         panel2Top.setBackground(new Color(255,245,238));
	         panel2Center.setPreferredSize(new Dimension(200, 30));
	         panel2Center2.setPreferredSize(new Dimension(200, 30));
	         
	         panel2Center.setBackground(Color.WHITE);
	         panel2Center2.setBackground(Color.WHITE);
	         
	         panel2Top.add(imglbl2);
	         panel2Center.add(namelbl2);
	         panel2Center2.add(pricelbl2);
	         
	         panel2.add(panel2Center); 
	         panel2.add(panel2Top); 
	         panel2.add(panel2Center2); 
	      }

	      private void Panel3() {
	         panel3 = new JPanel();
	         panel3.setBackground(new Color(255,245,238));
	         panel3Top = new JPanel();
	         panel3Center = new JPanel();
	         panel3Center2 = new JPanel();
	         
	         imgicon3 = new ImageIcon("images/new3.jpg");
	         imglbl3 = new JLabel(imgicon3);
	         imglbl3.setBackground(new Color(255,245,238));
	         namelbl3 = new JLabel("빈티지 반팔티 ");
	         namelbl3.setFont(new Font("EF_Diary", Font.ITALIC, 20));
	         
	         pricelbl3 = new JLabel("가격 : 13000원 ");
	         pricelbl3.setFont(new Font("EF_Diary", Font.ITALIC, 15));
	         
	         panel3Top.setPreferredSize(new Dimension(200, 250));
	         panel3Top.setBackground(new Color(255,245,238));
	         panel3Center.setPreferredSize(new Dimension(200, 30));
	         panel3Center2.setPreferredSize(new Dimension(200, 30));
	         
	         panel3Center.setBackground(Color.WHITE);
	         panel3Center2.setBackground(Color.WHITE);
	         
	         panel3Top.add(imglbl3);
	         panel3Center.add(namelbl3);
	         panel3Center2.add(pricelbl3);
	         
	         panel3.add(panel3Center); 
	         panel3.add(panel3Top); 
	         panel3.add(panel3Center2); 
	      }

	      private void Panel4() {
	         panel4 = new JPanel();
	         panel4.setBackground(new Color(255,245,238));
	         
	         panel4Top = new JPanel();
	         panel4Center = new JPanel();
	         panel4Center2 = new JPanel();
	         
	         imgicon4 = new ImageIcon("images/new4.jpg");
	         imglbl4 = new JLabel(imgicon4);
	         imglbl4.setBackground(new Color(255,245,238));
	         namelbl4 = new JLabel("썸머 린넨 긴팔티 ");
	         namelbl4.setFont(new Font("EF_Diary", Font.ITALIC, 20));
	         
	         pricelbl4 = new JLabel("가격 : 13000원 ");
	         pricelbl4.setFont(new Font("EF_Diary", Font.ITALIC, 15));
	         
	         panel4Top.setPreferredSize(new Dimension(200, 250));
	         panel4Top.setBackground(new Color(255,245,238));
	         panel4Center.setPreferredSize(new Dimension(200, 30));
	         panel4Center2.setPreferredSize(new Dimension(200, 30));
	         
	         panel4Center.setBackground(Color.WHITE);
	         panel4Center2.setBackground(Color.WHITE);
	         
	         panel4Top.add(imglbl4);
	         panel4Center.add(namelbl4);
	         panel4Center2.add(pricelbl4);
	         
	         panel4.add(panel4Center); 
	         panel4.add(panel4Top); 
	         panel4.add(panel4Center2); 
	      }

	      private void Panel5() {
	         panel5 = new JPanel();
	         panel5.setBackground(new Color(255,245,238));
	         panel5Top = new JPanel();
	         panel5Center = new JPanel();
	         panel5Center2 = new JPanel();
	         
	         imgicon5 = new ImageIcon("images/new5.jpg");
	         imglbl5 = new JLabel(imgicon5);
	         imglbl5.setBackground(new Color(255,245,238));
	         namelbl5 = new JLabel("핀턱 하프 슬랙스 ");
	         namelbl5.setFont(new Font("EF_Diary", Font.ITALIC, 20));
	         
	         pricelbl5 = new JLabel("가격 : 18000원 ");
	         pricelbl5.setFont(new Font("EF_Diary", Font.ITALIC, 15));
	         
	         panel5Top.setPreferredSize(new Dimension(200, 250));
	         panel5Top.setBackground(new Color(255,245,238));
	         panel5Center.setPreferredSize(new Dimension(200, 30));
	         panel5Center2.setPreferredSize(new Dimension(200, 30));
	         
	         panel5Center.setBackground(Color.WHITE);
	         panel5Center2.setBackground(Color.WHITE);
	         
	         panel5Top.add(imglbl5);
	         panel5Center.add(namelbl5);
	         panel5Center2.add(pricelbl5);
	         
	         panel5.add(panel5Center); 
	         panel5.add(panel5Top); 
	         panel5.add(panel5Center2); 
	      }

	      private void Panel6() {
	         panel6 = new JPanel();
	         panel6.setBackground(new Color(255,245,238));
	         panel6Top = new JPanel();
	         panel6Center = new JPanel();
	         panel6Center2 = new JPanel();
	         
	         imgicon6 = new ImageIcon("images/new6.jpg");
	         imglbl6 = new JLabel(imgicon6);
	         imglbl6.setBackground(new Color(255,245,238));
	         namelbl6 = new JLabel("데님 미니스커트 ");
	         namelbl6.setFont(new Font("EF_Diary", Font.ITALIC, 20));
	         
	         pricelbl6 = new JLabel("가격 : 18000원 ");
	         pricelbl6.setFont(new Font("EF_Diary", Font.ITALIC, 15));
	         
	         panel6Top.setPreferredSize(new Dimension(200, 250));
	         panel6Top.setBackground(new Color(255,245,238));
	         panel6Center.setPreferredSize(new Dimension(200, 30));
	         panel6Center2.setPreferredSize(new Dimension(200, 30));
	         
	         panel6Center.setBackground(Color.WHITE);
	         panel6Center2.setBackground(Color.WHITE);
	         
	         panel6Top.add(imglbl6);
	         panel6Center.add(namelbl6);
	         panel6Center2.add(pricelbl6);
	         
	         panel6.add(panel6Center); 
	         panel6.add(panel6Top); 
	         panel6.add(panel6Center2); 
	      }
	      
	      
	      
	      
	      
	/////////////////////////////////////////////////////////////////////
	   
	   private void newitempaneldec() { //신상품 보러가기!
	      
	        newitempanel.setLayout(new GridBagLayout());
	        newitempanel.setBackground(new Color(255,245,238));
	            
	             GridBagConstraints gbc = new GridBagConstraints();
	             gbc.fill = GridBagConstraints.BOTH;
	             gbc.weightx = 1.0;
	             gbc.weighty = 1.0;
	             
	             imageIcon = new ImageIcon("images/img4.jpg");
	             imgbtn = new JButton(imageIcon);
	             imgbtn.setPreferredSize(new Dimension(1285, 380));
	             imgbtn.addMouseListener(this);
	             newitempanel.add(imgbtn);
	   }
	   
	   
	/////////////////////////////////////////////////////////////////////
	   
	   private void normalitempaneldec() { // 버튼이랑 의류 항목 엏을 곳의 스크롤팬
	      
	      normalitempanel.setLayout(new BorderLayout());
	      
	      normalscrollpanel = new JPanel();
	      normalscrollpanel.setBackground(new Color(255,239,213));
	      
	      normalscroll = new JScrollPane(normalscrollpanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	      //가로 스크롤바를 사용하지 않고 오직 세로 스크롤만 사용하겠습니다.
	      
	      normalscroll.setBounds(4, 4, 100, 500);
	       normalitempanel.add(normalscroll, BorderLayout.CENTER);
	      
	       
	   }
	   
	   
	///////////////////////////////////////////////////////////////////
	   
	   private void normalscrollpanelLayout() {
	      
	      normalscrollpanel.setLayout(new GridBagLayout());
	      
	      itembtnpanel = new JPanel();
	      itembtnpanel.setLayout(new GridLayout(1,7));
	      
	      itemimagepanel = new JPanel();
	      
	      GridBagConstraints gbc = new GridBagConstraints();
	      gbc.fill = GridBagConstraints.BOTH;
	      gbc.weightx = 1.0;
	        gbc.weighty = 1.0;
	      
	        gbc.gridx = 0;
	      gbc.gridy = 0;
	      gbc.gridwidth = 1;
	      gbc.gridheight = 1;
	      normalscrollpanel.add(itembtnpanel, gbc);
	      itembtnpanel.setBackground(new Color(255,239,213));
	      
	      gbc.weighty = 8.0;
	      gbc.gridx = 0;
	      gbc.gridy = 1; //-<요기
	      gbc.gridwidth = 1;
	      gbc.gridheight = 1;
	      normalscrollpanel.add(itemimagepanel, gbc);
	      itemimagepanel.setBackground(Color.WHITE);
	      
	      nullpnl1 = new JPanel();
	      nullpnl1.setBackground(new Color(255,239,213));
	      
	      all = new JButton("전체");
	      all.setBackground(new Color(255,239,213));
	      all.setFont(new Font("EF_Diary", Font.ITALIC, 20));
	      all.setBorderPainted(false);
	      all.addActionListener(this);
	      
	      top = new JButton("상의");
	      top.setBackground(new Color(255,239,213));
	      top.setFont(new Font("EF_Diary", Font.ITALIC, 20));
	      top.setBorderPainted(false);
	      top.addActionListener(this);
	      
	      bottoms = new JButton("하의");
	      bottoms.setBackground(new Color(255,239,213));
	      bottoms.setFont(new Font("EF_Diary", Font.ITALIC, 20));
	      bottoms.setBorderPainted(false);
	      bottoms.addActionListener(this);
	      
	      outer = new JButton("아우터");
	      outer.setBackground(new Color(255,239,213));
	      outer.setFont(new Font("EF_Diary", Font.ITALIC, 20));
	      outer.setBorderPainted(false);
	      outer.addActionListener(this);
	      
	      acc = new JButton("액세서리");
	      acc.setBackground(new Color(255,239,213));
	      acc.setFont(new Font("EF_Diary", Font.ITALIC, 20));
	      acc.setBorderPainted(false);
	      acc.addActionListener(this);
	      
	      nullpnl2 = new JPanel();
	      nullpnl2.setBackground(new Color(255,239,213));
	      
	      
	      itembtnpanel.add(nullpnl1);
	      itembtnpanel.add(all);
	      itembtnpanel.add(top);
	      itembtnpanel.add(bottoms);
	      itembtnpanel.add(outer);
	      itembtnpanel.add(acc);
	      itembtnpanel.add(nullpnl2);
	      
	   }
	   
	   
	/////////////////////////////////////////////////////////////////////////
	   
	   private void itemimagepanel() {
	      
	      itemimagepanel.setLayout(new GridBagLayout());
	      
	      itemnullpnl1 = new JPanel();
	      trueitempanel = new JPanel();
	      itemnullpnl2 = new JPanel();
	      
	      GridBagConstraints gbc = new GridBagConstraints();
	      gbc.fill = GridBagConstraints.BOTH;
	      gbc.weightx = 1.0;
	        gbc.weighty = 1.0;
	      
	        gbc.gridx = 0;
	      gbc.gridy = 0;
	      gbc.gridwidth = 1;
	      gbc.gridheight = 1;
	      itemimagepanel.add(itemnullpnl1, gbc);
	      itemnullpnl1.setBackground(new Color(255,239,213));
	      
	      gbc.weightx = 12.0;
	      gbc.gridx = 1;
	      gbc.gridy = 0; //-<요기
	      gbc.gridwidth = 1;
	      gbc.gridheight = 1;
	      itemimagepanel.add(trueitempanel, gbc);
	      trueitempanel.setBackground(Color.white);
	      trueitempanel.setLayout(new BorderLayout());
	      
	      gbc.weightx = 1.0;
	      gbc.gridx = 2;
	      gbc.gridy = 0; //-<요기
	      gbc.gridwidth = 1;
	      gbc.gridheight = 1;
	      itemimagepanel.add(itemnullpnl2, gbc);
	      itemnullpnl2.setBackground(new Color(255,239,213));
	   }
	   
	   
	///////////////////////////////////////////////////////////////////////
	   
	   private void trueitempanelLayout() {
	   
		    allitempanel = new JPanel();
			topitempanel = new JPanel();
			bottomitempanel = new JPanel();
			outeritempanel = new JPanel();
			accitempanel = new JPanel();
			
	    	allitempanel.setLayout(new GridLayout(12,4));
					
			ArrayList<Data> arrall = new ArrayList<Data>();
			arrall = dao.readDataallitem();
			
			for(int i=0; i < arrall.size(); i++ ) {
				
				JPanel componentpanel = new JPanel();
				componentpanel.setBorder(new LineBorder(Color.black));
				
				JPanel namepan = new JPanel();
				namepan.setLayout(new FlowLayout());
				namepan.setBorder(new LineBorder(Color.black));
				namepan.setBackground(Color.white);
				JPanel pricepan = new JPanel();
				pricepan.setLayout(new FlowLayout());			
				pricepan.setBorder(new LineBorder(Color.black));
				pricepan.setBackground(Color.white);
				
				componentpanel.setLayout(new BorderLayout());
				componentpanel.setBackground(Color.white);
				
				String n = arrall.get(i).getName();
				
				int p = arrall.get(i).getPrice();
				
				String im = arrall.get(i).getImg();
				
				JLabel namelabel = new JLabel(arrall.get(i).getName());
				
				JLabel pricelabel = new JLabel(arrall.get(i).getPrice() + "");
				
				ImageIcon imgtest = new ImageIcon(arrall.get(i).getImg());
				//arr.get(i).getImg()
				Image image = imgtest.getImage();
				Image changeimg = image.getScaledInstance(240, 200, DO_NOTHING_ON_CLOSE);
				ImageIcon Changeicon = new ImageIcon(changeimg);
				
				JLabel img = new JLabel(Changeicon);
				
				ImageIcon carticon = new ImageIcon("images/jang.png");
				
				JButton cartbtn = new JButton(carticon);
				cartbtn.setBackground(Color.white);
				cartbtn.setBorder(new EmptyBorder(5,3,5,3));
				
				namepan.add(namelabel);
				pricepan.add(pricelabel);
				pricepan.add(cartbtn);
				cartbtn.addActionListener( new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						Object obj = e.getSource();
							
						if (obj == cartbtn) {
							ip = new ItemPage(n, p, im);
						}
					}
				});
				
				componentpanel.add(img, BorderLayout.CENTER);
				componentpanel.add(namepan, BorderLayout.NORTH);
				componentpanel.add(pricepan, BorderLayout.SOUTH);
				
				allitempanel.add(componentpanel);
				trueitempanel.add(allitempanel, BorderLayout.CENTER);
			}
			
		}
	   
	   
	///////////////////////////////////////////////////////////////
	   

	   
	   
	   
	//////////////////////////////////////////////////////////////

	    private void allpagemethod() { //전체페이지
	    	
	    	allitempanel.removeAll();
			
			allitempanel.setVisible(true);
			topitempanel.setVisible(false);
			bottomitempanel.setVisible(false);
			outeritempanel.setVisible(false);
			accitempanel.setVisible(false);
			
			allitempanel.setLayout(new GridLayout(12,4));
			
			ArrayList<Data> arrall = new ArrayList<Data>();
			arrall = dao.readDataallitem();
			
			for(int i=0; i < arrall.size(); i++ ) {
				
				JPanel componentpanel = new JPanel();
				componentpanel.setBorder(new LineBorder(Color.black));
				
				JPanel namepan = new JPanel();
				namepan.setLayout(new FlowLayout());
				namepan.setBorder(new LineBorder(Color.black));
				namepan.setBackground(Color.white);
				JPanel pricepan = new JPanel();
				pricepan.setLayout(new FlowLayout());			
				pricepan.setBorder(new LineBorder(Color.black));
				pricepan.setBackground(Color.white);
				
				componentpanel.setLayout(new BorderLayout());
				componentpanel.setBackground(Color.white);
				
				String n = arrall.get(i).getName();
				
				int p = arrall.get(i).getPrice();
				
				String im = arrall.get(i).getImg();
				
				JLabel namelabel = new JLabel(arrall.get(i).getName());
				
				JLabel pricelabel = new JLabel(arrall.get(i).getPrice() + "");
				
				ImageIcon imgtest = new ImageIcon(arrall.get(i).getImg());
				//arr.get(i).getImg()
				Image image = imgtest.getImage();
				Image changeimg = image.getScaledInstance(240, 200, DO_NOTHING_ON_CLOSE);
				ImageIcon Changeicon = new ImageIcon(changeimg);
				
				JLabel img = new JLabel(Changeicon);
				
				ImageIcon carticon = new ImageIcon("images/jang.png");
				
				JButton cartbtn = new JButton(carticon);
				cartbtn.setBackground(Color.white);
				cartbtn.setBorder(new EmptyBorder(5,3,5,3));
				
				namepan.add(namelabel);
				pricepan.add(pricelabel);
				pricepan.add(cartbtn);
				cartbtn.addActionListener( new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						Object obj = e.getSource();
							
						if (obj == cartbtn) {
							ip = new ItemPage(n, p, im);
						}
					}
				});
				
				componentpanel.add(img, BorderLayout.CENTER);
				componentpanel.add(namepan, BorderLayout.NORTH);
				componentpanel.add(pricepan, BorderLayout.SOUTH);
				
				allitempanel.add(componentpanel);
				trueitempanel.add(allitempanel, BorderLayout.CENTER);
			}
	      
	   }



	///////////////////////////////////////////////////////////

	    private void toppagemethod() { //상의페이지
	      
	    	topitempanel.removeAll();
	    	
	    	allitempanel.setVisible(false);
			topitempanel.setVisible(true);
			bottomitempanel.setVisible(false);
			outeritempanel.setVisible(false);
			accitempanel.setVisible(false);
			
			
	    	//topitempanel = new JPanel();
	    	topitempanel.setLayout(new GridLayout(3,4));
			
	    	ArrayList<Data> arrtop = new ArrayList<Data>();
			arrtop = dao.readDatatop();
			
			for(int i=0; i < arrtop.size(); i++ ) {
				
				JPanel componentpanel = new JPanel();
				componentpanel.setBorder(new LineBorder(Color.black));
				
				JPanel namepan = new JPanel();
				namepan.setLayout(new FlowLayout());
				namepan.setBorder(new LineBorder(Color.black));
				namepan.setBackground(Color.white);
				JPanel pricepan = new JPanel();
				pricepan.setLayout(new FlowLayout());			
				pricepan.setBorder(new LineBorder(Color.black));
				pricepan.setBackground(Color.white);
				
				componentpanel.setLayout(new BorderLayout());
				componentpanel.setBackground(Color.white);
				
				String n = arrtop.get(i).getName();
				
				int p = arrtop.get(i).getPrice();
				
				String im = arrtop.get(i).getImg();
				
				JLabel namelabel = new JLabel(arrtop.get(i).getName());
				
				JLabel pricelabel = new JLabel(arrtop.get(i).getPrice() + "");
				
				ImageIcon imgtest = new ImageIcon(arrtop.get(i).getImg());
				//arr.get(i).getImg()
				Image image = imgtest.getImage();
				Image changeimg = image.getScaledInstance(240, 200, DO_NOTHING_ON_CLOSE);
				ImageIcon Changeicon = new ImageIcon(changeimg);
				
				JLabel img = new JLabel(Changeicon);
				
				ImageIcon carticon = new ImageIcon("images/jang.png");
				
				JButton cartbtn = new JButton(carticon);
				cartbtn.setBackground(Color.white);
				cartbtn.setBorder(new EmptyBorder(5,3,5,3));
				
				namepan.add(namelabel);
				pricepan.add(pricelabel);
				pricepan.add(cartbtn);
				cartbtn.addActionListener( new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						Object obj = e.getSource();
							
						if (obj == cartbtn) {
							ip = new ItemPage(n, p, im);
						}
					}
				});
				
				componentpanel.add(img, BorderLayout.CENTER);
				componentpanel.add(namepan, BorderLayout.NORTH);
				componentpanel.add(pricepan, BorderLayout.SOUTH);
				
				topitempanel.add(componentpanel);
				trueitempanel.add(topitempanel, BorderLayout.CENTER);

			}
			
	       
	   }



	/////////////////////////////////////////////////////////////

	    private void bottompagemethod() { //하의페이지
	      

	    	bottomitempanel.removeAll();
	    	
	    	allitempanel.setVisible(false);
			topitempanel.setVisible(false);
			bottomitempanel.setVisible(true);
			outeritempanel.setVisible(false);
			accitempanel.setVisible(false);
			
			
	    	//bottomitempanel = new JPanel();
	    	bottomitempanel.setLayout(new GridLayout(3,4));
			
			ArrayList<Data> arrbottoms = new ArrayList<Data>();
			arrbottoms = dao.readDatabottoms();
			
			for(int i=0; i < arrbottoms.size(); i++ ) {
				
				JPanel componentpanel = new JPanel();
				componentpanel.setBorder(new LineBorder(Color.black));
				
				JPanel namepan = new JPanel();
				namepan.setLayout(new FlowLayout());
				namepan.setBorder(new LineBorder(Color.black));
				namepan.setBackground(Color.white);
				JPanel pricepan = new JPanel();
				pricepan.setLayout(new FlowLayout());			
				pricepan.setBorder(new LineBorder(Color.black));
				pricepan.setBackground(Color.white);
				
				componentpanel.setLayout(new BorderLayout());
				componentpanel.setBackground(Color.white);
				
				String n = arrbottoms.get(i).getName();
				
				int p = arrbottoms.get(i).getPrice();
				
				String im = arrbottoms.get(i).getImg();
				
				JLabel namelabel = new JLabel(arrbottoms.get(i).getName());
				
				JLabel pricelabel = new JLabel(arrbottoms.get(i).getPrice() + "");
				
				ImageIcon imgtest = new ImageIcon(arrbottoms.get(i).getImg());
				//arr.get(i).getImg()
				Image image = imgtest.getImage();
				Image changeimg = image.getScaledInstance(240, 200, DO_NOTHING_ON_CLOSE);
				ImageIcon Changeicon = new ImageIcon(changeimg);
				
				JLabel img = new JLabel(Changeicon);
				
				ImageIcon carticon = new ImageIcon("images/jang.png");
				
				JButton cartbtn = new JButton(carticon);
				cartbtn.setBackground(Color.white);
				cartbtn.setBorder(new EmptyBorder(5,3,5,3));
				
				namepan.add(namelabel);
				pricepan.add(pricelabel);
				pricepan.add(cartbtn);
				cartbtn.addActionListener( new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						Object obj = e.getSource();
							
						if (obj == cartbtn) {
							ip = new ItemPage(n, p, im);
						}
					}
				});
				
				componentpanel.add(img, BorderLayout.CENTER);
				componentpanel.add(namepan, BorderLayout.NORTH);
				componentpanel.add(pricepan, BorderLayout.SOUTH);
				
				bottomitempanel.add(componentpanel);
				trueitempanel.add(bottomitempanel, BorderLayout.CENTER);
			}
	   }



	/////////////////////////////////////////////////////////////

	    private void outerpagemethod() { //아우터페이지
	      
	    	outeritempanel.removeAll();
	    	
	    	allitempanel.setVisible(false);
			topitempanel.setVisible(false);
			bottomitempanel.setVisible(false);
			outeritempanel.setVisible(true);
			accitempanel.setVisible(false);
	    	
	    	//outeritempanel = new JPanel();
	    	outeritempanel.setLayout(new GridLayout(3,4));
			
			ArrayList<Data> arrouter = new ArrayList<Data>();
			arrouter = dao.readDataouter();
			
			for(int i=0; i < arrouter.size(); i++ ) {
				
				JPanel componentpanel = new JPanel();
				componentpanel.setBorder(new LineBorder(Color.black));
				
				JPanel namepan = new JPanel();
				namepan.setLayout(new FlowLayout());
				namepan.setBorder(new LineBorder(Color.black));
				namepan.setBackground(Color.white);
				JPanel pricepan = new JPanel();
				pricepan.setLayout(new FlowLayout());			
				pricepan.setBorder(new LineBorder(Color.black));
				pricepan.setBackground(Color.white);
				
				componentpanel.setLayout(new BorderLayout());
				componentpanel.setBackground(Color.white);
				
				String n = arrouter.get(i).getName();
				
				int p = arrouter.get(i).getPrice();
				
				String im = arrouter.get(i).getImg();
				
				JLabel namelabel = new JLabel(arrouter.get(i).getName());
				
				JLabel pricelabel = new JLabel(arrouter.get(i).getPrice() + "");
				
				ImageIcon imgtest = new ImageIcon(arrouter.get(i).getImg());
				//arr.get(i).getImg()
				Image image = imgtest.getImage();
				Image changeimg = image.getScaledInstance(240, 200, DO_NOTHING_ON_CLOSE);
				ImageIcon Changeicon = new ImageIcon(changeimg);
				
				JLabel img = new JLabel(Changeicon);
				
				ImageIcon carticon = new ImageIcon("images/jang.png");
				
				JButton cartbtn = new JButton(carticon);
				cartbtn.setBackground(Color.white);
				cartbtn.setBorder(new EmptyBorder(5,3,5,3));
				
				namepan.add(namelabel);
				pricepan.add(pricelabel);
				pricepan.add(cartbtn);
				cartbtn.addActionListener( new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						Object obj = e.getSource();
							
						if (obj == cartbtn) {
							ip = new ItemPage(n, p, im);
						}
					}
				});
				
				componentpanel.add(img, BorderLayout.CENTER);
				componentpanel.add(namepan, BorderLayout.NORTH);
				componentpanel.add(pricepan, BorderLayout.SOUTH);
				
				outeritempanel.add(componentpanel);
				trueitempanel.add(outeritempanel, BorderLayout.CENTER);
			}
			
	      
	   }



	////////////////////////////////////////////////////////////////

	     private void accpagemethod() { //악세사리페이지
	    	 accitempanel.removeAll();
	    		
	      	allitempanel.setVisible(false);
	  		topitempanel.setVisible(false);
	  		bottomitempanel.setVisible(false);
	  		outeritempanel.setVisible(false);
	  		accitempanel.setVisible(true);
	     	 
	     	 
	     	//accitempanel = new JPanel();
	     	accitempanel.setLayout(new GridLayout(3,4));
	  		
	  		ArrayList<Data> arracc = new ArrayList<Data>();
	  		arracc = dao.readDataacc();
	  		
	  		for(int i=0; i < arracc.size(); i++ ) {
	  			
	  			JPanel componentpanel = new JPanel();
	  			componentpanel.setBorder(new LineBorder(Color.black));
	  			
	  			JPanel namepan = new JPanel();
	  			namepan.setLayout(new FlowLayout());
	  			namepan.setBorder(new LineBorder(Color.black));
	  			namepan.setBackground(Color.white);
	  			JPanel pricepan = new JPanel();
	  			pricepan.setLayout(new FlowLayout());			
	  			pricepan.setBorder(new LineBorder(Color.black));
	  			pricepan.setBackground(Color.white);
	  			
	  			componentpanel.setLayout(new BorderLayout());
	  			componentpanel.setBackground(Color.white);
	  			
	  			String n = arracc.get(i).getName();
	  			
	  			int p = arracc.get(i).getPrice();
	  			
	  			String im = arracc.get(i).getImg();
	  			
	  			JLabel namelabel = new JLabel(arracc.get(i).getName());
	  			
	  			JLabel pricelabel = new JLabel(arracc.get(i).getPrice() + "");
	  			
	  			ImageIcon imgtest = new ImageIcon(arracc.get(i).getImg());
	  			//arr.get(i).getImg()
	  			Image image = imgtest.getImage();
	  			Image changeimg = image.getScaledInstance(240, 200, DO_NOTHING_ON_CLOSE);
	  			ImageIcon Changeicon = new ImageIcon(changeimg);
	  			
	  			JLabel img = new JLabel(Changeicon);
	  			
	  			ImageIcon carticon = new ImageIcon("images/jang.png");
	  			
	  			JButton cartbtn = new JButton(carticon);
	  			cartbtn.setBackground(Color.white);
	  			cartbtn.setBorder(new EmptyBorder(5,3,5,3));
	  			
	  			namepan.add(namelabel);
	  			pricepan.add(pricelabel);
	  			pricepan.add(cartbtn);
	  			cartbtn.addActionListener( new ActionListener() {
	  				
	  				@Override
	  				public void actionPerformed(ActionEvent e) {
	  					Object obj = e.getSource();
	  						
	  					if (obj == cartbtn) {
	  						ip = new ItemPage(n, p, im);
	  					}
	  				}
	  			});
	  			
	  			componentpanel.add(img, BorderLayout.CENTER);
	  			componentpanel.add(namepan, BorderLayout.NORTH);
	  			componentpanel.add(pricepan, BorderLayout.SOUTH);
	  			
	  			accitempanel.add(componentpanel);
	  			trueitempanel.add(accitempanel, BorderLayout.CENTER);
	  		}
	   
	    }


	////////////////////////////////////////////////////////////////
	     
	   @Override
	   public void actionPerformed(ActionEvent e) {
	      Object obj = e.getSource();
	      
	      if (obj == tf || obj == searchbtn) {
	            String s = tf.getText();
	            if(s.length() <1) {
	               JOptionPane.showMessageDialog(this, "검색어를 입력해주세요.",
	                 "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);   //내 프레임 안에서 띄우기 (this)
	            } else {
	            	vecCombo.add(s);
	            	tf.setText("");         //초기화
	            	tf.requestFocus();  //커서 잡기
	            	
	            	ArrayList<SearchData> listBlous = new ArrayList<SearchData>();
	            	listBlous = sd.readDataBlous();
	            	ArrayList<SearchData> listShortT = new ArrayList<SearchData>();
	            	listShortT = sd.readDataShortT();
	            	ArrayList<SearchData> listLongT = new ArrayList<SearchData>();
	            	listLongT = sd.readDataLongT();
	            	ArrayList<SearchData> listShirts = new ArrayList<SearchData>();
	            	listShirts = sd.readDataShirts();
	            	
	            	ArrayList<SearchData> listShotP = new ArrayList<SearchData>();
	            	listShotP = sd.readDataShotP();
	            	ArrayList<SearchData> listLongP = new ArrayList<SearchData>();
	            	listLongP = sd.readDataLongP();
	            	ArrayList<SearchData> listShotS = new ArrayList<SearchData>();
	            	listShotS = sd.readDataShotS();
	            	ArrayList<SearchData> listLongS = new ArrayList<SearchData>();
	            	listLongS = sd.readDataLongS();
	            	
	            	ArrayList<SearchData> listCadigan = new ArrayList<SearchData>();
	            	listCadigan = sd.readDataCadigan();
	            	ArrayList<SearchData> listTweed = new ArrayList<SearchData>();
	            	listTweed = sd.readDataTweed();
	            	ArrayList<SearchData> listShotJ = new ArrayList<SearchData>();
	            	listShotJ = sd.readDataShotJ();
	            	ArrayList<SearchData> listLongJ = new ArrayList<SearchData>();
	            	listLongJ = sd.readDataLongJ();
	            	
	            	ArrayList<SearchData> listEar = new ArrayList<SearchData>();
	            	listEar = sd.readDataEar();
	            	ArrayList<SearchData> listNeck = new ArrayList<SearchData>();
	            	listNeck = sd.readDataNeck();
	            	ArrayList<SearchData> listRing = new ArrayList<SearchData>();
	            	listRing = sd.readDataRing();
	            	ArrayList<SearchData> listHairBand = new ArrayList<SearchData>();
	            	listHairBand = sd.readDataHairBand();
	            	
	            	ArrayList<SearchData> listTshirts = new ArrayList<SearchData>();
	            	listTshirts = sd.readDataTshirts();
	            	ArrayList<SearchData> listPants = new ArrayList<SearchData>();
	            	listPants = sd.readDataPants();
	            	ArrayList<SearchData> listSkirt = new ArrayList<SearchData>();
	            	listSkirt = sd.readDataSkirt();
	            	ArrayList<SearchData> listJacket = new ArrayList<SearchData>();
	            	listJacket = sd.readDataJacket();
	            	
	            	if(s.equals(listBlous.get(0).getCategory())) {			//블라우스
	            		BlousPage BP = new BlousPage("블라우스 검색 결과");			
	            	}
	            	else if(s.equals(listShortT.get(0).getCategory())) {	//반팔티
	            		ShortTPage ShortTP = new ShortTPage("반팔티 검색 결과");
	            	}
	            	else if(s.equals(listLongT.get(0).getCategory())) {		//긴팔티
	            		LongTPage LongTP = new LongTPage("긴팔티 검색 결과");
	            	}
	            	else if(s.equals(listShirts.get(0).getCategory())) {	//셔츠
	            		ShirtsPage ShirtsP = new ShirtsPage("셔츠 검색 결과");
	            	}
	            	else if(s.equals(listShotP.get(0).getCategory())) {		//반바지
	            		ShotPPage ShotPP = new ShotPPage("반바지 검색 결과");
	            	}
	            	else if(s.equals(listLongP.get(0).getCategory())) {		//긴바지
	            		LongPPage LongPP = new LongPPage("긴바지 검색 결과");
	            	}
	            	else if(s.equals(listShotS.get(0).getCategory())) {		//숏치마
	            		ShotSPage ShotSP = new ShotSPage("숏치마 검색 결과");
	            	}
	            	else if(s.equals(listLongS.get(0).getCategory())) {		//롱치마
	            		LongSPage LongSP = new LongSPage("롱치마 검색 결과");
	            	}
	            	else if(s.equals(listCadigan.get(0).getCategory())) {	//가디건
	            		CadiganPage CadiP = new CadiganPage("가디건 검색 결과");
	            	}
	            	else if(s.equals(listTweed.get(0).getCategory())) {		//트위드
	            		TweedPage TweedP = new TweedPage("트위드 검색 결과");
	            	}
	            	else if(s.equals(listShotJ.get(0).getCategory())) {		//반팔자켓
	            		ShotJPage ShotJP = new ShotJPage("반팔자켓 검색 결과");
	            	}
	            	else if(s.equals(listLongJ.get(0).getCategory())) {		//긴팔자켓
	            		LongJPage LongJP = new LongJPage("긴팔자켓 검색 결과");
	            	}
	            	else if(s.equals(listEar.get(0).getCategory())) {		//귀걸이
	            		RingPage EarP = new RingPage("귀걸이 검색 결과");
	            	}
	            	else if(s.equals(listNeck.get(0).getCategory())) {		//목걸이
	            		NeckPage NeckP = new NeckPage("목걸이 검색 결과");
	            	}
	            	else if(s.equals(listRing.get(0).getCategory())) {		//반지
	            		RingPage RingP = new RingPage("반지 검색 결과");
	            	}
	            	else if(s.equals(listHairBand.get(0).getCategory())) {	//머리끈
	            		HairBandPage HBP = new HairBandPage("머리끈 검색 결과");
	            	}
	            	else if(s.equals(listTshirts.get(0).getCategory2())) {	//티셔츠
	            		TshirtsPage TP = new TshirtsPage("티셔츠 검색 결과");
	            	}
	            	else if(s.equals(listPants.get(0).getCategory2())) {	//바지
	            		PantsPage PantsP = new PantsPage("바지 검색 결과");
	            	}
	            	else if(s.equals(listSkirt.get(0).getCategory2())) {	//치마
	            		SkirtPage SkirtP = new SkirtPage("치마 검색 결과");
	            	}
	            	else if(s.equals(listJacket.get(0).getCategory2())) {	//자켓
	            		JacketPage JacketP = new JacketPage("자켓 검색 결과");
	            	}
	            	
	            	else {
	            		JOptionPane.showMessageDialog(this, "검색 결과가 없습니다.",
	       	                 "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
	            	}
	           }
	      }
	       
	       else if (obj == all) { 
		    	allpagemethod();
		    	
		    }
		    else if (obj == top) { 
		    	toppagemethod();
		    	
		    }
		    else if (obj == bottoms) { 
		    	bottompagemethod();
		    	
		    }
		    else if (obj == outer) { 
		    	outerpagemethod();
		    	
		    }
		    else if (obj == acc) { 
		    	accpagemethod();
		    	
		    }
	   }
	   
	   
	   
	   
	   
	   
	///////////////////////////////////////////////////////////////////////////////
	   
	   
	   
	   
	   
	   @Override
	   public void mouseClicked(MouseEvent e) {
	      if( e.getClickCount() == 2) {
	         String a = combo.getSelectedItem().toString();
	         tf.setText(a);
	         tf.requestFocus();
	      }
	   }
	   
	   @Override
	   public void mousePressed(MouseEvent e) {
	      newitempanel.setVisible(false);
	      panelWhole.setVisible(true);
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
	      
	   }
	   
	   
	   public static void main(String[] args) {
	      
	      ShopPage sp = new ShopPage("Oasis closet");
	   }

	}
