package citizens;

import cities.City;
import Objects.Colored;
import utils.Color;
import utils.Renamed;

public class Painter extends Citizen implements Renamed {
    Painter(String name, int age, City city) {
        super(name, age, city);
    }


    public void paint(Colored obj, Color color) {
        if (obj.get_city().hashCode() == this.getCity().hashCode()) {
            obj.change_color(color);
            System.out.println(this + " покрасил " + obj + " в " + color.toString());
        }
    }

    @Override
    public void rename(String new_name) {
        this.setName(new_name);
    }
}
