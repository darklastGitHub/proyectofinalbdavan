package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_alimento")
public class Alimento implements Serializable {

	@Id
	private Integer idalimento;

	@Column(name = "nombre", length = 100)
	private String nombrealimento;

	@Column(name = "cantidad")
	private Integer cantidadalimento;

	public Alimento() {
		// TODO Auto-generated constructor stub
	}

	public Alimento(Integer idalimento, String nombrealimento, Integer cantidadalimento) {
		super();
		this.idalimento = idalimento;
		this.nombrealimento = nombrealimento;
		this.cantidadalimento = cantidadalimento;
	}

	public Integer getIdalimento() {
		return idalimento;
	}

	public void setIdalimento(Integer idalimento) {
		this.idalimento = idalimento;
	}

	public String getNombrealimento() {
		return nombrealimento;
	}

	public void setNombrealimento(String nombrealimento) {
		this.nombrealimento = nombrealimento;
	}

	public Integer getCantidadalimento() {
		return cantidadalimento;
	}

	public void setCantidadalimento(Integer cantidadalimento) {
		this.cantidadalimento = cantidadalimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idalimento == null) ? 0 : idalimento.hashCode());
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
		Alimento other = (Alimento) obj;
		if (idalimento == null) {
			if (other.idalimento != null)
				return false;
		} else if (!idalimento.equals(other.idalimento))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Alimento [idalimento=" + idalimento + ", nombrealimento=" + nombrealimento + ", cantidadalimento="
				+ cantidadalimento + "]";
	}

}
