package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Admin_userInfoView extends JFrame implements ActionListener {

	private JTable memberTable;
	private JButton backToMainBtn;
	private JButton deleteBtn;
	private JScrollPane memberScrPane;

	String columnNames[] = { "회원번호", "이름", "ID", "전화번호", "email" };
	Object rowData[][] = { { "1행", "", "", "", "" }, { "2행", "", "", "", "" }, { "3행", "", "", "", "" },
			{ "4행", "", "", "", "" }, { "5행", "", "", "", "" } };

	DefaultTableModel model;

	public Admin_userInfoView() {
		super("회원관리");
		setLayout(null);
		
		model = new DefaultTableModel(columnNames, 0);
		model.setDataVector(rowData, columnNames);
		memberTable = new JTable(model);
		
		memberTable.getColumnModel().getColumn(0).setMaxWidth(100); 	// 글번호
		memberTable.getColumnModel().getColumn(1).setMaxWidth(100); 	// 이름
		memberTable.getColumnModel().getColumn(2).setMaxWidth(100); // id
		memberTable.getColumnModel().getColumn(3).setMaxWidth(150); // 전화번호
		memberTable.getColumnModel().getColumn(4).setMaxWidth(150); // mail
		
		memberTable.setRowHeight(50);
		
		DefaultTableCellRenderer celAlignCenter = new DefaultTableCellRenderer();
		celAlignCenter.setHorizontalAlignment(JLabel.CENTER);
		
		memberTable.getColumn("회원번호").setCellRenderer(celAlignCenter);
		memberTable.getColumn("이름").setCellRenderer(celAlignCenter);
		memberTable.getColumn("ID").setCellRenderer(celAlignCenter);

		memberScrPane = new JScrollPane(memberTable);
		memberScrPane.setBounds(10, 50, 600, 300);
		add(memberScrPane);
		
		backToMainBtn = new JButton("관리자 메인");
		backToMainBtn.setBounds(30, 370, 150, 30);
		add(backToMainBtn);
		backToMainBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Admin_mainView();
				
				
			}
		});
			
		deleteBtn = new JButton("삭제");
		deleteBtn.setBounds(500, 370, 100, 30);
		add(deleteBtn);
		deleteBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "삭제 버튼 클릭");
				
			}
		});

		
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setBounds(100, 100, 640, 480);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
