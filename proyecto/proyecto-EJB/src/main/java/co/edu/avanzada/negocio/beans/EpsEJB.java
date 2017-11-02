package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.benas.remote.IEpsremote;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.Eps;
import co.edu.eam.ingesoft.persistencia.entidades.Genero;
import co.edu.eam.ingesoft.persistencia.entidades.Persona;

@LocalBean
@Stateless
@Remote(IEpsremote.class)
public class EpsEJB implements IEpsremote {

	@PersistenceContext
	EntityManager em;

	public void crearEps(Eps eps) {
	
		Eps buscareps = buscarEps(eps.getIdeps());
		
		// no existe, se puede crear...
		if (buscareps == null) {
			em.persist(eps);
		} else {
			throw new ExcepcionNegocio("Ya existe esta eps");
		}

	}

	public Eps buscarEps(String codigoeps) {
		// TODO Auto-generated method stub
		return em.find(Eps.class, codigoeps);
	}

	public void editarEps(Eps eps) {
		// TODO Auto-generated method stub

	}

	public void eliminar(String codigoeps) {
		// TODO Auto-generated method stub

	}

	public List<Eps> ListarEps() {
		// TODO Auto-generated method stub
		List<Eps> resultadoTransaccion = null;
		try {
			resultadoTransaccion =  em.createNamedQuery("Eps.listareps").getResultList();
			System.out.println(resultadoTransaccion);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());
			
		}
		return resultadoTransaccion;
	}

	public List<Eps> BuscarListaEps(String codigoeps) {
		// TODO Auto-generated method stub
		return null;
	}

}
