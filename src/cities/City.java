package cities;


import exceptions.WrongCityObjectException;
import utils.Renamed;

import objects.ObjectType;
import objects.CityObject;
import java.util.Objects;

public abstract class City implements Renamed {
    private String name;


    City(String name) {

        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    abstract public int getAmountOfCityObjects(ObjectType type) throws WrongCityObjectException;

    abstract public void addCityObject(CityObject obj) throws WrongCityObjectException;

    abstract public CityObject[] getCityObjects(ObjectType type) throws WrongCityObjectException;



    @Override
    public void rename(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return 31 * Objects.hash(name);
    }

    @Override
    public boolean equals(Object city) {
        if (city == this) {
            return true;
        }
        if (city == null || city.getClass() != getClass()) {
            return false;
        }
        City city1 = (City) city;
        return city1.getName().equals(this.name);
    }
}
