package citizens;

import cities.BigCity;
import cities.City;
import cities.CustomCity;
import cities.SmallCity;

public class Neznaika extends Citizen{
    private static boolean amount = false;
    private Neznaika(int age, City city){super("Незнайка", age, city);}

    public City create_BigCity(String name){
        System.out.println(this + " основал новый большой город: " + name);
        return new BigCity(name);

    }

    public City create_SmallCity(String name){
        System.out.println(this + " основал новый маленький город: " + name);
        return new SmallCity(name);
    }

    public City create_CustomCity(String name,  int roads, int houses, int powerlines){
        System.out.println(this + " основал новый город: " + name);
        return new CustomCity(name, roads, houses, powerlines);
    }

    public static Neznaika create(int age, City city){
        if (!amount) {
            amount = true;
            return new Neznaika(age, city);
        }
        System.out.println("Такой горожанин уже есть!");
        return null;
    }
}
