package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="t_funcionario")
public class Funcionario implements Serializable {

	@Id
	private Integer idfuncionario;
	
	@Column(name="codigofuncionario",nullable=false)
	private String codigofuncionario;
	
	@Column(name="salariofuncionario")
	private Double salariofuncionado;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaingreso;
	
	@Column(name="estadofuncionario",nullable=false,length=1)
	private char estadofuncionario;
	
	@ManyToOne
	@JoinColumn(name="tipofuncionario",nullable=false)
	private TipoFuncionario tipofuncionario;
	
	
	@OneToMany(mappedBy="idauxiliar",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<PersonalAmbulancia> personalauxiliar;
	
	@OneToMany(mappedBy="idconductor",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<PersonalAmbulancia> personalconductor;
	
	@OneToMany(mappedBy="idmedico",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<PersonalAmbulancia> personalmedico;

	public Integer getIdfuncionario() {
		return idfuncionario;
	}

	public void setIdfuncionario(Integer idfuncionario) {
		this.idfuncionario = idfuncionario;
	}

	public String getCodigofuncionario() {
		return codigofuncionario;
	}

	public void setCodigofuncionario(String codigofuncionario) {
		this.codigofuncionario = codigofuncionario;
	}

	public Double getSalariofuncionado() {
		return salariofuncionado;
	}

	public void setSalariofuncionado(Double salariofuncionado) {
		this.salariofuncionado = salariofuncionado;
	}

	public Date getFechaingreso() {
		return fechaingreso;
	}

	public void setFechaingreso(Date fechaingreso) {
		this.fechaingreso = fechaingreso;
	}

	public char getEstadofuncionario() {
		return estadofuncionario;
	}

	public void setEstadofuncionario(char estadofuncionario) {
		this.estadofuncionario = estadofuncionario;
	}

	public TipoFuncionario getTipofuncionario() {
		return tipofuncionario;
	}

	public void setTipofuncionario(TipoFuncionario tipofuncionario) {
		this.tipofuncionario = tipofuncionario;
	}

	public List<PersonalAmbulancia> getPersonalauxiliar() {
		return personalauxiliar;
	}

	public void setPersonalauxiliar(List<PersonalAmbulancia> personalauxiliar) {
		this.personalauxiliar = personalauxiliar;
	}

	public List<PersonalAmbulancia> getPersonalconductor() {
		return personalconductor;
	}

	public void setPersonalconductor(List<PersonalAmbulancia> personalconductor) {
		this.personalconductor = personalconductor;
	}

	public List<PersonalAmbulancia> getPersonalmedico() {
		return personalmedico;
	}

	public void setPersonalmedico(List<PersonalAmbulancia> personalmedico) {
		this.personalmedico = personalmedico;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigofuncionario == null) ? 0 : codigofuncionario.hashCode());
		result = prime * result + estadofuncionario;
		result = prime * result + ((fechaingreso == null) ? 0 : fechaingreso.hashCode());
		result = prime * result + ((idfuncionario == null) ? 0 : idfuncionario.hashCode());
		result = prime * result + ((personalauxiliar == null) ? 0 : personalauxiliar.hashCode());
		result = prime * result + ((personalconductor == null) ? 0 : personalconductor.hashCode());
		result = prime * result + ((personalmedico == null) ? 0 : personalmedico.hashCode());
		result = prime * result + ((salariofuncionado == null) ? 0 : salariofuncionado.hashCode());
		result = prime * result + ((tipofuncionario == null) ? 0 : tipofuncionario.hashCode());
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
		Funcionario other = (Funcionario) obj;
		if (codigofuncionario == null) {
			if (other.codigofuncionario != null)
				return false;
		} else if (!codigofuncionario.equals(other.codigofuncionario))
			return false;
		if (estadofuncionario != other.estadofuncionario)
			return false;
		if (fechaingreso == null) {
			if (other.fechaingreso != null)
				return false;
		} else if (!fechaingreso.equals(other.fechaingreso))
			return false;
		if (idfuncionario == null) {
			if (other.idfuncionario != null)
				return false;
		} else if (!idfuncionario.equals(other.idfuncionario))
			return false;
		if (personalauxiliar == null) {
			if (other.personalauxiliar != null)
				return false;
		} else if (!personalauxiliar.equals(other.personalauxiliar))
			return false;
		if (personalconductor == null) {
			if (other.personalconductor != null)
				return false;
		} else if (!personalconductor.equals(other.personalconductor))
			return false;
		if (personalmedico == null) {
			if (other.personalmedico != null)
				return false;
		} else if (!personalmedico.equals(other.personalmedico))
			return false;
		if (salariofuncionado == null) {
			if (other.salariofuncionado != null)
				return false;
		} else if (!salariofuncionado.equals(other.salariofuncionado))
			return false;
		if (tipofuncionario == null) {
			if (other.tipofuncionario != null)
				return false;
		} else if (!tipofuncionario.equals(other.tipofuncionario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Funcionario [idfuncionario=" + idfuncionario + ", codigofuncionario=" + codigofuncionario
				+ ", salariofuncionado=" + salariofuncionado + ", fechaingreso=" + fechaingreso + ", estadofuncionario="
				+ estadofuncionario + ", tipofuncionario=" + tipofuncionario + ", personalauxiliar=" + personalauxiliar
				+ ", personalconductor=" + personalconductor + ", personalmedico=" + personalmedico + "]";
	}
	
	
	
	
}



