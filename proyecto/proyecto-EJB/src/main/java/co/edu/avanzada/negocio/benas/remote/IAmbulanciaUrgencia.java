package co.edu.avanzada.negocio.benas.remote;

import co.edu.eam.ingesoft.persistencia.entidades.AmbulanciaUrgencia;

public interface IAmbulanciaUrgencia {

	public void crearAmbulanciaUrgencia (AmbulanciaUrgencia ambulanciaUrgencia); 

	public AmbulanciaUrgencia  buscarAmbulanciaUrgencia (Integer idAmbulanciaUrgencia);
	
	public void editarAmbulanciaUrgencia (AmbulanciaUrgencia ambulanciaUrgencia);

	public void eliminarAmbulanciaUrgencia (Integer idAmbulanciaUrgencia);
}
