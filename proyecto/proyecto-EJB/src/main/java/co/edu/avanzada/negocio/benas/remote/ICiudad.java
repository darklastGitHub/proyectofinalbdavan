package co.edu.avanzada.negocio.benas.remote;

import java.util.List;

import co.edu.eam.ingesoft.persistencia.entidades.Ciudad;


public interface ICiudad {

	public void crearCiudad(Ciudad ciudad);

	public Ciudad buscarCiudad(String codigociudad);

	public void editarCiudad(Ciudad ciudad);

	public void eliminar(String codigociudad);

	public List<Ciudad> Listarciudad();

	public List<Ciudad> BuscarListaCiudad(String codigoeps);
}
