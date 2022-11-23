package Infrastructure;

import utils.Color;

public abstract class City_object {
    private int amount;
    private City city;
    private Color color;
    City_object(City city, Color color){
        this.city = city;
        this.color = color;
    }
}
