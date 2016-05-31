package main;

import remote.TraServiceLocator;

public class Main {
	
	public static void main(String[] args) {	
		TraServiceLocator serviceLocator = new TraServiceLocator();
		serviceLocator.setService(args[0], args[1], args[2]);
		
//		LoginController loginController = new LoginController(serviceLocator);
//		LoginDialog loginDialog = new LoginDialog(loginController);			
//		loginDialog.login();
//		
//		BidController bidController = new BidController(serviceLocator);			
//		BidWindow bidWindow = new BidWindow(bidController);
//		bidWindow.getCategories();
//		bidWindow.getArticles();
//		bidWindow.makeBid();			
	}

}
