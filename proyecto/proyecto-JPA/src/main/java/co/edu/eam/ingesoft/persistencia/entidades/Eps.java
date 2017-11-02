package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "t_eps")
@NamedQueries({ @NamedQuery(name = "Eps.listareps", query = "Select e from Eps e") })
public class Eps implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String ideps;

	@Column(name = "nombre", length = 50)
	private String nombre;

	@OneToMany(mappedBy = "epspersona", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Persona> persona;

	public Eps() {
		// TODO Auto-generated constructor stub
	}

	public Eps(String ideps, String nombre) {
		super();
		this.ideps = ideps;
		this.nombre = nombre;
	}

	public String getIdeps() {
		return ideps;
	}

	public void setIdeps(String ideps) {
		this.ideps = ideps;
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
		result = prime * result + ((ideps == null) ? 0 : ideps.hashCode());
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
		Eps other = (Eps) obj;
		if (ideps == null) {
			if (other.ideps != null)
				return false;
		} else if (!ideps.equals(other.ideps))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Eps [ideps=" + ideps + ", nombre=" + nombre + "]";
	}

}
