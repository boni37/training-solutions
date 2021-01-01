package interfacestaticmethods;

import java.util.List;

public interface Valued {

    double getValued();

    static double totalValue(List<Valued> values){
        double sum = 0;
        for(Valued actual : values){
            sum += actual.getValued();
        }return sum;
    }
}
