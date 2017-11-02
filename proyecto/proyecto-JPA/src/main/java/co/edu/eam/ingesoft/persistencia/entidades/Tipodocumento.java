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
@Table(name="t_tipodocumento")
@NamedQueries({ @NamedQuery(name = "Tipodocumento.listartipodocumento", query = "SELECT t FROM Tipodocumento t"),
	@NamedQuery(name = "Tipodocumento.buscarlistartipodocumento", query = "SELECT t FROM Tipodocumento t where t.nombredocumento=:id") })
public class Tipodocumento implements Serializable {

	@Id
	private Integer id;
	
	@Column(name="nombre",length=50)
	private String nombredocumento;
	
	@OneToMany(mappedBy="tipodocumentopersona",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Persona> persona;

	public Tipodocumento() {
		// TODO Auto-generated constructor stub
	}
	
	public Tipodocumento(Integer id, String nombredocumento) {
		super();
		this.id = id;
		this.nombredocumento = nombredocumento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombredocumento() {
		return nombredocumento;
	}

	public void setNombredocumento(String nombredocumento) {
		this.nombredocumento = nombredocumento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Tipodocumento other = (Tipodocumento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
