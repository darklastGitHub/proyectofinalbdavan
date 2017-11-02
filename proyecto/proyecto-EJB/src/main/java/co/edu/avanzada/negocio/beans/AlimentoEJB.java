package co.edu.avanzada.negocio.beans;

import java.io.Serializable;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.benas.remote.IAlimento;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.Alimento;

@LocalBean
@Stateless
@Remote(IAlimento.class)
public class AlimentoEJB implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext
	EntityManager entity;
	
	
	/**
	 * 
	 * @param alimento
	 */
	public void crearAlimento(Alimento alimento){
		Alimento busquedaAlimento = buscarAlimento(alimento.getIdalimento());
		if(busquedaAlimento == null){
				entity.persist(alimento);
				System.out.println("alimento registrado con exito");
		}else{
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe un registro asociado");
		}
	}
	
	/**
	 * 
	 * @param idAlimento
	 * @return
	 */
	public Alimento buscarAlimento(Integer idAlimento){
		return entity.find(Alimento.class, idAlimento);
	}
	
	/**
	 * 
	 * @param alimento
	 */
	public void editarAlimento (Alimento alimento){
		entity.merge(alimento);
	}
	
	/**
	 * 
	 */
	public void eliminarAlimento (Integer idAlimento){
		Alimento busquedaAlimeto = buscarAlimento(idAlimento);
		if(busquedaAlimeto != null){
		entity.remove(idAlimento);
		System.out.println("Se ha eliminado con exito el alimento");
		}else{
			throw new ExcepcionNegocio("Error al borrar la especialidad");
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public List<Alimento> ListarAlimento() {
		List<Alimento> resultado = null;
		try {
			resultado =  entity.createNamedQuery("Alimento.listaralimentos").getResultList();
			System.out.println(resultado);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());
		}
		return resultado;
	}
	
	
	/**
	 * 
	 * @param idAlimento
	 * @return
	 */
	public List<Alimento> BuscarListaAlimento(Integer idAlimento) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
