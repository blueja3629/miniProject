package singleton;

import controller.BbsController;
import controller.MemberController;

public class Singleton {
	
	private static Singleton s = new Singleton();
	public MemberController memCtrl;
	public BbsController bbsCtrl;
	public String loginId;
	
	private Singleton() {	
		memCtrl = new MemberController();
		bbsCtrl = new BbsController();
	}
	
	public static Singleton getInstance() {
		return s;
	}

}
