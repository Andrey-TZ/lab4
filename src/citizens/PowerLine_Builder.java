package citizens;

import Objects.PowerLine;
import cities.City;
import utils.Renamed;

public class PowerLine_Builder extends Citizen implements Renamed, StandartWorker{
    public PowerLine_Builder(String name, int age, City city) {
        super(name, age, city);
    }

    @Override
    public void work() {
        System.out.print(this );
        City city = this.getCity();
        new PowerLine(city);
        System.out.println(city);
        System.out.println("Теперь их здесь " + city.getI_powerlines());
    }

    @Override
    public void rename(String new_name) {
        this.setName(new_name);
    }
}
