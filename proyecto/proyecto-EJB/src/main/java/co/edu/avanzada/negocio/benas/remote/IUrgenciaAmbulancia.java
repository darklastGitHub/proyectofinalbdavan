package co.edu.avanzada.negocio.benas.remote;

import co.edu.eam.ingesoft.persistencia.entidades.UrgenciaAmbulancia;

public interface IUrgenciaAmbulancia {

	public void crearUrgenciaAmbulancia(UrgenciaAmbulancia urgenciaAmbulancia); 

	public UrgenciaAmbulancia  buscarUrgenciaAmbulancia(Integer idUrgenciaAmbulancia);
	
	public void editarUrgenciaAmbulancia (UrgenciaAmbulancia urgenciaAmbulancia);

	public void eliminarUrgenciaAmbulancia(Integer idUrgenciaAmbulancia);
}
