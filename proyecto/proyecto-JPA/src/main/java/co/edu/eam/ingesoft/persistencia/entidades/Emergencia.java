package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="t_emergencia")
public class Emergencia implements Serializable {

	@Id
	private Integer idemergencia;
	
	@Column(name="nombre")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="tipoemergencia",nullable=false)
	private TipoEmergencia tipoemergencia;
	
	
	
	public Emergencia() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param idemergencia
	 * @param nombre
	 * @param tipoemergencia
	 */
	public Emergencia(Integer idemergencia, String nombre, TipoEmergencia tipoemergencia) {
		super();
		this.idemergencia = idemergencia;
		this.nombre = nombre;
		this.tipoemergencia = tipoemergencia;
	}



	public Integer getIdemergencia() {
		return idemergencia;
	}

	public void setIdemergencia(Integer idemergencia) {
		this.idemergencia = idemergencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idemergencia == null) ? 0 : idemergencia.hashCode());
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
		Emergencia other = (Emergencia) obj;
		if (idemergencia == null) {
			if (other.idemergencia != null)
				return false;
		} else if (!idemergencia.equals(other.idemergencia))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Emergencia [idemergencia=" + idemergencia + ", nombre=" + nombre + "]";
	}
	
    
	
}
