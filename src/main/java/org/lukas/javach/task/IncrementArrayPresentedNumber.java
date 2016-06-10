package org.lukas.javach.task;

/**
 * Created by LPecak on 2016-06-08.
 *
 * @author Lukas Pecak
 */
public class IncrementArrayPresentedNumber {

    private IncrementArrayPresentedNumber() {
    }

    public static IncrementArrayPresentedNumber getInstance() {
        return new IncrementArrayPresentedNumber();
    }

    public int[] incrementAndGet(int[] input) {
        int[] inputArray = checkInputNull(input);
        StringBuilder numberString = new StringBuilder();
        for (int i : inputArray) {
            numberString.append(i);
        }
        int number = Integer.parseInt(numberString.toString());
        number++;
        String[] resultStrings = ("" + number).split("");
        int[] result = new int[resultStrings.length];
        for (int i = 0; i < resultStrings.length; i++) {
            result[i] = Integer.valueOf(resultStrings[i]);
        }
        return result;
    }

    public static int[] checkInputNull(int[] input) {

        if (input == null || input.length == 0) {
            return new int[]{0};
        }
        for (int i : input) {
            if (i < 0 || i > 10) {
                throw new IllegalArgumentException();
            }
        }
        return input;
    }
}
