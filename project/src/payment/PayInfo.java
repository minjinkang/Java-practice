package payment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PayInfo extends JFrame implements ActionListener{
	
	public JPanel panel1;
	public JPanel panel2;
	public JButton btnpay;
	public JLabel label1;
	public JLabel label2;
	public JLabel label3;
	public JTextField tf1;
	public JTextField tf2;
	public JTextField tf3;
	
	public PayComplete paycomplete;


	public PayInfo (String title, int width, int height) {
		setTitle(title);
		setLocation(400, 300);
		setSize(width,height);
		setResizable(false); 
		
		setPanel1();
		setPanel2();
		
		setVisible(true); 
	}

	private void setPanel1() { 
		panel1 = new JPanel();
		
		label1 = new JLabel("이름");
		tf1 = new JTextField(20);
		
		label2 = new JLabel("전화번호");
		tf2 = new JTextField(20);
		
		label3 = new JLabel("주소");
		tf3 = new JTextField(20);
		
		
		panel1.add(label1);
		panel1.add(tf1);
		
		panel1.add(label2);
		panel1.add(tf2);
		
		panel1.add(label3);
		panel1.add(tf3);
		panel1.setBackground(SystemColor.inactiveCaptionBorder);
		this.add(panel1, BorderLayout.CENTER);
		
	}

	private void setPanel2() {
		panel2 = new JPanel();
		btnpay = new JButton("결제하기");
		btnpay.addActionListener(this);
		
		panel2.add(btnpay);
		panel2.setBackground(new Color(255,239,213));
		add(panel2, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == btnpay) {
			//System.out.println(tf3.getText());
			//System.out.println(tf2.getText());
			//System.out.println(tf1.getText());
			
			paycomplete = new PayComplete("결제완료",300,300,tf1.getText(),tf2.getText(),tf3.getText()); 
			setVisible(false); 
		}
	}
	
}
	

