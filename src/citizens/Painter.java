package citizens;

import Infrastructure.City;
import Infrastructure.Colored;
import utils.Color;

public class Painter extends Citizen {
    Painter(String name, int age, City city) {
        super(name, age, city);
    }


    public void paint(Colored obj, Color color) {
        if (obj.get_city().hashCode() == this.getCity().hashCode()) {
            obj.change_color(color);
            System.out.println(name + " покрасил " + obj.toString() + " в " + color.toString());
        }
    }
}
