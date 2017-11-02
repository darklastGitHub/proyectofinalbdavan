package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.benas.remote.ITipoEvento;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.TipoEvento;

@LocalBean
@Stateless
@Remote(ITipoEvento.class)

public class TipoEventoEJB {

	@PersistenceContext
	EntityManager entity;
	

public void crearTipoEvento(TipoEvento tipoEvento){
		TipoEvento busquedaTipoEvento = buscarTipoEvento(tipoEvento.getIdevento());
		if(busquedaTipoEvento == null){
			entity.persist(tipoEvento);
			System.out.println("TipoEvento registrada");
		}else {
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe un registro asociado");
		}
		
	}
	
	/**
	 * 
	 * @param idTipoEvento
	 * @return
	 */
	public TipoEvento buscarTipoEvento(Integer idTipoEvento){
		return entity.find(TipoEvento.class, idTipoEvento);
	}

	/**
	 * 
	 * @param tipoEvento
	 */
	public void editarTipoEvento(TipoEvento tipoEvento){
		entity.merge(tipoEvento);
	}
	
	public void eliminarTipoEvento(Integer idTipoEvento){
		TipoEvento busquedaTipoEvento = buscarTipoEvento(idTipoEvento);
		if(busquedaTipoEvento != null){
			entity.remove(idTipoEvento);
		}else{
			throw new ExcepcionNegocio("Error al borrar la tipoEvento");
		}
	}
	
	
	public List<TipoEvento> listarTipoEvento(){
		List<TipoEvento> resultado = null;
		
		try{
			resultado = entity.createQuery("TipoEvento.listarTipoEvento").getResultList();
			System.out.println(resultado);
		} catch (Exception ex){
			System.out.println(ex.getMessage().toString());
		}
		return resultado;
	}
	
	
}
