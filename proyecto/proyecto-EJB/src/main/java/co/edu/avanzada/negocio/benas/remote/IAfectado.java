package co.edu.avanzada.negocio.benas.remote;

import co.edu.eam.ingesoft.persistencia.entidades.Afectado;

public interface IAfectado {

	public void crearAfectado(Afectado afectado); 

	public Afectado  buscarAfectado(Integer idAfectado);
	
	public void editarAfectado (Afectado afectado);

	public void eliminarAfectado(Integer idAfectado);
}
