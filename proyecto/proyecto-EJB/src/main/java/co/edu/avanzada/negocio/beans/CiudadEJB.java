package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.benas.remote.ICiudad;
import co.edu.eam.ingesoft.persistencia.entidades.Ciudad;
import co.edu.eam.ingesoft.persistencia.entidades.Eps;
import co.edu.eam.ingesoft.persistencia.entidades.Persona;

@LocalBean
@Stateless
@Remote(ICiudad.class)
public class CiudadEJB implements ICiudad {
	
	@PersistenceContext
	EntityManager em;

	public void crearCiudad(Ciudad ciudad) {
		// TODO Auto-generated method stub
		em.persist(ciudad);
	}

	public Ciudad buscarCiudad(String codigociudad) {
		// TODO Auto-generated method stub
		return em.find(Ciudad.class, codigociudad);
	}

	public void editarCiudad(Ciudad ciudad) {
		// TODO Auto-generated method stub
		
	}

	public void eliminar(String codigociudad) {
		// TODO Auto-generated method stub
		
	}

	public List<Ciudad> Listarciudad() {
		// TODO Auto-generated method stub
		List<Ciudad> resultadoTransaccion = null;
		try {
			resultadoTransaccion =  em.createNamedQuery("Ciudad.listarciudades").getResultList();
			System.out.println(resultadoTransaccion);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());
			
		}
		return resultadoTransaccion;
	}

	public List<Ciudad> BuscarListaCiudad(String codigoeps) {
		// TODO Auto-generated method stub
		return null;
	}

}
