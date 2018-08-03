package singleton;

import controller.BookController;
import controller.MemberController;

public class Singleton {
	
	private static Singleton s = new Singleton();
	public MemberController memCtrl;
	public BookController bokCtrl;
	public String loginId;
	
	private Singleton() {	
		memCtrl = new MemberController();
		bokCtrl = new BookController();
	}
	
	public static Singleton getInstance() {
		return s;
	}

}
