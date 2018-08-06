package main;

import db.DBConnection;
import singleton.Singleton;
import view.Accounts;
import view.Admin_bookListView;
import view.Admin_commentListView;
import view.Admin_mainView;
import view.Admin_userInfoView;
import view.Board;
import view.BoardAdd;
import view.ReportView;
import view.mainView;
import view.updateView;

public class mainClass {

	public static void main(String[] args) {

		DBConnection.initConnect();
		
		Singleton s = Singleton.getInstance();
		

		new Accounts();
		new Admin_bookListView();
		new Admin_commentListView();
		new Admin_mainView();
		new Admin_userInfoView();
		new Board();
		new BoardAdd();
		new mainView();
		new ReportView();
		new updateView();
	}

}
