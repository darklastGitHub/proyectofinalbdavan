package co.edu.avanzada.negocio.benas.remote;

import java.util.List;

import co.edu.eam.ingesoft.persistencia.entidades.Alimento;

public interface IAlimento  {
	
	public void crearAlimento(Alimento alimento);

	public Alimento buscarAlimento(Integer idAlimento);

	public void editarAlimento(Alimento alimento);

	public void eliminar(Integer idAlimento);

	public List<Alimento> listarAlimentos();

	public List<Alimento> buscarListaAlimentos(Integer idAlimento);
}
