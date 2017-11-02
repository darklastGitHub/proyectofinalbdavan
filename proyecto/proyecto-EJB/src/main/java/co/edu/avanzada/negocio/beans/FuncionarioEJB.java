package co.edu.avanzada.negocio.beans;

import java.io.Serializable;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.benas.remote.IFuncionario;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.Funcionario;

@LocalBean
@Stateless
@Remote(IFuncionario.class)

public class FuncionarioEJB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext
	EntityManager entity;

	public void crearFuncionario(Funcionario funcionario) {
		Funcionario busquedaFuncionario = buscarFuncionario(funcionario.getIdfuncionario());
		if (busquedaFuncionario != null) {
			entity.persist(funcionario);
			System.out.println("funcionario registrado con exito");
		}

	}

	public Funcionario buscarFuncionario(Integer idFuncionario) {
		return entity.find(Funcionario.class, idFuncionario);
	}

	public void editarFuncionario(Funcionario funcionario) {
		entity.merge(funcionario);
	}
	
	public void eliminarFuncionario(Integer idFuncionario){
		Funcionario busqFuncionario = buscarFuncionario(idFuncionario);
	
		if(busqFuncionario != null){
			entity.remove(idFuncionario);
			System.out.println("Funcionario eliminado con exito");
		}else{
			throw new ExcepcionNegocio("Error al borrar el funcionario");
		}
	}
}
