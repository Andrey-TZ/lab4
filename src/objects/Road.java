package objects;

import cities.City;
import utils.Color;

public class Road extends CityObject {
    public Road(City city){
        super(city, Color.GREY, ObjectType.ROAD);
        city.addCityObject(this);
    }
}
