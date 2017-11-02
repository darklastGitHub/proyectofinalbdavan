package co.edu.avanzada.negocio.benas.remote;

import co.edu.eam.ingesoft.persistencia.entidades.Emergencia;

public interface IEmergencia {
	
	public void crearEmergencia(Emergencia emergencia); 

	public Emergencia  buscarEmergencia(Integer idEmergencia);
	
	public void editarEmergencia (Emergencia emergencia);

	public void eliminarEmergencia(Integer idEmergencia);
}
