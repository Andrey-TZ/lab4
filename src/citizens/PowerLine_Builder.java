package citizens;

import cities.City;
import utils.Renamed;

public class PowerLine_Builder extends Citizen implements Renamed, StandartWorker{
    PowerLine_Builder(String name, int age, City city) {
        super(name, age, city);
    }

    @Override
    public void work() {

    }

    @Override
    public void rename(String new_name) {
        this.setName(new_name);
    }
}
