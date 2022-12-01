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

    @Override
    public City get_city() {
        return this.getCity();
    }

    @Override
    public String toString(){
        return "дом";
    }
}
