package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.benas.remote.IDepartamento;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.Ciudad;
import co.edu.eam.ingesoft.persistencia.entidades.Departamento;
import co.edu.eam.ingesoft.persistencia.entidades.Eps;

@LocalBean
@Stateless
@Remote(IDepartamento.class)
public class DepartamentoEJB implements IDepartamento {

	@PersistenceContext
	EntityManager em;

	public void crearDepartamento(Departamento departamento) {
		// TODO Auto-generated method stub
		em.persist(departamento);

	}

	public Departamento buscarDepartamento(String codigodepartamento) {
		// TODO Auto-generated method stub
		return em.find(Departamento.class, codigodepartamento);
	}

	public void editarDepartamento(Departamento departamento) {
		em.merge(departamento);

	}

	public void eliminar(String departamento) {
		Departamento depto = buscarDepartamento(departamento);
		if (depto != null) {
			em.remove(departamento);
		} else {
			throw new ExcepcionNegocio("Error al borrar el departamento");
		}
	}

	public List<Departamento> Listardepartamento() {
		// TODO Auto-generated method stub
		List<Departamento> resultadoTransaccion = null;
		try {
			resultadoTransaccion = em.createNamedQuery("Departamento.listardepartamentos").getResultList();
			System.out.println(resultadoTransaccion);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());

		}
		return resultadoTransaccion;
	}

	public List<Departamento> BuscarListaDepartamento(String codigodepartamento) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
