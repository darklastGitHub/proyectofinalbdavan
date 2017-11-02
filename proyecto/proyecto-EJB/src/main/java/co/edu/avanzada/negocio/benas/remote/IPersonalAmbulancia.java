package co.edu.avanzada.negocio.benas.remote;

import co.edu.eam.ingesoft.persistencia.entidades.PersonalAmbulancia;

public interface IPersonalAmbulancia {

	public void crearPersonalAmbulancia(PersonalAmbulancia personalAmbulancia); 

	public PersonalAmbulancia  buscarPersonalAmbulancia(Integer idPersonalAmbulancia);
	
	public void editarPersonalAmbulancia (PersonalAmbulancia personalAmbulancia);

	public void eliminarPersonalAmbulancia(Integer idPersonalAmbulancia);
}
