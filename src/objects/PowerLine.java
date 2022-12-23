package objects;

import exceptions.WrongCityObjectException;
import cities.City;
import utils.Color;

public class PowerLine extends CityObject {
    public PowerLine(City city){
        super(city, Color.BROWN, ObjectType.POWERLINE);
        try {


        city.addCityObject(this);}
        catch (WrongCityObjectException e){
            System.out.println("ЛЭП не может быть построена в этом городе");
        }
    }
}
