package citizens;

import objects.CityObject;
import objects.House;
import objects.ObjectType;
import cities.City;
import utils.Renamed;

public class House_Builder extends Citizen implements Builder, Renamed {
    public House_Builder(String name, int age, City city) {
        super(name, age, city);
    }

    @Override
    public CityObject build() {
        System.out.print(this );
        City city = this.getCity();
        House house = new House(city);
        System.out.println(city);
        System.out.println("Сейчас их здесь " + city.getCityObjects(ObjectType.HOUSE));
        return house;
    }

    @Override
    public void rename(String new_name) {
        this.setName(new_name);
    }
}
