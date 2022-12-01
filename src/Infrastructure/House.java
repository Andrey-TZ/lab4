package Infrastructure;

import utils.Color;

public class House extends City_object implements Colored{
    House(City city) {
        super(city, Color.BROWN);
    }

    @Override
    public void change_color(Color color) {
        this.color = color;
    }
}
