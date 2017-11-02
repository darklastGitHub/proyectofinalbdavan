package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.benas.remote.IUrgenciaEvento;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.UrgenciaAmbulancia;
import co.edu.eam.ingesoft.persistencia.entidades.UrgenciaEvento;

@LocalBean
@Stateless
@Remote(IUrgenciaEvento.class)
public class UrgenciaEventoEJB {

	@PersistenceContext
	EntityManager entity;
	

public void crearUrgenciaAmbulancia(UrgenciaEvento urgenciaEvento){
		UrgenciaAmbulancia busquedaUrgenciaAmbulancia = buscarUrgenciaAmbulancia(urgenciaEvento.getIdurgenciaevento());
		if(busquedaUrgenciaAmbulancia == null){
			entity.persist(urgenciaEvento);
			System.out.println("UrgenciaAmbulancia registrada");
		}else {
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe un registro asociado");
		}
		
	}
	
	/**
	 * 
	 * @param idUrgenciaAmbulancia
	 * @return
	 */
	public UrgenciaAmbulancia buscarUrgenciaAmbulancia(Integer idUrgenciaAmbulancia){
		return entity.find(UrgenciaAmbulancia.class, idUrgenciaAmbulancia);
	}

	/**
	 * 
	 * @param urgenciaEvento
	 */
	public void editarUrgenciaAmbulancia(UrgenciaAmbulancia urgenciaEvento){
		entity.merge(urgenciaEvento);
	}
	
	public void eliminarUrgenciaAmbulancia(Integer idUrgenciaAmbulancia){
		UrgenciaAmbulancia busquedaUrgenciaAmbulancia = buscarUrgenciaAmbulancia(idUrgenciaAmbulancia);
		if(busquedaUrgenciaAmbulancia != null){
			entity.remove(idUrgenciaAmbulancia);
		}else{
			throw new ExcepcionNegocio("Error al borrar la urgenciaEvento");
		}
	}
	
	
	public List<UrgenciaAmbulancia> listarUrgenciaAmbulancia(){
		List<UrgenciaAmbulancia> resultado = null;
		
		try{
			resultado = entity.createQuery("UrgenciaAmbulancia.listarUrgenciaAmbulancia").getResultList();
			System.out.println(resultado);
		} catch (Exception ex){
			System.out.println(ex.getMessage().toString());
		}
		return resultado;
	}
	
}
