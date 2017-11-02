package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import co.edu.eam.ingesoft.persistencia.entidades.PK.EmergenciaeventooperadorPK;

@Entity
@Table(name="t_emergenciaevento")
public class EmergenciaEvento implements Serializable {

	@EmbeddedId
	private EmergenciaeventooperadorPK emergenciaoperadorPK;
	
	@ManyToOne
	@JoinColumn(name="idemergencia")
	private Emergencia emergencia;
	
	@Column(name="descripcion",length=100,nullable=false)
	private String descripcionevento;
	
	@Column(name="lugar",length=50)
	private String lugarevento;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechahora;

	public EmergenciaEvento() {
		// TODO Auto-generated constructor stub
	}

	public EmergenciaEvento(EmergenciaeventooperadorPK emergenciaoperadorPK, String descripcionevento,
			String lugarevento, Date fechahora) {
		super();
		this.emergenciaoperadorPK = emergenciaoperadorPK;
		this.descripcionevento = descripcionevento;
		this.lugarevento = lugarevento;
		this.fechahora = fechahora;
	}

	public EmergenciaeventooperadorPK getEmergenciaoperadorPK() {
		return emergenciaoperadorPK;
	}

	public void setEmergenciaoperadorPK(EmergenciaeventooperadorPK emergenciaoperadorPK) {
		this.emergenciaoperadorPK = emergenciaoperadorPK;
	}

	public String getDescripcionevento() {
		return descripcionevento;
	}

	public void setDescripcionevento(String descripcionevento) {
		this.descripcionevento = descripcionevento;
	}

	public String getLugarevento() {
		return lugarevento;
	}

	public void setLugarevento(String lugarevento) {
		this.lugarevento = lugarevento;
	}

	public Date getFechahora() {
		return fechahora;
	}

	public void setFechahora(Date fechahora) {
		this.fechahora = fechahora;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emergenciaoperadorPK == null) ? 0 : emergenciaoperadorPK.hashCode());
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
		EmergenciaEvento other = (EmergenciaEvento) obj;
		if (emergenciaoperadorPK == null) {
			if (other.emergenciaoperadorPK != null)
				return false;
		} else if (!emergenciaoperadorPK.equals(other.emergenciaoperadorPK))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Emergenciaevento [emergenciaoperadorPK=" + emergenciaoperadorPK + ", descripcionevento="
				+ descripcionevento + ", lugarevento=" + lugarevento + ", fechahora=" + fechahora + "]";
	}

	

	
	
}
