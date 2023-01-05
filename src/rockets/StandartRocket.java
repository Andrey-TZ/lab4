package rockets;

import citizens.Citizen;
import objects.SpacePort;

public class StandartRocket extends Rocket{

    public StandartRocket(String name, SpacePort port){
        super(name, port, 48);
        Cabin storage = new Cabin(4){

        };
    }

    private abstract class Cabin{
        Citizen[] guests;
        int i_citizen = 0;
        public Cabin(int max_crewmates){
            guests = new Citizen[max_crewmates];
        }
        public void addCitizen(Citizen human){
            try{
            guests[i_citizen] = human;}
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println();
            }
        }
        public Citizen[] getGuests(){
            return guests;
        }
    }

    public static


}
