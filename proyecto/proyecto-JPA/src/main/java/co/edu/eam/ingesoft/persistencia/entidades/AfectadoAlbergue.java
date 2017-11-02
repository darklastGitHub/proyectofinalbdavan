package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_afectadoalbergue")
public class AfectadoAlbergue implements Serializable {

	@Id
	private Integer idafectadoalbergue;
	
	@ManyToOne
	@JoinColumn(name="idalbergue")
	private Albergue idalbergue;
	
	@ManyToOne
	@JoinColumn(name="alberguealimento",nullable=false)
	private Alimento alberguealimento;
	
	@ManyToOne
	@JoinColumn(name="albergueafectado",nullable=false)
	private Afectado albergueafectado;
	
	public AfectadoAlbergue() {
		// TODO Auto-generated constructor stub
	}

	public AfectadoAlbergue(Integer idafectadoalbergue, Albergue idalbergue, Alimento alberguealimento,
			Afectado albergueafectado) {
		super();
		this.idafectadoalbergue = idafectadoalbergue;
		this.idalbergue = idalbergue;
		this.alberguealimento = alberguealimento;
		this.albergueafectado = albergueafectado;
	}

	public Integer getIdafectadoalbergue() {
		return idafectadoalbergue;
	}

	public void setIdafectadoalbergue(Integer idafectadoalbergue) {
		this.idafectadoalbergue = idafectadoalbergue;
	}

	public Albergue getIdalbergue() {
		return idalbergue;
	}

	public void setIdalbergue(Albergue idalbergue) {
		this.idalbergue = idalbergue;
	}

	public Alimento getAlberguealimento() {
		return alberguealimento;
	}

	public void setAlberguealimento(Alimento alberguealimento) {
		this.alberguealimento = alberguealimento;
	}

	public Afectado getAlbergueafectado() {
		return albergueafectado;
	}

	public void setAlbergueafectado(Afectado albergueafectado) {
		this.albergueafectado = albergueafectado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((albergueafectado == null) ? 0 : albergueafectado.hashCode());
		result = prime * result + ((alberguealimento == null) ? 0 : alberguealimento.hashCode());
		result = prime * result + ((idafectadoalbergue == null) ? 0 : idafectadoalbergue.hashCode());
		result = prime * result + ((idalbergue == null) ? 0 : idalbergue.hashCode());
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
		AfectadoAlbergue other = (AfectadoAlbergue) obj;
		if (albergueafectado == null) {
			if (other.albergueafectado != null)
				return false;
		} else if (!albergueafectado.equals(other.albergueafectado))
			return false;
		if (alberguealimento == null) {
			if (other.alberguealimento != null)
				return false;
		} else if (!alberguealimento.equals(other.alberguealimento))
			return false;
		if (idafectadoalbergue == null) {
			if (other.idafectadoalbergue != null)
				return false;
		} else if (!idafectadoalbergue.equals(other.idafectadoalbergue))
			return false;
		if (idalbergue == null) {
			if (other.idalbergue != null)
				return false;
		} else if (!idalbergue.equals(other.idalbergue))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "afectadoalbergue [idafectadoalbergue=" + idafectadoalbergue + ", idalbergue=" + idalbergue
				+ ", alberguealimento=" + alberguealimento + ", albergueafectado=" + albergueafectado + "]";
	}
	
	
	
	

	
	
	
	
	
}
