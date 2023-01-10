import exceptions.WrongCityObjectException;
import objects.CityObject;
import objects.SpacePort;
import rockets.Rocket;
import rockets.StandartRocket;
import utils.Recolored;

import cities.*;
import citizens.*;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {


        // lab_3
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


        // lab_4
        Znaika znaika = Znaika.create(22, capital);
        City vostochny = znaika.create_SmallCity("Восточный");
        Builder spacePortBuilder_1 = new SpacePortBuilder("Юра", 35, vostochny);
        CityObject vostochny_spacePort = spacePortBuilder_1.build();
        znaika.travel(vostochny);
        try{
            StandartRocket soyuz = znaika.create_a_rocket("Союз-2.1а", vostochny_spacePort, 8);
            System.out.println(soyuz.journal.get_notes());
            Citizen[] group = {neznaika, znaika, (Citizen) spacePortBuilder_1};
            soyuz.common_excursion(group, "Фуксия");
            ArrayList<Citizen> guests_1 = soyuz.journal.get_notes();
            System.out.println("Журнал посещения " + soyuz);
            System.out.println(guests_1);

//            Citizen[] group2 ={};
//            soyuz.common_excursion(group2, "Фуксия");

            City baikonur = znaika.create_BigCity("Байконур");
            Builder spacePortBuilder_2 = new SpacePortBuilder("Санёчек", 18, baikonur);
            CityObject baikonur_spacePort = spacePortBuilder_2.build();
            znaika.travel(baikonur);
            StandartRocket vostok = znaika.create_a_rocket("Восток", baikonur_spacePort, 1);
            Citizen[] group_2 = {(Citizen)spacePortBuilder_2};
            vostok.common_excursion(group_2, "Селёдочка");
            ArrayList<Citizen> guests_2 = vostok.journal.get_notes_on_this_rocket();
            System.out.println("Журнал посещения " + vostok);
            System.out.println(guests_2);
            System.out.println("Гости со всех рокет:");
            ArrayList<Citizen> all_guests = StandartRocket.Journal.get_notes();
            System.out.println(all_guests);

        }
        catch (WrongCityObjectException e){
            System.out.println(e.getMessage());
        }


    }
}
