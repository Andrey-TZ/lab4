package objects;

import exceptions.WrongCityObjectException;
import cities.City;
import utils.Color;
import utils.InCity;

public class SpacePort extends CityObject implements InCity {
    String name;
    public SpacePort(City city, String name){
        super(city, Color.GREY, ObjectType.SPACEPORT);
        this.name = name;
        try{
        city.addCityObject(this);}
        catch (WrongCityObjectException e){
            System.err.println("Космопорт не может быть построен в этом городе!");
        }
    }




}
