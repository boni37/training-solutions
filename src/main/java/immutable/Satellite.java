package immutable;

import java.util.ArrayList;
import java.util.List;

public class Satellite {

    private CelestialCoordinates coordinates;
    private String satIdent;


    public Satellite(CelestialCoordinates coordinates, String name) {
        if(name.equals("")) throw new IllegalArgumentException("Register ident must not be empty!");
        this.coordinates = coordinates;
        this.satIdent = name;
    }

    public CelestialCoordinates getCoordinates() {
        return coordinates;
    }

    public String getSatIdent() {
        return satIdent;
    }

    public void modifyDestination(CelestialCoordinates diff){
        coordinates = new CelestialCoordinates(coordinates.getX()+diff.getX(),coordinates.getY()+diff.getY(),coordinates.getZ()+diff.getZ());
    }

    @Override
    public String toString() {
        return getSatIdent() + ": " + getCoordinates();
    }
}
