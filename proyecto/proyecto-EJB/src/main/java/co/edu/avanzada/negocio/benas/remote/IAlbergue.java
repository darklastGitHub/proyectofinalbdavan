package co.edu.avanzada.negocio.benas.remote;

import java.util.List;

import co.edu.eam.ingesoft.persistencia.entidades.Albergue;


public interface IAlbergue {

	public void crearAlbergue(Albergue albergue); 

	public Albergue  buscarAlbergue(Integer idAlbergue);
	
	public void editarAlbergue (Albergue albergue);

	public void eliminarAlbergue (Integer idAlbergue);

	public List<Albergue> listarAlbergue();

	public List<Albergue> BuscarListarAlbergue (Integer idAlbergue);
}
