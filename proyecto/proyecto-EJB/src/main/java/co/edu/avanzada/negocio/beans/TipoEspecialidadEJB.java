package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.eam.ingesoft.persistencia.entidades.TipoEspecialidad;

@LocalBean
@Stateless

public class TipoEspecialidadEJB{
	@PersistenceContext
	private EntityManager manager;
	public List<TipoEspecialidad> llenar_TipoEspecialidad() {
		List<TipoEspecialidad> resultList = manager.createQuery("select te from TipoEspecialidad te").getResultList();
		System.out.println("resultList"+resultList);
		return resultList;
	}
	public TipoEspecialidad consultarPorLlave(int codigo) {

		return manager.find(TipoEspecialidad.class, codigo);
	}

}
