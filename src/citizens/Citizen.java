package citizens;

import Infrastructure.City;

public abstract class Citizen {
    String name;
    int age;
    Citizen(String name, int age){
        this.name = name;
        this.age = age;
    }

    abstract  protected void work(City city);
}
