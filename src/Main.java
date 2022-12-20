import objects.CityObject;
import utils.Recolored;

import cities.*;
import citizens.*;


public class Main {
    public static void main(String[] args) {
        StandartCity capital  = new StandartCity("Первый", 10, 10, 10);
        Neznaika neznaika = Neznaika.create(21, capital);
        City noyabrsk = neznaika.create_SmallCity("Ноябрьск");

        RoadBuilder builder_1 = new RoadBuilder("Рабочий Винтик", 34, capital);
        HouseBuilder builder_2 = new HouseBuilder("Рабочий Шпунтик", 34, capital);
        PowerLineBuilder builder_3 = new PowerLineBuilder("Рабочий Серёга", 42, capital);
        for (int i = 0; i<=30; i++) {
            CityObject road = builder_1.build();
            CityObject house = builder_2.build();
            CityObject pwr_line = builder_3.build();
        }

        Tubik tubik = Tubik.create(25, noyabrsk);
        Painter painter = new Painter( "маляр Валера", 32, noyabrsk);
        builder_2.travel(noyabrsk);
        CityObject house_2 = builder_2.build();
        painter.paint((Recolored) house_2, tubik.give_color());

    }
}
