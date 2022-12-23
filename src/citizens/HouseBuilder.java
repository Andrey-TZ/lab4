package citizens;

import exceptions.WrongCityObjectException;
import objects.CityObject;
import objects.House;
import objects.ObjectType;
import cities.City;
import utils.Renamed;

public class HouseBuilder extends Citizen implements Builder, Renamed {
    public HouseBuilder(String name, int age, City city) {
        super(name, age, city);
    }

    @Override
    public CityObject build() {
        System.out.print(this );
        City city = this.getCity();
        House house = new House(city);
        System.out.println(city);
        try{
        System.out.println("Сейчас их здесь " + city.getAmountOfCityObjects(ObjectType.HOUSE));}
        catch (WrongCityObjectException e){
            System.err.println(e.getMessage());
        }
        return house;
    }

    @Override
    public void rename(String new_name) {
        this.setName(new_name);
    }
}
