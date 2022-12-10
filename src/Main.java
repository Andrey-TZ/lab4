import Objects.City_object;
import Objects.House;
import utils.Colored;

import cities.*;
import citizens.*;


public class Main {
    public static void main(String[] args) {
        StandartCity capital  = new StandartCity("Первый", 10, 10, 10);
        Neznaika neznaika = Neznaika.create(21, capital);
        City noyabrsk = neznaika.create_SmallCity("Ноябрьск");

        Road_Builder builder_1 = new Road_Builder("Рабочий Винтик", 34, capital);
        House_Builder builder_2 = new House_Builder("Рабочий Шпунтик", 34, capital);
        PowerLine_Builder builder_3 = new PowerLine_Builder("Рабочий Серёга", 42, capital);
        for (int i = 0; i<=30; i++) {
            City_object road = builder_1.build();
            City_object house = builder_2.build();
            City_object pwr_line = builder_3.build();
        }

        Tubik tubik = Tubik.create(25, noyabrsk);
        Painter painter = new Painter( "маляр Валера", 32, noyabrsk);
        builder_2.travel(noyabrsk);
        City_object house_2 = builder_2.build();
        painter.paint((Colored) house_2, tubik.give_color());

    }
}
