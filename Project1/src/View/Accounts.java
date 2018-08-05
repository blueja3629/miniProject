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
		super("ȸ������");
		setLayout(null);
		
		AccountLabel = new JLabel("ȸ������ ȭ��");
		AccountLabel.setBounds(131, 30, 120, 15);
		add(AccountLabel);
		
		//���̵�
		IDLabel = new JLabel("���̵�");
		IDLabel.setBounds(31, 60, 67, 15);
		add(IDLabel);
		
		IDTextField = new JTextField(100);
		IDTextField.setBounds(31, 80, 150, 20);
		add(IDTextField);
		
		IDBtn = new JButton("�ߺ�Ȯ��");
		IDBtn.setBounds(200, 80, 90, 20);
		add(IDBtn);
		
		//��й�ȣ
		PWLabel = new JLabel("��й�ȣ");
		PWLabel.setBounds(31, 110, 67, 15);
		add(PWLabel);
		
		PWTextField = new JTextField(100);
		PWTextField.setBounds(31, 130, 150, 20);
		add(PWTextField);
		
		//��й�ȣȮ��
		PWCheckLabel = new JLabel("��й�ȣȮ��");
		PWCheckLabel.setBounds(31, 160, 80, 15);
		add(PWCheckLabel);
		
		PWCheckTextField = new JTextField(100);
		PWCheckTextField.setBounds(31, 180, 150, 20);
		add(PWCheckTextField);
		
		// �̸�
		NameLabel = new JLabel("�̸�");
		NameLabel.setBounds(31, 210, 67, 15);
		add(NameLabel);
		
		NameTextField = new JTextField(100);
		NameTextField.setBounds(31, 230, 150, 20);
		add(NameTextField);
		
		// ����	
		SexLabel = new JLabel(" ���� ");
		SexLabel.setBounds(31, 260, 67, 20);
		add(SexLabel);
		
		ManButton = new JRadioButton();
		ManButton.setText(" ���� ");
		ManButton.setBounds(31,280,65,30);
		ManButton.setBackground(new Color(112, 195, 190));
		add(ManButton);
		
		WomanButton = new JRadioButton();
		WomanButton.setText(" ���� ");
		WomanButton.setBounds(101,280,65,30);
		WomanButton.setBackground(new Color(112, 195, 190));
		add(WomanButton);
		

		
		// ��ȭ��ȣ
		PhoneLabel = new JLabel("��ȭ��ȣ");
		PhoneLabel.setBounds(31, 310, 67, 15);
		add(PhoneLabel);
		
		PhoneTextField = new JTextField(100);
		PhoneTextField.setBounds(31, 330, 150, 20);
		add(PhoneTextField);
		
		//�̸���
		EmailLabel = new JLabel("�̸���");
		EmailLabel.setBounds(31, 360, 67, 15);
		add(EmailLabel);
		
		EmailTextField = new JTextField(100);
		EmailTextField.setBounds(31, 380, 150, 20);
		add(EmailTextField);
		
		// �α���â����
		mainBtn = new JButton("���");
		mainBtn.setBounds(31, 420, 120, 50);
		add(mainBtn);
		
		// ����Ȯ�ι�ư
		AccountBtn = new JButton("Ȯ��");
		AccountBtn.setBounds(171, 420, 120, 50);
		add(AccountBtn);
		
		getContentPane().setBackground(new Color(112, 195, 190));
		
		setBounds(100, 100, 350, 550);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


	}
}
