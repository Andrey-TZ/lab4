package Objects;

public enum ObjectType {
    HOUSE, POWERLINE, ROAD;

    @Override
    public String toString(){
        return switch (this){
            case HOUSE -> "дом";
            case POWERLINE -> "линия электропередачи";
            case ROAD -> "Дорога";
        };
    }
}
