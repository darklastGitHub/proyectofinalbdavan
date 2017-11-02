package co.edu.avanzada.standalone.web.controladores;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import co.edu.avanzada.negocio.beans.CiudadEJB;
import co.edu.avanzada.negocio.beans.DepartamentoEJB;
import co.edu.avanzada.negocio.beans.EpsEJB;
import co.edu.avanzada.negocio.beans.EstadocivilEJB;
import co.edu.avanzada.negocio.beans.PersonaEJB;
import co.edu.avanzada.negocio.beans.TipodocumentoEJB;
import co.edu.eam.ingesoft.persistencia.entidades.Ciudad;
import co.edu.eam.ingesoft.persistencia.entidades.Departamento;
import co.edu.eam.ingesoft.persistencia.entidades.Eps;
import co.edu.eam.ingesoft.persistencia.entidades.Estadocivil;
import co.edu.eam.ingesoft.persistencia.entidades.Genero;
import co.edu.eam.ingesoft.persistencia.entidades.Persona;
import co.edu.eam.ingesoft.persistencia.entidades.Tipodocumento;

@ViewScoped
@Named("conPersona")
public class Controladorpersona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB
	private PersonaEJB personaejb;
	
	@EJB
	private CiudadEJB ciudadejb;
	
	@EJB
	private DepartamentoEJB departamentoejb;
	
	@EJB
	private EstadocivilEJB estadocivilejb;
	
	@EJB
	private TipodocumentoEJB tipodocumentoejb;
	
	@EJB
	private EpsEJB epsejb;

	// List
	private List<Persona> listarpersonas;
	private List<Ciudad> listarciudades;
	private List<Departamento> listardepartamento;
	private List<Estadocivil> listarestadocivil;
	private List<Tipodocumento> listartipodocumento;
	private List<Eps> listareps;

	
	private Ciudad ciudadselesscionada;
	private Eps epsseleccionada;
	private Departamento departamentoseleccionado;
	private Estadocivil estadocivilseleccionado;
	private Tipodocumento tipodocumentoseleccionado;


	@Size(min = 1, max = 4, message = "la longitud debe se entre 1 y 4 caracteres")
	@Pattern(regexp = "[0-9]*", message = "Formato invalido, no se permiten letras")
	private String idpersona;
	
	@Size(min = 1, max = 50, message = "la longitud debe se entre 1 y 100 caracteres")
	@Pattern(regexp = "[a-zA-z]*", message = "Formato invalido, no se permiten letras")
	private String nombrepersona;
	private String apellidopersona;
	private String numerodocumentopersona;
	private String emailpersona;
	private Date fechanacimientopersona;
	private Integer telefonopersona;
	private Ciudad cidadpersona;
	private Genero generopersona;
	private Eps epspersona;
	private Estadocivil estadocivilpersona;
	private Tipodocumento tipodocumentopersona;
	private Persona persona;

	@PostConstruct
	public void initializar() {
		listarpersonas = personaejb.ListarPersonas();
		listarciudades= ciudadejb.Listarciudad();
		listareps=epsejb.ListarEps();
		listardepartamento=departamentoejb.Listardepartamento();
		listarestadocivil=estadocivilejb.ListarEstadocivil();
		listartipodocumento=tipodocumentoejb.Listartipodocumento();
		idpersona = "Juan";
	}
	
	
	

	public Tipodocumento getTipodocumentoseleccionado() {
		return tipodocumentoseleccionado;
	}




	public void setTipodocumentoseleccionado(Tipodocumento tipodocumentoseleccionado) {
		this.tipodocumentoseleccionado = tipodocumentoseleccionado;
	}




	public Estadocivil getEstadocivilseleccionado() {
		return estadocivilseleccionado;
	}



	public void setEstadocivilseleccionado(Estadocivil estadocivilseleccionado) {
		this.estadocivilseleccionado = estadocivilseleccionado;
	}



	public Eps getEpsseleccionada() {
		return epsseleccionada;
	}
 
	

	public Departamento getDepartamentoseleccionado() {
		return departamentoseleccionado;
	}


	public void setDepartamentoseleccionado(Departamento departamentoseleccionado) {
		this.departamentoseleccionado = departamentoseleccionado;
	}


	public void setEpsseleccionada(Eps epsseleccionada) {
		this.epsseleccionada = epsseleccionada;
	}


	public PersonaEJB getPersonaejb() {
		return personaejb;
	}

	public void setPersonaejb(PersonaEJB personaejb) {
		this.personaejb = personaejb;
	}

	public String getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(String idpersona) {
		this.idpersona = idpersona;
	}

	public String getNombrepersona() {
		return nombrepersona;
	}

	public void setNombrepersona(String nombrepersona) {
		this.nombrepersona = nombrepersona;
	}

	public List<Persona> getListarpersonas() {
		return listarpersonas;
	}

	public void setListarpersonas(List<Persona> listarpersonas) {
		this.listarpersonas = listarpersonas;
	}

	public String getApellidopersona() {
		return apellidopersona;
	}

	public void setApellidopersona(String apellidopersona) {
		this.apellidopersona = apellidopersona;
	}

	public String getNumerodocumentopersona() {
		return numerodocumentopersona;
	}

	public void setNumerodocumentopersona(String numerodocumentopersona) {
		this.numerodocumentopersona = numerodocumentopersona;
	}

	public String getEmailpersona() {
		return emailpersona;
	}

	public void setEmailpersona(String emailpersona) {
		this.emailpersona = emailpersona;
	}

	public Date getFechanacimientopersona() {
		return fechanacimientopersona;
	}

	public void setFechanacimientopersona(Date fechanacimientopersona) {
		this.fechanacimientopersona = fechanacimientopersona;
	}

	public Integer getTelefonopersona() {
		return telefonopersona;
	}

	public void setTelefonopersona(Integer telefonopersona) {
		this.telefonopersona = telefonopersona;
	}

	public Ciudad getCidadpersona() {
		return cidadpersona;
	}

	public void setCidadpersona(Ciudad cidadpersona) {
		this.cidadpersona = cidadpersona;
	}

	public Genero getGeneropersona() {
		return generopersona;
	}

	public void setGeneropersona(Genero generopersona) {
		this.generopersona = generopersona;
	}

	public Eps getEpspersona() {
		return epspersona;
	}

	public void setEpspersona(Eps epspersona) {
		this.epspersona = epspersona;
	}

	public Estadocivil getEstadocivilpersona() {
		return estadocivilpersona;
	}

	public void setEstadocivilpersona(Estadocivil estadocivilpersona) {
		this.estadocivilpersona = estadocivilpersona;
	}

	public Tipodocumento getTipodocumentopersona() {
		return tipodocumentopersona;
	}

	public void setTipodocumentopersona(Tipodocumento tipodocumentopersona) {
		this.tipodocumentopersona = tipodocumentopersona;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void crearPersona() {

	}

	public void eliminarPersona() {

	}

	public Ciudad getCiudadselesscionada() {
		return ciudadselesscionada;
	}

	public void setCiudadselesscionada(Ciudad ciudadselesscionada) {
		this.ciudadselesscionada = ciudadselesscionada;
	}

	public CiudadEJB getCiudadejb() {
		return ciudadejb;
	}

	public void setCiudadejb(CiudadEJB ciudadejb) {
		this.ciudadejb = ciudadejb;
	}

	public List<Ciudad> getListarciudades() {
		return listarciudades;
	}

	public void setListarciudades(List<Ciudad> listarciudades) {
		this.listarciudades = listarciudades;
	}

	public DepartamentoEJB getDepartamentoejb() {
		return departamentoejb;
	}

	public void setDepartamentoejb(DepartamentoEJB departamentoejb) {
		this.departamentoejb = departamentoejb;
	}

	public EstadocivilEJB getEstadocivilejb() {
		return estadocivilejb;
	}

	public void setEstadocivilejb(EstadocivilEJB estadocivilejb) {
		this.estadocivilejb = estadocivilejb;
	}

	public TipodocumentoEJB getTipodocumentoejb() {
		return tipodocumentoejb;
	}

	public void setTipodocumentoejb(TipodocumentoEJB tipodocumentoejb) {
		this.tipodocumentoejb = tipodocumentoejb;
	}

	public EpsEJB getEpsejb() {
		return epsejb;
	}

	public void setEpsejb(EpsEJB epsejb) {
		this.epsejb = epsejb;
	}

	public List<Departamento> getListardepartamento() {
		return listardepartamento;
	}

	public void setListardepartamento(List<Departamento> listardepartamento) {
		this.listardepartamento = listardepartamento;
	}

	public List<Estadocivil> getListarestadocivil() {
		return listarestadocivil;
	}

	public void setListarestadocivil(List<Estadocivil> listarestadocivil) {
		this.listarestadocivil = listarestadocivil;
	}

	public List<Tipodocumento> getListartipodocumento() {
		return listartipodocumento;
	}

	public void setListartipodocumento(List<Tipodocumento> listartipodocumento) {
		this.listartipodocumento = listartipodocumento;
	}

	public List<Eps> getListareps() {
		return listareps;
	}

	public void setListareps(List<Eps> listareps) {
		this.listareps = listareps;
	}
	
	
	
	
	
}
