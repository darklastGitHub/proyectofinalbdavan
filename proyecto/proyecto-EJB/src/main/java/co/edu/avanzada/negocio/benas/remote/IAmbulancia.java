package co.edu.avanzada.negocio.benas.remote;

import co.edu.eam.ingesoft.persistencia.entidades.Ambulancia;

public interface IAmbulancia {

	public Ambulancia crearAmbulancia(Ambulancia ambulancia);
	
	public void buscarAmbulancia(Integer idAmbulancia);
	
	public void editarAmbulancia(Ambulancia ambulancia);
	
	public void eliminarAmbulancia(Integer idAmbulancia);
	
}
