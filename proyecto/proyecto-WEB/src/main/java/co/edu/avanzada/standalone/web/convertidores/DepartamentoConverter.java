package co.edu.avanzada.standalone.web.convertidores;

import javax.ejb.EJB;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

import co.edu.avanzada.negocio.beans.DepartamentoEJB;
import co.edu.eam.ingesoft.persistencia.entidades.Departamento;



@FacesConverter(value = "departamentoConverter", forClass = Departamento.class)
@Named
public class DepartamentoConverter implements Converter {

	@EJB
	private DepartamentoEJB departamentoEJB;
	
	public Object getAsObject(FacesContext facesContext,UIComponent uIComponent, String string) {
		if (string == null
				|| string.trim().length() == 0
				|| string.equals("Seleccione")) {
			return null;
		}

		final String id = string;
		Departamento departamento = departamentoEJB.buscarDepartamento(String.valueOf(id));

		return departamento;
	}

	public String getAsString(FacesContext facesContext,
			UIComponent uIComponent, Object object) {
		if (object == null) {
			return null;
		}
		
		if (object instanceof Departamento) {
			Departamento departamento = (Departamento) object;

			// Se obtiene el id de la entidad seleccionada
			final String idDepartamento = String.valueOf(departamento.getId_departamento());
			return idDepartamento;
			
		} else {

			throw new IllegalArgumentException();
		}
		
	}
}