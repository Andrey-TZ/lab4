package citizens;

import cities.City;

import java.util.Objects;

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
    public void travel(City city){
        this.city = city;
        System.out.println(this.name + "переехал в" + city.getName());
    }

    void setName(String new_name){
        this.name = new_name;
    }

    public City getCity() {
        return city;
    }

    public String getName(){return name;}

    public int getAge(){return age;}

    public City getNative_city(){return native_city;}

    @Override
    public String toString(){
        return this.name;
    }

    @Override
    public boolean equals(Object oth){
        if(oth == this){
            return true;
        }
        if(oth == null || oth.getClass() != this.getClass()){
            return false;
        }
        Citizen other = (Citizen) oth;
        return this.name.equals(other.getName()) && this.age == other.getAge() && this.city.equals(other.getCity()) && this.native_city.equals(other.getNative_city());
    }

    @Override
    public int hashCode(){return 31 * Objects.hash(name, age, native_city, city);}
}
