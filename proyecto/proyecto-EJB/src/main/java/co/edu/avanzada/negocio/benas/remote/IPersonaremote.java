package co.edu.avanzada.negocio.benas.remote;

import java.util.List;

import co.edu.eam.ingesoft.persistencia.entidades.Persona;

public interface IPersonaremote {

	public void crearPersona(Persona persona);

	public Persona buscarPersona(String cedula);

	public void editarPersona(Persona persona);

	public void eliminar(String cedula);

	public List<Persona> ListarPersonas();

	public List<Persona> BuscarListaPersonas(String cedula);

}
