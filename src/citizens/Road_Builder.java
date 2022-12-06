package citizens;

import Objects.Road;
import cities.City;
import utils.Renamed;

public class Road_Builder extends Citizen implements Renamed, StandartWorker {
    public Road_Builder(String name, int age, City city) {
        super(name, age, city);

    }

    @Override
    public void work() {
            System.out.print(this );
            City city = this.getCity();
            Road road = new Road(city);
            System.out.println(city);
            System.out.println("Теперь их здесь " + city.getI_roads());
    }

    @Override
    public void rename(String new_name) {
        this.setName(new_name);
    }
}
