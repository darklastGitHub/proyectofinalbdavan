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

import co.edu.eam.ingesoft.persistencia.entidades.PK.Acompa�antepersonaPK;

@Entity
@Table(name="t_acompanante")
public class Acompanante implements Serializable {


	@EmbeddedId
	private Acompa�antepersonaPK idacompananate;
	
	@Column(name="parentezcoacompanante")
	private String parentezcoacompa�ante;
	
	@Column(name="telefonoacompanante")
	private String telegonoacompa�ante;
	
	/*@OneToMany(mappedBy="acompananteid",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Urgenciaambulancia> urgenciaambulancia;*/
	
	
	public Acompanante() {
		// TODO Auto-generated constructor stub
	}

	public Acompanante(Acompa�antepersonaPK idacompananate, String parentezcoacompa�ante, String telegonoacompa�ante,
			List<UrgenciaAmbulancia> urgenciaambulancia) {
		super();
		this.idacompananate = idacompananate;
		this.parentezcoacompa�ante = parentezcoacompa�ante;
		this.telegonoacompa�ante = telegonoacompa�ante;
		
	}

	public Acompa�antepersonaPK getIdacompananate() {
		return idacompananate;
	}

	public void setIdacompananate(Acompa�antepersonaPK idacompananate) {
		this.idacompananate = idacompananate;
	}

	public String getParentezcoacompa�ante() {
		return parentezcoacompa�ante;
	}

	public void setParentezcoacompa�ante(String parentezcoacompa�ante) {
		this.parentezcoacompa�ante = parentezcoacompa�ante;
	}

	public String getTelegonoacompa�ante() {
		return telegonoacompa�ante;
	}

	public void setTelegonoacompa�ante(String telegonoacompa�ante) {
		this.telegonoacompa�ante = telegonoacompa�ante;
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
		return "Acompanante [idacompananate=" + idacompananate + ", parentezcoacompa�ante=" + parentezcoacompa�ante
				+ ", telegonoacompa�ante=" + telegonoacompa�ante + "]";
	}

	
	
	 
	
}
