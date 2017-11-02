package co.edu.avanzada.negocio.beans;

import java.io.Serializable;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.benas.remote.IAlbergue;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.Albergue;
import co.edu.eam.ingesoft.persistencia.entidades.Cama;

@LocalBean
@Stateless
@Remote(IAlbergue.class)

public class AlbergueEJB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@PersistenceContext
	EntityManager entity;
	
	/**
	 * 
	 * @param albergue
	 */
	public void crearAlbergue(Albergue albergue){
		Albergue busquedaAlbergue = buscarAlbergue(albergue.getIdalbergue());
		
		if(busquedaAlbergue==null){
			entity.persist(albergue);
			System.out.println("se ha registrado con exito el albergue");
		}else {
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe un registro asociado");
		}

	}
	
	/**
	 * 
	 * @param idAlbergue
	 * @return
	 */
	public Albergue buscarAlbergue (Integer idAlbergue){
		return entity.find(Albergue.class, idAlbergue);
	}
	
	public void editarCama(Cama cama) {
		entity.merge(cama);
	}

	/**
	 * 
	 * @param idAlbergue
	 */
	public void eliminarAlbergue(Integer idAlbergue) {
		Albergue busquedaAlbergue = buscarAlbergue(idAlbergue);
		if (busquedaAlbergue != null) {
			entity.remove(idAlbergue);
			System.out.println("Se h eliminado con exito el alberggue");
		} else {
			throw new ExcepcionNegocio("Error al borrar la especialidad");
		}
	}
	
	/***
	 * 
	 * @return
	 */
	public List<Albergue> ListarAlbergue(){
		List<Albergue> result = null;
		try{
			result = entity.createNamedQuery("Albergue.listarAlbergue").getResultList();
			System.out.println(result);			
		} catch (Exception ex){
			System.out.println(ex.getMessage().toString());
		}
		return result;
	}
	
	/**
	 * 
	 * @param idAlbergue
	 * @return
	 */
	public List<Albergue> BuscarListaAlbergue(Integer idAlbergue) {
		// TODO Auto-generated method stub
		return null;
	}
}
	
