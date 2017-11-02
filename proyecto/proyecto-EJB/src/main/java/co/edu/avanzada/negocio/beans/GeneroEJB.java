package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.benas.remote.IGenero;
import co.edu.eam.ingesoft.persistencia.entidades.Ciudad;
import co.edu.eam.ingesoft.persistencia.entidades.Eps;
import co.edu.eam.ingesoft.persistencia.entidades.Genero;

@LocalBean
@Stateless
@Remote(IGenero.class)
public class GeneroEJB implements IGenero{

	@PersistenceContext
	EntityManager em;
	

	public void crearGenero(Genero genero) {
		// TODO Auto-generated method stub
		em.persist(genero);
		
	}


	public Genero buscarGenero(String codigogenero) {
		// TODO Auto-generated method stub
		return em.find(Genero.class, codigogenero);
	}


	public void editarGenero(Genero genero) {
		// TODO Auto-generated method stub
		
	}


	public void eliminar(String codigogenero) {
		// TODO Auto-generated method stub
		
	}


	public List<Genero> Listargenero() {
		// TODO Auto-generated method stub
		List<Genero> resultadoTransaccion = null;
		try {
			resultadoTransaccion =  em.createNamedQuery("Genero.listargenero").getResultList();
			System.out.println(resultadoTransaccion);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());
			
		}
		return resultadoTransaccion;
	}


	public List<Genero> BuscarListaGenero(String codigogenero) {
		// TODO Auto-generated method stub
		return null;
	}


	

	

}
