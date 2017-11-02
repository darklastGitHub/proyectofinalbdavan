package co.edu.avanzada.standalone.controlador;

import javax.naming.NamingException;

import co.edu.avanzada.negocio.benas.remote.IEstadocivil;
import co.edu.avanzada.standalone.util.ServiceLocator;
import co.edu.eam.ingesoft.persistencia.entidades.Estadocivil;

public class controladorEstadocivil {

	private IEstadocivil iestadocivil;

	public controladorEstadocivil() throws NamingException {
		// TODO Auto-generated constructor stub
		iestadocivil = (IEstadocivil) ServiceLocator.buscarEJB("EstadocivilEJB", IEstadocivil.class.getCanonicalName());
	}

	public void crearEstadocivil(Estadocivil estadocivil) {
		iestadocivil.crearEstadocivil(estadocivil);
	}

	public Estadocivil buscarestadocivil(String codigoestadocivil) {
		return iestadocivil.buscarEstadocivil(codigoestadocivil);
	}
}
