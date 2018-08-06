package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ReportView extends JFrame implements ActionListener, MouseListener {
	private JButton homeBtn, logoutBtn, myPageBtn;
	private JTable jTable;
	private JScrollPane jScrPane;
	DefaultTableModel model;

	Object rowData[][];
	String columnNames[] = {
			"번호", "제목", "대출일", "반납예정일", "상태"
	};

	public ReportView() {
		super("현황");

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
		
		// 테이블의 폭을 설정하기 위한 Model
		model = new DefaultTableModel(columnNames, 0);
		model.setDataVector(rowData, columnNames);

		// 테이블 생성
		jTable = new JTable(model);
		jTable.addMouseListener(this);

		// 컬럼의 넓이를 설정
		jTable.getColumnModel().getColumn(0).setMaxWidth(50); // 글번호 폭
		jTable.getColumnModel().getColumn(1).setMaxWidth(50); // 글제목 폭
		jTable.getColumnModel().getColumn(2).setMaxWidth(50); // 글쓴이 폭
		jTable.getColumnModel().getColumn(3).setMaxWidth(50);
		jTable.getColumnModel().getColumn(4).setMaxWidth(50);

		// 테이블 안의 컬럼의 쓰기 설정(왼쪽, 오른쪽, 중간)
		DefaultTableCellRenderer celAlignCenter = new DefaultTableCellRenderer();
		celAlignCenter.setHorizontalAlignment(JLabel.CENTER);

		jTable.getColumnModel().getColumn(0).setCellRenderer(celAlignCenter);
		jTable.getColumnModel().getColumn(1).setCellRenderer(celAlignCenter);
		jTable.getColumnModel().getColumn(2).setCellRenderer(celAlignCenter);
		jTable.getColumnModel().getColumn(3).setCellRenderer(celAlignCenter);
		jTable.getColumnModel().getColumn(4).setCellRenderer(celAlignCenter);

		jScrPane = new JScrollPane(jTable);
		jScrPane.setBounds(10, 50, 600, 300);
		add(jScrPane);

		setLayout(null);
		setBounds(100, 100, 1080, 720);
		JTable rentalTable = new JTable(rowData, columnNames);
		rentalTable.setBounds(100, 100, 200, 200);
		add(rentalTable);
		//
		// mainTab = new JTabbedPane();
		// mainTab.setBounds(100, 100, 100, 100);
		// mainTab.addTab("대여 현황", rentalTable);
		// add(mainTab);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
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
