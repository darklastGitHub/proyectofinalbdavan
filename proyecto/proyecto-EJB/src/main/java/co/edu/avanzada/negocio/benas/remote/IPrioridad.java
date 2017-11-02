package co.edu.avanzada.negocio.benas.remote;

import co.edu.eam.ingesoft.persistencia.entidades.Prioridad;

public interface IPrioridad {

	public void crearPrioridad(Prioridad prioridad); 

	public Prioridad  buscarPrioridad(Integer idPrioridad);
	
	public void editarPrioridad (Prioridad prioridad);

	public void eliminarPrioridad(Integer idPrioridad);
}
