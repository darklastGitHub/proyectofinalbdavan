package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.benas.remote.IAfectadoAlbergue;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.AfectadoAlbergue;

@LocalBean
@Stateless
@Remote(IAfectadoAlbergue.class)
public class AfectadoAlbergueEJB {

	@PersistenceContext
	EntityManager entity;
	

public void crearAfectadoAlbergue(AfectadoAlbergue afectadoAlbergue){
		AfectadoAlbergue busquedaAfectadoAlbergue = buscarAfectadoAlbergue(afectadoAlbergue.getIdafectadoalbergue());
		if(busquedaAfectadoAlbergue == null){
			entity.persist(afectadoAlbergue);
			System.out.println("AfectadoAlbergue registrada");
		}else {
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe un registro asociado");
		}
		
	}
	
	/**
	 * 
	 * @param idAfectadoAlbergue
	 * @return
	 */
	public AfectadoAlbergue buscarAfectadoAlbergue(Integer idAfectadoAlbergue){
		return entity.find(AfectadoAlbergue.class, idAfectadoAlbergue);
	}

	/**
	 * 
	 * @param afectadoAlbergue
	 */
	public void editarAfectadoAlbergue(AfectadoAlbergue afectadoAlbergue){
		entity.merge(afectadoAlbergue);
	}
	
	public void eliminarAfectadoAlbergue(Integer idAfectadoAlbergue){
		AfectadoAlbergue busquedaAfectadoAlbergue = buscarAfectadoAlbergue(idAfectadoAlbergue);
		if(busquedaAfectadoAlbergue != null){
			entity.remove(idAfectadoAlbergue);
		}else{
			throw new ExcepcionNegocio("Error al borrar la afectadoAlbergue");
		}
	}
	
	
	public List<AfectadoAlbergue> listarAfectadoAlbergue(){
		List<AfectadoAlbergue> resultado = null;
		
		try{
			resultado = entity.createQuery("AfectadoAlbergue.listarAfectadoAlbergue").getResultList();
			System.out.println(resultado);
		} catch (Exception ex){
			System.out.println(ex.getMessage().toString());
		}
		return resultado;
	}
	
}
