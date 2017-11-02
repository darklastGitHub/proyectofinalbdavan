package co.edu.eam.ingesoft.persistencia.entidades.PK;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Emergenciaeventopk implements Serializable {

	@Column(name="emergencaevento")
	private String emergenciaeventooperador;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emergenciaeventooperador == null) ? 0 : emergenciaeventooperador.hashCode());
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
		Emergenciaeventopk other = (Emergenciaeventopk) obj;
		if (emergenciaeventooperador == null) {
			if (other.emergenciaeventooperador != null)
				return false;
		} else if (!emergenciaeventooperador.equals(other.emergenciaeventooperador))
			return false;
		return true;
	}
	
	
	
}
