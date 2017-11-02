package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="t_urgencia")
public class Urgencia implements Serializable {

	@Id
	private Integer idurgencia;
	
	@Column(name="descripcion",length=100)
	private String descripcionUrgencia;
	
	@Column(name="nombre",length=50)
	private String nombreurgencia;
	
	@OneToMany(mappedBy="idurgencia",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<UrgenciaEvento> urgenciaevento;

	public Urgencia() {
		// TODO Auto-generated constructor stub
	}
	
	public Urgencia(Integer idurgencia, String descripcionUrgencia, String nombreurgencia) {
		super();
		this.idurgencia = idurgencia;
		this.descripcionUrgencia = descripcionUrgencia;
		this.nombreurgencia = nombreurgencia;
	}

	public Integer getIdurgencia() {
		return idurgencia;
	}

	public void setIdurgencia(Integer idurgencia) {
		this.idurgencia = idurgencia;
	}

	public String getDescripcionUrgencia() {
		return descripcionUrgencia;
	}

	public void setDescripcionUrgencia(String descripcionUrgencia) {
		this.descripcionUrgencia = descripcionUrgencia;
	}

	public String getNombreurgencia() {
		return nombreurgencia;
	}

	public void setNombreurgencia(String nombreurgencia) {
		this.nombreurgencia = nombreurgencia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idurgencia == null) ? 0 : idurgencia.hashCode());
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
		Urgencia other = (Urgencia) obj;
		if (idurgencia == null) {
			if (other.idurgencia != null)
				return false;
		} else if (!idurgencia.equals(other.idurgencia))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Urgencia [idurgencia=" + idurgencia + ", descripcionUrgencia=" + descripcionUrgencia
				+ ", nombreurgencia=" + nombreurgencia + "]";
	}
	
	
	
	
}
