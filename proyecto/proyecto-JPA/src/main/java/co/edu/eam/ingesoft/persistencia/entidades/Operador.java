package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import co.edu.eam.ingesoft.persistencia.entidades.PK.OperadorPersonalPK;

@Entity
@Table(name="t_operador")
public class Operador implements Serializable {

	@EmbeddedId
	private OperadorPersonalPK idpk;
	
	@Column(name="codigooprador",length=50,nullable=false)
	private String codigooperador;
	
	/*@OneToMany(mappedBy="operadorurgencia",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Urgenciaevento> urgenciaevento;*/
	
	public Operador() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Operador(OperadorPersonalPK idpk, String codigooperador) {
		super();
		this.idpk = idpk;
		this.codigooperador = codigooperador;
	}
	
	
	public OperadorPersonalPK getIdpk() {
		return idpk;
	}


	public void setIdpk(OperadorPersonalPK idpk) {
		this.idpk = idpk;
	}


	public String getCodigooperador() {
		return codigooperador;
	}


	public void setCodigooperador(String codigooperador) {
		this.codigooperador = codigooperador;
	}
	
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idpk == null) ? 0 : idpk.hashCode());
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
		Operador other = (Operador) obj;
		if (idpk == null) {
			if (other.idpk != null)
				return false;
		} else if (!idpk.equals(other.idpk))
			return false;
		return true;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
