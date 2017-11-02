package co.edu.avanzada.negocio.benas.remote;

import co.edu.eam.ingesoft.persistencia.entidades.AfectadoAlbergue;

public interface IAfectadoAlbergue {

	public void crearAfectadoAlbergue(AfectadoAlbergue afectadoAlbergue); 

	public AfectadoAlbergue  buscarAfectadoAlbergue(Integer idAfectadoAlbergue);
	
	public void editarAfectadoAlbergue (AfectadoAlbergue afectadoAlbergue);

	public void eliminarAfectadoAlbergue(Integer idAfectadoAlbergue);
}
