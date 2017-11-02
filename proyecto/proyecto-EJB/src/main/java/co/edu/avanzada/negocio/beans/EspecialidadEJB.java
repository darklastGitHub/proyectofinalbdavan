package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.Especialidad;


@LocalBean
@Stateless

public class EspecialidadEJB {
	@PersistenceContext
	private EntityManager manager;
	
	
	public void CrearEspecialidad(Especialidad especialidad) {
		Especialidad buscarEspecialidad = BuscarEspecialidad(especialidad.getCodigo());
		if(buscarEspecialidad == null){
			manager.persist(especialidad);
			System.out.println("La especialidad se ha creado");
		}else{
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe registro asociado");
		}
	}
	
	
	public Especialidad BuscarEspecialidad(String codigo) {
		return manager.find(Especialidad.class, codigo);
	
	}
	
	public void EditarEspecialidad(Especialidad especialidad) {
		manager.merge(especialidad);
		
	}
	
	public void EliminarEspecialidad(String codigo) {
		Especialidad buscarEspecialidad = BuscarEspecialidad(codigo);
		if(buscarEspecialidad !=null){
			manager.remove(buscarEspecialidad);
		}else{
			throw new ExcepcionNegocio("Error al borrar la especialidad");
		}
	}
	
	public List<Especialidad> llenar_Especialidades(){
		List<Especialidad> resultList=manager.createQuery("Select esp from Especialidad esp").getResultList();
		return resultList;
	}
	
	 public List<Especialidad> ListaEspecialidad(String numero) {
			
			Query resultList = manager.createQuery("Select esp from Especialidad esp where esp.codigo=:numero");
			resultList.setParameter("numero", numero);
			List<Especialidad> especialidad=resultList.getResultList();
			return especialidad;
		
	 }

}
