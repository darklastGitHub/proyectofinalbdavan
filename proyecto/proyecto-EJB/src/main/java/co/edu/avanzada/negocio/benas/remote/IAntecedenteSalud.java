package co.edu.avanzada.negocio.benas.remote;

import co.edu.eam.ingesoft.persistencia.entidades.AntecedenteSalud;

public interface IAntecedenteSalud {

	public void crearAntecedenteSalud(AntecedenteSalud antecedenteSalud); 

	public AntecedenteSalud  buscarAntecedenteSalud(Integer idAntecedenteSalud);
	
	public void editarAntecedenteSalud (AntecedenteSalud antecedenteSalud);

	public void eliminarAntecedenteSalud(Integer idAntecedenteSalud);
}
