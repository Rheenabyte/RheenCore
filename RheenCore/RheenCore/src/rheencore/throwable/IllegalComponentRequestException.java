package rheencore.throwable;

public class IllegalComponentRequestException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public IllegalComponentRequestException(){
		super();
	}
	
	public IllegalComponentRequestException(String message){
		super(message);
	}
	
	public IllegalComponentRequestException(String message, Throwable cause){
		super(message, cause);
	}
	
	public IllegalComponentRequestException(Throwable cause){
		super(cause);
	}
	
}
