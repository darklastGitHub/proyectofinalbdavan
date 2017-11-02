package co.edu.avanzada.negocio.beans;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.edu.avanzada.negocio.benas.remote.ITipoDocumento;
import co.edu.eam.ingesoft.persistencia.entidades.Departamento;
import co.edu.eam.ingesoft.persistencia.entidades.Tipodocumento;

@LocalBean
@Stateless
@Remote(ITipoDocumento.class)
public class TipodocumentoEJB implements ITipoDocumento{

	@PersistenceContext
	EntityManager em;
	
	
	public void crearTipodocumento(Tipodocumento tipodocumento) {
		// TODO Auto-generated method stub
		em.persist(tipodocumento);
	}



	public void editarTipodocumento(Tipodocumento tipodocumento) {
		// TODO Auto-generated method stub
		
	}

	public void eliminar(String codigotipodocumento) {
		// TODO Auto-generated method stub
		
	}

	public List<Tipodocumento> Listartipodocumento() {
		// TODO Auto-generated method stub
		List<Tipodocumento> resultadoTransaccion = null;
		try {
			resultadoTransaccion =  em.createNamedQuery("Tipodocumento.listartipodocumento").getResultList();
			System.out.println(resultadoTransaccion);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage().toString());
			
		}
		return resultadoTransaccion;
	}

	public List<Tipodocumento> BuscarListaTipodocumento(String codigotipodocumento) {
		// TODO Auto-generated method stub
		return null;
	}



	public Tipodocumento buscarTipodocumento(String codigotipodocumento) {
		// TODO Auto-generated method stub
		return em.find(Tipodocumento.class, codigotipodocumento);
	}

}
