package objects;

public enum ObjectType {
    HOUSE("дом"), POWERLINE("линия электропередачи"), ROAD("дорога"), SPACEPORT("космодром");
    private String name;
    ObjectType(String name){this.name = name;}

    @Override
    public String toString(){
        return name;
    }
}
