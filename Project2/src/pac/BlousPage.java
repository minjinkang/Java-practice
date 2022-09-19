package pac;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

	public class BlousPage extends JFrame{

		private JPanel blousPanel;
		private JPanel titlePanel;
		private JLabel titlelbl;
		private JPanel nullPanel;
		private JPanel itemPanel;
		private SearchDAO sd;
		private ItemPage ip;
		
		public BlousPage(String title) {
			
			setTitle(title);
			setLocation(180, 110);
			setSize(1230, 360);
			
			sd = new SearchDAO();
			
			blousPanel = new JPanel();
			blousPanel.setLayout(new BorderLayout());
			titlePanel = new JPanel();
			titlePanel.setPreferredSize(new Dimension(250, 40));
			titlePanel.setBackground(new Color(255,239,213));
			titlelbl = new JLabel("블라우스 검색 결과 ");
			titlelbl.setFont(new Font("EF_Diary", Font.ITALIC, 30));
			titlelbl.setHorizontalAlignment(JLabel.CENTER);
			
			titlePanel.add(titlelbl);
			blousPanel.add(titlePanel, BorderLayout.NORTH);
			
			nullPanel = new JPanel();
			nullPanel.setBackground(Color.WHITE);
			
			blous();
			
			add(blousPanel);
			
			setVisible(true);
		}
		
		private void blous() {
			ArrayList<SearchData> list = new ArrayList<SearchData>();
        	list = sd.readDataBlous();
        	
        	itemPanel = new JPanel();
        	itemPanel.setLayout(new GridLayout(1,4));
        	
        	
        	for(int i=0; i < list.size(); i++ ) {
	  			
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
	  			
	  			String n = list.get(i).getName();
	  			
	  			int p = list.get(i).getPrice();
	  			
	  			String im = list.get(i).getImg();
	  			
	  			JLabel namelabel = new JLabel(list.get(i).getName());
	  			
	  			JLabel pricelabel = new JLabel(list.get(i).getPrice() + "");
	  			
	  			ImageIcon imgtest = new ImageIcon(list.get(i).getImg());
	  			
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
	  			
	  			itemPanel.add(componentpanel);
	  			itemPanel.add(nullPanel);
	  			blousPanel.add(itemPanel, BorderLayout.CENTER);
	  		}
	    }
	}
///////////////////////////////////////////////////////////////////////	 반팔티
	class ShortTPage extends JFrame{

		private JPanel shortTPanel;
		private JPanel titlePanel;
		private JLabel titlelbl;
		private JPanel nullPanel;
		private JPanel itemPanel;
		private SearchDAO sd;
		private ItemPage ip;
		
		public ShortTPage(String title) {
			
			setTitle(title);
			setLocation(180, 110);
			setSize(1230, 360);
			
			sd = new SearchDAO();
			
			shortTPanel = new JPanel();
			shortTPanel.setLayout(new BorderLayout());
			titlePanel = new JPanel();
			titlePanel.setPreferredSize(new Dimension(250, 40));
			titlePanel.setBackground(new Color(255,239,213));
			titlelbl = new JLabel("반팔티 검색 결과 ");
			titlelbl.setFont(new Font("EF_Diary", Font.ITALIC, 30));
			titlelbl.setHorizontalAlignment(JLabel.CENTER);
			
			titlePanel.add(titlelbl);
			shortTPanel.add(titlePanel, BorderLayout.NORTH);
			
			nullPanel = new JPanel();
			nullPanel.setBackground(Color.WHITE);
			
			shortT();
			
			add(shortTPanel);
			
			setVisible(true);
		}
		
		private void shortT() {
			ArrayList<SearchData> list = new ArrayList<SearchData>();
        	list = sd.readDataShortT();
        	
        	itemPanel = new JPanel();
        	itemPanel.setLayout(new GridLayout(1,4));
        	
        	
        	for(int i=0; i < list.size(); i++ ) {
	  			
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
	  			
	  			String n = list.get(i).getName();
	  			
	  			int p = list.get(i).getPrice();
	  			
	  			String im = list.get(i).getImg();
	  			
	  			JLabel namelabel = new JLabel(list.get(i).getName());
	  			
	  			JLabel pricelabel = new JLabel(list.get(i).getPrice() + "");
	  			
	  			ImageIcon imgtest = new ImageIcon(list.get(i).getImg());
	  			
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
	  			
	  			itemPanel.add(componentpanel);
	  			itemPanel.add(nullPanel);
	  			shortTPanel.add(itemPanel, BorderLayout.CENTER);
	  		}
	    }
	}
//////////////////////////////////////////////////////////////////////////// 긴팔티
	class LongTPage extends JFrame{

		private JPanel longTPanel;
		private JPanel titlePanel;
		private JLabel titlelbl;
		private JPanel nullPanel;
		private JPanel itemPanel;
		private SearchDAO sd;
		private ItemPage ip;
		
		public LongTPage(String title) {
			
			setTitle(title);
			setLocation(180, 110);
			setSize(1230, 360);
			
			sd = new SearchDAO();
			
			longTPanel = new JPanel();
			longTPanel.setLayout(new BorderLayout());
			titlePanel = new JPanel();
			titlePanel.setPreferredSize(new Dimension(250, 40));
			titlePanel.setBackground(new Color(255,239,213));
			titlelbl = new JLabel("긴팔티 검색 결과 ");
			titlelbl.setFont(new Font("EF_Diary", Font.ITALIC, 30));
			titlelbl.setHorizontalAlignment(JLabel.CENTER);
			
			titlePanel.add(titlelbl);
			longTPanel.add(titlePanel, BorderLayout.NORTH);
			
			nullPanel = new JPanel();
			nullPanel.setBackground(Color.WHITE);
			
			longT();
			
			add(longTPanel);
			
			setVisible(true);
		}
		
		private void longT() {
			ArrayList<SearchData> list = new ArrayList<SearchData>();
        	list = sd.readDataLongT();
        	
        	itemPanel = new JPanel();
        	itemPanel.setLayout(new GridLayout(1,4));
        	
        	
        	for(int i=0; i < list.size(); i++ ) {
	  			
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
	  			
	  			String n = list.get(i).getName();
	  			
	  			int p = list.get(i).getPrice();
	  			
	  			String im = list.get(i).getImg();
	  			
	  			JLabel namelabel = new JLabel(list.get(i).getName());
	  			
	  			JLabel pricelabel = new JLabel(list.get(i).getPrice() + "");
	  			
	  			ImageIcon imgtest = new ImageIcon(list.get(i).getImg());
	  			
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
	  			
	  			itemPanel.add(componentpanel);
	  			itemPanel.add(nullPanel);
	  			longTPanel.add(itemPanel, BorderLayout.CENTER);
	  		}
	    }
	}
//////////////////////////////////////////////////////////////////////// 셔츠
	class ShirtsPage extends JFrame{

		private JPanel shirtsPanel;
		private JPanel titlePanel;
		private JLabel titlelbl;
		private JPanel nullPanel;
		private JPanel itemPanel;
		private SearchDAO sd;
		private ItemPage ip;
		
		public ShirtsPage(String title) {
			
			setTitle(title);
			setLocation(180, 110);
			setSize(1230, 360);
			
			sd = new SearchDAO();
			
			shirtsPanel = new JPanel();
			shirtsPanel.setLayout(new BorderLayout());
			titlePanel = new JPanel();
			titlePanel.setPreferredSize(new Dimension(250, 40));
			titlePanel.setBackground(new Color(255,239,213));
			titlelbl = new JLabel("셔츠 검색 결과 ");
			titlelbl.setFont(new Font("EF_Diary", Font.ITALIC, 30));
			titlelbl.setHorizontalAlignment(JLabel.CENTER);
			
			titlePanel.add(titlelbl);
			shirtsPanel.add(titlePanel, BorderLayout.NORTH);
			
			nullPanel = new JPanel();
			nullPanel.setBackground(Color.WHITE);
			
			shirts();
			
			add(shirtsPanel);
			
			setVisible(true);
		}
		
		private void shirts() {
			ArrayList<SearchData> list = new ArrayList<SearchData>();
        	list = sd.readDataShirts();
        	
        	itemPanel = new JPanel();
        	itemPanel.setLayout(new GridLayout(1,4));
        	
        	
        	for(int i=0; i < list.size(); i++ ) {
	  			
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
	  			
	  			String n = list.get(i).getName();
	  			
	  			int p = list.get(i).getPrice();
	  			
	  			String im = list.get(i).getImg();
	  			
	  			JLabel namelabel = new JLabel(list.get(i).getName());
	  			
	  			JLabel pricelabel = new JLabel(list.get(i).getPrice() + "");
	  			
	  			ImageIcon imgtest = new ImageIcon(list.get(i).getImg());
	  			
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
	  			
	  			itemPanel.add(componentpanel);
	  			itemPanel.add(nullPanel);
	  			shirtsPanel.add(itemPanel, BorderLayout.CENTER);
	  		}
	    }
	}
////////////////////////////////////////////////////////////////////////////////	반바지
	class ShotPPage extends JFrame{
		
		private JPanel shotPPanel;
		private JPanel titlePanel;
		private JLabel titlelbl;
		private JPanel nullPanel;
		private JPanel itemPanel;
		private SearchDAO sd;
		private ItemPage ip;
		
		public ShotPPage(String title) {
			
			setTitle(title);
			setLocation(180, 110);
			setSize(1230, 360);
			
			sd = new SearchDAO();
			
			shotPPanel = new JPanel();
			shotPPanel.setLayout(new BorderLayout());
			titlePanel = new JPanel();
			titlePanel.setPreferredSize(new Dimension(250, 40));
			titlePanel.setBackground(new Color(255,239,213));
			titlelbl = new JLabel("반바지 검색 결과 ");
			titlelbl.setFont(new Font("EF_Diary", Font.ITALIC, 30));
			titlelbl.setHorizontalAlignment(JLabel.CENTER);
			
			titlePanel.add(titlelbl);
			shotPPanel.add(titlePanel, BorderLayout.NORTH);
			
			nullPanel = new JPanel();
			nullPanel.setBackground(Color.WHITE);
			
			shotP();
			
			add(shotPPanel);
			
			setVisible(true);
		}
		
		private void shotP() {
			ArrayList<SearchData> list = new ArrayList<SearchData>();
			list = sd.readDataShotP();
			
			itemPanel = new JPanel();
			itemPanel.setLayout(new GridLayout(1,4));
			
			
			for(int i=0; i < list.size(); i++ ) {
				
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
				
				String n = list.get(i).getName();
				
				int p = list.get(i).getPrice();
				
				String im = list.get(i).getImg();
				
				JLabel namelabel = new JLabel(list.get(i).getName());
				
				JLabel pricelabel = new JLabel(list.get(i).getPrice() + "");
				
				ImageIcon imgtest = new ImageIcon(list.get(i).getImg());
				
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
				
				itemPanel.add(componentpanel);
				itemPanel.add(nullPanel);
				shotPPanel.add(itemPanel, BorderLayout.CENTER);
			}
		}
	}
/////////////////////////////////////////////////////////////////////////////	긴바지
	class LongPPage extends JFrame{
		
		private JPanel longPPanel;
		private JPanel titlePanel;
		private JLabel titlelbl;
		private JPanel nullPanel;
		private JPanel itemPanel;
		private SearchDAO sd;
		private ItemPage ip;
		
		public LongPPage(String title) {
			
			setTitle(title);
			setLocation(180, 110);
			setSize(1230, 360);
			
			sd = new SearchDAO();
			
			longPPanel = new JPanel();
			longPPanel.setLayout(new BorderLayout());
			titlePanel = new JPanel();
			titlePanel.setPreferredSize(new Dimension(250, 40));
			titlePanel.setBackground(new Color(255,239,213));
			titlelbl = new JLabel("긴바지 검색 결과 ");
			titlelbl.setFont(new Font("EF_Diary", Font.ITALIC, 30));
			titlelbl.setHorizontalAlignment(JLabel.CENTER);
			
			titlePanel.add(titlelbl);
			longPPanel.add(titlePanel, BorderLayout.NORTH);
			
			nullPanel = new JPanel();
			nullPanel.setBackground(Color.WHITE);
			
			longP();
			
			add(longPPanel);
			
			setVisible(true);
		}
		
		private void longP() {
			ArrayList<SearchData> list = new ArrayList<SearchData>();
			list = sd.readDataLongP();
			
			itemPanel = new JPanel();
			itemPanel.setLayout(new GridLayout(1,4));
			
			
			for(int i=0; i < list.size(); i++ ) {
				
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
				
				String n = list.get(i).getName();
				
				int p = list.get(i).getPrice();
				
				String im = list.get(i).getImg();
				
				JLabel namelabel = new JLabel(list.get(i).getName());
				
				JLabel pricelabel = new JLabel(list.get(i).getPrice() + "");
				
				ImageIcon imgtest = new ImageIcon(list.get(i).getImg());
				
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
				
				itemPanel.add(componentpanel);
				itemPanel.add(nullPanel);
				longPPanel.add(itemPanel, BorderLayout.CENTER);
			}
		}
	}
///////////////////////////////////////////////////////////////////////////////	숏치마
	class ShotSPage extends JFrame{
		
		private JPanel shotSPanel;
		private JPanel titlePanel;
		private JLabel titlelbl;
		private JPanel nullPanel;
		private JPanel itemPanel;
		private SearchDAO sd;
		private ItemPage ip;
		
		public ShotSPage(String title) {
			
			setTitle(title);
			setLocation(180, 110);
			setSize(1230, 360);
			
			sd = new SearchDAO();
			
			shotSPanel = new JPanel();
			shotSPanel.setLayout(new BorderLayout());
			titlePanel = new JPanel();
			titlePanel.setPreferredSize(new Dimension(250, 40));
			titlePanel.setBackground(new Color(255,239,213));
			titlelbl = new JLabel("숏치마 검색 결과 ");
			titlelbl.setFont(new Font("EF_Diary", Font.ITALIC, 30));
			titlelbl.setHorizontalAlignment(JLabel.CENTER);
			
			titlePanel.add(titlelbl);
			shotSPanel.add(titlePanel, BorderLayout.NORTH);
			
			nullPanel = new JPanel();
			nullPanel.setBackground(Color.WHITE);
			
			shotS();
			
			add(shotSPanel);
			
			setVisible(true);
		}
		
		private void shotS() {
			ArrayList<SearchData> list = new ArrayList<SearchData>();
			list = sd.readDataShotS();
			
			itemPanel = new JPanel();
			itemPanel.setLayout(new GridLayout(1,4));
			
			
			for(int i=0; i < list.size(); i++ ) {
				
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
				
				String n = list.get(i).getName();
				
				int p = list.get(i).getPrice();
				
				String im = list.get(i).getImg();
				
				JLabel namelabel = new JLabel(list.get(i).getName());
				
				JLabel pricelabel = new JLabel(list.get(i).getPrice() + "");
				
				ImageIcon imgtest = new ImageIcon(list.get(i).getImg());
				
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
				
				itemPanel.add(componentpanel);
				itemPanel.add(nullPanel);
				shotSPanel.add(itemPanel, BorderLayout.CENTER);
			}
		}
	}	
/////////////////////////////////////////////////////////////////////	롱치마
	class LongSPage extends JFrame{
		
		private JPanel longSPanel;
		private JPanel titlePanel;
		private JLabel titlelbl;
		private JPanel nullPanel;
		private JPanel itemPanel;
		private SearchDAO sd;
		private ItemPage ip;
		
		public LongSPage(String title) {
			
			setTitle(title);
			setLocation(180, 110);
			setSize(1230, 360);
			
			sd = new SearchDAO();
			
			longSPanel = new JPanel();
			longSPanel.setLayout(new BorderLayout());
			titlePanel = new JPanel();
			titlePanel.setPreferredSize(new Dimension(250, 40));
			titlePanel.setBackground(new Color(255,239,213));
			titlelbl = new JLabel("롱치마 검색 결과 ");
			titlelbl.setFont(new Font("EF_Diary", Font.ITALIC, 30));
			titlelbl.setHorizontalAlignment(JLabel.CENTER);
			
			titlePanel.add(titlelbl);
			longSPanel.add(titlePanel, BorderLayout.NORTH);
			
			nullPanel = new JPanel();
			nullPanel.setBackground(Color.WHITE);
			
			longS();
			
			add(longSPanel);
			
			setVisible(true);
		}
		
		private void longS() {
			ArrayList<SearchData> list = new ArrayList<SearchData>();
			list = sd.readDataLongS();
			
			itemPanel = new JPanel();
			itemPanel.setLayout(new GridLayout(1,4));
			
			
			for(int i=0; i < list.size(); i++ ) {
				
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
				
				String n = list.get(i).getName();
				
				int p = list.get(i).getPrice();
				
				String im = list.get(i).getImg();
				
				JLabel namelabel = new JLabel(list.get(i).getName());
				
				JLabel pricelabel = new JLabel(list.get(i).getPrice() + "");
				
				ImageIcon imgtest = new ImageIcon(list.get(i).getImg());
				
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
				
				itemPanel.add(componentpanel);
				itemPanel.add(nullPanel);
				longSPanel.add(itemPanel, BorderLayout.CENTER);
			}
		}
	}	
//////////////////////////////////////////////////////////////////////////////	가디건
	class CadiganPage extends JFrame{
		
		private JPanel cadiganPanel;
		private JPanel titlePanel;
		private JLabel titlelbl;
		private JPanel nullPanel;
		private JPanel itemPanel;
		private SearchDAO sd;
		private ItemPage ip;
		
		public CadiganPage(String title) {
			
			setTitle(title);
			setLocation(180, 110);
			setSize(1230, 360);
			
			sd = new SearchDAO();
			
			cadiganPanel = new JPanel();
			cadiganPanel.setLayout(new BorderLayout());
			titlePanel = new JPanel();
			titlePanel.setPreferredSize(new Dimension(250, 40));
			titlePanel.setBackground(new Color(255,239,213));
			titlelbl = new JLabel("가디건 검색 결과 ");
			titlelbl.setFont(new Font("EF_Diary", Font.ITALIC, 30));
			titlelbl.setHorizontalAlignment(JLabel.CENTER);
			
			titlePanel.add(titlelbl);
			cadiganPanel.add(titlePanel, BorderLayout.NORTH);
			
			nullPanel = new JPanel();
			nullPanel.setBackground(Color.WHITE);
			
			cadigan();
			
			add(cadiganPanel);
			
			setVisible(true);
		}
		
		private void cadigan() {
			ArrayList<SearchData> list = new ArrayList<SearchData>();
			list = sd.readDataCadigan();
			
			itemPanel = new JPanel();
			itemPanel.setLayout(new GridLayout(1,4));
			
			
			for(int i=0; i < list.size(); i++ ) {
				
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
				
				String n = list.get(i).getName();
				
				int p = list.get(i).getPrice();
				
				String im = list.get(i).getImg();
				
				JLabel namelabel = new JLabel(list.get(i).getName());
				
				JLabel pricelabel = new JLabel(list.get(i).getPrice() + "");
				
				ImageIcon imgtest = new ImageIcon(list.get(i).getImg());
				
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
				
				itemPanel.add(componentpanel);
				itemPanel.add(nullPanel);
				cadiganPanel.add(itemPanel, BorderLayout.CENTER);
			}
		}
	}
///////////////////////////////////////////////////////// 트위드	
	class TweedPage extends JFrame{
		
		private JPanel tweedPanel;
		private JPanel titlePanel;
		private JLabel titlelbl;
		private JPanel nullPanel;
		private JPanel itemPanel;
		private SearchDAO sd;
		private ItemPage ip;
		
		public TweedPage(String title) {
			
			setTitle(title);
			setLocation(180, 110);
			setSize(1230, 360);
			
			sd = new SearchDAO();
			
			tweedPanel = new JPanel();
			tweedPanel.setLayout(new BorderLayout());
			titlePanel = new JPanel();
			titlePanel.setPreferredSize(new Dimension(250, 40));
			titlePanel.setBackground(new Color(255,239,213));
			titlelbl = new JLabel("트위드 검색 결과 ");
			titlelbl.setFont(new Font("EF_Diary", Font.ITALIC, 30));
			titlelbl.setHorizontalAlignment(JLabel.CENTER);
			
			titlePanel.add(titlelbl);
			tweedPanel.add(titlePanel, BorderLayout.NORTH);
			
			nullPanel = new JPanel();
			nullPanel.setBackground(Color.WHITE);
			
			tweed();
			
			add(tweedPanel);
			
			setVisible(true);
		}
		
		private void tweed() {
			ArrayList<SearchData> list = new ArrayList<SearchData>();
			list = sd.readDataTweed();
			
			itemPanel = new JPanel();
			itemPanel.setLayout(new GridLayout(1,4));
			
			
			for(int i=0; i < list.size(); i++ ) {
				
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
				
				String n = list.get(i).getName();
				
				int p = list.get(i).getPrice();
				
				String im = list.get(i).getImg();
				
				JLabel namelabel = new JLabel(list.get(i).getName());
				
				JLabel pricelabel = new JLabel(list.get(i).getPrice() + "");
				
				ImageIcon imgtest = new ImageIcon(list.get(i).getImg());
				
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
				
				itemPanel.add(componentpanel);
				itemPanel.add(nullPanel);
				tweedPanel.add(itemPanel, BorderLayout.CENTER);
			}
		}
	}	
///////////////////////////////////////////////////////////////////////	반팔자켓
	class ShotJPage extends JFrame{
		
		private JPanel shotJPanel;
		private JPanel titlePanel;
		private JLabel titlelbl;
		private JPanel nullPanel;
		private JPanel itemPanel;
		private SearchDAO sd;
		private ItemPage ip;
		
		public ShotJPage(String title) {
			
			setTitle(title);
			setLocation(180, 110);
			setSize(1230, 360);
			
			sd = new SearchDAO();
			
			shotJPanel = new JPanel();
			shotJPanel.setLayout(new BorderLayout());
			titlePanel = new JPanel();
			titlePanel.setPreferredSize(new Dimension(250, 40));
			titlePanel.setBackground(new Color(255,239,213));
			titlelbl = new JLabel("반팔자켓 검색 결과 ");
			titlelbl.setFont(new Font("EF_Diary", Font.ITALIC, 30));
			titlelbl.setHorizontalAlignment(JLabel.CENTER);
			
			titlePanel.add(titlelbl);
			shotJPanel.add(titlePanel, BorderLayout.NORTH);
			
			nullPanel = new JPanel();
			nullPanel.setBackground(Color.WHITE);
			
			shotJ();
			
			add(shotJPanel);
			
			setVisible(true);
		}
		
		private void shotJ() {
			ArrayList<SearchData> list = new ArrayList<SearchData>();
			list = sd.readDataShotJ();
			
			itemPanel = new JPanel();
			itemPanel.setLayout(new GridLayout(1,4));
			
			
			for(int i=0; i < list.size(); i++ ) {
				
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
				
				String n = list.get(i).getName();
				
				int p = list.get(i).getPrice();
				
				String im = list.get(i).getImg();
				
				JLabel namelabel = new JLabel(list.get(i).getName());
				
				JLabel pricelabel = new JLabel(list.get(i).getPrice() + "");
				
				ImageIcon imgtest = new ImageIcon(list.get(i).getImg());
				
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
				
				itemPanel.add(componentpanel);
				itemPanel.add(nullPanel);
				shotJPanel.add(itemPanel, BorderLayout.CENTER);
			}
		}
	}
///////////////////////////////////////////////////////////////// 긴팔자켓	
	class LongJPage extends JFrame{
		
		private JPanel longJPanel;
		private JPanel titlePanel;
		private JLabel titlelbl;
		private JPanel nullPanel;
		private JPanel itemPanel;
		private SearchDAO sd;
		private ItemPage ip;
		
		public LongJPage(String title) {
			
			setTitle(title);
			setLocation(180, 110);
			setSize(1230, 360);
			
			sd = new SearchDAO();
			
			longJPanel = new JPanel();
			longJPanel.setLayout(new BorderLayout());
			titlePanel = new JPanel();
			titlePanel.setPreferredSize(new Dimension(250, 40));
			titlePanel.setBackground(new Color(255,239,213));
			titlelbl = new JLabel("긴팔자켓 검색 결과 ");
			titlelbl.setFont(new Font("EF_Diary", Font.ITALIC, 30));
			titlelbl.setHorizontalAlignment(JLabel.CENTER);
			
			titlePanel.add(titlelbl);
			longJPanel.add(titlePanel, BorderLayout.NORTH);
			
			nullPanel = new JPanel();
			nullPanel.setBackground(Color.WHITE);
			
			longJ();
			
			add(longJPanel);
			
			setVisible(true);
		}
		
		private void longJ() {
			ArrayList<SearchData> list = new ArrayList<SearchData>();
			list = sd.readDataLongJ();
			
			itemPanel = new JPanel();
			itemPanel.setLayout(new GridLayout(1,4));
			
			
			for(int i=0; i < list.size(); i++ ) {
				
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
				
				String n = list.get(i).getName();
				
				int p = list.get(i).getPrice();
				
				String im = list.get(i).getImg();
				
				JLabel namelabel = new JLabel(list.get(i).getName());
				
				JLabel pricelabel = new JLabel(list.get(i).getPrice() + "");
				
				ImageIcon imgtest = new ImageIcon(list.get(i).getImg());
				
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
				
				itemPanel.add(componentpanel);
				itemPanel.add(nullPanel);
				longJPanel.add(itemPanel, BorderLayout.CENTER);
			}
		}
	}
///////////////////////////////////////////////////////////////////////// 귀걸이
	class EarPage extends JFrame{
		
		private JPanel EarPanel;
		private JPanel titlePanel;
		private JLabel titlelbl;
		private JPanel nullPanel;
		private JPanel itemPanel;
		private SearchDAO sd;
		private ItemPage ip;
		
		public EarPage(String title) {
			
			setTitle(title);
			setLocation(180, 110);
			setSize(1230, 360);
			
			sd = new SearchDAO();
			
			EarPanel = new JPanel();
			EarPanel.setLayout(new BorderLayout());
			titlePanel = new JPanel();
			titlePanel.setPreferredSize(new Dimension(250, 40));
			titlePanel.setBackground(new Color(255,239,213));
			titlelbl = new JLabel("귀걸이 검색 결과 ");
			titlelbl.setFont(new Font("EF_Diary", Font.ITALIC, 30));
			titlelbl.setHorizontalAlignment(JLabel.CENTER);
			
			titlePanel.add(titlelbl);
			EarPanel.add(titlePanel, BorderLayout.NORTH);
			
			nullPanel = new JPanel();
			nullPanel.setBackground(Color.WHITE);
			
			ear();
			
			add(EarPanel);
			
			setVisible(true);
		}
		
		private void ear() {
			ArrayList<SearchData> list = new ArrayList<SearchData>();
			list = sd.readDataEar();
			
			itemPanel = new JPanel();
			itemPanel.setLayout(new GridLayout(1,4));
			
			
			for(int i=0; i < list.size(); i++ ) {
				
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
				
				String n = list.get(i).getName();
				
				int p = list.get(i).getPrice();
				
				String im = list.get(i).getImg();
				
				JLabel namelabel = new JLabel(list.get(i).getName());
				
				JLabel pricelabel = new JLabel(list.get(i).getPrice() + "");
				
				ImageIcon imgtest = new ImageIcon(list.get(i).getImg());
				
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
				
				itemPanel.add(componentpanel);
				itemPanel.add(nullPanel);
				EarPanel.add(itemPanel, BorderLayout.CENTER);
			}
		}
	}
////////////////////////////////////////////////////////////////// 목걸이	
	class NeckPage extends JFrame{
		
		private JPanel NeckPanel;
		private JPanel titlePanel;
		private JLabel titlelbl;
		private JPanel nullPanel;
		private JPanel itemPanel;
		private SearchDAO sd;
		private ItemPage ip;
		
		public NeckPage(String title) {
			
			setTitle(title);
			setLocation(180, 110);
			setSize(1230, 360);
			
			sd = new SearchDAO();
			
			NeckPanel = new JPanel();
			NeckPanel.setLayout(new BorderLayout());
			titlePanel = new JPanel();
			titlePanel.setPreferredSize(new Dimension(250, 40));
			titlePanel.setBackground(new Color(255,239,213));
			titlelbl = new JLabel("목걸이 검색 결과 ");
			titlelbl.setFont(new Font("EF_Diary", Font.ITALIC, 30));
			titlelbl.setHorizontalAlignment(JLabel.CENTER);
			
			titlePanel.add(titlelbl);
			NeckPanel.add(titlePanel, BorderLayout.NORTH);
			
			nullPanel = new JPanel();
			nullPanel.setBackground(Color.WHITE);
			
			neck();
			
			add(NeckPanel);
			
			setVisible(true);
		}
		
		private void neck() {
			ArrayList<SearchData> list = new ArrayList<SearchData>();
			list = sd.readDataNeck();
			
			itemPanel = new JPanel();
			itemPanel.setLayout(new GridLayout(1,4));
			
			
			for(int i=0; i < list.size(); i++ ) {
				
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
				
				String n = list.get(i).getName();
				
				int p = list.get(i).getPrice();
				
				String im = list.get(i).getImg();
				
				JLabel namelabel = new JLabel(list.get(i).getName());
				
				JLabel pricelabel = new JLabel(list.get(i).getPrice() + "");
				
				ImageIcon imgtest = new ImageIcon(list.get(i).getImg());
				
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
				
				itemPanel.add(componentpanel);
				itemPanel.add(nullPanel);
				NeckPanel.add(itemPanel, BorderLayout.CENTER);
			}
		}
	}	
//////////////////////////////////////////////////////////////////////// 반지	
	class RingPage extends JFrame{
		
		private JPanel ringPanel;
		private JPanel titlePanel;
		private JLabel titlelbl;
		private JPanel nullPanel;
		private JPanel itemPanel;
		private SearchDAO sd;
		private ItemPage ip;
		
		public RingPage(String title) {
			
			setTitle(title);
			setLocation(180, 110);
			setSize(1230, 360);
			
			sd = new SearchDAO();
			
			ringPanel = new JPanel();
			ringPanel.setLayout(new BorderLayout());
			titlePanel = new JPanel();
			titlePanel.setPreferredSize(new Dimension(250, 40));
			titlePanel.setBackground(new Color(255,239,213));
			titlelbl = new JLabel("반지 검색 결과 ");
			titlelbl.setFont(new Font("EF_Diary", Font.ITALIC, 30));
			titlelbl.setHorizontalAlignment(JLabel.CENTER);
			
			titlePanel.add(titlelbl);
			ringPanel.add(titlePanel, BorderLayout.NORTH);
			
			nullPanel = new JPanel();
			nullPanel.setBackground(Color.WHITE);
			
			ring();
			
			add(ringPanel);
			
			setVisible(true);
		}
		
		private void ring() {
			ArrayList<SearchData> list = new ArrayList<SearchData>();
			list = sd.readDataRing();
			
			itemPanel = new JPanel();
			itemPanel.setLayout(new GridLayout(1,4));
			
			
			for(int i=0; i < list.size(); i++ ) {
				
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
				
				String n = list.get(i).getName();
				
				int p = list.get(i).getPrice();
				
				String im = list.get(i).getImg();
				
				JLabel namelabel = new JLabel(list.get(i).getName());
				
				JLabel pricelabel = new JLabel(list.get(i).getPrice() + "");
				
				ImageIcon imgtest = new ImageIcon(list.get(i).getImg());
				
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
				
				itemPanel.add(componentpanel);
				itemPanel.add(nullPanel);
				ringPanel.add(itemPanel, BorderLayout.CENTER);
			}
		}
	}
/////////////////////////////////////////////////////////////////머리끈	
	class HairBandPage extends JFrame{
		
		private JPanel hairPanel;
		private JPanel titlePanel;
		private JLabel titlelbl;
		private JPanel nullPanel;
		private JPanel itemPanel;
		private SearchDAO sd;
		private ItemPage ip;
		
		public HairBandPage(String title) {
			
			setTitle(title);
			setLocation(180, 110);
			setSize(1230, 360);
			
			sd = new SearchDAO();
			
			hairPanel = new JPanel();
			hairPanel.setLayout(new BorderLayout());
			titlePanel = new JPanel();
			titlePanel.setPreferredSize(new Dimension(250, 40));
			titlePanel.setBackground(new Color(255,239,213));
			titlelbl = new JLabel("머리끈 검색 결과 ");
			titlelbl.setFont(new Font("EF_Diary", Font.ITALIC, 30));
			titlelbl.setHorizontalAlignment(JLabel.CENTER);
			
			titlePanel.add(titlelbl);
			hairPanel.add(titlePanel, BorderLayout.NORTH);
			
			nullPanel = new JPanel();
			nullPanel.setBackground(Color.WHITE);
			
			hair();
			
			add(hairPanel);
			
			setVisible(true);
		}
		
		private void hair() {
			ArrayList<SearchData> list = new ArrayList<SearchData>();
			list = sd.readDataHairBand();
			
			itemPanel = new JPanel();
			itemPanel.setLayout(new GridLayout(1,4));
			
			
			for(int i=0; i < list.size(); i++ ) {
				
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
				
				String n = list.get(i).getName();
				
				int p = list.get(i).getPrice();
				
				String im = list.get(i).getImg();
				
				JLabel namelabel = new JLabel(list.get(i).getName());
				
				JLabel pricelabel = new JLabel(list.get(i).getPrice() + "");
				
				ImageIcon imgtest = new ImageIcon(list.get(i).getImg());
				
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
				
				itemPanel.add(componentpanel);
				itemPanel.add(nullPanel);
				hairPanel.add(itemPanel, BorderLayout.CENTER);
			}
		}
	}	
/////////////////////////////////////////////////////////////////////////	티셔츠
	class TshirtsPage extends JFrame{
		
		private JPanel tshirtsPanel;
		private JPanel titlePanel;
		private JLabel titlelbl;
		private JPanel nullPanel;
		private JPanel itemPanel;
		private SearchDAO sd;
		private ItemPage ip;
		
		public TshirtsPage(String title) {
			
			setTitle(title);
			setLocation(180, 110);
			setSize(1230, 640);
			
			sd = new SearchDAO();
			
			tshirtsPanel = new JPanel();
			tshirtsPanel.setLayout(new BorderLayout());
			titlePanel = new JPanel();
			titlePanel.setPreferredSize(new Dimension(250, 40));
			titlePanel.setBackground(new Color(255,239,213));
			titlelbl = new JLabel("티셔츠 검색 결과 ");
			titlelbl.setFont(new Font("EF_Diary", Font.ITALIC, 30));
			titlelbl.setHorizontalAlignment(JLabel.CENTER);
			
			titlePanel.add(titlelbl);
			tshirtsPanel.add(titlePanel, BorderLayout.NORTH);
			
			nullPanel = new JPanel();
			nullPanel.setBackground(Color.WHITE);
			
			tshirts();
			
			add(tshirtsPanel);
			
			setVisible(true);
		}
		
		private void tshirts() {
			ArrayList<SearchData> list = new ArrayList<SearchData>();
			list = sd.readDataTshirts();
			
			itemPanel = new JPanel();
			itemPanel.setLayout(new GridLayout(2,4));
			itemPanel.setBackground(Color.WHITE);
			
			for(int i=0; i < list.size(); i++ ) {
				
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
				
				String n = list.get(i).getName();
				
				int p = list.get(i).getPrice();
				
				String im = list.get(i).getImg();
				
				JLabel namelabel = new JLabel(list.get(i).getName());
				
				JLabel pricelabel = new JLabel(list.get(i).getPrice() + "");
				
				ImageIcon imgtest = new ImageIcon(list.get(i).getImg());
				
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
				
				itemPanel.add(componentpanel);
				itemPanel.add(nullPanel);
				tshirtsPanel.add(itemPanel, BorderLayout.CENTER);
			}
		}
	}
///////////////////////////////////////////////////////////////////// 바지	
	class PantsPage extends JFrame{
		
		private JPanel pantsPanel;
		private JPanel titlePanel;
		private JLabel titlelbl;
		private JPanel nullPanel;
		private JPanel itemPanel;
		private SearchDAO sd;
		private ItemPage ip;
		
		public PantsPage(String title) {
			
			setTitle(title);
			setLocation(180, 110);
			setSize(1230, 640);
			
			sd = new SearchDAO();
			
			pantsPanel = new JPanel();
			pantsPanel.setLayout(new BorderLayout());
			titlePanel = new JPanel();
			titlePanel.setPreferredSize(new Dimension(250, 40));
			titlePanel.setBackground(new Color(255,239,213));
			titlelbl = new JLabel("바지 검색 결과 ");
			titlelbl.setFont(new Font("EF_Diary", Font.ITALIC, 30));
			titlelbl.setHorizontalAlignment(JLabel.CENTER);
			
			titlePanel.add(titlelbl);
			pantsPanel.add(titlePanel, BorderLayout.NORTH);
			
			nullPanel = new JPanel();
			nullPanel.setBackground(Color.WHITE);
			
			pants();
			
			add(pantsPanel);
			
			setVisible(true);
		}
		
		private void pants() {
			ArrayList<SearchData> list = new ArrayList<SearchData>();
			list = sd.readDataPants();
			
			itemPanel = new JPanel();
			itemPanel.setLayout(new GridLayout(2,4));
			itemPanel.setBackground(Color.WHITE);
			
			for(int i=0; i < list.size(); i++ ) {
				
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
				
				String n = list.get(i).getName();
				
				int p = list.get(i).getPrice();
				
				String im = list.get(i).getImg();
				
				JLabel namelabel = new JLabel(list.get(i).getName());
				
				JLabel pricelabel = new JLabel(list.get(i).getPrice() + "");
				
				ImageIcon imgtest = new ImageIcon(list.get(i).getImg());
				
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
				
				itemPanel.add(componentpanel);
				itemPanel.add(nullPanel);
				pantsPanel.add(itemPanel, BorderLayout.CENTER);
			}
		}
	}
/////////////////////////////////////////////////////////////////////// 치마	
	class SkirtPage extends JFrame{
		
		private JPanel skirtPanel;
		private JPanel titlePanel;
		private JLabel titlelbl;
		private JPanel nullPanel;
		private JPanel itemPanel;
		private SearchDAO sd;
		private ItemPage ip;
		
		public SkirtPage(String title) {
			
			setTitle(title);
			setLocation(180, 110);
			setSize(1230, 640);
			
			sd = new SearchDAO();
			
			skirtPanel = new JPanel();
			skirtPanel.setLayout(new BorderLayout());
			titlePanel = new JPanel();
			titlePanel.setPreferredSize(new Dimension(250, 40));
			titlePanel.setBackground(new Color(255,239,213));
			titlelbl = new JLabel("치마 검색 결과 ");
			titlelbl.setFont(new Font("EF_Diary", Font.ITALIC, 30));
			titlelbl.setHorizontalAlignment(JLabel.CENTER);
			
			titlePanel.add(titlelbl);
			skirtPanel.add(titlePanel, BorderLayout.NORTH);
			
			nullPanel = new JPanel();
			nullPanel.setBackground(Color.WHITE);
			
			skirt();
			
			add(skirtPanel);
			
			setVisible(true);
		}
		
		private void skirt() {
			ArrayList<SearchData> list = new ArrayList<SearchData>();
			list = sd.readDataSkirt();
			
			itemPanel = new JPanel();
			itemPanel.setLayout(new GridLayout(2,4));
			itemPanel.setBackground(Color.WHITE);
			
			for(int i=0; i < list.size(); i++ ) {
				
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
				
				String n = list.get(i).getName();
				
				int p = list.get(i).getPrice();
				
				String im = list.get(i).getImg();
				
				JLabel namelabel = new JLabel(list.get(i).getName());
				
				JLabel pricelabel = new JLabel(list.get(i).getPrice() + "");
				
				ImageIcon imgtest = new ImageIcon(list.get(i).getImg());
				
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
				
				itemPanel.add(componentpanel);
				itemPanel.add(nullPanel);
				skirtPanel.add(itemPanel, BorderLayout.CENTER);
			}
		}
	}	
///////////////////////////////////////////////////////////////// 자켓	
	class JacketPage extends JFrame{
		
		private JPanel jacketPanel;
		private JPanel titlePanel;
		private JLabel titlelbl;
		private JPanel nullPanel;
		private JPanel nullPanel2;
		private JPanel itemPanel;
		private SearchDAO sd;
		private ItemPage ip;
		
		public JacketPage(String title) {
			
			setTitle(title);
			setLocation(180, 110);
			setSize(1230, 640);
			
			sd = new SearchDAO();
			
			jacketPanel = new JPanel();
			jacketPanel.setLayout(new BorderLayout());
			titlePanel = new JPanel();
			titlePanel.setPreferredSize(new Dimension(250, 40));
			titlePanel.setBackground(new Color(255,239,213));
			titlelbl = new JLabel("자켓 검색 결과 ");
			titlelbl.setFont(new Font("EF_Diary", Font.ITALIC, 30));
			titlelbl.setHorizontalAlignment(JLabel.CENTER);
			
			titlePanel.add(titlelbl);
			jacketPanel.add(titlePanel, BorderLayout.NORTH);
			
			nullPanel = new JPanel();
			nullPanel.setBackground(Color.WHITE);
			
			jacket();
			
			add(jacketPanel);
			
			setVisible(true);
		}
		
		private void jacket() {
			ArrayList<SearchData> list = new ArrayList<SearchData>();
			list = sd.readDataJacket();
			
			itemPanel = new JPanel();
			itemPanel.setLayout(new GridLayout(2,4));
			itemPanel.setBackground(Color.WHITE);
			
			for(int i=0; i < list.size(); i++ ) {
				
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
				
				String n = list.get(i).getName();
				
				int p = list.get(i).getPrice();
				
				String im = list.get(i).getImg();
				
				JLabel namelabel = new JLabel(list.get(i).getName());
				
				JLabel pricelabel = new JLabel(list.get(i).getPrice() + "");
				
				ImageIcon imgtest = new ImageIcon(list.get(i).getImg());
				
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
				
				itemPanel.add(componentpanel);
				itemPanel.add(nullPanel);
				jacketPanel.add(itemPanel, BorderLayout.CENTER);
			}
		}
	}	
