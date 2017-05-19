package pro.mrgr3n.kata;

import static java.lang.System.out;

public class FizzBuzzApp {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        for (int i = 0; i <= 100; i++) {
            out.println(fizzBuzz.execute(i));
        }
    }
}
