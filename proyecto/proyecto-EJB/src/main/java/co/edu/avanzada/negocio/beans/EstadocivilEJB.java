package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.benas.remote.IEstadocivil;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.Eps;
import co.edu.eam.ingesoft.persistencia.entidades.Estadocivil;

@LocalBean
@Stateless
@Remote(IEstadocivil.class)
public class EstadocivilEJB implements IEstadocivil {

	@PersistenceContext
	EntityManager em;

	public void crearEstadocivil(Estadocivil estadocivil) {
		// TODO Auto-generated method stub
		Estadocivil buscarestadocivil = buscarEstadocivil(String.valueOf(estadocivil.getIdestadocivil()));

		// no existe, se puede crear...
		if (buscarestadocivil == null) {
			em.persist(estadocivil);
		} else {
			throw new ExcepcionNegocio("Ya existe esta eps");
		}
	}

	public Estadocivil buscarEstadocivil(String codigoestado) {
		// TODO Auto-generated method stub
		return em.find(Estadocivil.class, codigoestado);
	}

	public void editarEstadocivil(Estadocivil estadocivil) {
		// TODO Auto-generated method stub

	}

	public void eliminar(String codigoestadocivil) {
		// TODO Auto-generated method stub

	}

	public List<Estadocivil> ListarEstadocivil() {
		// TODO Auto-generated method stub
		List<Estadocivil> resultadoTransaccion = null;
		try {
			resultadoTransaccion =  em.createNamedQuery("Estadocivil.listarestadocivil").getResultList();
			System.out.println(resultadoTransaccion);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());
			
		}
		return resultadoTransaccion;
	}

	public List<Estadocivil> BuscarListaEstadocivil(String codigoestadocivil) {
		// TODO Auto-generated method stub
		return null;
	}

}
