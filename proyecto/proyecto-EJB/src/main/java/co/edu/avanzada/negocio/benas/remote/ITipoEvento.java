package co.edu.avanzada.negocio.benas.remote;

import co.edu.eam.ingesoft.persistencia.entidades.TipoEvento;

public interface ITipoEvento {

	public void crearTipoEvento(TipoEvento tipoEvento); 

	public TipoEvento  buscarTipoEvento(Integer idTipoEvento);
	
	public void editarTipoEvento (TipoEvento tipoEvento);

	public void eliminarTipoEvento(Integer idTipoEvento);
}
