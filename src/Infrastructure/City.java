package Infrastructure;

public abstract class City {
    protected String name;
    protected int population;
    protected Road[] roads;
    private int i_roads = 0;
    protected House[] houses;
    protected PowerLine[] powerlines;

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
}
