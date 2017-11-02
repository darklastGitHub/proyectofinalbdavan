package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="t_antecedentessalud")
public class AntecedenteSalud implements Serializable {

	@Id
	private Integer idantecedentessalud;
	
	@Column(name="antecedentessalud",length=100)
	private String antecedentesdalus;
	
	public AntecedenteSalud() {
		// TODO Auto-generated constructor stub
	}

	public AntecedenteSalud(Integer idantecedentessalud, String antecedentesdalus) {
		super();
		this.idantecedentessalud = idantecedentessalud;
		this.antecedentesdalus = antecedentesdalus;
	}

	public Integer getIdantecedentessalud() {
		return idantecedentessalud;
	}

	public void setIdantecedentessalud(Integer idantecedentessalud) {
		this.idantecedentessalud = idantecedentessalud;
	}

	public String getAntecedentesdalus() {
		return antecedentesdalus;
	}

	public void setAntecedentesdalus(String antecedentesdalus) {
		this.antecedentesdalus = antecedentesdalus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idantecedentessalud == null) ? 0 : idantecedentessalud.hashCode());
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
		AntecedenteSalud other = (AntecedenteSalud) obj;
		if (idantecedentessalud == null) {
			if (other.idantecedentessalud != null)
				return false;
		} else if (!idantecedentessalud.equals(other.idantecedentessalud))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Antecedentesalud [idantecedentessalud=" + idantecedentessalud + ", antecedentesdalus="
				+ antecedentesdalus + "]";
	}
	
	
	
}
