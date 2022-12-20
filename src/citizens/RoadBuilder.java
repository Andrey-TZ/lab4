package citizens;

import objects.CityObject;
import objects.ObjectType;
import objects.Road;
import cities.City;
import utils.Renamed;

public class RoadBuilder extends Citizen implements Renamed, Builder {
    public RoadBuilder(String name, int age, City city) {
        super(name, age, city);

    }

    @Override
    public CityObject build() {
            System.out.print(this );
            City city = this.getCity();
            Road road = new Road(city);
            System.out.println(city);
            System.out.println("Сейчас их здесь " + city.getCityObjects(ObjectType.ROAD));
            return road;
    }

    @Override
    public void rename(String new_name) {
        this.setName(new_name);
    }
}
