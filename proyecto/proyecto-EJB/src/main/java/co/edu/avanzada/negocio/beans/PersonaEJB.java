package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.benas.remote.IPersonaremote;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.Persona;



@LocalBean
@Stateless
@Remote(IPersonaremote.class)
public class PersonaEJB implements IPersonaremote{

	@PersistenceContext
	private EntityManager em;

	public void crearPersona(Persona persona) {
		// TODO Auto-generated method stub
		Persona buscpersona = buscarPersona(String.valueOf(persona.getIdpersona()));
		// no existe, se puede crear...
		if (buscpersona == null) {
			em.persist(persona);
		} else {
			throw new ExcepcionNegocio("Ya existe este Cliente");
		}
	}

	public Persona buscarPersona(String cedula) {
		return em.find(Persona.class, cedula);
	}

	public void editarPersona(Persona persona) {
		em.merge(persona);
		
	}

	public void eliminar(String cedula) {
		Persona busqPersona = buscarPersona(cedula);
		if(busqPersona != null){
			em.remove(cedula);
		}else{
			throw new ExcepcionNegocio("Error al borrar la persona");
		}
		
	}

	public List<Persona> ListarPersonas() {
		List<Persona> resultadoTransaccion = null;
		try {
			resultadoTransaccion =  em.createNamedQuery("Persona.listarpersonas").getResultList();
			System.out.println(resultadoTransaccion);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());
		}
		return resultadoTransaccion;
	}

	public List<Persona> BuscarListaPersonas(String cedula) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	

}
