package remote;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class TraServiceLocator {
	
	private IGlobalService service; // Da error porque falta el lib
	
	public TraServiceLocator(){
		// Constructor vacio
	}
	
	public void setService(String ip, String port, String name){
		// Inicializar el façade global. se hara una sola vez
		String name; // Este nombre en funcion de que? En funcion de lo que le pasa el main.
		try{
			service = (IGlobalService) java.rmi.Naming.lookup(name);
			
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
