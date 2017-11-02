package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_prioridad")
public class Prioridad implements Serializable {

	@Id
	@Column(name="idprioridad")
	private Integer idprioridad;
	
	@Column(name="estadopaciente")
	private String estadopaciente;

	public Prioridad() {
		// TODO Auto-generated constructor stub
	} 
	
	public Prioridad(Integer idprioridad, String estadopaciente) {
		super();
		this.idprioridad = idprioridad;
		this.estadopaciente = estadopaciente;
	}

	public Integer getIdprioridad() {
		return idprioridad;
	}

	public void setIdprioridad(Integer idprioridad) {
		this.idprioridad = idprioridad;
	}

	public String getEstadopaciente() {
		return estadopaciente;
	}

	public void setEstadopaciente(String estadopaciente) {
		this.estadopaciente = estadopaciente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idprioridad == null) ? 0 : idprioridad.hashCode());
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
		Prioridad other = (Prioridad) obj;
		if (idprioridad == null) {
			if (other.idprioridad != null)
				return false;
		} else if (!idprioridad.equals(other.idprioridad))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Prioridad [idprioridad=" + idprioridad + ", estadopaciente=" + estadopaciente + "]";
	}
	
	
	
	
	
}
