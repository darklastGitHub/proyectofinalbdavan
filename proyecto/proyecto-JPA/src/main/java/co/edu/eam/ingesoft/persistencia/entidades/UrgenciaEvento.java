package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "t_urgenciaevento")
public class UrgenciaEvento implements Serializable {

	@Id
	private Integer idurgenciaevento;

	@ManyToOne
	@JoinColumn(name = "tipoeventourgencia",nullable=false)
	private TipoEvento tipoevento;

	@Column(name = "descripciourgenciaevento", length = 100)
	private String descripcionurgenciaevento;

	@Column(name = "lugarurgenciaevento", length = 100)
	private String lugarurgenciaevento;

	@Column(name = "estadourgenciaevento", length = 1)
	private char estadourgenciaevento;

	@ManyToOne
	@JoinColumn(name = "idurgencia",nullable=false)
	private Urgencia idurgencia;

	/*@ManyToOne
	@JoinColumn(name = "idoperador")
	private Operador operadorurgencia;*/

	public UrgenciaEvento() {
		// TODO Auto-generated constructor stub
	}

	public Integer getIdurgenciaevento() {
		return idurgenciaevento;
	}

	public void setIdurgenciaevento(Integer idurgenciaevento) {
		this.idurgenciaevento = idurgenciaevento;
	}

	public TipoEvento getTipoevento() {
		return tipoevento;
	}

	public void setTipoevento(TipoEvento tipoevento) {
		this.tipoevento = tipoevento;
	}

	public String getDescripcionurgenciaevento() {
		return descripcionurgenciaevento;
	}

	public void setDescripcionurgenciaevento(String descripcionurgenciaevento) {
		this.descripcionurgenciaevento = descripcionurgenciaevento;
	}

	public String getLugarurgenciaevento() {
		return lugarurgenciaevento;
	}

	public void setLugarurgenciaevento(String lugarurgenciaevento) {
		this.lugarurgenciaevento = lugarurgenciaevento;
	}

	public char getEstadourgenciaevento() {
		return estadourgenciaevento;
	}

	public void setEstadourgenciaevento(char estadourgenciaevento) {
		this.estadourgenciaevento = estadourgenciaevento;
	}

	public Urgencia getIdurgencia() {
		return idurgencia;
	}

	public void setIdurgencia(Urgencia idurgencia) {
		this.idurgencia = idurgencia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcionurgenciaevento == null) ? 0 : descripcionurgenciaevento.hashCode());
		result = prime * result + estadourgenciaevento;
		result = prime * result + ((idurgencia == null) ? 0 : idurgencia.hashCode());
		result = prime * result + ((idurgenciaevento == null) ? 0 : idurgenciaevento.hashCode());
		result = prime * result + ((lugarurgenciaevento == null) ? 0 : lugarurgenciaevento.hashCode());
		result = prime * result + ((tipoevento == null) ? 0 : tipoevento.hashCode());
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
		UrgenciaEvento other = (UrgenciaEvento) obj;
		if (descripcionurgenciaevento == null) {
			if (other.descripcionurgenciaevento != null)
				return false;
		} else if (!descripcionurgenciaevento.equals(other.descripcionurgenciaevento))
			return false;
		if (estadourgenciaevento != other.estadourgenciaevento)
			return false;
		if (idurgencia == null) {
			if (other.idurgencia != null)
				return false;
		} else if (!idurgencia.equals(other.idurgencia))
			return false;
		if (idurgenciaevento == null) {
			if (other.idurgenciaevento != null)
				return false;
		} else if (!idurgenciaevento.equals(other.idurgenciaevento))
			return false;
		if (lugarurgenciaevento == null) {
			if (other.lugarurgenciaevento != null)
				return false;
		} else if (!lugarurgenciaevento.equals(other.lugarurgenciaevento))
			return false;
		if (tipoevento == null) {
			if (other.tipoevento != null)
				return false;
		} else if (!tipoevento.equals(other.tipoevento))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UrgenciaEvento [idurgenciaevento=" + idurgenciaevento + ", tipoevento=" + tipoevento
				+ ", descripcionurgenciaevento=" + descripcionurgenciaevento + ", lugarurgenciaevento="
				+ lugarurgenciaevento + ", estadourgenciaevento=" + estadourgenciaevento + ", idurgencia=" + idurgencia
				+ "]";
	}

	
	
}
