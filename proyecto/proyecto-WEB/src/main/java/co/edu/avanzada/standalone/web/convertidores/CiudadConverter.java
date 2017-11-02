package co.edu.avanzada.standalone.web.convertidores;

import javax.ejb.EJB;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Named;

import co.edu.avanzada.negocio.beans.CiudadEJB;
import co.edu.eam.ingesoft.persistencia.entidades.Ciudad;


@Named
@FacesConverter(value="ciudadConverter", forClass= Ciudad.class)
public class CiudadConverter implements Converter{

	@EJB
	private CiudadEJB ciudadEJB;
	
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null
				|| arg2.trim().length() == 0
				|| arg2.equals("Seleccione")) {
			return null;
		}

		final String idciudad = arg2;
		Ciudad ciudad = ciudadEJB.buscarCiudad(idciudad);
		return ciudad;
	}

	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		// TODO Auto-generated method stub
		if (arg2 == null) {
			return null;
		}
		if (arg2 instanceof Ciudad) {
			Ciudad ciudad = (Ciudad) arg2;

			// Se obtiene el id de la entidad seleccionada
			final String cedulaid = String.valueOf(ciudad.getIdciudad());

			return cedulaid;
		} else {

			throw new IllegalArgumentException();
		}
	}

}
