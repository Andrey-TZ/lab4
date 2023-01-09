package citizens;

import cities.City;

import cities.StandartCity;
import exceptions.FamousCitizenException;

public class Neznaika extends Citizen{
    private static boolean exist = false;
    private Neznaika(int age, City city){super("Незнайка", age, city);}

    public City create_BigCity(String name){
        System.out.println(this + " основал новый большой город: " + name);
        return new StandartCity(name, 30, 30, 30);

    }

    public City create_SmallCity(String name){
        System.out.println(this + " основал новый маленький город: " + name);
        return new StandartCity(name, 10, 10, 10);
    }

    public City create_CustomCity(String name,  int roads, int houses, int powerlines){
        System.out.println(this + " основал новый город: " + name);
        return new StandartCity(name, roads, houses, powerlines);
    }

    public static Neznaika create(int age, City city){
        if (!exist) {
            exist = true;
            return new Neznaika(age, city);
        }
        System.out.println("Такой горожанин уже есть!");
        throw new FamousCitizenException();
    }
}
