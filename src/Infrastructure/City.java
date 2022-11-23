package Infrastructure;

public class City {
    private String name;
    private int population;
    private Road[] roads;
    private House[] houses;
    private PowerLine[] powerLines;

    public City(String name) {
        this.name = name;
        this.population = 1;
    }

    public City() {
    }

    public String getName() {
        return this.name;
    }
}
