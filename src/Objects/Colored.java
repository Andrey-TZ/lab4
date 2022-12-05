package Objects;

import cities.City;
import utils.Color;

public interface Colored {
    void change_color(Color color);
    City get_city();

    @Override
    String toString();
}