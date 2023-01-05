package objects;

import exceptions.WrongCityObjectException;
import cities.City;
import rockets.Rocket;
import utils.Color;
import utils.InCity;

public class SpacePort extends CityObject implements InCity {
    String name;
    Rocket[] rockets;

    public SpacePort(City city, String name, int max_rockets) {
        super(city, Color.GREY, ObjectType.SPACEPORT);
        this.name = name;
        try {
            city.addCityObject(this);
            this.rockets = new Rocket[max_rockets];
        } catch (WrongCityObjectException e) {
            System.err.println("Космопорт не может быть построен в этом городе!");
        }
    }


}
