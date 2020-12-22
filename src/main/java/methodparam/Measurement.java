package methodparam;

import java.util.Collections;
import java.util.List;

public class Measurement {

    private List<Double> measuredValues;

    public Measurement(List<Double> measuredValues) {
        this.measuredValues = measuredValues;
    }

    public List<Double> getMeasuredValues() {
        return measuredValues;
    }

    public int findFirstIndexInLimit(int lower, int upper){
        int index = 0;
        for(int i = 0; i < measuredValues.size(); i++){
            if((measuredValues.get(i)<lower)&&(measuredValues.get(i)>upper)){
                index = i;
                return index;
            }continue;
        }return -1;
    }

    public double minimum(){
        Collections.sort(measuredValues);
        return measuredValues.get(0);
    }

    public double maximum(){
        Collections.sort(measuredValues,Collections.reverseOrder());
        return measuredValues.get(0);
    }

    public ExtremValues minmax(){
        Collections.sort(measuredValues);
        int m = measuredValues.size()-1;
        return new ExtremValues(measuredValues.get(0),measuredValues.get(m));
    }

}
