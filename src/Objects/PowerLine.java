package Objects;

import cities.City;
import utils.Color;

public class PowerLine extends City_object {
    PowerLine(City city){
        super(city, Color.BROWN, ObjectType.POWERLINE);
    }
}
