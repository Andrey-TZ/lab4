package rockets;

import citizens.Citizen;
import exceptions.CrewOutOfIndexException;
import exceptions.DifferentRocketException;
import objects.SpacePort;
import utils.Renamed;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Rocket implements Renamed {
    String name;
    SpacePort port;
    Citizen[] crew;
    int size;
    int i_crew = 0;
    public Rocket(String name, SpacePort port, int crew_size){
        this.name = name;
        this.port = port;
        this.crew = new Citizen[crew_size];
        size = crew_size;
    }

    public void add_crew_member(Citizen crew_member) throws CrewOutOfIndexException {
        try{
            crew[i_crew] = crew_member;
            i_crew+=1;
        }
        catch (ArrayIndexOutOfBoundsException e){
            throw new CrewOutOfIndexException();
        }
    }

    public void move(SpacePort port) {
        try {
            port.add_rocket(this);
        } catch (DifferentRocketException e) {
            System.out.println("В космопорте " + port + " нет места!");
        }
    }


    public Citizen[] getCrew() {
        return crew;
    }

    public SpacePort getPort() {
        return port;
    }

    public String getName() {
        return name;
    }

    public int getSize(){
        return size;
    }

    public void clear_crew(){
        Arrays.fill(crew, null);
    }

    @Override
    public void rename(String new_name) {
        this.name = new_name;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object oth) {
        if (oth == this) {
            return true;
        }
        if (oth == null || oth.getClass() != getClass()) {
            return false;
        }
        Rocket other = (Rocket) oth;
        return other.getPort().equals(port) && other.getName().equals(name);
    }

}
