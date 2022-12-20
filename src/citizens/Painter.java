package citizens;

import cities.City;
import utils.Recolored;
import utils.Color;
import utils.Renamed;

public class Painter extends Citizen implements Renamed {
    public Painter(String name, int age, City city) {
        super(name, age, city);
    }


    public void paint(Recolored obj, Color color) {
        if (obj.getCity().hashCode() == this.getCity().hashCode()) {
            System.out.print(this + " покрасил " + obj + "в ");
            obj.change_color(color);
            System.out.println(color);
        }
        else{
            System.out.println(this + " находится не в том же городе, что и " + obj);
        }
    }

    @Override
    public void rename(String new_name) {
        this.setName(new_name);
    }
}
