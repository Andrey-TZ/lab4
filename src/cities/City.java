package cities;

import Objects.House;
import Objects.PowerLine;
import Objects.Road;
import utils.Renamed;

import java.util.Arrays;
import java.util.Objects;

public abstract class City implements Renamed {
    private String name;
    private final Road[] roads;
    private int i_roads = 0, i_houses = 0 , i_powerlines = 0;
    private final House[] houses;
    private final PowerLine[] powerlines;

    City(String name, int roads, int houses, int powerlines) {
        this.roads = new Road[roads];
        this.houses = new House[houses];
        this.powerlines = new PowerLine[powerlines];
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void add_road(Road road) {
        try{
            roads[i_roads] = road;
            i_roads ++;
            System.out.print(" построил дорогу в городе ");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.print( " не смог построить дорогу: их слишком много в городе ");
        }
    }

    public void add_house(House house){
        try{
            houses[i_houses] = house;
            i_houses ++;
            System.out.print(" построил дом в городе ");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.print( " не смог построить дом: их слишком много в городе ");
        }
    }

    public void add_powerline(PowerLine powerLine){
        try{
            powerlines[i_powerlines] = powerLine;
            i_powerlines ++;
            System.out.print(" построл ЛЭП в городе ");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.print(" не смог построить ЛЭП: их слишком много в городе ");
        }
    }

    public Road[] getRoads() {
        return roads;
    }

    public House[] getHouses() {
        return houses;
    }

    public PowerLine[] getPowerLines() {
        return powerlines;
    }

    public int getI_roads(){return i_roads;}

    public int getI_houses(){return i_houses;}

    public int getI_powerlines(){return i_powerlines;}

    @Override
    public void rename(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return 31 * Objects.hash(name, roads, houses, powerlines);
    }

    @Override
    public boolean equals(Object city) {
        if (city == this) {
            return true;
        }
        if (city == null || city.getClass() != getClass()) {
            return false;
        }
        City city1 = (City) city;
        return city1.getName().equals(this.name) && Arrays.equals(city1.getHouses(), this.houses) && Arrays.equals(city1.getRoads(), this.roads) && Arrays.equals(city1.getPowerLines(), this.powerlines);
    }
}
