package co.edu.avanzada.negocio.beans;

import java.io.Serializable;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.benas.remote.ICama;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.Cama;

@LocalBean
@Stateless
@Remote(ICama.class)
public class CamaEJB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext
	EntityManager entity;

	public void crearCama(Cama cama) {
		Cama busquedaCama = buscarCama(cama.getIdcama());
		if (busquedaCama == null) {
			entity.persist(cama);
			System.out.println("xama registrada con exito");
		} else {
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe un registro asociado");
		}

	}

	/**
	 * 
	 * @param idCama
	 */
	public Cama buscarCama(Integer idCama) {
		return entity.find(Cama.class, idCama);
	}

	/**
	 * 
	 * @param cama
	 */
	public void editarCama(Cama cama) {
		entity.merge(cama);
	}

	/**
	 * 
	 * @param idcama
	 */
	public void eliminarCama(Integer idcama) {
		Cama busquedacama = buscarCama(idcama);
		if (busquedacama != null) {
			entity.remove(idcama);
			System.out.println("Se h eliminado con exito la cama");
		} else {
			throw new ExcepcionNegocio("Error al borrar la especialidad");
		}
	}
	
	/***
	 * 
	 * @return
	 */
	public List<Cama> ListarCama(){
		List<Cama> result = null;
		try{
			result = entity.createNamedQuery("Cama.listarcama").getResultList();
			System.out.println(result);			
		} catch (Exception ex){
			System.out.println(ex.getMessage().toString());
		}
		return result;
	}
	

