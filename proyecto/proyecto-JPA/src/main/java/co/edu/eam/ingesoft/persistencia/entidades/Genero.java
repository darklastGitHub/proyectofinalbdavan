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
@Table(name="t_genero")
@NamedQueries({ @NamedQuery(name = "Genero.listargenero", query = "Select e from Eps e") })
public class Genero implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Integer idgenero;
	
	@Column(name="sexo")
	private String sexo;
	
	@OneToMany(mappedBy="generopersona",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Persona> persona;
	
	public Genero() {
		// TODO Auto-generated constructor stub
	}

	public Genero(Integer idgenero, String sexo) {
		super();
		this.idgenero = idgenero;
		this.sexo = sexo;
	}

	public Integer getIdgenero() {
		return idgenero;
	}

	public void setIdgenero(Integer idgenero) {
		this.idgenero = idgenero;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idgenero == null) ? 0 : idgenero.hashCode());
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
		Genero other = (Genero) obj;
		if (idgenero == null) {
			if (other.idgenero != null)
				return false;
		} else if (!idgenero.equals(other.idgenero))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Genero [idgenero=" + idgenero + ", sexo=" + sexo + "]";
	}
	
	
}
