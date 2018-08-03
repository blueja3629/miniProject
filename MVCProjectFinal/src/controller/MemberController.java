package controller;

import javax.swing.JOptionPane;

import model.MemberDto;
import service.MemberService;
import service.MemberServiceImpl;
import singleton.Singleton;
import view.accountView;
import view.loginView;

public class MemberController {

	MemberServiceImpl mService = new MemberService();
	
	public void login() {
		new loginView();
	}
	
	public void regi() {
		new accountView();
	}
	
	public boolean idCheck(String id) {
		return mService.getId(id);		
	}
	
	public void regiAf(String id, String pwd, String name, String email) {
		
		boolean b = mService.addMember(new MemberDto(id, pwd, name, email, 0));
		if(b) {
			JOptionPane.showMessageDialog(null, "회원가입 성공!!");
			login();			
		}else {
			JOptionPane.showMessageDialog(null, "회원가입 실패");
			regi();
		}
	}
	
	public void loginAf(String id, String pwd) {
		
		MemberDto dto = mService.login(new MemberDto(id, pwd, null, null, 0));
		if(dto == null) {
			JOptionPane.showMessageDialog(null, "id나 password가 틀렸습니다");
			login();
		}else {
			JOptionPane.showMessageDialog(null, dto.getName() + "님 환영합니다");
			Singleton s = Singleton.getInstance();
			s.loginId = dto.getId();
			s.bbsCtrl.getBbsList();
		}		
	}
}












