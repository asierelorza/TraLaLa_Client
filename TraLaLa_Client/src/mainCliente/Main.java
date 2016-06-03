package mainCliente;

import java.rmi.RemoteException;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import controller.Init_Reg_Controller;
import controller.Rep_List_Controller;
import data.Artista;
import data.Cancion;
import gui.MenuGUI;
import remote.TraServiceLocator;

public class Main {	
	
	
	
	public static void main(String[] args) {	
		
		boolean reproduciendo = false;
		
		TraServiceLocator serviceLocator = new TraServiceLocator();
		serviceLocator.setService(args[0], args[1], args[2]);
		
		Init_Reg_Controller irc = new Init_Reg_Controller(serviceLocator);
		Rep_List_Controller rlc = new Rep_List_Controller(serviceLocator);
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MenuGUI mgui = new MenuGUI(irc, rlc);
		mgui.setVisible(true);
		
		// Insercion de datos directo:
		
//		try {
//			serviceLocator.getService().login("axi", "dorron", "iepa", 10, true);
//		} catch (RemoteException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			reproduciendo = serviceLocator.getService().reproducirCancion(new Cancion("ue", 1, "axi", 4, new Artista(1, "dorron")));
//		} catch (RemoteException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		if(reproduciendo){
//			System.out.println("Reproduciendo cancion");
//		}
//		else{
//			System.out.println("No se ha podido reproducir la cancion");
//		}
			
	}

}
