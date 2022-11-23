package citizens;

import Infrastructure.City;
import utils.Color;

import java.util.Random;

public class Tubik extends Citizen{
    Color color_given;
    public Tubik(int age, City city) {
        super("Tubik", age, city);
        work();
    }

    @Override
    public void work() {
        int color_number = new Random().nextInt(9);
        Color color = Color.values()[color_number];
        System.out.println(color);
        this.color_given = color;
    }
}

