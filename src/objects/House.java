package objects;

import exceptions.WrongCityObjectException;
import cities.City;
import utils.Color;
import utils.Recolored;

public class House extends CityObject implements Recolored {
    public House(City city) {
        super(city, Color.BROWN, ObjectType.HOUSE);
        try {
        city.addCityObject(this);
    }
        catch (WrongCityObjectException e){
            System.err.println("Дом не может быть построен в этом городе!");
        }
    }

    @Override
    public void change_color(Color color) {
        setColor(color);
    }

    @Override
    public String toString(){
        return getColor() + " дом ";
    }
}
