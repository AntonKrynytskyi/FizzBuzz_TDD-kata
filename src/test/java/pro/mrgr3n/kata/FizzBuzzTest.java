package pro.mrgr3n.kata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ_BUZZ = "FizzBuzz";
    private FizzBuzz fb;

    @Before
    public void init() {
        fb = new FizzBuzz();
    }

    @Test
    public void shouldReturnNumber() {
        String[] expectedArray = {"0", "1", "2", "13"};
        int[] dataArray = {0, 1, 2, 13};

        checkData(expectedArray, dataArray);
    }

    @Test
    public void shouldReturnFizz() {
        String[] expectedArray = {FIZZ, FIZZ, FIZZ};
        int[] dataArray = {3, 9, 27};

        checkData(expectedArray, dataArray);
    }

    @Test
    public void shouldReturnBuzz() {
        String[] expectedArray = {BUZZ, BUZZ, BUZZ};
        int[] dataArray = {5, 25, 35};

        checkData(expectedArray, dataArray);
    }

    @Test
    public void shouldReturnFizzBuzz() {
        String[] expectedArray = {FIZZ_BUZZ, FIZZ_BUZZ};
        int[] dataArray = {15, 30};

        checkData(expectedArray, dataArray);
    }

    private void checkData(String[] expectedArray, int[] dataArray) {
        for (int i = 0; i < expectedArray.length; i++) {
            assertEquals(expectedArray[i], fb.execute(dataArray[i]));
        }
    }
}