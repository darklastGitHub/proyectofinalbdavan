package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.benas.remote.ITipoEmergencia;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.TipoEmergencia;

@LocalBean
@Stateless
@Remote(ITipoEmergencia.class)

public class TipoEmergenciaEJB {

	@PersistenceContext
	EntityManager entity;
	


public void crearTipoEmergencia(TipoEmergencia tipoEmergencia){
		TipoEmergencia busquedaTipoEmergencia = buscarTipoEmergencia(tipoEmergencia.getIdemergencia());
		if(busquedaTipoEmergencia == null){
			entity.persist(tipoEmergencia);
			System.out.println("TipoEmergencia registrada");
		}else {
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe un registro asociado");
		}
		
	}
	
	/**
	 * 
	 * @param idTipoEmergencia
	 * @return
	 */
	public TipoEmergencia buscarTipoEmergencia(Integer idTipoEmergencia){
		return entity.find(TipoEmergencia.class, idTipoEmergencia);
	}

	/**
	 * 
	 * @param tipoEmergencia
	 */
	public void editarTipoEmergencia(TipoEmergencia tipoEmergencia){
		entity.merge(tipoEmergencia);
	}
	
	public void eliminarTipoEmergencia(Integer idTipoEmergencia){
		TipoEmergencia busquedaTipoEmergencia = buscarTipoEmergencia(idTipoEmergencia);
		if(busquedaTipoEmergencia != null){
			entity.remove(idTipoEmergencia);
		}else{
			throw new ExcepcionNegocio("Error al borrar la tipoEmergencia");
		}
	}
	
	
	public List<TipoEmergencia> listarTipoEmergencia(){
		List<TipoEmergencia> resultado = null;
		
		try{
			resultado = entity.createQuery("TipoEmergencia.listarTipoEmergencia").getResultList();
			System.out.println(resultado);
		} catch (Exception ex){
			System.out.println(ex.getMessage().toString());
		}
		return resultado;
	}
}
