package week10d02;

//Van egy egész számok listája, amelyben egy szám azt jelzi, hogy az adott számú buszmegállóban egy ember
// fel akar szállni. A 12,12,0,3,4,4 sorozat tehát azt jelenti, hogy a 12-es buszmegállóban 2-en, a 0-ásban
// 1 ember, 3-asban egy ember, 4-esben 2 ember akar felszállni. A MaxTravel osztály getMaxIndex() metódusa adja vissza,
// hogy hanyas megállóban szeretnének a legtöbben felszállni. Maximum 30 megálló lehet.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxTravel {

    private static final int numStops = 30;
    private static int[][] busStops = new int[numStops][2];

    public void getMaxIndex(int... getOns){
        for(int i=0; i< getOns.length;i++)
        for(int j=0; j< busStops.length; j++){
            if(getOns[i]== busStops[j][0]){
                busStops[j][1] ++;
            }
        }
    }

    public static void main(String[] args) {
        for(int i = 0; i < numStops; i++){
            busStops[i][0] = i;
        }
        MaxTravel maxTravel = new MaxTravel();
        maxTravel.getMaxIndex(12,12,20,20,15,23,12,22,22,22,22,22);
        for(int i = 0; i < numStops; i++){
            System.out.println("Bus Stop Number:" + busStops[i][0]+" Getons number:"+busStops[i][1]);
        }
    }


}
