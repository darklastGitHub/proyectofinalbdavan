package co.edu.avanzada.negocio.beans;

import java.io.Serializable;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.Emergencia;

@LocalBean
@Stateless
@Remote

public class EmergenciaEJB implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext
	EntityManager entity;
	

public void crearEmergencia(Emergencia emergencia){
		Emergencia busquedaEmergencia = buscarEmergencia(emergencia.getIdemergencia());
		if(busquedaEmergencia == null){
			entity.persist(emergencia);
			System.out.println("Emergencia registrada");
		}else {
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe un registro asociado");
		}
		
	}
	
	/**
	 * 
	 * @param idEmergencia
	 * @return
	 */
	public Emergencia buscarEmergencia(Integer idEmergencia){
		return entity.find(Emergencia.class, idEmergencia);
	}

	/**
	 * 
	 * @param emergencia
	 */
	public void editarEmergencia(Emergencia emergencia){
		entity.merge(emergencia);
	}
	
	public void eliminarEmergencia(Integer idEmergencia){
		Emergencia busquedaEmergencia = buscarEmergencia(idEmergencia);
		if(busquedaEmergencia != null){
			entity.remove(idEmergencia);
		}else{
			throw new ExcepcionNegocio("Error al borrar la emergencia");
		}
	}
	
	
	public List<Emergencia> listarEmergencia(){
		List<Emergencia> resultado = null;
		
		try{
			resultado = entity.createQuery("Emergencia.listarEmergencia").getResultList();
			System.out.println(resultado);
		} catch (Exception ex){
			System.out.println(ex.getMessage().toString());
		}
		return resultado;
	}
	
}
	
