package org.lukas.javach.task;

import static java.lang.Math.pow;

/**
 * Created by LPecak on 2016-06-09.
 *
 * @author Lukas Pecak
 */
public class IncrementArrayPresentedNumber2 {

    private IncrementArrayPresentedNumber2() {
    }

    public static IncrementArrayPresentedNumber2 getInstance() {
        return new IncrementArrayPresentedNumber2();
    }

    private static void printArray(int[] array){
        for (int i: array) {
            System.out.print(i + "|");
        }
        System.out.println();
    }

    public static int[] incrementAndGet(int[] baseArray) {
        baseArray = IncrementArrayPresentedNumber.checkInputNull(baseArray);
        int[] exponent = exponent(baseArray.length);
        int[] withOverflow = new int[baseArray.length + 1];
        withOverflow[0] = 0;
        System.arraycopy(baseArray, 0, withOverflow, 1, baseArray.length);
        int number = 0;
        for (int i = 0; i < withOverflow.length; i++) {
            number += withOverflow[i]*exponent[i];
        }
        number += 1;
        for (int i = 0; i < withOverflow.length; i++) {
            withOverflow[i] = number/exponent[i];
            number -= withOverflow[i]*exponent[i];
        }
        if(withOverflow[0] == 0){
            int[] result = new int[withOverflow.length-1];
            System.arraycopy(withOverflow, 1, result, 0, result.length);
            withOverflow = result;
        }
        return withOverflow;
    }

    private static int[] exponent(int size){
        int exSize = size + 1;
        int[] exArray = new int[exSize];
        int counter = 0;
        for(int i = exSize-1; i>=0; i--){
            exArray[i] = (int) pow(10, counter);
            counter++;
        }
        return exArray;
    }
}
