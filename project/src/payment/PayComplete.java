package payment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PayComplete extends JFrame implements ActionListener{
	
	public JPanel panel1;
	public JPanel panel2;
	public JPanel panel3;
	public JPanel panel4;
	public JLabel label;
	public JLabel label2;
	private JLabel labeloasis;
	
	public JButton btnok;
	private String tf1;
	private String tf2;
	private String tf3;
	
	public OrderMain ordermain;
	public PayInfo payinfo;
	
	
	public PayComplete (String title, int width, int height,String tf1,String tf2, String tf3) {
		setTitle(title);
		setLocation(400, 300);
		setSize(width,height);;
		this.tf1 = tf1;
		this.tf2 = tf2;
		this.tf3 = tf3;
		setPanel1();
		setPanel2();
		setPanel3();
		setPanel4();
		setLayout(new GridLayout(4,1));
		setVisible(true);

	}




	private void setPanel1() {
		panel1 = new JPanel();			
		label = new JLabel( "<html>" + tf1 + "<br>" + tf2 + "<br>" + tf3 + "</html>");
		
		panel1.add(label);
		panel1.setBackground(SystemColor.inactiveCaptionBorder);
		add(panel1);
	}

	private void setPanel2() {
	panel2 = new JPanel();
		
		label2 = new JLabel(tf1 +" "+ "님의" + " "+ "주문이 완료되었습니다.");
		
		panel2.add(label2);
		panel2.setBackground(SystemColor.inactiveCaptionBorder);
		add(panel2);
	}
	
	
	private void setPanel3() {
		panel3 = new JPanel();
		ImageIcon iconoasis = new ImageIcon("images/oasis.png");
		Image image = iconoasis.getImage();
		
		Image changeImage = image.getScaledInstance(290, 70, Image.SCALE_SMOOTH);
		iconoasis = new ImageIcon(changeImage);
		
		JLabel labeloasis = new JLabel(iconoasis);
		
		
		panel3.setBackground(SystemColor.inactiveCaptionBorder);
		panel3.add(labeloasis);
		add(panel3);
	}
	
	private void setPanel4() {
		panel4 = new JPanel();
		
		btnok = new JButton("확인");
		//btnok.setBounds(182, 170, 122, 30);
		btnok.addActionListener(this);
	
		panel4.add(btnok);
		panel4.setBackground(SystemColor.inactiveCaptionBorder);

       
       
		//Dimension size = new Dimension(50,50);
		//panel4.setPreferredSize(size);
		add(panel4);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == btnok) {
			dispose();
			
		}
	}

	

}
