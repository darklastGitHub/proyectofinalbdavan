package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.benas.remote.IUrgencia;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.Urgencia;

@LocalBean
@Stateless
@Remote(IUrgencia.class)

public class UrgenciaEJB {

	@PersistenceContext
	EntityManager entity;
	

public void crearUrgencia(Urgencia urgencia){
		Urgencia busquedaUrgencia = buscarUrgencia(urgencia.getIdurgencia());
		if(busquedaUrgencia == null){
			entity.persist(urgencia);
			System.out.println("Urgencia registrada");
		}else {
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe un registro asociado");
		}
		
	}
	
	/**
	 * 
	 * @param idUrgencia
	 * @return
	 */
	public Urgencia buscarUrgencia(Integer idUrgencia){
		return entity.find(Urgencia.class, idUrgencia);
	}

	/**
	 * 
	 * @param urgencia
	 */
	public void editarUrgencia(Urgencia urgencia){
		entity.merge(urgencia);
	}
	
	public void eliminarUrgencia(Integer idUrgencia){
		Urgencia busquedaUrgencia = buscarUrgencia(idUrgencia);
		if(busquedaUrgencia != null){
			entity.remove(idUrgencia);
		}else{
			throw new ExcepcionNegocio("Error al borrar la urgencia");
		}
	}
	
	
	public List<Urgencia> listarUrgencia(){
		List<Urgencia> resultado = null;
		
		try{
			resultado = entity.createQuery("Urgencia.listarUrgencia").getResultList();
			System.out.println(resultado);
		} catch (Exception ex){
			System.out.println(ex.getMessage().toString());
		}
		return resultado;
	}
	
}
