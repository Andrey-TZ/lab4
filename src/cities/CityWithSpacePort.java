package cities;

import exceptions.WrongCityObjectException;
import objects.*;

import java.util.Arrays;
import java.util.Objects;

public class CityWithSpacePort extends StandartCity {
    final ObjectType[] types = {ObjectType.POWERLINE, ObjectType.ROAD, ObjectType.HOUSE, ObjectType.SPACEPORT};

    SpacePort spacePort = null;
    SpacePort[] spacePorts = new SpacePort[1];

    public CityWithSpacePort(String name, int roads, int houses, int powerlines) {
        super(name, roads, houses, powerlines);

    }

    @Override
    public void addCityObject(CityObject obj) throws WrongCityObjectException {
        ObjectType type = obj.getType();
        if (type == ObjectType.SPACEPORT) {
            if (spacePort != null) {
                System.err.printf(" не смог построить \"%s\": их слишком много в городе ", type);
            } else {
                spacePort = (SpacePort) obj;
                spacePorts[0] = spacePort;
                System.out.print(" построил космодром в городе ");

            }
        } else {
            super.addCityObject(obj);
        }
    }



    @Override
    public CityObject[] getCityObjects(ObjectType type) throws WrongCityObjectException {
        if (type == ObjectType.SPACEPORT) {
            SpacePort[] spacePorts = {spacePort};
            return spacePorts;
        }
        return super.getCityObjects(type);
    }

    @Override
    public int hashCode() {
        return 31 * Objects.hash(getName(), roads, houses, powerlines, spacePort);
    }

    @Override
    public boolean equals(Object city) {
        if (city == this) {
            return true;
        }
        if (city == null || city.getClass() != getClass()) {
            return false;
        }
        StandartCity city1 = (StandartCity) city;
        try {
            return city1.getName().equals(this.getName()) && Arrays.equals(city1.getCityObjects(ObjectType.HOUSE), this.houses) && Arrays.equals(city1.getCityObjects(ObjectType.ROAD), this.roads) && Arrays.equals(city1.getCityObjects(ObjectType.POWERLINE), this.powerlines) && Arrays.equals(city1.getCityObjects(ObjectType.SPACEPORT), this.spacePorts);
        } catch (WrongCityObjectException e) {
            throw new RuntimeException(e);
        }
    }
}