package pac;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import payment.ProductInfoVO;

public class ItemPage extends JFrame implements ActionListener{

	private ShopPage shopPage;
	private JPanel itemnamepan;
	private JPanel itemimagepan;
	private JPanel itemoptionpan;
	private JLabel itemname;
	public int p;
	public String title;
	public String im;

	public ItemPage(String title, int p, String im, ShopPage shopPage) {
		this.p = p;
		this.title = title;
		this.im = im;
		this.shopPage = shopPage;
		setTitle(title);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(700, 150);
		setSize(500, 600);
		setLayout(new GridBagLayout());
		
		itemnamepan = new JPanel();
		itemimagepan = new JPanel();
		itemoptionpan = new JPanel();
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(itemnamepan, gbc);
		itemnamepan.setBackground(Color.white);
		
		gbc.weighty = 5.0;
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(itemimagepan, gbc);
		itemimagepan.setBackground(Color.white);
		
		gbc.weighty = 2.0;
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(itemoptionpan, gbc);
		itemoptionpan.setBackground(Color.white);
		
/////////////////////////////////////////////////////////////////////////////
		
		itemnamepan.setLayout(new FlowLayout());
		itemnamepan.setBorder(new LineBorder(new Color(173,216,230)));
		
		itemname = new JLabel(title);
		
		itemname.setFont(new Font("EF_Diary", Font.BOLD, 15));
		
		itemnamepan.add(itemname);
		
///////////////////////////////////////////////////////////////////////////////
		
		itemimagepan.setLayout(new FlowLayout());
		
		ImageIcon imgtest = new ImageIcon(im);
		Image image = imgtest.getImage();
		Image changeimg = image.getScaledInstance(400, 400, DO_NOTHING_ON_CLOSE);
		ImageIcon Changeicon = new ImageIcon(changeimg);
		
		JLabel itemimg = new JLabel(Changeicon);
		
		itemimagepan.add(itemimg);
		
//////////////////////////////////////////////////////////////////////////////
		
		itemoptionpan.setLayout(new GridLayout(4,1));
		
		JLabel op1 = new JLabel("사이즈 : free size     " + "가격 : " + p);
		op1.setFont(new Font("Gothic", Font.BOLD, 12));
		JLabel op2 = new JLabel("배송예정일 : 주문일로부터 1주일 이내");
		op2.setFont(new Font("Gothic", Font.BOLD, 12));
		JLabel op3 = new JLabel("리뷰 작성은 큰 힘이 됩니다");
		op3.setFont(new Font("Gothic", Font.BOLD, 12));
		op3.setForeground(new Color(173,216,230));
		
		JButton cartgo = new JButton("장바구니에 넣기");
		cartgo.addActionListener(this);
		
		cartgo.setBackground(Color.white);
		cartgo.setFont(new Font("Gothic", Font.BOLD, 15));
		cartgo.setBorder(new LineBorder(Color.black));
		
		itemoptionpan.add(op1);
		itemoptionpan.add(op2);
		itemoptionpan.add(op3);
		itemoptionpan.add(cartgo);
		
		
		setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JOptionPane aa=new JOptionPane();
		ProductInfoVO piVO = new ProductInfoVO();
		piVO.setProductimage(im);
		piVO.setProductname(title);
		piVO.setProductprice(this.p);
		
		shopPage.productList.add(piVO);
		aa.showMessageDialog(null, "해당 상품을 장바구니에 넣었습니다!");
	}
}
