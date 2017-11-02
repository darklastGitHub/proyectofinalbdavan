package co.edu.avanzada.negocio.benas.remote;

import co.edu.eam.ingesoft.persistencia.entidades.TipoFuncionario;

public interface ITipoFuncionario {

	public void crearTipoFuncionario(TipoFuncionario tipoFuncionario); 

	public TipoFuncionario  buscarTipoFuncionario(Integer idTipoFuncionario);
	
	public void editarTipoFuncionario (TipoFuncionario tipoFuncionario);

	public void eliminarTipoFuncionario(Integer idTipoFuncionario);
}
