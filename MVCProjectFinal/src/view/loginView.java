package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import singleton.Singleton;

public class loginView extends JFrame implements ActionListener {
	
	private JTextField idTextF;
	private JPasswordField pwTextF;
	
	private JButton logBtn;
	private JButton accountBtn;
	
	public loginView() {
		super("로그인");
		setLayout(null);
		
		JLabel loginLabel = new JLabel("로그인 화면");
		loginLabel.setBounds(100, 10, 120, 15);
		add(loginLabel);
		
		JLabel idLabel = new JLabel("ID:");
		idLabel.setBounds(31, 60, 67, 15);
		add(idLabel);
		
		idTextF = new JTextField(10);
		idTextF.setBounds(100, 60, 150, 20);
		add(idTextF);
		
		JLabel passLabel = new JLabel("PW:");
		passLabel.setBounds(31, 104, 67, 15);
		add(passLabel);
		
		pwTextF = new JPasswordField();
		pwTextF.setBounds(100, 104, 150, 20);
		add(pwTextF);
				
		logBtn = new JButton("log-in");
		logBtn.setBounds(31, 150, 100, 40);
		logBtn.addActionListener(this);
		add(logBtn);
		
		accountBtn = new JButton("회원가입");
		accountBtn.setBounds(150, 150, 100, 40);
		accountBtn.addActionListener(this);
		add(accountBtn);
		
		setBounds(100, 100, 300, 280);
		getContentPane().setBackground(Color.red);
		setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {				
				System.exit(0);				
			}			
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		
		Singleton s = Singleton.getInstance();
		
		if(btn == logBtn){
			s.memCtrl.loginAf(idTextF.getText(), pwTextF.getText());		
		}
		else if(btn == accountBtn){
			s.memCtrl.regi();
		}
		this.dispose();
		
	/*	
		MemberDao dao = MemberDao.getInstance();
		if(btn == logBtn){
			MemberDto dto = dao.login(new MemberDto(idTextF.getText(), pwTextF.getText(), null,	null, 0));
			if(dto == null) {
				JOptionPane.showMessageDialog(null, "ID나 Password가 틀렸습니다");
				idTextF.grabFocus();
			}
			else {
				// 이동
				JOptionPane.showMessageDialog(null, dto.getName() + "님 환영합니다");
				dao.setLoginId(dto.getId());	// 로그인 id저장
				this.dispose();
				
				new bbsListView();
			}
		}
		else if(btn == accountBtn){
			new accountView();
			this.dispose();
		}*/
	}

}
