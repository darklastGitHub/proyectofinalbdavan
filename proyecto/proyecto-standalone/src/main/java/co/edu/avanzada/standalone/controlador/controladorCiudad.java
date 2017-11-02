package co.edu.avanzada.standalone.controlador;

import javax.naming.NamingException;

import co.edu.avanzada.negocio.benas.remote.ICiudad;
import co.edu.avanzada.standalone.util.ServiceLocator;
import co.edu.eam.ingesoft.persistencia.entidades.Ciudad;

public class controladorCiudad {
	
	private ICiudad iciudad;
	
	public controladorCiudad() throws NamingException{
		// TODO Auto-generated constructor stub
		iciudad = (ICiudad) ServiceLocator.buscarEJB("CiudadEJB", ICiudad.class.getCanonicalName());
	}
	
	public void crearCiudad(Ciudad ciudad) {
		iciudad.crearCiudad(ciudad);
	}
	
	public Ciudad buscarCodigo(String codigociudad) {
		return iciudad.buscarCiudad(codigociudad);
	}

}
