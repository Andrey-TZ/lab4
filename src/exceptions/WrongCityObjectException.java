package exceptions;

public class WrongCityObjectException extends Exception{
    public WrongCityObjectException(){
        super("Объектов такого типа не может быть в данном городе!");
    }
}
