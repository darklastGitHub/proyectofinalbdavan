package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.List;
import co.edu.eam.ingesoft.persistencia.entidades.*;
import javax.persistence.*;

@Entity
@Table(name="t_entidadhospitalaria")
public class EntidadHospitalaria implements Serializable {

	@Id
	private Integer identidadhospitalaria;
	
	@Column(name="nombreentidadhospitalaria")
	private String nombreentidadhospitalaria;
	
	@Column(name="gradocomplejidad")
	private Integer gradocomplejidad;
	
	@Column(name="estado",length=1)
	private char estado;
	
	@OneToMany(mappedBy="entidadhospitalaria",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Cama> camas;
	
	@OneToMany(mappedBy="entidadhospitalaria",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<UrgenciaAmbulancia> urgenciaambulancia;
	
	
	
	public EntidadHospitalaria() {
		// TODO Auto-generated constructor stub
	}

	public EntidadHospitalaria(Integer identidadhospitalaria, String nombreentidadhospitalaria,
			Integer gradocomplejidad, char estado) {
		super();
		this.identidadhospitalaria = identidadhospitalaria;
		this.nombreentidadhospitalaria = nombreentidadhospitalaria;
		this.gradocomplejidad = gradocomplejidad;
		this.estado = estado;
	}
	
	

	public Integer getIdentidadhospitalaria() {
		return identidadhospitalaria;
	}

	public void setIdentidadhospitalaria(Integer identidadhospitalaria) {
		this.identidadhospitalaria = identidadhospitalaria;
	}

	public String getNombreentidadhospitalaria() {
		return nombreentidadhospitalaria;
	}

	public void setNombreentidadhospitalaria(String nombreentidadhospitalaria) {
		this.nombreentidadhospitalaria = nombreentidadhospitalaria;
	}

	public Integer getGradocomplejidad() {
		return gradocomplejidad;
	}

	public void setGradocomplejidad(Integer gradocomplejidad) {
		this.gradocomplejidad = gradocomplejidad;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	public List<Cama> getCamas() {
		return camas;
	}

	public void setCamas(List<Cama> camas) {
		this.camas = camas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identidadhospitalaria == null) ? 0 : identidadhospitalaria.hashCode());
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
		EntidadHospitalaria other = (EntidadHospitalaria) obj;
		if (identidadhospitalaria == null) {
			if (other.identidadhospitalaria != null)
				return false;
		} else if (!identidadhospitalaria.equals(other.identidadhospitalaria))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Entidadhospitalaria [identidadhospitalaria=" + identidadhospitalaria + ", nombreentidadhospitalaria="
				+ nombreentidadhospitalaria + ", gradocomplejidad=" + gradocomplejidad + ", estado=" + estado
				+ ", camas=" + camas + "]";
	}
	
	
	
	
}
