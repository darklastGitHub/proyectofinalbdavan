package co.edu.avanzada.negocio.benas.remote;

import java.util.List;


import co.edu.eam.ingesoft.persistencia.entidades.Departamento;

public interface IDepartamento {

	public void crearDepartamento(Departamento departamento);

	public Departamento buscarDepartamento(String codigodepartamento);

	public void editarDepartamento(Departamento departamento);

	public void eliminar(String departamento);

	public List<Departamento> Listardepartamento();

	public List<Departamento> BuscarListaDepartamento(String codigodepartamento);
	
}
