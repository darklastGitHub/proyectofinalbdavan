package co.edu.avanzada.negocio.benas.remote;

import java.util.List;


import co.edu.eam.ingesoft.persistencia.entidades.Estadocivil;

public interface IEstadocivil {

	public void crearEstadocivil(Estadocivil estadocivil);

	public Estadocivil buscarEstadocivil(String codigoestado);

	public void editarEstadocivil(Estadocivil estadocivil);

	public void eliminar(String codigoestadocivil);

	public List<Estadocivil> ListarEstadocivil();

	public List<Estadocivil> BuscarListaEstadocivil(String codigoestadocivil);
}
