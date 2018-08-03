package controller;

import service.MemberService;
import service.MemberServiceImpl;
import view.loginView;

public class MemberController {
	
	MemberServiceImpl mService = new MemberService();
	
	public void login() {
		new loginView();
	}
	
	

}
