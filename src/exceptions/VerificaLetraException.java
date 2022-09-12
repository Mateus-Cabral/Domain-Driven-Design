package exceptions;

public class VerificaLetraException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2321539341599700686L;
	
	@Override
	public String getMessage() {
		return "\"Letra inválida\"";
	}
	
}
