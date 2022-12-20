package citizens;

import objects.CityObject;
import objects.ObjectType;
import objects.PowerLine;
import cities.City;
import utils.Renamed;

public class PowerLineBuilder extends Citizen implements Renamed, Builder {
    public PowerLineBuilder(String name, int age, City city) {
        super(name, age, city);
    }

    @Override
    public CityObject build() {
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
