package objects;

import exceptions.DifferentRocketException;
import exceptions.WrongCityObjectException;
import cities.City;
import rockets.Rocket;
import utils.Color;
import utils.InCity;

public class SpacePort extends CityObject implements InCity {
    String name;
    Rocket rocket = null;
    public SpacePort(City city){
        super(city, Color.GREY, ObjectType.SPACEPORT);
        this.name = city.getName();
        try{
        city.addCityObject(this);}
        catch (WrongCityObjectException e){
            System.err.println("Космопорт не может быть построен в этом городе!");
        }
    }
    public void add_rocket(Rocket rocket) throws DifferentRocketException {
        if (rocket != null){
            throw new DifferentRocketException();
        }
        else {
            this.rocket = rocket;
        }
    }

    public Rocket getRocket(){
        return rocket;
    }




}
