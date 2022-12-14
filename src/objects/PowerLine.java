package objects;

import cities.City;
import utils.Color;

public class PowerLine extends CityObject {
    public PowerLine(City city){
        super(city, Color.BROWN, ObjectType.POWERLINE);
        city.addCityObject(this);
    }
}
