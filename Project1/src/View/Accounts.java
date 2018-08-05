package View;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Accounts extends JFrame {

	private JLabel AccountLabel;
	private JLabel IDLabel;
	private JLabel PWLabel;
	private JLabel PWCheckLabel;
	private JLabel NameLabel;
	private JLabel SexLabel;
	private JLabel PhoneLabel;
	private JLabel EmailLabel;
	
	private JTextField IDTextField;
	private JTextField PWTextField;
	private JTextField PWCheckTextField;
	private JTextField NameTextField;
	private JTextField PhoneTextField;
	private JTextField EmailTextField;
	
	private JRadioButton ManButton;
	private JRadioButton WomanButton;
	
	private JButton IDBtn;
	private JButton mainBtn;
	private JButton AccountBtn;
	
	
	public Accounts() {
		super("회원가입");
		setLayout(null);
		
		AccountLabel = new JLabel("회원가입 화면");
		AccountLabel.setBounds(131, 30, 120, 15);
		add(AccountLabel);
		
		//아이디
		IDLabel = new JLabel("아이디");
		IDLabel.setBounds(31, 60, 67, 15);
		add(IDLabel);
		
		IDTextField = new JTextField(100);
		IDTextField.setBounds(31, 80, 150, 20);
		add(IDTextField);
		
		IDBtn = new JButton("중복확인");
		IDBtn.setBounds(200, 80, 90, 20);
		add(IDBtn);
		
		//비밀번호
		PWLabel = new JLabel("비밀번호");
		PWLabel.setBounds(31, 110, 67, 15);
		add(PWLabel);
		
		PWTextField = new JTextField(100);
		PWTextField.setBounds(31, 130, 150, 20);
		add(PWTextField);
		
		//비밀번호확인
		PWCheckLabel = new JLabel("비밀번호확인");
		PWCheckLabel.setBounds(31, 160, 80, 15);
		add(PWCheckLabel);
		
		PWCheckTextField = new JTextField(100);
		PWCheckTextField.setBounds(31, 180, 150, 20);
		add(PWCheckTextField);
		
		// 이름
		NameLabel = new JLabel("이름");
		NameLabel.setBounds(31, 210, 67, 15);
		add(NameLabel);
		
		NameTextField = new JTextField(100);
		NameTextField.setBounds(31, 230, 150, 20);
		add(NameTextField);
		
		// 성별	
		SexLabel = new JLabel(" 성별 ");
		SexLabel.setBounds(31, 260, 67, 20);
		add(SexLabel);
		
		ManButton = new JRadioButton();
		ManButton.setText(" 남자 ");
		ManButton.setBounds(31,280,65,30);
		ManButton.setBackground(new Color(112, 195, 190));
		add(ManButton);
		
		WomanButton = new JRadioButton();
		WomanButton.setText(" 여자 ");
		WomanButton.setBounds(101,280,65,30);
		WomanButton.setBackground(new Color(112, 195, 190));
		add(WomanButton);
		

		
		// 전화번호
		PhoneLabel = new JLabel("전화번호");
		PhoneLabel.setBounds(31, 310, 67, 15);
		add(PhoneLabel);
		
		PhoneTextField = new JTextField(100);
		PhoneTextField.setBounds(31, 330, 150, 20);
		add(PhoneTextField);
		
		//이메일
		EmailLabel = new JLabel("이메일");
		EmailLabel.setBounds(31, 360, 67, 15);
		add(EmailLabel);
		
		EmailTextField = new JTextField(100);
		EmailTextField.setBounds(31, 380, 150, 20);
		add(EmailTextField);
		
		// 로그인창으로
		mainBtn = new JButton("목록");
		mainBtn.setBounds(31, 420, 120, 50);
		add(mainBtn);
		
		// 가입확인버튼
		AccountBtn = new JButton("확인");
		AccountBtn.setBounds(171, 420, 120, 50);
		add(AccountBtn);
		
		getContentPane().setBackground(new Color(112, 195, 190));
		
		setBounds(100, 100, 350, 550);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


	}
}
