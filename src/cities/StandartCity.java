package cities;

import exceptions.WrongCityObjectException;
import objects.House;
import objects.PowerLine;
import objects.Road;
import objects.ObjectType;
import objects.CityObject;

import java.util.Arrays;
import java.util.Objects;

public class StandartCity extends City {
    private final ObjectType[] types = {ObjectType.POWERLINE, ObjectType.ROAD, ObjectType.HOUSE};
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
    public void addCityObject(CityObject obj) throws WrongCityObjectException {
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
                default -> throw new WrongCityObjectException();
            }


        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.printf(" не смог построить \"%s\": их слишком много в городе ", type);
        }

    }


    @Override
    public int getAmountOfCityObjects(ObjectType type) throws WrongCityObjectException {
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
            default -> throw new WrongCityObjectException();
        }

    }

    @Override
    public CityObject[] getCityObjects(ObjectType type) throws WrongCityObjectException {
        switch (type) {
            case ROAD -> {
                return roads;
            }
            case HOUSE -> {
                return houses;
            }
            case POWERLINE -> {
                return powerlines;
            }
            default -> throw new WrongCityObjectException();
        }
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
        try {
            return city1.getName().equals(this.getName()) && Arrays.equals(city1.getCityObjects(ObjectType.HOUSE), this.houses) && Arrays.equals(city1.getCityObjects(ObjectType.ROAD), this.roads) && Arrays.equals(city1.getCityObjects(ObjectType.POWERLINE), this.powerlines);
        } catch (WrongCityObjectException e) {
            throw new RuntimeException(e);
        }
    }
}
