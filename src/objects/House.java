package objects;

import cities.City;
import utils.Color;
import utils.Recolored;

public class House extends CityObject implements Recolored {
    public House(City city) {
        super(city, Color.BROWN, ObjectType.HOUSE);
        city.addCityObject(this);
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
