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
@Table(name="t_departamento")
@NamedQueries({ @NamedQuery(name = "Departamento.listardepartamentos", query = "SELECT d FROM Departamento d"),
	@NamedQuery(name = "Departamento.buscarlistardepartamentos", query = "SELECT d FROM Departamento d where d.id_departamento=:id") })
public class Departamento implements Serializable {

	@Id
	private Integer id_departamento;
	
	@Column(name="nombre",length=50,nullable=false)
	private String nombredepartemento;
	
	@Column(name="descripcion")
	private String descriptiondepartamento;
	
	@OneToMany(mappedBy = "departamento",fetch = FetchType.LAZY)
	private List<Ciudad> Ciudades;
	
	
	 
	public Departamento() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param id_departamento
	 * @param nombredepartemento
	 * @param descriptiondepartamento
	 */
	public Departamento(Integer id_departamento, String nombredepartemento, String descriptiondepartamento) {
		super();
		this.id_departamento = id_departamento;
		this.nombredepartemento = nombredepartemento;
		this.descriptiondepartamento = descriptiondepartamento;
	}


	public Integer getId_departamento() {
		return id_departamento;
	}


	public void setId_departamento(Integer id_departamento) {
		this.id_departamento = id_departamento;
	}


	public String getNombredepartemento() {
		return nombredepartemento;
	}


	/**
	 * 
	 * @param nombredepartemento
	 */
	public void setNombredepartemento(String nombredepartemento) {
		this.nombredepartemento = nombredepartemento;
	}

	/**
	 * 
	 * @return
	 */
	public String getDescriptiondepartamento() {
		return descriptiondepartamento;
	}


	/**
	 * 
	 * @param descriptiondepartamento
	 */
	public void setDescriptiondepartamento(String descriptiondepartamento) {
		this.descriptiondepartamento = descriptiondepartamento;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_departamento == null) ? 0 : id_departamento.hashCode());
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
		Departamento other = (Departamento) obj;
		if (id_departamento == null) {
			if (other.id_departamento != null)
				return false;
		} else if (!id_departamento.equals(other.id_departamento))
			return false;
		return true;
	}


	
	
	
	
	
	
	
}
