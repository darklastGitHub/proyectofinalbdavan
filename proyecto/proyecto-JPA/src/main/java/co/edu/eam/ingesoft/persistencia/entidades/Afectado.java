package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_afectado")
public class Afectado implements Serializable {

	@Id
	private Integer idafectado;
	
	@Column(name="estado")
	private String estadoafectado;
	
	@Column(name="canthijos")
	private Integer canthijos;
	
	@ManyToOne
	@JoinColumn(name="personaid")
	private Persona personaafectado;
	
	
	public Afectado() {
		// TODO Auto-generated constructor stub
	}


	public Afectado(Integer idafectado, String estadoafectado, Integer canthijos, Persona personaafectado) {
		super();
		this.idafectado = idafectado;
		this.estadoafectado = estadoafectado;
		this.canthijos = canthijos;
		this.personaafectado = personaafectado;
	}


	public Integer getIdafectado() {
		return idafectado;
	}


	public void setIdafectado(Integer idafectado) {
		this.idafectado = idafectado;
	}


	public String getEstadoafectado() {
		return estadoafectado;
	}


	public void setEstadoafectado(String estadoafectado) {
		this.estadoafectado = estadoafectado;
	}


	public Integer getCanthijos() {
		return canthijos;
	}


	public void setCanthijos(Integer canthijos) {
		this.canthijos = canthijos;
	}


	public Persona getPersonaafectado() {
		return personaafectado;
	}


	public void setPersonaafectado(Persona personaafectado) {
		this.personaafectado = personaafectado;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idafectado == null) ? 0 : idafectado.hashCode());
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
		Afectado other = (Afectado) obj;
		if (idafectado == null) {
			if (other.idafectado != null)
				return false;
		} else if (!idafectado.equals(other.idafectado))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Afectado [idafectado=" + idafectado + ", estadoafectado=" + estadoafectado + ", canthijos=" + canthijos
				+ ", personaafectado=" + personaafectado + "]";
	}
	
	
	
}
