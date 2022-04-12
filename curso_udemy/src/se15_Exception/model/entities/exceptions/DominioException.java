package se15_Exception.model.entities.exceptions;

public class DominioException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public DominioException (String msg) {
		super(msg);
	}

}
