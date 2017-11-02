package co.edu.avanzada.standalone.web.convertidores;

import javax.ejb.EJB;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

import co.edu.avanzada.negocio.beans.TipoEspecialidadEJB;
import co.edu.eam.ingesoft.persistencia.entidades.TipoEspecialidad;



@FacesConverter(value="tipoEspecialidadConverter",forClass=TipoEspecialidad.class)
@Named
public class tipoEspecialidadConverter implements Converter {

	@EJB
	private TipoEspecialidadEJB tipoEspecialidadEJB;
	
	public Object getAsObject(FacesContext facesContext,UIComponent uIComponent, String string) {
		if(string == null || string.trim().length() == 0
				|| string.equals("Seleccione")){
			return null;
		}
		final String id = string;
		TipoEspecialidad tipoEspecialidad = tipoEspecialidadEJB.consultarPorLlave(Integer.parseInt(id));
		return tipoEspecialidad;
	}

	public String getAsString(FacesContext facesContext,
			UIComponent uIComponent, Object object) {
		if (object == null) {
			return null;
		}
		if (object instanceof TipoEspecialidad) {
			TipoEspecialidad tipoEspecialidad = (TipoEspecialidad) object;

			// Se obtiene el id de la entidad seleccionada
			final String idTipo = String.valueOf(tipoEspecialidad.getCodigo());

			return idTipo;
		} else {

			throw new IllegalArgumentException();
		}
	}

}
