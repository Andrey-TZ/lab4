package citizens;

import Infrastructure.City;

public abstract class Citizen {
    protected String name;
    private int age;
    private City native_city, city;
    Citizen(String name, int age, City city){
        this.name = name;
        this.age = age;
        this.native_city = city;
        this.city = city;
    }
    public void travel(City city){
        this.city = city;
        System.out.println(this.name + "переехал в" + city.getName());
    }

    public City getCity() {
        return city;
    }
}
