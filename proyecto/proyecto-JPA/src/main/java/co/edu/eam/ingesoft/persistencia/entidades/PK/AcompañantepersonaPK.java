package co.edu.eam.ingesoft.persistencia.entidades.PK;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AcompañantepersonaPK implements Serializable {

	@Column(name="idacompañante")
	private Integer idacompañante;
	
	@Column(name="idpersona")
	private Integer idpersona;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idacompañante == null) ? 0 : idacompañante.hashCode());
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
		AcompañantepersonaPK other = (AcompañantepersonaPK) obj;
		if (idacompañante == null) {
			if (other.idacompañante != null)
				return false;
		} else if (!idacompañante.equals(other.idacompañante))
			return false;
		if (idpersona == null) {
			if (other.idpersona != null)
				return false;
		} else if (!idpersona.equals(other.idpersona))
			return false;
		return true;
	}
	
	
}
