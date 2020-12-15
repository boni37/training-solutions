package immutable;

import java.util.ArrayList;
import java.util.List;

public class SpaceAgency {

    private List<Satellite> satellites= new ArrayList<>();

    public SpaceAgency() {
    }

    public SpaceAgency(List<Satellite> satellites) {
        satellites = satellites;
    }

    public List<Satellite> getSatellites() {
        return satellites;
    }

    public void registerSatellite(Satellite satellite){
        if(satellite==null) throw new NullPointerException("Parameter must not be null!");
        satellites.add(satellite);
    }

    public Satellite findSatelliteByRegisterIdent(String registerIdent){
        for(Satellite satellite : satellites){
            if(registerIdent.equals(satellite.getSatIdent())) return satellite;
        }throw new IllegalArgumentException("Satellite with the given registration cannot be found!"+registerIdent);
    }

    public String toString(){
        return getSatellites().toString();
    }
}
