package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder.In;

@Entity
@Table(name="T_TipoEspecialidadp")
public class TipoEspecialidad implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="CodigoTipoEspecialidad",unique=true,nullable=false,length=70)
	private Integer codigo;
	@Column(name="NombreTipoEspecialidad",nullable=false,length=100)
	private String nombre;
	@OneToMany(mappedBy="tipoEspecialidad")
	private List<Especialidad> especialidades;
	public TipoEspecialidad(Integer codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}
	public TipoEspecialidad() {
	}
	
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<Especialidad> getEspecialidades() {
		return especialidades;
	}
	public void setEspecialidades(List<Especialidad> especialidades) {
		this.especialidades = especialidades;
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
		TipoEspecialidad other = (TipoEspecialidad) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "TipoEspecialidad [nombre=" + nombre + "]";
	}
	
	
}
