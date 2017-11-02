package co.edu.avanzada.standalone.web.controladores;


import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import co.edu.avanzada.negocio.beans.EspecialidadEJB;
import co.edu.avanzada.negocio.beans.TipoEspecialidadEJB;
import co.edu.eam.ingesoft.persistencia.entidades.Especialidad;
import co.edu.eam.ingesoft.persistencia.entidades.TipoEspecialidad;


@ViewScoped
@Named("conEspecialidad")
public class ControladorEspecialidad implements Serializable{
	@EJB
	private EspecialidadEJB especialidadEjb;
	@EJB
	private TipoEspecialidadEJB tipoEspecialidadEjb;
	private String codigo;
	private String nombre;
	private TipoEspecialidad tipoEspecialidadSeleccionada;
	private List<TipoEspecialidad> tipoEspecialidades;
	private List<Especialidad>especialidades;
	private boolean mostrarPanelCrud;
	
	@PostConstruct
	public void init(){
		//especialidades=especialidadEjb.llenar_Especialidades();
		//tipoEspecialidades = tipoEspecialidadEjb.llenar_TipoEspecialidad();
		//System.out.println("tipoEspecialidades"+tipoEspecialidades);
		mostrarPanelCrud = Boolean.TRUE;
	}
	
	

	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public TipoEspecialidad getTipoEspecialidadSeleccionada() {
		return tipoEspecialidadSeleccionada;
	}
	public void setTipoEspecialidadSeleccionada(TipoEspecialidad tipoEspecialidadSeleccionada) {
		this.tipoEspecialidadSeleccionada = tipoEspecialidadSeleccionada;
	}
	public List<TipoEspecialidad> getTipoEspecialidades() {
		return tipoEspecialidades;
	}
	public void setTipoEspecialidades(List<TipoEspecialidad> tipoEspecialidades) {
		this.tipoEspecialidades = tipoEspecialidades;
	}
	public List<Especialidad> getEspecialidades() {
		return especialidades;
	}
	public void setEspecialidades(List<Especialidad> especialidades) {
		this.especialidades = especialidades;
	}
	public boolean isMostrarPanelCrud() {
		return mostrarPanelCrud;
	}
	public void setMostrarPanelCrud(boolean mostrarPanelCrud) {
		this.mostrarPanelCrud = mostrarPanelCrud;
	}
	
	
	public EspecialidadEJB getEspecialidadEjb() {
		return especialidadEjb;
	}

	public void setEspecialidadEjb(EspecialidadEJB especialidadEjb) {
		this.especialidadEjb = especialidadEjb;
	}

	public TipoEspecialidadEJB getTipoEspecialidadEjb() {
		return tipoEspecialidadEjb;
	}

	public void setTipoEspecialidadEjb(TipoEspecialidadEJB tipoEspecialidadEjb) {
		this.tipoEspecialidadEjb = tipoEspecialidadEjb;
	}

	public void habilitarPanel(){
		mostrarPanelCrud = Boolean.TRUE;
	}
	public void inHabilitarPanel(){
		mostrarPanelCrud = Boolean.FALSE;
	}
	
	public void crear(){
		
		TipoEspecialidad tipoespecialidad=new TipoEspecialidad();
		tipoespecialidad.setCodigo(1);
		tipoespecialidad.setNombre("dd");
		
		Especialidad especialidad = new Especialidad(getCodigo(),getNombre(),tipoespecialidad);
		
		
		try{
			especialidadEjb.CrearEspecialidad(especialidad);
			//especialidades=especialidadEjb.llenar_Especialidades();
			FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"Registro con exito",null));
		}catch (Exception e) {
			e.printStackTrace();
			FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,e.getMessage(),null));
		}
		//mostrarPanelCrud = Boolean.FALSE;
	}
	
	public void buscar(){
		List<Especialidad> especialidadBuscada;
		especialidadBuscada = especialidadEjb.ListaEspecialidad(codigo);
		if(especialidadBuscada.isEmpty()){
			FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,"No se encuentra registro asociado",null));
		}else{
			FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"Registro asociado",null));
			setEspecialidades(especialidadBuscada);
		}
	}
	
	public void editar(){
		Especialidad especialidad = especialidadEjb.BuscarEspecialidad(codigo);
		if(especialidad !=null){
			especialidad.setCodigo(codigo);
			especialidad.setNombre(nombre);
			especialidad.setTipoEspecialidad(tipoEspecialidadSeleccionada);
			especialidadEjb.EditarEspecialidad(especialidad);
		}
	}
	public void eliminar(){
		Especialidad especialidad = especialidadEjb.BuscarEspecialidad(codigo);
		if(especialidad!=null){
			especialidadEjb.EliminarEspecialidad(codigo);
		}
	}
	
	
	
	
}
