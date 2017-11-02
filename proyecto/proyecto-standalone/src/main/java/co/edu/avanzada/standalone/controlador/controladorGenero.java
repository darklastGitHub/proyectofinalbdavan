package co.edu.avanzada.standalone.controlador;

import javax.naming.NamingException;

import co.edu.avanzada.negocio.benas.remote.IEpsremote;
import co.edu.avanzada.negocio.benas.remote.IGenero;
import co.edu.avanzada.standalone.util.ServiceLocator;
import co.edu.eam.ingesoft.persistencia.entidades.Eps;
import co.edu.eam.ingesoft.persistencia.entidades.Genero;

public class controladorGenero {

	public IGenero igenero;
	
	public controladorGenero() throws NamingException {
		// TODO Auto-generated constructor stub
		igenero =(IGenero) ServiceLocator.buscarEJB("GeneroEJB", IGenero.class.getCanonicalName());
	}
	
	public void crearGenero(Genero genero) {
		igenero.crearGenero(genero);
	}
	
	public Genero buscarGenero(String codigogenero) {
		return (Genero) igenero.buscarGenero(codigogenero);
	}
}
