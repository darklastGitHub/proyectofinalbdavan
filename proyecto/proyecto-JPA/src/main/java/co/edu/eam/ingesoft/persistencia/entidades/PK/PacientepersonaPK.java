package co.edu.eam.ingesoft.persistencia.entidades.PK;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Embeddable
public class PacientepersonaPK implements Serializable {

	@Column(name="id_persona")
	private Integer idpersona;
	
	@Column(name="id_paciente")
	private Integer idpaciente;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idpaciente == null) ? 0 : idpaciente.hashCode());
		result = prime * result + ((idpersona == null) ? 0 : idpersona.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PacientepersonaPK other = (PacientepersonaPK) obj;
		if (idpaciente == null) {
			if (other.idpaciente != null)
				return false;
		} else if (!idpaciente.equals(other.idpaciente))
			return false;
		if (idpersona == null) {
			if (other.idpersona != null)
				return false;
		} else if (!idpersona.equals(other.idpersona))
			return false;
		return true;
	}

	
	
	
	
}
