package co.edu.avanzada.negocio.benas.remote;

import java.util.List;

import co.edu.eam.ingesoft.persistencia.entidades.Eps;

public interface IEpsremote {

	public void crearEps(Eps eps);

	public Eps buscarEps(String codigoeps);

	public void editarEps(Eps eps);

	public void eliminar(String codigoeps);

	public List<Eps> ListarEps();

	public List<Eps> BuscarListaEps(String codigoeps);
}
