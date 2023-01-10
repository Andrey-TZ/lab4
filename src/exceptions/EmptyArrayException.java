package exceptions;

public class EmptyArrayException extends IndexOutOfBoundsException{
    public EmptyArrayException(String message){
        super(message);
    }
}
