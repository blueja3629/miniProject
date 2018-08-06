package view;


import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class BoardAdd extends JFrame {
	private JLabel BoardLabel;
	
	private JLabel BookNLabel;
	private JLabel FieldLabel;
	private JLabel AuthorLabel;
	private JLabel PublisherLabel;
	private JLabel YearLabel;
	private JLabel BookContentLabel;
	private JLabel BookNumLabel;
	
	private JPanel PhotoTF;
	private JTextField BookNTF;
	private JTextField FieldTF;
	private JTextField AuthorTF;
	private JTextField PublisherTF;
	private JTextField YearTF;
	private JTextArea BookContentTA;
	private JTextField BookNumTF;

	
	private JButton PhotoAddBtn;
	private JButton backBtn;
	private JButton BookAddBtn;
		
	public BoardAdd() {
		super("책 추가");
		setLayout(null);
		
		// ������ġ
		BoardLabel = new JLabel("책 추가");
		BoardLabel.setBounds(31, 30, 60, 30);
		add(BoardLabel);
		
		//å ����
		PhotoTF = new JPanel();
		PhotoTF.setBounds(61, 80, 140, 180);
		PhotoTF.setBackground(new Color(255, 255, 255));
		add(PhotoTF);
		
		// ���������� �ƴ���.
		PhotoAddBtn = new JButton("사진 추가");
		PhotoAddBtn.setBounds(76, 280, 100, 30);
		add(PhotoAddBtn);
		
		// ����
		BookNLabel = new JLabel("책 이름 :");
		BookNLabel.setBounds(220, 80, 60, 15);
		add(BookNLabel);
		
		BookNTF = new JTextField();
		BookNTF.setBounds(280, 80, 160, 20);
		add(BookNTF);
		
		// å �о�
		FieldLabel = new JLabel("분야 : ");
		FieldLabel.setBounds(220, 110, 60, 15);
		add(FieldLabel);
		
		FieldTF = new JTextField();
		FieldTF.setBounds(260, 110, 160, 20);
		add(FieldTF);
		
		// ����
		AuthorLabel = new JLabel("저자 : ");
		AuthorLabel.setBounds(220, 140, 60, 15);
		add(AuthorLabel);
		
		AuthorTF = new JTextField();
		AuthorTF.setBounds(260, 140, 80, 20);
		add(AuthorTF);
		
		// ���ǻ�
		PublisherLabel = new JLabel("출판사 : ");
		PublisherLabel.setBounds(220, 170, 80, 15);
		add(PublisherLabel);
		
		PublisherTF = new JTextField();
		PublisherTF.setBounds(285, 170, 60, 20);
		add(PublisherTF);
		
		// ����⵵
		YearLabel = new JLabel("발행연도 : ");
		YearLabel.setBounds(220, 200, 80, 15);
		add(YearLabel);
		
		YearTF = new JTextField();
		YearTF.setBounds(285, 200, 60, 20);
		add(YearTF);
		
		BookNumLabel = new JLabel("책 권수 : ");
		BookNumLabel.setBounds(220, 230, 80, 15);
		add(BookNumLabel);
		
		BookNumTF = new JTextField();
		BookNumTF.setBounds(285, 230, 60, 20);
		add(BookNumTF);
		
		
		// å ����
		BookContentLabel = new JLabel("책 내용");
		BookContentLabel.setBounds(61, 330, 60, 15);
		add(BookContentLabel);
		
		BookContentTA = new JTextArea();
		BookContentTA.setBounds(61, 350, 430, 100);
		add(BookContentTA);
		
		// ���� ��ư
		backBtn = new JButton("뒤로");
		backBtn.setBounds(270, 470, 100, 50);
		add(backBtn);
		
		// BookAddBtn ��ư
		BookAddBtn = new JButton("도서 추가");
		BookAddBtn.setBounds(390, 470, 100, 50);
		add(BookAddBtn);
		
		
		
		
		
				
		setBounds(100, 100, 800, 600);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
}
