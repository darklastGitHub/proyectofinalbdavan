package co.edu.avanzada.negocio.beans;

import java.io.Serializable;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.benas.remote.IAmbulanciaUrgencia;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.AmbulanciaUrgencia;

@LocalBean
@Stateless
@Remote(IAmbulanciaUrgencia.class)

public class AmbulanciaUrgenciaEJB implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext
	EntityManager entity;
	
	public void crearAmbulanciaUrgencia(AmbulanciaUrgencia ambulanciaUrgencia){
		AmbulanciaUrgencia busquedaAmbulanciaUrgencia = buscarAmbulanciaUrgencia(ambulanciaUrgencia.getIdambulanciaurgencia());
		if(busquedaAmbulanciaUrgencia == null){
			entity.persist(ambulanciaUrgencia);
			System.out.println("AmbulanciaUrgencia registrada");
		}else {
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe un registro asociado");
		}
		
	}
	
	/**
	 * 
	 * @param idAmbulanciaUrgencia
	 * @return
	 */
	public AmbulanciaUrgencia buscarAmbulanciaUrgencia(Integer idAmbulanciaUrgencia){
		return entity.find(AmbulanciaUrgencia.class, idAmbulanciaUrgencia);
	}

	/**
	 * 
	 * @param ambulanciaUrgencia
	 */
	public void editarAmbulanciaUrgencia(AmbulanciaUrgencia ambulanciaUrgencia){
		entity.merge(ambulanciaUrgencia);
	}
	
	public void eliminarAmbulanciaUrgencia(Integer idAmbulanciaUrgencia){
		AmbulanciaUrgencia busquedaAmbulanciaUrgencia = buscarAmbulanciaUrgencia(idAmbulanciaUrgencia);
		if(busquedaAmbulanciaUrgencia != null){
			entity.remove(idAmbulanciaUrgencia);
		}else{
			throw new ExcepcionNegocio("Error al borrar la ambulanciaUrgencia");
		}
	}
	
	
	public List<AmbulanciaUrgencia> listarAmbulanciaUrgencia(){
		List<AmbulanciaUrgencia> resultado = null;
		
		try{
			resultado = entity.createQuery("AmbulanciaUrgencia.listarAmbulanciaUrgencia").getResultList();
			System.out.println(resultado);
		} catch (Exception ex){
			System.out.println(ex.getMessage().toString());
		}
		return resultado;
	}
	
}

