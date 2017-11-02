package co.edu.avanzada.negocio.benas.remote;

import java.util.List;


import co.edu.eam.ingesoft.persistencia.entidades.Tipodocumento;

public interface ITipoDocumento {
	
	public void crearTipodocumento(Tipodocumento tipodocumento);

	public Tipodocumento buscarTipodocumento(String codigotipodocumento);

	public void editarTipodocumento(Tipodocumento tipodocumento);

	public void eliminar(String codigotipodocumento);

	public List<Tipodocumento> Listartipodocumento();

	public List<Tipodocumento> BuscarListaTipodocumento(String codigotipodocumento);

}
