package Objects;

import cities.City;
import utils.Color;

public class Road extends City_object {
    Road(City city){
        super(city, Color.GREY, ObjectType.ROAD);
    }
}