package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class updateView extends JFrame implements ActionListener{

	JTextField nameTextF;
	JTextField genderTextF;
	JTextField idTextF;
	JPasswordField pwdTextF;
	JPasswordField pwd2TextF;
	JTextField pNumTextF;
	JTextField emailTextF;
	JTextField email2TextF;
	
	JButton homeBtn;
	JButton logoutBtn;
	JButton myPageBtn;
	JButton updateBtn;
	
	public updateView() {
		super("회원정보 수정");
		setLayout(null);
		
		JLabel label = new JLabel("회원정보 수정");
		label.setBounds(50, 70, 120, 15);
		add(label);
		
		homeBtn = new JButton("홈");
		homeBtn.setBounds(215, 20, 50, 30);
		add(homeBtn);
		
		logoutBtn = new JButton("로그아웃");
		logoutBtn.setBounds(275, 20, 90, 30);
		add(logoutBtn);
		
		myPageBtn = new JButton("마이 페이지");
		myPageBtn.setBounds(375, 20, 110, 30);
		add(myPageBtn);
		
		
		
		label = new JLabel("이름");
		label.setBounds(60, 130, 80, 30);
		add(label);
		
		nameTextF = new JTextField();
		nameTextF.setBounds(140, 135, 170, 30);
		add(nameTextF);
		
		label = new JLabel("성별");
		label.setBounds(60, 190, 67, 15);
		add(label);
		
		genderTextF = new JTextField();
		genderTextF.setBounds(140, 185, 170, 30);
		add(genderTextF);
		
		label = new JLabel("아이디");
		label.setBounds(55, 245, 67, 15);
		add(label);
		
		idTextF = new JTextField();
		idTextF.setBounds(140, 240, 170, 30);
		add(idTextF);
		
		label = new JLabel("비밀번호");
		label.setBounds(55, 300, 67, 15);
		add(label);
		
		pwdTextF = new JPasswordField();
		pwdTextF.setBounds(140, 295, 170, 30);
		add(pwdTextF);
		
		label = new JLabel("비밀번호 확인");
		label.setBounds(45, 355, 85, 15);
		add(label);
		
		pwd2TextF = new JPasswordField();
		pwd2TextF.setBounds(140, 350, 170, 30);
		add(pwd2TextF);
		
		label = new JLabel("전화번호");
		label.setBounds(55, 410, 67, 15);
		add(label);
		
		pNumTextF = new JTextField();
		pNumTextF.setBounds(140, 405, 170, 30);
		add(pNumTextF);
		
		label = new JLabel("이메일");
		label.setBounds(60, 465, 67, 15);
		add(label);
		
		emailTextF = new JTextField();
		emailTextF.setBounds(140, 460, 90, 30);
		add(emailTextF);
		
		label = new JLabel(" @ ");
		label.setBounds(230, 465, 67, 15);
		add(label);
		
		email2TextF = new JTextField();
		email2TextF.setBounds(250, 460, 90, 30);
		add(email2TextF);
		
		updateBtn = new JButton("회원 정보 수정");
		updateBtn.setBounds(180, 525, 130, 40);
		add(updateBtn);
		
		
		setBounds(100,100,515,640);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
