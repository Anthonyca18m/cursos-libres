package pe.edu.idat.rest.view.exception;

import java.util.List;

public class ErrorResourceDTO {

	private String code;
	private String message;
	private List<FieldErrorResourceDTO> fieldErrors;

	public ErrorResourceDTO() {
	}

	public ErrorResourceDTO(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<FieldErrorResourceDTO> getFieldErrors() {
		return fieldErrors;
	}
	public void setFieldErrors(List<FieldErrorResourceDTO> fieldErrors) {
		this.fieldErrors = fieldErrors;
	}
	
}