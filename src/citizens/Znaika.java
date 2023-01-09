package citizens;

import cities.City;
import cities.CityWithSpacePort;
import cities.StandartCity;
import exceptions.FamousCitizenException;
import exceptions.NoneSpacePortInCityException;
import exceptions.WrongCityObjectException;
import objects.CityObject;
import objects.ObjectType;
import objects.SpacePort;
import rockets.Rocket;
import rockets.StandartRocket;

public class Znaika extends Citizen {
    private static boolean exist = false;

    private Znaika(int age, City city) {
        super("Знайка", age, city);
    }


    public CityWithSpacePort create_BigCity(String name) {
        System.out.println(this + " основал новый большой город c 2 космическими портами: " + name);
        return new CityWithSpacePort(name, 30, 30, 30);

    }

    public CityWithSpacePort create_SmallCity(String name) {
        System.out.println(this + " основал новый маленький город с космическим портом: " + name);
        return new CityWithSpacePort(name, 10, 10, 10);
    }

    public StandartRocket create_a_rocket(String name, CityObject port1, int crew_size) throws WrongCityObjectException {
        try {
            SpacePort port = (SpacePort) port1;
            City city = this.getCity();
            try {
                boolean flag = false;
                CityObject[] ports = city.getCityObjects(ObjectType.SPACEPORT);
                for (int i = 0; i < ports.length; i++) {
                    if (ports[i] == port) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    StandartRocket rocket = new StandartRocket(name, port, crew_size);
                    System.out.println("Благодаря Знайке теперь в городе " + city + " есть ракета: " + rocket);
                    return rocket;
                } else {
                    throw new NoneSpacePortInCityException();
                }
            } catch (WrongCityObjectException e) {
                System.out.println("В этом городе нет космопортов");
                return null;
            }
        } catch (Exception e) {
            throw new WrongCityObjectException();
        }

    }

    public static Znaika create(int age, City city) {
        if (!exist) {
            exist = true;
            return new Znaika(age, city);
        }
        System.out.println("Знайка уже есть!");
        throw new FamousCitizenException();
    }
}
