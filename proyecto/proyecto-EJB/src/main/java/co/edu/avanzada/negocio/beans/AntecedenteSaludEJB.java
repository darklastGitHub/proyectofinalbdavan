package co.edu.avanzada.negocio.beans;

import java.io.Serializable;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.benas.remote.IAntecedenteSalud;
import co.edu.avanzada.negocio.excepciones.ExcepcionNegocio;
import co.edu.eam.ingesoft.persistencia.entidades.AntecedenteSalud;

@LocalBean
@Stateless
@Remote(IAntecedenteSalud.class)
public class AntecedenteSaludEJB implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext
	EntityManager entity;
	

public void crearAntecedenteSalud(AntecedenteSalud antecedenteSalud){
		AntecedenteSalud busquedaAntecedenteSalud = buscarAntecedenteSalud(antecedenteSalud.getIdantecedentessalud());
		if(busquedaAntecedenteSalud == null){
			entity.persist(antecedenteSalud);
			System.out.println("AntecedenteSalud registrada");
		}else {
			throw new co.edu.avanzada.negocio.excepciones.ExcepcionNegocio("Ya existe un registro asociado");
		}
		
	}
	
	/**
	 * 
	 * @param idAntecedenteSalud
	 * @return
	 */
	public AntecedenteSalud buscarAntecedenteSalud(Integer idAntecedenteSalud){
		return entity.find(AntecedenteSalud.class, idAntecedenteSalud);
	}

	/**
	 * 
	 * @param antecedenteSalud
	 */
	public void editarAntecedenteSalud(AntecedenteSalud antecedenteSalud){
		entity.merge(antecedenteSalud);
	}
	
	public void eliminarAntecedenteSalud(Integer idAntecedenteSalud){
		AntecedenteSalud busquedaAntecedenteSalud = buscarAntecedenteSalud(idAntecedenteSalud);
		if(busquedaAntecedenteSalud != null){
			entity.remove(idAntecedenteSalud);
		}else{
			throw new ExcepcionNegocio("Error al borrar la antecedenteSalud");
		}
	}
	
	
	public List<AntecedenteSalud> listarAntecedenteSalud(){
		List<AntecedenteSalud> resultado = null;
		
		try{
			resultado = entity.createQuery("AntecedenteSalud.listarAntecedenteSalud").getResultList();
			System.out.println(resultado);
		} catch (Exception ex){
			System.out.println(ex.getMessage().toString());
		}
		return resultado;
	}

}
