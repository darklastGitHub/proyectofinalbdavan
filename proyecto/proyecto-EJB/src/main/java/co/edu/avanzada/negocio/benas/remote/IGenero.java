package co.edu.avanzada.negocio.benas.remote;

import java.util.List;

import co.edu.eam.ingesoft.persistencia.entidades.Genero;


public interface IGenero {

	public void crearGenero(Genero genero);

	public Genero buscarGenero(String codigogenero);

	public void editarGenero(Genero genero);

	public void eliminar(String codigogenero);

	public List<Genero> Listargenero();

	public List<Genero> BuscarListaGenero(String codigogenero);
}
