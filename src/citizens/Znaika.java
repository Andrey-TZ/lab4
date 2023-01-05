package citizens;

import cities.City;
import exceptions.NoneSpacePortInCityException;
import exceptions.WrongCityObjectException;
import objects.CityObject;
import objects.ObjectType;
import objects.SpacePort;
import rockets.Rocket;
import rockets.StandartRocket;

public class Znaika extends Citizen{
    public Znaika(int age, City city){
        super("Знайка",  age, city);
    }

    public Rocket create_a_rocket(String name, SpacePort port){
        City city = this.getCity();
        try{
            boolean flag = false;
            CityObject[] ports = city.getCityObjects(ObjectType.SPACEPORT);
            for (int i = 0; i < ports.length; i++){
                if (ports[i] == port){
                    flag = true;
                    break;
                }
            }
            if (flag){
                Rocket rocket = new StandartRocket(name, port);
                return rocket;
            }
            else {
                throw new NoneSpacePortInCityException();
            }
        }
        catch(WrongCityObjectException e){
            System.out.println("В этом городе нет космопортов");
            return null;
        }
    }
}
