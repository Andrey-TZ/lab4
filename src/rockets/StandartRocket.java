package rockets;

import citizens.Citizen;
import exceptions.CrewOutOfIndexException;
import exceptions.DifferentRocketException;
import exceptions.EmptyArrayException;
import objects.SpacePort;

import java.util.ArrayList;

public class StandartRocket extends Rocket {
    Cabin storage = new Cabin("склад") {
        @Override
        public void what_in_the_cabin() {
            System.out.print("\"Здесь хранится запас семян полезных растений\"");
        }
    };
    Cabin astronomy_cabin = new Cabin("астрономическая каюта") {
        @Override
        public void what_in_the_cabin() {
            System.out.print("\"Здесь находится астрономическое оборудование\"");
        }
    };

    Cabin living_cabin = new Cabin("жилая каюта") {
        @Override
        public void what_in_the_cabin() {
            System.out.print("\"Здесь спят наши космонавты\"");
        }
    };
    public Journal journal = new Journal();
    Cabin[] all_cabins = {storage, astronomy_cabin, living_cabin};

    public StandartRocket(String name, SpacePort port, int crew_size) {
        super(name, port, crew_size);

    }

    public void common_excursion(Citizen[] guests, String name) {
        try {
            Excursion excursion = new Excursion(guests, all_cabins);
            excursion.start_excursion(name);
            journal.add_note(guests);
        } catch (CrewOutOfIndexException e) {
            System.out.println(e.getMessage());
        }
    }

    private abstract class Cabin {
        Citizen[] guests;
        String name;

        public Cabin(String name) {
            this.name = name;
            guests = new Citizen[getSize()];
        }

        public void addGuests(Citizen[] group) {

            guests = group;

        }

        public Citizen[] getGuests() {
            return guests;
        }

        abstract public void what_in_the_cabin();

        @Override
        public String toString() {
            return name;
        }
    }


    class Excursion {
        private Citizen[] guests;
        private Cabin[] cabins;

        Excursion(Citizen[] guests, Cabin[] cabins) throws CrewOutOfIndexException {
            this.guests = guests;
            this.cabins = cabins;
            if (guests.length == 0) {
                throw new EmptyArrayException("Список гостей пуст.");
            }
            if (cabins.length == 0) {
                throw new EmptyArrayException("Список комнат для посещения пуст.");
            }
            if (guests.length > getSize()) {
                throw new CrewOutOfIndexException();
            }
        }

        private void start_excursion(String guide_name) {
            class Guide {
                String name;

                Guide(String name) {
                    this.name = name;
                }

                void speak_about_cabin(Cabin cabin) {
                    cabin.what_in_the_cabin();
                    System.out.println(" - сказал " + name);
                }

                @Override
                public String toString() {
                    return name;
                }
            }


            Guide guide = new Guide(guide_name);

            for (int i = 0; i < guests.length; i++) {
                System.out.print(guests[i] + ", ");
            }
            System.out.println(" отправились на экскурсию с гидом " + guide);
            for (int i = 0; i < cabins.length; i++) {
                Cabin cabin = cabins[i];
                System.out.println(guide + " привел группу в " + cabin);

                cabin.addGuests(guests);


                guide.speak_about_cabin(cabin);
            }
        }
    }

    public static class Journal {
        private static ArrayList<Citizen> all_guests = new ArrayList<>();
        private ArrayList<Citizen> guests_on_this_rocket = new ArrayList<>();
        public void add_note(Citizen[] guests) {
            for (int i = 0; i < guests.length; i++) {
                if (guests[i] != null) {
                    guests_on_this_rocket.add(guests[i]);
                    all_guests.add(guests[i]);
                } else {
                    break;
                }
            }
        }

        public ArrayList get_notes_on_this_rocket(){
            return guests_on_this_rocket;
        }

        public static ArrayList get_notes() {
            return all_guests;
        }
    }
}

