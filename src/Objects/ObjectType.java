package Objects;

public enum ObjectType {
    HOUSE("дом"), POWERLINE("линия электропередачи"), ROAD("Дорога");
    private String name;
    ObjectType(String name){this.name = name;}

    @Override
    public String toString(){
        return name;
    }
}
