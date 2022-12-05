package cities;

import Objects.House;
import Objects.PowerLine;
import Objects.Road;
import utils.Renamed;

import java.util.Arrays;
import java.util.Objects;

public abstract class City implements Renamed {
    private String name;
    private int population;
    private final Road[] roads;
    private int i_roads = 0;
    private final House[] houses;
    private final PowerLine[] powerlines;

    public City(String name, int roads, int houses, int powerlines) {
        this.roads = new Road[roads];
        this.houses = new House[houses];
        this.powerlines = new PowerLine[powerlines];
        this.name = name;
        this.population = 1;
    }

    public String getName() {
        return this.name;
    }

    public void add_road(Road road) {
        if (roads.length >= 10) {
            System.out.println("Не удалось построить дорогу: в городе их слишком много");
        } else {
            roads[i_roads] = road;
            i_roads += 1;
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
        return city1.getName().equals(this.name) && Arrays.equals(city1.houses, this.houses) && Arrays.equals(city1.getRoads(), this.roads) && Arrays.equals(((City) city).getPowerLines(), this.powerlines);
    }
}
