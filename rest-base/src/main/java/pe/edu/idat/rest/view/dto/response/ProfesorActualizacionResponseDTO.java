package pe.edu.idat.rest.view.dto.response;

import java.io.Serializable;

public class ProfesorActualizacionResponseDTO  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1018907543302524725L;

	private String codigoRespuesta;
	private String mensajeRespuesta;
	
	public String getCodigoRespuesta() {
		return codigoRespuesta;
	}
	public void setCodigoRespuesta(String codigoRespuesta) {
		this.codigoRespuesta = codigoRespuesta;
	}
	public String getMensajeRespuesta() {
		return mensajeRespuesta;
	}
	public void setMensajeRespuesta(String mensajeRespuesta) {
		this.mensajeRespuesta = mensajeRespuesta;
	}
	
	
}
