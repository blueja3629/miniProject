package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Admin_mainView extends JFrame implements ActionListener {

	private JButton memberCtrlBtn;
	private JButton bookCtrlBtn;
	private JButton replyCtrlBtn;

	public Admin_mainView() {
		super("관리자 페이지");
		setLayout(null);

		memberCtrlBtn = new JButton("회원관리");
		memberCtrlBtn.setBounds(80, 100, 200, 80);
		add(memberCtrlBtn);

		bookCtrlBtn = new JButton("도서관리");
		bookCtrlBtn.setBounds(330, 100, 200, 80);
		add(bookCtrlBtn);

		replyCtrlBtn = new JButton("댓글관리");
		replyCtrlBtn.setBounds(80, 270, 200, 80);
		add(replyCtrlBtn);

		setBounds(100, 100, 640, 480);
		getContentPane().setBackground(Color.lightGray);
		setVisible(true);
		
		memberCtrlBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Admin_userInfoView();
			}
		});
		
		bookCtrlBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Admin_bookListView();
				
			}
		});
		
		replyCtrlBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Admin_commentListView();
				
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}