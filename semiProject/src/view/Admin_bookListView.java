package view;

	import java.awt.Color;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JOptionPane;
	import javax.swing.JScrollPane;
	import javax.swing.JTable;
	import javax.swing.table.DefaultTableModel;

	public class Admin_bookListView extends JFrame implements ActionListener {

		private JTable bookTable;
		private JButton backToMainBtn;
		private JButton deleteBtn;
		private JScrollPane bookScrPane;

		String columnNames[] = {"책번호" ,"책이름", "분야", "저자", "출판사", "책소개",  "", "" };
		Object rowData[][] = { { "1", "", "", "", "", "", "", ""}, { "2", "", "", "", "",  "", "", ""  }, 
				{ "3", "", "", "", "",  "", "", "" },
				{ "4", "", "", "", "",  "", "", "" },
				{ "5", "", "", "", "",  "", "", "" } };

		DefaultTableModel model;
		private JButton addBookBtn;

		public Admin_bookListView() {
			super("도서 추가");
			setLayout(null);
			
			model = new DefaultTableModel(columnNames, 0);
			model.setDataVector(rowData, columnNames);
			bookTable = new JTable(model);
			
			bookTable.getColumnModel().getColumn(0).setMaxWidth(100); 	
			bookTable.getColumnModel().getColumn(1).setMaxWidth(100); 
			bookTable.getColumnModel().getColumn(2).setMaxWidth(100);
			bookTable.getColumnModel().getColumn(3).setMaxWidth(100); 	
			bookTable.getColumnModel().getColumn(4).setMaxWidth(100); 	
			bookTable.getColumnModel().getColumn(5).setMaxWidth(100); 
			bookTable.getColumnModel().getColumn(6).setMaxWidth(100); 
			bookTable.getColumnModel().getColumn(7).setMaxWidth(100); 
			
			bookTable.setRowHeight(30);

			bookScrPane = new JScrollPane(bookTable);
			bookScrPane.setBounds(10, 50, 600, 300);
			add(bookScrPane);
			
			addBookBtn = new JButton("글쓰기");
			addBookBtn.setBounds(300, 370, 100, 30);
			add(addBookBtn);
			addBookBtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "");
					
				}
			});
			
			backToMainBtn = new JButton("관리자 메인페이지");
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
					JOptionPane.showMessageDialog(null, "삭제 되었습니다.");
					
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


