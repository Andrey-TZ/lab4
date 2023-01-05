package exceptions;

public class CrewOutOfIndexException extends Exception {
    public CrewOutOfIndexException() {
        super("Превышено количество экипажа");
    }
}
