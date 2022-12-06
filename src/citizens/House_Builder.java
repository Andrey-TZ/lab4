package citizens;

import Objects.House;
import Objects.PowerLine;
import cities.City;
import utils.Renamed;

public class House_Builder extends Citizen implements StandartWorker, Renamed {
    public House_Builder(String name, int age, City city) {
        super(name, age, city);
    }

    @Override
    public void work() {
        System.out.print(this );
        City city = this.getCity();
        House house = new House(city);
        System.out.println(city);
        System.out.println("Теперь их здесь " + city.getI_houses());
    }

    @Override
    public void rename(String new_name) {
        this.setName(new_name);
    }
}
