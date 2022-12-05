package Objects;

import cities.City;
import utils.Color;

public class House extends City_object implements Colored {
    House(City city) {
        super(city, Color.BROWN, ObjectType.HOUSE);
    }

    @Override
    public void change_color(Color color) {
        setColor(color);
    }

    @Override
    public City get_city() {
        return this.getCity();
    }

    @Override
    public String toString(){
        return getColor() + "дом";
    }
}
