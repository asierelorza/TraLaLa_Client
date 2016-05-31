package mainCliente;

import java.rmi.RemoteException;

import remote.TraServiceLocator;

public class Main {
	
	public static void main(String[] args) {	
		TraServiceLocator serviceLocator = new TraServiceLocator();
		serviceLocator.setService(args[0], args[1], args[2]);
		
		try {
			serviceLocator.getService().login("axi", "dorron", "iepa", 10, true);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
