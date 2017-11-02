package co.edu.avanzada.negocio.benas.remote;

import co.edu.eam.ingesoft.persistencia.entidades.Funcionario;

public interface IFuncionario {

	public Funcionario crearFuncionario(Funcionario funcionario);
	
	public void buscarFuncionario(Integer idFuncionario);
	
	public void editarFuncionario(Funcionario funcionario);
	
	public void eliminarFuncionario(Integer idFuncionario);
}
