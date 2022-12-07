package citizens;

import cities.City;
import utils.InCity;

import java.util.Objects;

public abstract class Citizen implements InCity {
    private String name;
    private final int age;
    private final City native_city;
    private City city;
    Citizen(String name, int age, City city){
        this.name = name;
        this.age = age;
        this.native_city = city;
        this.city = city;
        System.out.println(this + " приехал в " + city);
        System.out.println("Теперь это его родной город на Луне!");
    }
    public void travel(City city){
        this.city = city;
        System.out.println(this.name + " переехал в " + city.getName());
    }

    void setName(String new_name){
        this.name = new_name;
    }

    @Override
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
