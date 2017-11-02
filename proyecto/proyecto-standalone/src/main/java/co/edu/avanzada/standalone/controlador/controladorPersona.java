package co.edu.avanzada.standalone.controlador;

import java.util.List;

import javax.naming.NamingException;

import co.edu.avanzada.negocio.benas.remote.IPersonaremote;
import co.edu.avanzada.standalone.util.ServiceLocator;
import co.edu.eam.ingesoft.pa.persistencia.entidades.TipoCuenta;
import co.edu.eam.ingesoft.persistencia.entidades.Persona;

public class controladorPersona {

	private IPersonaremote ipersona;

	public controladorPersona() throws NamingException {
		// TODO Auto-generated constructor stub
		ipersona = (IPersonaremote) ServiceLocator.buscarEJB("PersonaEJB", IPersonaremote.class.getCanonicalName());
	}

	public void crearPersona(Persona persona) {
		ipersona.crearPersona(persona);
	}
	
	public Persona buscarPersona(String cedula) {
		return ipersona.buscarPersona(cedula);
	}
	
	public List<Persona> listarpersonas(){
		return ipersona.ListarPersonas();
	}

}
