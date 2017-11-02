package co.edu.avanzada.negocio.beans;

import java.io.Serializable;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.PersonalAmbulancia;

@LocalBean
@Stateless
@Remote

public class PersonalAmbulanciaEJB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PersistenceContext
	EntityManager entity;
	
	public void crearPersonalAmbulancia(PersonalAmbulancia personalAmbulancia){
		PersonalAmbulancia busquedaPersonalAmbulancia = buscarPersonalAmbulancia(personalAmbulancia.getIdpersonalambulancia());
		if(busquedaPersonalAmbulancia == null){
			entity.persist(personalAmbulancia);
			System.out.println("PersonalAmbulancia registrada");
		}else {
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe un registro asociado");
		}
		
	}
	
	/**
	 * 
	 * @param idPersonalAmbulancia
	 * @return
	 */
	public PersonalAmbulancia buscarPersonalAmbulancia(Integer idPersonalAmbulancia){
		return entity.find(PersonalAmbulancia.class, idPersonalAmbulancia);
	}

	/**
	 * 
	 * @param personalAmbulancia
	 */
	public void editarPersonalAmbulancia(PersonalAmbulancia personalAmbulancia){
		entity.merge(personalAmbulancia);
	}
	
	public void eliminarPersonalAmbulancia(Integer idPersonalAmbulancia){
		PersonalAmbulancia busquedaPersonalAmbulancia = buscarPersonalAmbulancia(idPersonalAmbulancia);
		if(busquedaPersonalAmbulancia != null){
			entity.remove(idPersonalAmbulancia);
		}else{
			throw new ExcepcionNegocio("Error al borrar la personalAmbulancia");
		}
	}
	
}
