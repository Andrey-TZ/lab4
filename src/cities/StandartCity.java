package cities;

import objects.House;
import objects.PowerLine;
import objects.Road;
import objects.ObjectType;
import objects.CityObject;

import java.util.Arrays;
import java.util.Objects;

public class StandartCity extends City {
    private final Road[] roads;
    private int i_roads = 0, i_houses = 0, i_powerlines = 0;
    private final House[] houses;
    private final PowerLine[] powerlines;

    public StandartCity(String name, int roads, int houses, int powerlines) {
        super(name);
        this.roads = new Road[roads];
        this.houses = new House[houses];
        this.powerlines = new PowerLine[powerlines];

    }
    @Override
    public void addCityObject(CityObject obj) {
        ObjectType type = obj.getType();
        try {
            switch (type) {
                case HOUSE -> {
                    houses[i_houses] = (House) obj;
                    i_houses++;
                    System.out.print(" построил дом в городе ");
                }
                case ROAD -> {
                    roads[i_roads] = (Road) obj;
                    i_roads++;
                    System.out.print(" построил дорогу в городе ");
                }
                case POWERLINE -> {
                    powerlines[i_powerlines] = (PowerLine) obj;
                    i_powerlines++;
                    System.out.print(" построл ЛЭП в городе ");

                }
            }

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.printf(" не смог построить \"%s\": их слишком много в городе ", type);
        }
    }


    @Override
    public int getCityObjects(ObjectType type) {
        switch (type) {
            case ROAD -> {
                return i_roads;
            }
            case POWERLINE -> {
                return i_powerlines;
            }
            case HOUSE -> {
                return i_houses;
            }
        }
        return 0;
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


    @Override
    public int hashCode() {
        return 31 * Objects.hash(getName(), roads, houses, powerlines);
    }

    @Override
    public boolean equals(Object city) {
        if (city == this) {
            return true;
        }
        if (city == null || city.getClass() != getClass()) {
            return false;
        }
        StandartCity city1 = (StandartCity) city;
        return city1.getName().equals(this.getName()) && Arrays.equals(city1.getHouses(), this.houses) && Arrays.equals(city1.getRoads(), this.roads) && Arrays.equals(city1.getPowerLines(), this.powerlines);
    }
}
