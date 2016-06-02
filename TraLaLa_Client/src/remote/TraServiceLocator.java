package remote;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;

public class TraServiceLocator {
	
	private IGlobalService2 service;
	
	public TraServiceLocator(){
		
	}
	
	public void setService(String ip, String port, String name){
		if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
		}
		
		String url = "//" + ip + ":" + port + "/" + name;
		try{
			service = (IGlobalService2) java.rmi.Naming.lookup(url);
			
		}
		catch(MalformedURLException | RemoteException | NotBoundException e){
			
			e.printStackTrace();
		}
		
		
	}
	
	public IGlobalService2 getService(){
		// Cada vez que se quiera acceder al servidor, se tendra que hacer esto
		
		return service;
	}
	
	

}
