package co.edu.avanzada.standalone.web.controladores;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import co.edu.avanzada.negocio.beans.EpsEJB;
import co.edu.eam.ingesoft.persistencia.entidades.Eps;

@ViewScoped
@Named("controladorEps")
public class Controladoreps implements Serializable {

	@EJB
	private EpsEJB epsejb;

	@Size(min = 1, max = 4, message = "la longitud debe se entre 1 y 4 caracteres")
	@Pattern(regexp = "[0-9]*", message = "Formato invalido, no se permiten letras")
	private String ideps;

	@Size(min = 1, max = 100, message = "la longitud debe se entre 1 y 100 caracteres")
	@Pattern(regexp = "[a-zA-z]*", message = "Formato invalido, no se permiten letras")
	private String nombre;

	@PostConstruct
	public void initializar() {
		nombre="Juan";
	}

	public EpsEJB getEpsejb() {
		return epsejb;
	}

	public void setEpsejb(EpsEJB epsejb) {
		this.epsejb = epsejb;
	}

	public String getIdeps() {
		return ideps;
	}

	public void setIdeps(String ideps) {
		this.ideps = ideps;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void crearEps() {
		Eps eps = new Eps(getIdeps(), getNombre());
		 FacesContext context = FacesContext.getCurrentInstance();
		try {
			epsejb.crearEps(eps);
			 context.addMessage(null, new FacesMessage("Successful", "Eps creada"));
		} catch (Exception e) {
			// TODO: handle exception
			context.addMessage(null, new FacesMessage("Second Message", e.getMessage().toString()));
		}  
	}

}
