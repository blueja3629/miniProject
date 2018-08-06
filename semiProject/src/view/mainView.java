package view;

import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class mainView extends JFrame implements ActionListener, MouseListener {
	
	JTextField searchTF;
	private JButton homeBtn, logoutBtn, myPageBtn, searchBtn, hopeBtn;
	private Label book1Label, book2Label, book3Label, newBook1Label, newBook2Label, newBook3Label;
	
	public mainView() {
		super("메인");
		setLayout(null);
		setBounds(100, 100, 1080, 720);
		
		Label logoLabel = new Label("KH 도서 대여 시스템");
		logoLabel.setBounds(100, 80, 200, 50);
		add(logoLabel);
		
		homeBtn = new JButton("홈");
		homeBtn.setBounds(740, 50, 50, 30);
		homeBtn.addActionListener(this);
		add(homeBtn);
		
		logoutBtn = new JButton("로그아웃");
		logoutBtn.setBounds(800, 50, 100, 30);
		logoutBtn.addActionListener(this);
		add(logoutBtn);

		myPageBtn = new JButton("마이 페이지");
		myPageBtn.setBounds(910, 50, 110, 30);
		myPageBtn.addActionListener(this);
		add(myPageBtn);
		
		searchTF = new JTextField();
		searchTF.setBounds(200, 200, 500, 50);
		add(searchTF);
		
		hopeBtn = new JButton("도서 신청");	// 검색 버튼 위에 위치?
		hopeBtn.setBounds(750, 150, 100, 30);
//		hopeBtn.addActionListener(this);
		add(hopeBtn);
		
		searchBtn = new JButton("검색");
		searchBtn.setBounds(750, 200, 100, 50);
//		searchBtn.addActionListener(this);
		add(searchBtn);
		
		JLabel monthBookLabel = new JLabel("이 달의 책");
		monthBookLabel.setBounds(140, 300, 100, 30);
		add(monthBookLabel);
		
		book1Label = new Label("책1");
		book1Label.setBounds(110, 350, 120, 170);
		book1Label.setBackground(Color.cyan);
		book1Label.addMouseListener(this);
		add(book1Label);
		
		book2Label = new Label("책2");
		book2Label.setBounds(250, 350, 120, 170);
		book2Label.setBackground(Color.cyan);
		book2Label.addMouseListener(this);
		add(book2Label);
		
		book3Label = new Label("책3");
		book3Label.setBounds(390, 350, 120, 170);
		book3Label.setBackground(Color.cyan);
		book3Label.addMouseListener(this);
		add(book3Label);
		
		
		JLabel newBookLabel = new JLabel("신규 도서");
		newBookLabel.setBounds(550, 300, 100, 30);
		add(newBookLabel);
		
		newBook1Label = new Label("새책1");
		newBook1Label.setBounds(530, 350, 120, 170);
		newBook1Label.setBackground(Color.red);
		newBook1Label.addMouseListener(this);
		add(newBook1Label);
		
		newBook2Label = new Label("새책2");
		newBook2Label.setBounds(670, 350, 120, 170);
		newBook2Label.setBackground(Color.red);
		newBook2Label.addMouseListener(this);
		add(newBook2Label);
		
		newBook3Label = new Label("새책3");
		newBook3Label.setBounds(810, 350, 120, 170);
		newBook3Label.setBackground(Color.red);
		newBook3Label.addMouseListener(this);
		add(newBook3Label);
		
		
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Object obj = e.getSource();
		
		if (obj == newBook3Label) {
			JOptionPane.showMessageDialog(null, "test 3");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
	
	

}
