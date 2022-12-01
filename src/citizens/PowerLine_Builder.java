package citizens;

import Infrastructure.City;
import utils.Renamed;

public class PowerLine_Builder extends Citizen implements Renamed {
    PowerLine_Builder(String name, int age, City city) {
        super(name, age, city);
    }

    @Override
    public void work() {

    }

    @Override
    public void rename(String new_name) {
        this.name = new_name;
    }
}
