package citizens;

import exceptions.WrongCityObjectException;
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
            try{
            System.out.println("Сейчас их здесь " + city.getAmountOfCityObjects(ObjectType.ROAD));}
            catch (WrongCityObjectException e){
                System.err.println(e.getMessage());
            }
            return road;
    }

    @Override
    public void rename(String new_name) {
        this.setName(new_name);
    }
}
