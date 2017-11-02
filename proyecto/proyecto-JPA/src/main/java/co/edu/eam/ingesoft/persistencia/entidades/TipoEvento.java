package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_tipoevento")
public class TipoEvento implements Serializable {

	@Id
	private Integer idevento;
	
	@Column(name="nombre_evento")
	private String nombreevento;
	
	public TipoEvento() {
		// TODO Auto-generated constructor stub
	}

	public TipoEvento(Integer idevento, String nombreevento) {
		super();
		this.idevento = idevento;
		this.nombreevento = nombreevento;
	}

	public Integer getIdevento() {
		return idevento;
	}

	public void setIdevento(Integer idevento) {
		this.idevento = idevento;
	}

	public String getNombreevento() {
		return nombreevento;
	}

	public void setNombreevento(String nombreevento) {
		this.nombreevento = nombreevento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idevento == null) ? 0 : idevento.hashCode());
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
		TipoEvento other = (TipoEvento) obj;
		if (idevento == null) {
			if (other.idevento != null)
				return false;
		} else if (!idevento.equals(other.idevento))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tipoevento [idevento=" + idevento + ", nombreevento=" + nombreevento + "]";
	}
		
}
