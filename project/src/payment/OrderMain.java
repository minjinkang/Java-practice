package payment;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class OrderMain extends JFrame implements ActionListener{
	
	public JToolBar toolBar;
	public JPanel panel1;
	public JPanel panel2;
	public JButton btnBack;
	public JButton btncouponlist;
	public JButton btnorder;
	
	public Coupon coupon;
	public PayInfo payinfo;
	private List<ProductInfoVO> productInfoList = new ArrayList<>();
	public List<JLabel> ProductInfoJLabelList = new ArrayList<JLabel>();
	private String productname;
	private int productprice;
	private String productimage;

	public OrderMain(List<ProductInfoVO> piVO) {
		productInfoList = piVO;
		setTitle("장바구니");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(100,100);
		setSize(500,500);
		setLayout(new BorderLayout());
		
		setToolBar(); 
		setPanel1(); 
		setPanel2();
		
		setVisible(true);
	}
	
	
	
	private void setToolBar() {	
		toolBar = new JToolBar();
		ImageIcon iconBack = new ImageIcon("images/back2.png");
		Image img = iconBack.getImage();
		
		Image changeImg = img.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		
		btnBack = new JButton(changeIcon);
		btnBack.addActionListener(this);
		
		toolBar.add(btnBack);
		toolBar.addSeparator();
		toolBar.add(new JLabel("장바구니"));
		
		
		
		//toolBar.setFont(new Font("Agency FB", Font.ITALIC, 40)); 
		toolBar.setBackground(new Color(255,239,213)); 
		add(toolBar, BorderLayout.NORTH);
	}


	private void setPanel1() { 
		panel1 = new JPanel();

		for(ProductInfoVO i : productInfoList) {
	         ImageIcon imgiconproduct = new ImageIcon(i.getProductimage());
	         Image img2 = imgiconproduct.getImage();
	         
	         Image changeImg = img2.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	         ImageIcon changeIcon = new ImageIcon(changeImg);
	         
			JLabel label1 = new JLabel(i.getProductname() + "/" + Integer.toString(i.getProductprice()),changeIcon,JLabel.CENTER);
			ProductInfoJLabelList.add(label1);
			
//			JLabel label2 = new JLabel("전체 상품 가격" + " : " + i.getProductprice());
//			ProductInfoJLabelList.add(label2);

			panel1.add(label1);
			panel1.setBackground(SystemColor.inactiveCaptionBorder);		
			
		}

		add(panel1);
}
	
	private void setPanel2() {	
		panel2 = new JPanel();
		btncouponlist = new JButton("쿠폰선택");
		btncouponlist.addActionListener(this); 
		btnorder = new JButton("주문하기");
		btnorder.addActionListener(this); 
		
		panel2.add(btncouponlist);
		panel2.add(btnorder);
		panel2.setBackground(new Color(255,239,213));
		add(panel2, BorderLayout.SOUTH);
			
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == btnBack) {
			dispose();
			
		} else if(obj == btncouponlist) {
			coupon = new Coupon("쿠폰",300,300,this);
		} else if(obj == btnorder) {
			payinfo = new PayInfo("구매자정보",280,250);
		}
	}
	}


