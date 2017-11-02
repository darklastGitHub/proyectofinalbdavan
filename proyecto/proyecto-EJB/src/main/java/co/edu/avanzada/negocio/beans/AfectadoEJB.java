package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.benas.remote.IAfectado;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.Afectado;

@LocalBean
@Stateless
@Remote(IAfectado.class)
public class AfectadoEJB {

	@PersistenceContext
	EntityManager entity;
	


public void crearAfectado(Afectado afectado){
		Afectado busquedaAfectado = buscarAfectado(afectado.getIdafectado());
		if(busquedaAfectado == null){
			entity.persist(afectado);
			System.out.println("Afectado registrada");
		}else {
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe un registro asociado");
		}
		
	}
	
	/**
	 * 
	 * @param idAfectado
	 * @return
	 */
	public Afectado buscarAfectado(Integer idAfectado){
		return entity.find(Afectado.class, idAfectado);
	}

	/**
	 * 
	 * @param afectado
	 */
	public void editarAfectado(Afectado afectado){
		entity.merge(afectado);
	}
	
	public void eliminarAfectado(Integer idAfectado){
		Afectado busquedaAfectado = buscarAfectado(idAfectado);
		if(busquedaAfectado != null){
			entity.remove(idAfectado);
		}else{
			throw new ExcepcionNegocio("Error al borrar la afectado");
		}
	}
	
	
	public List<Afectado> listarAfectado(){
		List<Afectado> resultado = null;
		
		try{
			resultado = entity.createQuery("Afectado.listarAfectado").getResultList();
			System.out.println(resultado);
		} catch (Exception ex){
			System.out.println(ex.getMessage().toString());
		}
		return resultado;
	}

}