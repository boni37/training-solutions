package collectionslist;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LotteryMachineTest {

   @Test
public void wrongParametersShouldThrowExeption() throws IllegalArgumentException {
    int lotteryType = 6;
    int ballCount = 6;

    Exception ex = assertThrows(IllegalArgumentException.class, () -> {
        new LotteryMachine().selectWinningNumbers(lotteryType, ballCount);
    });
    assertEquals("Balls must be more then the winning numbers!", ex.getMessage());
}

    @Test
    public void winningNumbersCountShouldBeEqualToLotteryType() throws IllegalArgumentException {

        //Given
        int lotteryType = 5;
        int ballCount = 90;

        //When
        List<Integer> winningNumbers = new LotteryMachine().selectWinningNumbers(lotteryType, ballCount);

        //Then
        assertEquals(lotteryType, new HashSet<>(winningNumbers).size());
        for (int winningNumber : winningNumbers) {
            assertTrue(winningNumber > 0);
            assertTrue(winningNumber <= ballCount);
        }
    }

}

