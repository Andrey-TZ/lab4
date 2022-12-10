package citizens;

import Objects.City_object;
import Objects.ObjectType;
import Objects.Road;
import cities.City;
import utils.Renamed;

public class Road_Builder extends Citizen implements Renamed, Builder {
    public Road_Builder(String name, int age, City city) {
        super(name, age, city);

    }

    @Override
    public City_object build() {
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
