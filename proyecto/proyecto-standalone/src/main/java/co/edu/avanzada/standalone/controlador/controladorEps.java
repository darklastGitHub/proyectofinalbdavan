package co.edu.avanzada.standalone.controlador;

import javax.naming.NamingException;

import co.edu.avanzada.negocio.benas.remote.IEpsremote;
import co.edu.avanzada.standalone.util.ServiceLocator;
import co.edu.eam.ingesoft.pa.persistencia.entidades.Cliente;
import co.edu.eam.ingesoft.persistencia.entidades.Eps;


public class controladorEps {

	private IEpsremote ieps;
	
	public controladorEps() throws NamingException {
		// TODO Auto-generated constructor stub
		ieps = (IEpsremote) ServiceLocator.buscarEJB("EpsEJB", IEpsremote.class.getCanonicalName());
	}
	
	public void crearEps(Eps eps) {
		ieps.crearEps(eps);
	}
	
	public Eps buscarEps(String codigoeps) {
		return ieps.buscarEps(codigoeps);
	}
}
