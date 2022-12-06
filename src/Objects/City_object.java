package Objects;

import cities.City;
import utils.Color;

import java.util.Objects;

public abstract class City_object {
    private City city;
    private Color color;
    private ObjectType type;

    City_object(City city, Color color, ObjectType type) {
        this.city = city;
        this.color = color;
        this.type = type;
    }


    public City getCity() {
        return city;
    }

    public Color getColor() {return color;}

    public ObjectType getType(){return type;}

    protected void setColor(Color new_color) {this.color = new_color;}

    @Override
    public boolean equals(Object oth) {
        if (oth == this) {
            return true;
        }
        if (oth == null || oth.getClass() != getClass()) {
            return false;
        }
        City_object other = (City_object) oth;
        return other.getCity().equals(city) && other.getColor().equals(color) && other.getType() == type;
    }

    @Override
    public int hashCode(){return 31 * Objects.hash(city, color, type);}

    @Override
    public String toString(){
        return type.toString();
    }
}
