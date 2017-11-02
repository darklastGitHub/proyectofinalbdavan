package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_albergue")
public class Albergue implements Serializable {

	@Id
	private Integer idalbergue;
	
	@Column(name="nombre",length=50)
	private String nombrealbergue;
	
	@Column(name="ubicacion",length=50)
	private String ubicacionalbergue;
	
	@Column(name="capacidad")
	private Integer capacidadalbergue;
	
	public Albergue() {
		// TODO Auto-generated constructor stub
	}

	public Albergue(Integer idalbergue, String nombrealbergue, String ubicacionalbergue, Integer capacidadalbergue) {
		super();
		this.idalbergue = idalbergue;
		this.nombrealbergue = nombrealbergue;
		this.ubicacionalbergue = ubicacionalbergue;
		this.capacidadalbergue = capacidadalbergue;
	}

	public Integer getIdalbergue() {
		return idalbergue;
	}

	public void setIdalbergue(Integer idalbergue) {
		this.idalbergue = idalbergue;
	}

	public String getNombrealbergue() {
		return nombrealbergue;
	}

	public void setNombrealbergue(String nombrealbergue) {
		this.nombrealbergue = nombrealbergue;
	}

	public String getUbicacionalbergue() {
		return ubicacionalbergue;
	}

	public void setUbicacionalbergue(String ubicacionalbergue) {
		this.ubicacionalbergue = ubicacionalbergue;
	}

	public Integer getCapacidadalbergue() {
		return capacidadalbergue;
	}

	public void setCapacidadalbergue(Integer capacidadalbergue) {
		this.capacidadalbergue = capacidadalbergue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Albergue other = (Albergue) obj;
		if (idalbergue == null) {
			if (other.idalbergue != null)
				return false;
		} else if (!idalbergue.equals(other.idalbergue))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Albergue [idalbergue=" + idalbergue + ", nombrealbergue=" + nombrealbergue + ", ubicacionalbergue="
				+ ubicacionalbergue + ", capacidadalbergue=" + capacidadalbergue + "]";
	}
}
