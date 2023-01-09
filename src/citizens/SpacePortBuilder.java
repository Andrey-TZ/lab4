package citizens;

import cities.City;
import exceptions.WrongCityObjectException;
import objects.CityObject;
import objects.ObjectType;
import objects.Road;
import objects.SpacePort;
import utils.Renamed;

public class SpacePortBuilder extends Citizen implements Builder, Renamed {
    public SpacePortBuilder(String name, int age, City city) {
        super(name, age, city);

    }

    @Override
    public CityObject build() {
        System.out.print(this );
        City city = this.getCity();
        SpacePort spacePort = new SpacePort(city);
        System.out.println(city);
        return spacePort;
    }

    @Override
    public void rename(String new_name) {
        this.setName(new_name);
    }
}

