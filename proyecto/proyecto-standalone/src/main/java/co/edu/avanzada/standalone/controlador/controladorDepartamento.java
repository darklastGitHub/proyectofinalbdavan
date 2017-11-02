package co.edu.avanzada.standalone.controlador;

import javax.naming.NamingException;

import co.edu.avanzada.negocio.benas.remote.IDepartamento;
import co.edu.avanzada.standalone.util.ServiceLocator;
import co.edu.eam.ingesoft.persistencia.entidades.Departamento;

public class controladorDepartamento {

	private IDepartamento idepartamento;
	
	public controladorDepartamento() throws NamingException {
		// TODO Auto-generated constructor stub
		
		idepartamento = (IDepartamento) ServiceLocator.buscarEJB("DepartamentoEJB", IDepartamento.class.getCanonicalName());
	}
	
	public void crearDepartamento(Departamento departamento) {
		idepartamento.crearDepartamento(departamento);
	}
	
	public Departamento buscarCodigo(String codigodepartamento) {
		return idepartamento.buscarDepartamento(codigodepartamento);
	}
}
