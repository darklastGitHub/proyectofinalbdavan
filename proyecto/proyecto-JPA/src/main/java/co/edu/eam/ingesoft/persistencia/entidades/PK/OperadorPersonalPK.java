package co.edu.eam.ingesoft.persistencia.entidades.PK;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OperadorPersonalPK implements Serializable {

	@Column(name="id_peronal")
	private Integer ippersonal;
	
	@Column(name="id_operador")
	private Integer idoperador;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idoperador == null) ? 0 : idoperador.hashCode());
		result = prime * result + ((ippersonal == null) ? 0 : ippersonal.hashCode());
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
		OperadorPersonalPK other = (OperadorPersonalPK) obj;
		if (idoperador == null) {
			if (other.idoperador != null)
				return false;
		} else if (!idoperador.equals(other.idoperador))
			return false;
		if (ippersonal == null) {
			if (other.ippersonal != null)
				return false;
		} else if (!ippersonal.equals(other.ippersonal))
			return false;
		return true;
	}
	
	
}
