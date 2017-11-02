package co.edu.avanzada.negocio.beans;

import java.io.Serializable;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.benas.remote.IAmbulancia;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.Ambulancia;

@LocalBean
@Stateless
@Remote(IAmbulancia.class)
public class AmbulanciaEJB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext
	EntityManager entity;
	
	/**
	 * 
	 * @param ambulancia
	 */
	public void crearAmbulancia(Ambulancia ambulancia){
		Ambulancia busquedaAmbulancia = buscarAmbulancia(ambulancia.getIdambulancia());
		if(busquedaAmbulancia == null){
			entity.persist(ambulancia);
			System.out.println("Ambulancia registrada");
		}else {
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe un registro asociado");
		}
		
	}
	
	/**
	 * 
	 * @param idAmbulancia
	 * @return
	 */
	public Ambulancia buscarAmbulancia(Integer idAmbulancia){
		return entity.find(Ambulancia.class, idAmbulancia);
	}

	/**
	 * 
	 * @param ambulancia
	 */
	public void editarAmbulancia(Ambulancia ambulancia){
		entity.merge(ambulancia);
	}
	
	public void eliminarAmbulancia(Integer idAmbulancia){
		Ambulancia busquedaAmbulancia = buscarAmbulancia(idAmbulancia);
		if(busquedaAmbulancia != null){
			entity.remove(idAmbulancia);
		}else{
			throw new ExcepcionNegocio("Error al borrar la ambulancia");
		}
	}
	
	
	public List<Ambulancia> listarAmbulancia(){
		List<Ambulancia> resultado = null;
		
		try{
			resultado = entity.createQuery("Ambulancia.listarAmbulancia").getResultList();
			System.out.println(resultado);
		} catch (Exception ex){
			System.out.println(ex.getMessage().toString());
		}
		return resultado;
	}
	
}
