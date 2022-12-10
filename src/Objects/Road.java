package Objects;

import cities.City;
import utils.Color;

public class Road extends City_object {
    public Road(City city){
        super(city, Color.GREY, ObjectType.ROAD);
        city.addCityObject(this);
    }
}
