package co.edu.eam.ingesoft.persistencia.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import co.edu.eam.ingesoft.persistencia.entidades.PK.PacientepersonaPK;

@Entity
@Table(name="t_paciente")

public class Paciente implements Serializable {

	
	@Id
	@Column(name="idPaciente")
	private Integer idPaciente;
	
	private Persona persona;
	
	@ManyToOne
	@JoinColumn(name="pacienteprioridad")
	private Prioridad prioridad;
	
	@ManyToOne
	@JoinColumn(name="pacienteantecedentesalud")
	private AntecedenteSalud antecedente;
	
	@Column(name="descripcionprioridad", length=250)
	private String descripcionP;
	
}
