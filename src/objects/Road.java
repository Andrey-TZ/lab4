package objects;

import exceptions.WrongCityObjectException;
import cities.City;
import utils.Color;

public class Road extends CityObject {
    public Road(City city){
        super(city, Color.GREY, ObjectType.ROAD);
        try{
        city.addCityObject(this);}
        catch (WrongCityObjectException e){
            System.err.println("Дорога не может быть создан в этом городе!");
        }
    }
}
