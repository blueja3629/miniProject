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

	public class Admin_commentListView extends JFrame implements ActionListener {

		private JTable memberReplyTable;
		private JButton backToMainBtn;
		private JButton deleteBtn;
		private JScrollPane memberReplyScrPane;

		String columnNames[] = { "번호", "ID", "댓글내용", "올린 시간" };
		Object rowData[][] = { { "1행", "", "", "" }, { "2행", "", "", "" }, 
				{ "3행", "", "", "" },
				{ "4행", "", "", "" },
				{ "5행", "", "", "" } };

		DefaultTableModel model;
		private JButton addmemberReplyBtn;

		public Admin_commentListView() {
			super("댓글 관리");
			setLayout(null);
			
			model = new DefaultTableModel(columnNames, 0);
			model.setDataVector(rowData, columnNames);
			memberReplyTable = new JTable(model);
			
			memberReplyTable.getColumnModel().getColumn(0).setMaxWidth(100); 	// 번호
			memberReplyTable.getColumnModel().getColumn(1).setMaxWidth(100); 	// id
			memberReplyTable.getColumnModel().getColumn(2).setMaxWidth(300); 	// 댓글내용
			memberReplyTable.getColumnModel().getColumn(3).setMaxWidth(100); 	// 올린시간
			
			
			memberReplyTable.setRowHeight(30);
			
			/*DefaultTableCellRenderer celAlignCenter = new DefaultTableCellRenderer();
			celAlignCenter.setHorizontalAlignment(JLabel.CENTER);
			
			memberReplyTable.getColumn("회원번호").setCellRenderer(celAlignCenter);
			memberReplyTable.getColumn("이름").setCellRenderer(celAlignCenter);
			memberReplyTable.getColumn("ID").setCellRenderer(celAlignCenter);
			 */
			memberReplyScrPane = new JScrollPane(memberReplyTable);
			memberReplyScrPane.setBounds(10, 50, 600, 300);
			add(memberReplyScrPane);
			
		
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




