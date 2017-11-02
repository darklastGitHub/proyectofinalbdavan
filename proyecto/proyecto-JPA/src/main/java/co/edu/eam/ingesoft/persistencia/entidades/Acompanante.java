package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import co.edu.eam.ingesoft.persistencia.entidades.PK.AcompañantepersonaPK;

@Entity
@Table(name="t_acompanante")
public class Acompanante implements Serializable {


	@EmbeddedId
	private AcompañantepersonaPK idacompananate;
	
	@Column(name="parentezcoacompanante")
	private String parentezcoacompañante;
	
	@Column(name="telefonoacompanante")
	private String telegonoacompañante;
	
	/*@OneToMany(mappedBy="acompananteid",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Urgenciaambulancia> urgenciaambulancia;*/
	
	
	public Acompanante() {
		// TODO Auto-generated constructor stub
	}

	public Acompanante(AcompañantepersonaPK idacompananate, String parentezcoacompañante, String telegonoacompañante,
			List<UrgenciaAmbulancia> urgenciaambulancia) {
		super();
		this.idacompananate = idacompananate;
		this.parentezcoacompañante = parentezcoacompañante;
		this.telegonoacompañante = telegonoacompañante;
		
	}

	public AcompañantepersonaPK getIdacompananate() {
		return idacompananate;
	}

	public void setIdacompananate(AcompañantepersonaPK idacompananate) {
		this.idacompananate = idacompananate;
	}

	public String getParentezcoacompañante() {
		return parentezcoacompañante;
	}

	public void setParentezcoacompañante(String parentezcoacompañante) {
		this.parentezcoacompañante = parentezcoacompañante;
	}

	public String getTelegonoacompañante() {
		return telegonoacompañante;
	}

	public void setTelegonoacompañante(String telegonoacompañante) {
		this.telegonoacompañante = telegonoacompañante;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idacompananate == null) ? 0 : idacompananate.hashCode());
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
		Acompanante other = (Acompanante) obj;
		if (idacompananate == null) {
			if (other.idacompananate != null)
				return false;
		} else if (!idacompananate.equals(other.idacompananate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Acompanante [idacompananate=" + idacompananate + ", parentezcoacompañante=" + parentezcoacompañante
				+ ", telegonoacompañante=" + telegonoacompañante + "]";
	}

	
	
	 
	
}
