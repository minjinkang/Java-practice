package proj;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.Container;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

public class join extends JFrame implements ActionListener{

	JFrame frame;
	private JLabel idlbl;
	private JTextField idtf;
	private JLabel pwlbl;
	private JLabel namelbl;
	private JLabel dlbl;
	private JLabel gdlbl;
	private JPasswordField pwtf;
	private JTextField nametf;
	private JPanel panel;
	private JLabel maillbl;
	private JTextField mailtf;
	private JLabel numberlbl;
	private JTextField numbertf;
	private JButton btn;
	private JComboBox combo;
	private JLabel Label;
	private Container contentPane;


	public static void main(String[] args) {
		join jo = new join("");
	}


	public join(String title) {
		
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(500, 100);
		setSize(600, 690);
		setResizable(false);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		Label = new JLabel("회원가입");
		Label.setBounds(225, 10, 130, 70);
		Label.setForeground(new Color(176, 196, 222));
		Label.setBackground(Color.WHITE);
		Label.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 30));
		
		idlbl = new JLabel("id");
		idlbl.setForeground(SystemColor.controlShadow);
		idlbl.setFont(new Font("Arial", Font.PLAIN, 20));
		idlbl.setBackground(Color.WHITE);
		idlbl.setBounds(88, 99, 91, 29);
		
		idtf = new JTextField();
		idtf.setBounds(205, 93, 306, 42);
		idtf.setColumns(10);
		
		pwlbl= new JLabel("password");
		pwlbl.setFont(new Font("Arial", Font.PLAIN, 20));
		pwlbl.setForeground(SystemColor.controlShadow);
		pwlbl.setBounds(88, 179, 97, 29);
		
		pwtf = new JPasswordField();
		pwtf.setBounds(205, 176, 306, 42);
		
		
		namelbl = new JLabel("이름");
		namelbl.setForeground(SystemColor.controlShadow);
		namelbl.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		namelbl.setBounds(88, 258, 98, 36);
	
		
		nametf = new JTextField();
		nametf.setColumns(10);
		nametf.setBounds(205, 252, 306, 42);
	
		
		gdlbl = new JLabel("성별");
		gdlbl.setForeground(SystemColor.controlShadow);
		gdlbl.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 20));
		gdlbl.setBounds(88, 331, 65, 35);

		
		combo = new JComboBox();
		combo.setModel(new DefaultComboBoxModel(new String[] {"남자", "여자"}));
		combo.setBounds(207, 330, 304, 42);
		
		maillbl = new JLabel("email");
		maillbl.setBounds(87, 388, 82, 23);
		maillbl.setFont(new Font("Arial", Font.PLAIN, 20));
		maillbl.setForeground(SystemColor.controlShadow);
		
		mailtf = new JTextField();
		mailtf.setBounds(87, 421, 424, 42);
		mailtf.setColumns(10);
		
		numberlbl = new JLabel("전화번호");
		numberlbl.setBounds(87, 486, 130, 29);
		numberlbl.setForeground(SystemColor.controlShadow);
		numberlbl.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 20));
		
		numbertf = new JTextField();
		numbertf.setBounds(87, 525, 424, 42);
		numbertf.setColumns(10);
		
		btn = new JButton("회원가입하기");
		btn.setForeground(Color.WHITE);
		btn.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		btn.setBackground(SystemColor.scrollbar);
		btn.setBounds(212, 588, 156, 44);
		btn.addActionListener(this);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 586, 653);

		
		getContentPane().add(Label);
		getContentPane().add(idlbl);
		getContentPane().add(idtf);
		getContentPane().add(pwlbl);
		getContentPane().add(pwtf);
		getContentPane().add(namelbl);
		getContentPane().add(nametf);
		getContentPane().add(gdlbl);
		getContentPane().add(combo);
		getContentPane().add(maillbl);
		getContentPane().add(mailtf);
		getContentPane().add(numberlbl);
		getContentPane().add(numbertf);
		getContentPane().add(btn);
		getContentPane().add(panel);
		
		setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		String idtf = idlbl.getText();
		String pwtf = pwlbl.getText();
		String nametf = namelbl.getText();
		String combo = ((ComboBoxModel) gdlbl).getSelectedItem().toString();
		String mailtf = maillbl.getText();
		String numbertf = numberlbl.getText();
		
		
		if(obj == btn){
			JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다.");
			dispose();
		
	}

	}

}

