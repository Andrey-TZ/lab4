package citizens;

import cities.City;
import exceptions.FamousCitizenException;
import utils.Color;

import java.util.Random;

public class Tubik extends Citizen {
    private static boolean amount = false;

    private Tubik(int age, City city) {
        super("Тюбик", age, city);
    }


    public static Tubik create(int age, City city) {
        if (!amount) {
            amount = true;
            return new Tubik(age, city);
        }
        System.out.println("Такой горожанин уже есть!");
        throw new FamousCitizenException();
    }

    public Color give_color() {
        int color_number = new Random().nextInt(9);
        Color color = Color.values()[color_number];
        System.out.println("Тюбик выбрал " + color + " цвет для покраски");
        return color;
    }
}

