package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="t_ambulancia")
public class Ambulancia implements Serializable {

	@Id
	private Integer idambulancia;
	
	@Column(name="codigoambulancia",nullable=false,length=50)
	private String codigoambulancia;
	
	@Column(name="marcaambulancia",length=50)
	private String marcaambulancia;
	
	@Column(name="placaambulancia",length=50)
	private String placaambulancia;
	
	@Column(name="estadodisponible",length=1)
	private char estadodisponibleambulacia;
	
	@Column(name="estadodactivo",length=1)
	private char estadoactivoambulancia;
	
	@Column(name="cantidad",length=1)
	private Integer cantidad;
	
	@OneToMany(mappedBy="ambulanciaid")
	private List<AmbulanciaUrgencia> ambulanciaurgencia;

	public Ambulancia() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param idambulancia
	 * @param codigoambulancia
	 * @param marcaambulancia
	 * @param placaambulancia
	 * @param estadodisponibleambulacia
	 * @param estadoactivoambulancia
	 * @param cantidad
	 */
	public Ambulancia(Integer idambulancia, String codigoambulancia, String marcaambulancia, String placaambulancia,
			char estadodisponibleambulacia, char estadoactivoambulancia, Integer cantidad) {
		super();
		this.idambulancia = idambulancia;
		this.codigoambulancia = codigoambulancia;
		this.marcaambulancia = marcaambulancia;
		this.placaambulancia = placaambulancia;
		this.estadodisponibleambulacia = estadodisponibleambulacia;
		this.estadoactivoambulancia = estadoactivoambulancia;
		this.cantidad = cantidad;
	}

	public Integer getIdambulancia() {
		return idambulancia;
	}

	public void setIdambulancia(Integer idambulancia) {
		this.idambulancia = idambulancia;
	}

	public String getCodigoambulancia() {
		return codigoambulancia;
	}

	public void setCodigoambulancia(String codigoambulancia) {
		this.codigoambulancia = codigoambulancia;
	}

	public String getMarcaambulancia() {
		return marcaambulancia;
	}

	public void setMarcaambulancia(String marcaambulancia) {
		this.marcaambulancia = marcaambulancia;
	}

	public String getPlacaambulancia() {
		return placaambulancia;
	}

	public void setPlacaambulancia(String placaambulancia) {
		this.placaambulancia = placaambulancia;
	}

	public char getEstadodisponibleambulacia() {
		return estadodisponibleambulacia;
	}

	public void setEstadodisponibleambulacia(char estadodisponibleambulacia) {
		this.estadodisponibleambulacia = estadodisponibleambulacia;
	}

	public char getEstadoactivoambulancia() {
		return estadoactivoambulancia;
	}

	public void setEstadoactivoambulancia(char estadoactivoambulancia) {
		this.estadoactivoambulancia = estadoactivoambulancia;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idambulancia == null) ? 0 : idambulancia.hashCode());
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
		Ambulancia other = (Ambulancia) obj;
		if (idambulancia == null) {
			if (other.idambulancia != null)
				return false;
		} else if (!idambulancia.equals(other.idambulancia))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Ambulancia [idambulancia=" + idambulancia + ", codigoambulancia=" + codigoambulancia
				+ ", marcaambulancia=" + marcaambulancia + ", placaambulancia=" + placaambulancia
				+ ", estadodisponibleambulacia=" + estadodisponibleambulacia + ", estadoactivoambulancia="
				+ estadoactivoambulancia + ", cantidad=" + cantidad + "]";
	}
	
	
	
	
}
