package pac;

import java.awt.BorderLayout;

import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import com.sun.jdi.connect.spi.Connection;



public class ShopPage extends JFrame implements ActionListener, MouseListener {

	private JPanel toppanel;
	private JPanel centerpanel;
	private JPanel newitempanel;
	private JPanel normalitempanel;
	private JScrollPane normalscroll;
	private JLabel newitemgogo;
	private JLabel newitemgogoEn;
	private JPanel newitempanelnull;
	private JPanel newitempanelshopname;
	private JPanel newsalepanel;
	private JPanel newitempanelnull2;
	private JPanel newitempanelmid;
	private JPanel newitempanelnull3;
	private JPanel newitempanelnull4;
	private JPanel newitempanelnull5;
	private JPanel newitempanelnull6;
	private JPanel newitempanelnull7;
	private JLabel shopname;
	private JTextField tf;
	private ImageIcon search;
	private JButton searchbtn;
	private JButton all;
	private JButton top;
	private JButton bottoms;
	private JButton outer;
	private JButton acc;
	private ImageIcon cart;
	private ImageIcon mypage;
	private JButton cartbtn;
	private JButton mypagebtn;
	private JPanel normalscrollpanel;
	private JPanel itembtnpanel;
	private JPanel itemimagepanel;
	private JPanel nullpnl1;
	private JPanel nullpnl2;
	private JPanel itemnullpnl1;
	private JPanel trueitempanel;
	private JPanel itemnullpnl2;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private ImageIcon img1;
	private JLabel lbl4;
	private JButton one;
	private JButton two;
	private JButton thr;
	private JButton fou;
	private JPanel cartpanel;
	private JPanel searchpanel;
	private JPanel mypagepanel;
	private JLabel lbl33;
	private ImageIcon outerimg1;
	private JLabel outerlbl1;
	private JLabel outername1;
	private JPanel testpanel;
	private static ImageIcon imgtest;
	private static ArrayList topcategory;
	private JLabel itemlbltest;
	private JToolBar toolbar;
	private Vector<String> vecCombo;
	private JComboBox combo;
	private DAO dao;
	private ArrayList<Data> arrall;
	private ImageIcon imageIcon;
	private JButton imgbtn;
	private JButton cartgo;
	private ItemPage ip;
	private JPanel panelWhole;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JPanel panel5;
	private JPanel panel6;
	private JPanel panel6Top;
	private JPanel panel6Center;
	private JPanel panel6Center2;
	private ImageIcon imgicon6;
	private JLabel imglbl6;
	private JLabel namelbl6;
	private JLabel pricelbl6;
	private JPanel panel1Top;
	private JPanel panel1Center;
	private JPanel panel1Center2;
	private ImageIcon imgicon1;
	private JLabel imglbl1;
	private JLabel namelbl1;
	private JLabel pricelbl1;
	private JPanel panel2Top;
	private JPanel panel2Center;
	private JPanel panel2Center2;
	private ImageIcon imgicon2;
	private JLabel imglbl2;
	private Component namelbl2;
	private JLabel pricelbl2;
	private JPanel panel3Top;
	private JPanel panel3Center;
	private JPanel panel3Center2;
	private ImageIcon imgicon3;
	private JLabel imglbl3;
	private JLabel namelbl3;
	private Component pricelbl3;
	private JPanel panel4Top;
	private JPanel panel4Center;
	private JPanel panel4Center2;
	private JLabel imglbl4;
	private ImageIcon imgicon4;
	private Component namelbl4;
	private JLabel pricelbl4;
	private JPanel panel5Top;
	private JPanel panel5Center;
	private JPanel panel5Center2;
	private ImageIcon imgicon5;
	private JLabel imglbl5;
	private JLabel namelbl5;
	private Component pricelbl5;


	//Color(255,228,225); = ?????????
	//Color(255,240,245); = ?????????2
	
	//Color(255,239,213); = ?????????
	//Color(255,245,238); = ?????????2
	
	//Color(173,216,230); = ???????????????
	//systemColor(inaCtivecaption); = ????????????
	
	
	
	public ShopPage (String title) {

		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300, 50);
		setSize(1300, 900);
		setLayout(new GridBagLayout());
		
		dao = new DAO();
		
		setLayout1(); //?????? ?????? ????????????(???????????? ??????, ?????????, ??????????????? ??????)
		
		toppanelLayout(); //????????? ????????? (???????????? ??????, ?????????, ??????????????? ??????)
		
		setLayout2(); //centerpanel??? ????????????(????????? ????????????, ?????????)

		newitempaneldec(); //????????? ???????????? ?????? ?????????
		
		normalitempaneldec(); //???????????? ?????? ?????? ?????? ?????? ?????????
		
		normalscrollpanelLayout(); //?????????????????? ??????????????? ?????? ?????? ???????????? ?????? ??? ????????????
	
		itemimagepanel(); //itemimagepanel ??? ??????
		
		trueitempanelLayout(); //trueitempanel ?????? ?????? ??????
		
		setVisible(true);
	}









///////////////////////////////////////////////////////////////////
	
	private void setLayout1() { //?????? ????????????
		
		toppanel = new JPanel();
		centerpanel = new JPanel();
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(toppanel, gbc);
		toppanel.setBackground(new Color(255,245,238));
		
		gbc.weighty = 8.0;
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(centerpanel, gbc);
	}
	
	
/////////////////////////////////////////////////////////////////////
	
	
	private void toppanelLayout() { //(???????????? ??????, ?????????, ??????????????? ??????)
		
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
	      
	      gbc.weightx = 10.0;   //searchpanel ?????? ?????? ??????
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
	      vecCombo.add("?????? ??????");
	      
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
	       //toolbar.setBackground(new Color(255,245,238));
	          
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
	       mypagepanel.add(mypagebtn);
	}
	
	
	
/////////////////////////////////////////////////////////////////////
	
	private void setLayout2() { //centerpanel ?????? ????????????
		
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
	      namelbl1 = new JLabel("???????????? ????????????");
	      namelbl1.setFont(new Font("EF_Diary", Font.ITALIC, 20));
	      
	      pricelbl1 = new JLabel("?????? : 22000???");
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
	      
	      panel1.add(panel1Top); 
	      panel1.add(panel1Center); 
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
	      namelbl2 = new JLabel("????????? ?????? ????????????");
	      namelbl2.setFont(new Font("EF_Diary", Font.ITALIC, 20));
	      
	      pricelbl2 = new JLabel("?????? : 15000???");
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
	      
	      panel2.add(panel2Top); 
	      panel2.add(panel2Center); 
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
	      namelbl3 = new JLabel("????????? ?????????");
	      namelbl3.setFont(new Font("EF_Diary", Font.ITALIC, 20));
	      
	      pricelbl3 = new JLabel("?????? : 13000???");
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
	      
	      panel3.add(panel3Top); 
	      panel3.add(panel3Center); 
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
	      namelbl4 = new JLabel("?????? ?????? ?????????");
	      namelbl4.setFont(new Font("EF_Diary", Font.ITALIC, 20));
	      
	      pricelbl4 = new JLabel("?????? : 20000???");
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
	      
	      panel4.add(panel4Top); 
	      panel4.add(panel4Center); 
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
	      namelbl5 = new JLabel("?????? ?????? ?????????");
	      namelbl5.setFont(new Font("EF_Diary", Font.ITALIC, 20));
	      
	      pricelbl5 = new JLabel("?????? : 18000???");
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
	      
	      panel5.add(panel5Top); 
	      panel5.add(panel5Center); 
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
	      namelbl6 = new JLabel("?????? ???????????????");
	      namelbl6.setFont(new Font("EF_Diary", Font.ITALIC, 20));
	      
	      pricelbl6 = new JLabel("?????? : 18000???");
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
	      
	      panel6.add(panel6Top); 
	      panel6.add(panel6Center); 
	      panel6.add(panel6Center2); 
	   }
	   
	   
	   
	   
	   
/////////////////////////////////////////////////////////////////////
	
	private void newitempaneldec() { //????????? ????????????!
		
		  newitempanel.setLayout(new GridBagLayout());
		    //newitempanel.setBackground(new Color(255,245,238));
		      
		       GridBagConstraints gbc = new GridBagConstraints();
		       gbc.fill = GridBagConstraints.BOTH;
		       gbc.weightx = 1.0;
		       gbc.weighty = 1.0;
		       
		       imageIcon = new ImageIcon("images/img4.jpg");
		       imgbtn = new JButton(imageIcon);
		       imgbtn.addMouseListener(this);
		       newitempanel.add(imgbtn);
	}
	
	
/////////////////////////////////////////////////////////////////////
	
	private void normalitempaneldec() { // ???????????? d?????? ?????? ?????? ?????? ????????????
		
		normalitempanel.setLayout(new BorderLayout());
		
		normalscrollpanel = new JPanel();
		normalscrollpanel.setBackground(new Color(255,239,213));
		
		normalscroll = new JScrollPane(normalscrollpanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		//?????? ??????????????? ???????????? ?????? ?????? ?????? ???????????? ?????????????????????.
		
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
		gbc.gridy = 1; //-<??????
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		normalscrollpanel.add(itemimagepanel, gbc);
		itemimagepanel.setBackground(Color.WHITE);
		
		nullpnl1 = new JPanel();
		nullpnl1.setBackground(new Color(255,239,213));
		
		all = new JButton("??????");
		all.setBackground(new Color(255,239,213));
		all.setFont(new Font("EF_Diary", Font.ITALIC, 20));
		all.setBorderPainted(false);
		all.addActionListener(this);
		
		top = new JButton("??????");
		top.setBackground(new Color(255,239,213));
		top.setFont(new Font("EF_Diary", Font.ITALIC, 20));
		top.setBorderPainted(false);
		top.addActionListener(this);
		
		bottoms = new JButton("??????");
		bottoms.setBackground(new Color(255,239,213));
		bottoms.setFont(new Font("EF_Diary", Font.ITALIC, 20));
		bottoms.setBorderPainted(false);
		bottoms.addActionListener(this);
		
		outer = new JButton("?????????");
		outer.setBackground(new Color(255,239,213));
		outer.setFont(new Font("EF_Diary", Font.ITALIC, 20));
		outer.setBorderPainted(false);
		outer.addActionListener(this);
		
		acc = new JButton("????????????");
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
		gbc.gridy = 0; //-<??????
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		itemimagepanel.add(trueitempanel, gbc);
		trueitempanel.setBackground(Color.white);
		
		gbc.weightx = 1.0;
		gbc.gridx = 2;
		gbc.gridy = 0; //-<??????
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		itemimagepanel.add(itemnullpnl2, gbc);
		itemnullpnl2.setBackground(new Color(255,239,213));
	}
	
	
///////////////////////////////////////////////////////////////////////
	
	private void trueitempanelLayout() {
	
		trueitempanel.setLayout(new GridLayout(12,4));
		
		arrall = new ArrayList<Data>();
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
			
			trueitempanel.add(componentpanel);
		}
		
	}
	
	
///////////////////////////////////////////////////////////////
	

	
	
	
//////////////////////////////////////////////////////////////

    private void allpagemethod() { //???????????????
    	
    	trueitempanel.setLayout(new GridLayout(12,4));
		
		arrall = new ArrayList<Data>();
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
			
			trueitempanel.add(componentpanel);
		}
		
	}



///////////////////////////////////////////////////////////

    private void toppagemethod() { //???????????????
		
    	trueitempanel.setLayout(new GridLayout(3,4));
		
		arrall = new ArrayList<Data>();
		arrall = dao.readDatatop();
		
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
			
			trueitempanel.add(componentpanel);
		}
		
    	
	}



/////////////////////////////////////////////////////////////

    private void bottompagemethod() { //???????????????
		
    	trueitempanel.setLayout(new GridLayout(3,4));
		
		arrall = new ArrayList<Data>();
		arrall = dao.readDatabottoms();
		
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
			
			trueitempanel.add(componentpanel);
		}
		
	}



/////////////////////////////////////////////////////////////

    private void outerpagemethod() { //??????????????????
		
    
    	trueitempanel.setLayout(new GridLayout(3,4));
		
		arrall = new ArrayList<Data>();
		arrall = dao.readDataouter();
		
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
			
			trueitempanel.add(componentpanel);
		}
		
	}



////////////////////////////////////////////////////////////////

     private void accpagemethod() { //?????????????????????
	
	
    	trueitempanel.setLayout(new GridLayout(3,4));
 		
 		arrall = new ArrayList<Data>();
 		arrall = dao.readDataacc();
 		
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
 			
 			trueitempanel.add(componentpanel);
 		}
    }


////////////////////////////////////////////////////////////////
     
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if (obj == tf) {
	         String s = tf.getText();
	         if(s.length() <1) {
	            JOptionPane.showMessageDialog(this, "???????????? ??????????????????.",
	              "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);   //??? ????????? ????????? ????????? (this)
	         } else {
	            vecCombo.add(s);
	            tf.setText("");         //?????????
	            tf.requestFocus();      //?????? ??????
	         }
	    }
	    else if (obj == searchbtn) {
	         String s = tf.getText();
	         if(s.length() <1) {
	            JOptionPane.showMessageDialog(this, "???????????? ??????????????????.",
	             "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);   //??? ????????? ????????? ????????? (this)
	         } else {
	            vecCombo.add(s);
	            tf.setText("");         //?????????
	            tf.requestFocus();      //?????? ??????
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










