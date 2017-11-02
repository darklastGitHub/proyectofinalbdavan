package co.edu.avanzada.negocio.beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.benas.remote.IPrioridad;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.Prioridad;

import java.io.Serializable;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;

@LocalBean
@Stateless
@Remote(IPrioridad.class)

public class PrioridadEJB implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext
	EntityManager entity;
	

public void crearPrioridad(Prioridad prioridad){
		Prioridad busquedaPrioridad = buscarPrioridad(prioridad.getIdprioridad());
		if(busquedaPrioridad == null){
			entity.persist(prioridad);
			System.out.println("Prioridad registrada");
		}else {
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe un registro asociado");
		}
		
	}
	
	/**
	 * 
	 * @param idPrioridad
	 * @return
	 */
	public Prioridad buscarPrioridad(Integer idPrioridad){
		return entity.find(Prioridad.class, idPrioridad);
	}

	/**
	 * 
	 * @param prioridad
	 */
	public void editarPrioridad(Prioridad prioridad){
		entity.merge(prioridad);
	}
	
	public void eliminarPrioridad(Integer idPrioridad){
		Prioridad busquedaPrioridad = buscarPrioridad(idPrioridad);
		if(busquedaPrioridad != null){
			entity.remove(idPrioridad);
		}else{
			throw new ExcepcionNegocio("Error al borrar la prioridad");
		}
	}
	
	
	public List<Prioridad> listarPrioridad(){
		List<Prioridad> resultado = null;
		
		try{
			resultado = entity.createQuery("Prioridad.listarPrioridad").getResultList();
			System.out.println(resultado);
		} catch (Exception ex){
			System.out.println(ex.getMessage().toString());
		}
		return resultado;
	}
	
}
