package co.edu.avanzada.negocio.benas.remote;

import co.edu.eam.ingesoft.persistencia.entidades.EntidadHospitalaria;

public interface IEntidadHospitalaria {

	public void crearEntidadHospitalaria(EntidadHospitalaria entidadHospitalaria); 

	public EntidadHospitalaria  buscarEntidadHospitalaria(Integer idEntidadHospitalaria);
	
	public void editarEntidadHospitalaria (EntidadHospitalaria entidadHospitalaria);

	public void eliminarEntidadHospitalaria(Integer idEntidadHospitalaria);
}
