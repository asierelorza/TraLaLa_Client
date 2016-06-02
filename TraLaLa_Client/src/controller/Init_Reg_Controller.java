package controller;

import java.rmi.RemoteException;

import remote.TraServiceLocator;

public class Init_Reg_Controller {
	
	private TraServiceLocator tsl;
	
	public Init_Reg_Controller(TraServiceLocator tsl){
		this.tsl = tsl;
	}
	
	public boolean registrarUsuario(String nombreUsu, String usuPayPal, String contraPayPal, String numTarj, boolean ventajoso){
		try {
			return this.tsl.getService().login(nombreUsu, usuPayPal, contraPayPal, Integer.parseInt(numTarj), ventajoso);
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
			return false;
		} catch (RemoteException e) {
			
			e.printStackTrace();
			return false;
		}
	}

}
