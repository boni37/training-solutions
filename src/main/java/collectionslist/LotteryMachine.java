package collectionslist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LotteryMachine {

    public List<Integer> createPool(int ballCount){
        List<Integer> pool = new ArrayList<>();
        for(int i=1; i<= ballCount; i++){
            pool.add(i);
        }
        Collections.shuffle(pool,new Random(3));
        return pool;
    }

    public List<Integer> selectWinningNumbers(int lotteryType, int ballCount){
        if(ballCount<=lotteryType) throw new IllegalArgumentException("Balls must be more then the winning numbers!");
        List<Integer> winningList = new ArrayList<>(lotteryType);
        for(int i=0; i<lotteryType;i++){
            winningList.add(createPool(ballCount).get(i));
        }return winningList;
    }


}
