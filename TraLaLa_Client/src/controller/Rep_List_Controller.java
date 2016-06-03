package controller;

import data.Cancion;
import remote.TraServiceLocator;

public class Rep_List_Controller {
	
	private TraServiceLocator tsl;
	
	public Rep_List_Controller(TraServiceLocator tsl){
		this.tsl = tsl;
	}
	
	public boolean ReproducirCancion(){
//		this.tsl.getService().reproducirCancion(new Cancion(arg0, arg1, arg2, arg3, arg4));
		// Tendria que recibir la cancion escogida por el usuario de la lista
		return false;
	}

}
