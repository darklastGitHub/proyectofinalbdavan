package co.edu.avanzada.standalone.controlador;

import javax.naming.NamingException;

import co.edu.avanzada.negocio.benas.remote.ICiudad;
import co.edu.avanzada.negocio.benas.remote.ITipoDocumento;
import co.edu.avanzada.standalone.util.ServiceLocator;
import co.edu.eam.ingesoft.persistencia.entidades.Ciudad;
import co.edu.eam.ingesoft.persistencia.entidades.Tipodocumento;

public class controladorTipodocumento {

private ITipoDocumento itipodocumento;
	
	
	public controladorTipodocumento() throws NamingException {
		// TODO Auto-generated constructor stub
		itipodocumento = (ITipoDocumento) ServiceLocator.buscarEJB("TipodocumentoEJB", ITipoDocumento.class.getCanonicalName());
	}
	
	public void creaTipodocumento(Tipodocumento tipodocumento) {
		itipodocumento.crearTipodocumento(tipodocumento);
	}
	
	public Tipodocumento buscarCodigo(String codigotipodocumento) {
		return itipodocumento.buscarTipodocumento(codigotipodocumento);
	}
	
}
