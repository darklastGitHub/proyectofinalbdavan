package co.edu.avanzada.negocio.benas.remote;

import java.util.List;


import co.edu.eam.ingesoft.persistencia.entidades.Cama;

public interface ICama {

	public void crearCama(Cama cama); 

	public Cama  buscarCama(Integer idCama);
	
	public void editarCama (Cama cama);

	public void eliminarCama(Integer idcama);

	public List<Cama> listarCamas();

	public List<Cama> BuscarListarCamas (Integer idCama);
}
