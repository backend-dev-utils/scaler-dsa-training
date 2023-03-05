package beginner.oops.exceptions;

public class ApplicationException extends RuntimeException{

    private String message;

    private Throwable cause;

    public ApplicationException(){
        super();
    }
}