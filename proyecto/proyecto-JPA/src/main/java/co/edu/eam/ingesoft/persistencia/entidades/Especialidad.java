//package entidades;

package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="T_Especialidadp")
public class Especialidad implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="CodigoEspecialidad",unique=true,nullable=false,length=70)
	private String codigo;
	@Column(name="NombreEspecialidad",nullable=false,length=100)
	private String nombre;
	@ManyToOne
	@JoinColumn(name="CodigoTipoEspecialidad",nullable=false)
	private TipoEspecialidad tipoEspecialidad;
	
	public Especialidad(String codigo, String nombre, TipoEspecialidad tipoEspecialidad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.tipoEspecialidad = tipoEspecialidad;
	}


	public Especialidad() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public TipoEspecialidad getTipoEspecialidad() {
		return tipoEspecialidad;
	}


	public void setTipoEspecialidad(TipoEspecialidad tipoEspecialidad) {
		this.tipoEspecialidad = tipoEspecialidad;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Especialidad other = (Especialidad) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Especialidad [codigo=" + codigo + ", nombre=" + nombre + ", tipoEspecialidad=" + tipoEspecialidad + "]";
	}
	
	
}
