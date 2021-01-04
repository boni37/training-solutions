package week10d01;

import com.sun.jdi.DoubleValue;

import java.util.Arrays;
import java.util.List;

public class Hiking {

   private List<String> routes;


    public Hiking(List<String> routes) {
        this.routes = routes;
    }

    public List<String> getRoutes() {
        return routes;
    }

    public double getPlusElevation(){
        double sumElevation = 0.00;
        for(int i = 1; i < routes.size(); i++){
            double d1 = Double.parseDouble(routes.get(i-1));
            double d2 = Double.parseDouble(routes.get(i));
            if(d1 < d2){
             sumElevation += d2 -d1;
            }
            }return sumElevation/100*100;
    }

    public static void main(String[] args) {
       Hiking hiking = new Hiking(Arrays.asList("123.3","143.4","120.45","160.23","250.67"));
       System.out.println("The sum of elevation:" + hiking.getPlusElevation());
    }
}
