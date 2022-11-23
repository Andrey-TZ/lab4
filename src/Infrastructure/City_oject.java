package Infrastructure;

import utils.Color;

public abstract class City_oject {
    private int amount;
    private City city;
    private Color color;
    City_oject(City city, Color color){
        this.city = city;
        this.color = color;
    }
}
