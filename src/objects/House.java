package objects;

import cities.City;
import utils.Color;
import utils.Colored;

public class House extends CityObject implements Colored {
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
