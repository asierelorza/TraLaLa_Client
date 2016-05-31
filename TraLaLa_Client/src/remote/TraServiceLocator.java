package remote;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;

public class TraServiceLocator {
	
	private IGlobalService service; // Da error porque falta el lib
	
	public TraServiceLocator(){
		// Constructor vacio
	}
	
	public void setService(String ip, String port, String name){
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}
		// Inicializar el façade global. se hara una sola vez
		String url = "//" + ip + ":" + port + "/" + name; // Este nombre en funcion de que? En funcion de lo que le pasa el main.
		try{
			service = (IGlobalService) java.rmi.Naming.lookup(url);
			
		}
		catch(MalformedURLException | RemoteException | NotBoundException e){
			
			e.printStackTrace();
		}
		
		
	}
	
	public IGlobalService getService(){
		// Cada vez que se quiera acceder al servidor, se tendra que hacer esto
		
		return service;
	}
	
	

}
