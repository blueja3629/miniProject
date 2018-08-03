package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import model.BbsDto;
import singleton.Singleton;

public class bbsListView extends JFrame implements ActionListener, MouseListener {

	private JButton logoutBtn;
	private JTable jTable;
	private JScrollPane jScrPane;	
	private JButton writeBtn;
	
	private JComboBox<String> choiceList;
	
	private JTextField selectField;
	private JButton selectBtn;
		
	String columnNames[] = {
		"번호", "제목", "작성자"	
	};
	
	Object rowData[][];
	
	DefaultTableModel model;
	
	List<BbsDto> list;
	
	public bbsListView(List<BbsDto> list) {
		super("게시판");			
		
		this.list = list;
		
		setLayout(null);
		
		String cur = System.getProperty("user.dir");
		System.out.println("cur:" + cur);
							
		JLabel loginLabel = new JLabel("게시판");
		loginLabel.setBounds(10, 10, 120, 15);
		add(loginLabel);
		
		logoutBtn = new JButton("로그아웃");
		logoutBtn.setBounds(510, 10, 100, 20);	
		logoutBtn.addActionListener(this);
		add(logoutBtn);			
				
		int len = list.size();
		int n = 1;
		
		rowData = new Object[len][3];
				
		for(int i = 0;i < len; i++){
			BbsDto dto = list.get(i);			
			rowData[i][0] = n;
			if(dto.getDel() == 1) {
				rowData[i][1] = "************************이 글은 삭제되었습니다************************";
			}else {
				rowData[i][1] = dto.getTitle();
			}
			rowData[i][2] = dto.getId();
			n++;
		}
		model = new DefaultTableModel(columnNames, 0);
		
		model.setDataVector(rowData, columnNames);			
		
		jTable = new JTable(model);
		jTable.addMouseListener(this);
		
		jTable.getColumnModel().getColumn(0).setMaxWidth(50);
		jTable.getColumnModel().getColumn(1).setMaxWidth(500);
		jTable.getColumnModel().getColumn(2).setMaxWidth(200);
		
		DefaultTableCellRenderer celAlignCenter = new DefaultTableCellRenderer();
		celAlignCenter.setHorizontalAlignment(JLabel.CENTER);

		jTable.getColumn("번호").setCellRenderer(celAlignCenter);
		jTable.getColumn("작성자").setCellRenderer(celAlignCenter);
		
		jScrPane = new JScrollPane(jTable);
		
		jScrPane.setBounds(10, 50, 600, 300);
		add(jScrPane);		
		
		writeBtn = new JButton("글쓰기");
		writeBtn.addActionListener(this);
		writeBtn.setBounds(10, 380, 100, 20);		
		add(writeBtn);
		
		
		
		// 검색
		selectField = new JTextField();
		selectField.setBounds(250, 380, 150, 20);
		add(selectField);
		
		selectBtn = new JButton("검색");
		selectBtn.addActionListener(this);
		selectBtn.setBounds(420, 380, 100, 20);		
		add(selectBtn);
		
		
		// Choice(AWT) -> JComboBox(swing)
		String[] selects = new String[] {"제목", "내용", "작성자"};		
		choiceList = new JComboBox<>(selects);
		choiceList.setBounds(150, 380, 80, 20);
		add(choiceList);
				
		
		getContentPane().setBackground(Color.cyan);
		setBounds(100, 100, 640, 480);
		setVisible(true);		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Singleton sc = Singleton.getInstance();
		Object obj = e.getSource();
		
		DefaultTableModel tableModel = (DefaultTableModel) jTable.getModel();
		
		if(obj == logoutBtn){
			this.dispose();
			sc.memCtrl.login();
		}
		else if(obj == writeBtn){
			sc.bbsCtrl.bbsWrite();
		}
		else if(obj == selectBtn){			
			String selectedItem = (String)choiceList.getSelectedItem();
			
			sc.bbsCtrl.getBbsFindList(selectField.getText(), selectedItem);			
		}
		
		this.dispose();
	}
		
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		Singleton sc = Singleton.getInstance();
		 
		int rowNum = jTable.getSelectedRow();		
	//	JOptionPane.showMessageDialog(null, "선택한 글 정보:" + list.get(rowNum).toString());
		
		if(list.get(rowNum).getDel() == 1) {
			JOptionPane.showMessageDialog(null, "이 글은 볼 수 없습니다");
			return;
		}
		
		sc.bbsCtrl.bbsDetail(list.get(rowNum).getSeq());
		this.dispose();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	

}
