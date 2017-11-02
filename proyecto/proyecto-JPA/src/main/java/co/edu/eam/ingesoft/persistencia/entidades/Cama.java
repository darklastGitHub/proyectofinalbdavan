package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_cama")
public class Cama implements Serializable{

	@Id
	private Integer idcama;
	
	@Column(name="codigo")
	private String codigocama;
	
	@Column(name="estado",length=1)
	private char estadocama;
	
	@ManyToOne
	@JoinColumn(name="endidadhospitalaria")
	private EntidadHospitalaria entidadhospitalaria;

	public Integer getIdcama() {
		return idcama;
	}

	public void setIdcama(Integer idcama) {
		this.idcama = idcama;
	}

	public String getCodigocama() {
		return codigocama;
	}

	public void setCodigocama(String codigocama) {
		this.codigocama = codigocama;
	}

	public char getEstadocama() {
		return estadocama;
	}

	public void setEstadocama(char estadocama) {
		this.estadocama = estadocama;
	}

	public EntidadHospitalaria getEntidadhospitalaria() {
		return entidadhospitalaria;
	}

	public void setEntidadhospitalaria(EntidadHospitalaria entidadhospitalaria) {
		this.entidadhospitalaria = entidadhospitalaria;
	}

	@Override
	public String toString() {
		return "Cama [idcama=" + idcama + ", codigocama=" + codigocama + ", estadocama=" + estadocama
				+ ", entidadhospitalaria=" + entidadhospitalaria + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigocama == null) ? 0 : codigocama.hashCode());
		result = prime * result + ((entidadhospitalaria == null) ? 0 : entidadhospitalaria.hashCode());
		result = prime * result + estadocama;
		result = prime * result + ((idcama == null) ? 0 : idcama.hashCode());
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
		Cama other = (Cama) obj;
		if (codigocama == null) {
			if (other.codigocama != null)
				return false;
		} else if (!codigocama.equals(other.codigocama))
			return false;
		if (entidadhospitalaria == null) {
			if (other.entidadhospitalaria != null)
				return false;
		} else if (!entidadhospitalaria.equals(other.entidadhospitalaria))
			return false;
		if (estadocama != other.estadocama)
			return false;
		if (idcama == null) {
			if (other.idcama != null)
				return false;
		} else if (!idcama.equals(other.idcama))
			return false;
		return true;
	}

	

}
