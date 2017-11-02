package co.edu.eam.ingesoft.persistencia.entidades.PK;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Acompa�antepersonaPK implements Serializable {

	@Column(name="idacompa�ante")
	private Integer idacompa�ante;
	
	@Column(name="idpersona")
	private Integer idpersona;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idacompa�ante == null) ? 0 : idacompa�ante.hashCode());
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
		Acompa�antepersonaPK other = (Acompa�antepersonaPK) obj;
		if (idacompa�ante == null) {
			if (other.idacompa�ante != null)
				return false;
		} else if (!idacompa�ante.equals(other.idacompa�ante))
			return false;
		if (idpersona == null) {
			if (other.idpersona != null)
				return false;
		} else if (!idpersona.equals(other.idpersona))
			return false;
		return true;
	}
	
	
}
