package exceptions;

public class DifferentRocketException extends Exception{
    public DifferentRocketException(){super("На космодроме уже есть другая рокета");}
}
