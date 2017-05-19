package pro.mrgr3n.kata;

public class FizzBuzz {

    private static final String FIZZ_BUZZ = "FizzBuzz";
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    public String execute(int number) {
        if (isFizzBuzz(number)) {
            return FIZZ_BUZZ;
        } else if (isFizz(number)) {
            return FIZZ;
        } else if (isBuzz(number)) {
            return BUZZ;
        } else {
            return Integer.toString(number);
        }
    }

    private boolean isFizzBuzz(int number) {
        return isBuzz(number) && isFizz(number);
    }

    private boolean isBuzz(int number) {
        return number / 5 >= 1 && number % 5 == 0;
    }

    private boolean isFizz(int number) {
        return number / 3 >= 1 && number % 3 == 0;
    }
}
