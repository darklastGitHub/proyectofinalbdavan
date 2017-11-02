package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="t_tipoemergencia")
public class TipoEmergencia implements Serializable {

	@Id
	private Integer idemergencia;
	
	
	@Column(name="nombre")
	private String nombreemergencia;
	
	@Column(name="descripcion",length=250)
	private String descripcionemergencia;
	
	@OneToMany(mappedBy="tipoemergencia")
	private List<Emergencia> emergencias;
	
	public TipoEmergencia() {
		// TODO Auto-generated constructor stub
	}

	public TipoEmergencia(Integer idemergencia, String nombreemergencia, String descripcionemergencia) {
		super();
		this.idemergencia = idemergencia;
		this.nombreemergencia = nombreemergencia;
		this.descripcionemergencia = descripcionemergencia;
	}

	public Integer getIdemergencia() {
		return idemergencia;
	}

	public void setIdemergencia(Integer idemergencia) {
		this.idemergencia = idemergencia;
	}

	public String getNombreemergencia() {
		return nombreemergencia;
	}

	public void setNombreemergencia(String nombreemergencia) {
		this.nombreemergencia = nombreemergencia;
	}

	public String getDescripcionemergencia() {
		return descripcionemergencia;
	}

	public void setDescripcionemergencia(String descripcionemergencia) {
		this.descripcionemergencia = descripcionemergencia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idemergencia == null) ? 0 : idemergencia.hashCode());
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
		TipoEmergencia other = (TipoEmergencia) obj;
		if (idemergencia == null) {
			if (other.idemergencia != null)
				return false;
		} else if (!idemergencia.equals(other.idemergencia))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tipoemergencia [idemergencia=" + idemergencia + ", nombreemergencia=" + nombreemergencia
				+ ", descripcionemergencia=" + descripcionemergencia + "]";
	}

}
