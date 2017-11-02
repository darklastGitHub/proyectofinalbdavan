package co.edu.eam.ingesoft.persistencia.entidades.PK;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EmergenciaeventooperadorPK implements Serializable {
	
	@Column(name="emergencaeventooperador")
	private String emergenciaeventooperador;
	
	@Column(name="emergenciaevento")
	private String emergecniaevento;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emergecniaevento == null) ? 0 : emergecniaevento.hashCode());
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
		EmergenciaeventooperadorPK other = (EmergenciaeventooperadorPK) obj;
		if (emergecniaevento == null) {
			if (other.emergecniaevento != null)
				return false;
		} else if (!emergecniaevento.equals(other.emergecniaevento))
			return false;
		if (emergenciaeventooperador == null) {
			if (other.emergenciaeventooperador != null)
				return false;
		} else if (!emergenciaeventooperador.equals(other.emergenciaeventooperador))
			return false;
		return true;
	}

	
	
	

}
