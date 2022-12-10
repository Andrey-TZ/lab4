package citizens;

import Objects.City_object;
import Objects.ObjectType;
import Objects.PowerLine;
import cities.City;
import utils.Renamed;

public class PowerLine_Builder extends Citizen implements Renamed, Builder {
    public PowerLine_Builder(String name, int age, City city) {
        super(name, age, city);
    }

    @Override
    public City_object build() {
        System.out.print(this );
        City city = this.getCity();
        PowerLine pwr_line = new PowerLine(city);
        System.out.println(city);
        System.out.println("Сейчас их здесь " + city.getCityObjects(ObjectType.POWERLINE));
        return pwr_line;
    }

    @Override
    public void rename(String new_name) {
        this.setName(new_name);
    }
}
