import utils.Colored;
import cities.BigCity;
import cities.*;
import citizens.*;


public class Main {
    public static void main(String[] args) {
        BigCity capital  = new BigCity("Первый");
        Neznaika neznaika = Neznaika.create(21, capital);
        City noyabrsk = neznaika.create_SmallCity("Ноябрьск");

        Road_Builder builder_1 = new Road_Builder("Рабочий Винтик", 34, capital);
        House_Builder builder_2 = new House_Builder("Рабочий Шпунтик", 34, capital);
        PowerLine_Builder builder_3 = new PowerLine_Builder("Рабочий Серёга", 42, capital);
        for (int i = 0; i<=30; i++) {
            builder_1.work();
            builder_2.work();
            builder_3.work();
        }

        Tubik tubik = Tubik.create(25, noyabrsk);
        Painter painter = new Painter( "маляр Валера", 32, noyabrsk);
        builder_2.travel(noyabrsk);
        builder_2.work();
        painter.paint((Colored) noyabrsk.getHouses()[0], tubik.give_color());

    }
}
