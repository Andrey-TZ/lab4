package citizens;

import Infrastructure.City;

public abstract class Citizen {
    private String name;
    private int age;
    private City native_city, city;
    Citizen(String name, int age, City city){
        this.name = name;
        this.age = age;
        this.native_city = city;
        this.city = city;
    }

    abstract public void work();

    public void travel(City city){
        this.city = city;
        System.out.println(this.name + "переехал в" + city.getName());
    }
}
