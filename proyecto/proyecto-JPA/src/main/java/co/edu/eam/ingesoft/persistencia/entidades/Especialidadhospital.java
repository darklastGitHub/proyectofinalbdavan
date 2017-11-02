package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_especialidadhospital")
public class Especialidadhospital implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Integer idespecialidadhospital;
	
	@ManyToOne
	@JoinColumn(name="especalidadhospital",insertable=false,updatable=false)
	private Especialidadcristian especialidad;
	
	@ManyToOne
	@JoinColumn(name="especalidadhospital")
	private EntidadHospitalaria entidadhospitalaria;

	public Integer getIdespecialidadhospital() {
		return idespecialidadhospital;
	}

	public void setIdespecialidadhospital(Integer idespecialidadhospital) {
		this.idespecialidadhospital = idespecialidadhospital;
	}

	public Especialidadcristian getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidadcristian especialidad) {
		this.especialidad = especialidad;
	}

	public EntidadHospitalaria getEntidadhospitalaria() {
		return entidadhospitalaria;
	}

	public void setEntidadhospitalaria(EntidadHospitalaria entidadhospitalaria) {
		this.entidadhospitalaria = entidadhospitalaria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((entidadhospitalaria == null) ? 0 : entidadhospitalaria.hashCode());
		result = prime * result + ((especialidad == null) ? 0 : especialidad.hashCode());
		result = prime * result + ((idespecialidadhospital == null) ? 0 : idespecialidadhospital.hashCode());
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
		Especialidadhospital other = (Especialidadhospital) obj;
		if (entidadhospitalaria == null) {
			if (other.entidadhospitalaria != null)
				return false;
		} else if (!entidadhospitalaria.equals(other.entidadhospitalaria))
			return false;
		if (especialidad == null) {
			if (other.especialidad != null)
				return false;
		} else if (!especialidad.equals(other.especialidad))
			return false;
		if (idespecialidadhospital == null) {
			if (other.idespecialidadhospital != null)
				return false;
		} else if (!idespecialidadhospital.equals(other.idespecialidadhospital))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Especialidadhospital [idespecialidadhospital=" + idespecialidadhospital + ", especialidad="
				+ especialidad + ", entidadhospitalaria=" + entidadhospitalaria + "]";
	}
	
	
}
