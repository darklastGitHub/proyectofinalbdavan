package co.edu.avanzada.negocio.benas.remote;

import co.edu.eam.ingesoft.persistencia.entidades.TipoEmergencia;

public interface ITipoEmergencia {

	public void crearTipoEmergencia(TipoEmergencia tipoEmergencia); 

	public TipoEmergencia  buscarTipoEmergencia(Integer idTipoEmergencia);
	
	public void editarTipoEmergencia (TipoEmergencia tipoEmergencia);

	public void eliminarTipoEmergencia(Integer idTipoEmergencia);
}
