package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.TipoFuncionario;

@LocalBean
@Stateless
@Remote(ITipoFuncionario)
public class TipoFuncionarioEJB {

	@PersistenceContext
	EntityManager entity;


public void crearTipoFuncionario(TipoFuncionario tipoFuncionario){
		TipoFuncionario busquedaTipoFuncionario = buscarTipoFuncionario(tipoFuncionario.getIdfuncionario());
		if(busquedaTipoFuncionario == null){
			entity.persist(tipoFuncionario);
			System.out.println("TipoFuncionario registrada");
		}else {
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe un registro asociado");
		}
		
	}
	
	/**
	 * 
	 * @param idTipoFuncionario
	 * @return
	 */
	public TipoFuncionario buscarTipoFuncionario(Integer idTipoFuncionario){
		return entity.find(TipoFuncionario.class, idTipoFuncionario);
	}

	/**
	 * 
	 * @param tipoFuncionario
	 */
	public void editarTipoFuncionario(TipoFuncionario tipoFuncionario){
		entity.merge(tipoFuncionario);
	}
	
	public void eliminarTipoFuncionario(Integer idTipoFuncionario){
		TipoFuncionario busquedaTipoFuncionario = buscarTipoFuncionario(idTipoFuncionario);
		if(busquedaTipoFuncionario != null){
			entity.remove(idTipoFuncionario);
		}else{
			throw new ExcepcionNegocio("Error al borrar la tipoFuncionario");
		}
	}
	
	
	public List<TipoFuncionario> listarTipoFuncionario(){
		List<TipoFuncionario> resultado = null;
		
		try{
			resultado = entity.createQuery("TipoFuncionario.listarTipoFuncionario").getResultList();
			System.out.println(resultado);
		} catch (Exception ex){
			System.out.println(ex.getMessage().toString());
		}
		return resultado;
	}
	
}
