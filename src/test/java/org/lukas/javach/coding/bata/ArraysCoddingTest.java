package org.lukas.javach.coding.bata;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Lukas on 01.06.2018.
 *
 * @author Lukas Pecak
 */
public class ArraysCoddingTest {

    private ArraysCodding arraysCodding;

    @Before
    public void initialize() {
        arraysCodding = new ArraysCodding();
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void checkIfThrowsIllegalArgumentExceptionForNullInput() {
        thrown.expect(IllegalArgumentException.class);
        arraysCodding.zeroFront(null);
    }

    @Test
    public void checkIfMethodReturnsOriginalArrayIfInputArrayLengthIsInRangeFrom0To1() {
        int[] emptyArray = {};
        int[] oneElementArray = {1};
        assertThat(emptyArray == arraysCodding.zeroFront(emptyArray), is(true));
        assertThat(oneElementArray == arraysCodding.zeroFront(oneElementArray), is(true));
    }

    @Test
    public void checkIfInputArrayIsZeroFormatted () {
        int[] testInput1 = {1,3,9,0,0,0,3};
        int[] testOutput1 = {0,0,0,1,3,9,3};

        int[] testInput2 = {0,3,9,1,0};
        int[] testOutput2 = {0,0,3,9,1};

        int[] testInput3 = {1,0};
        int[] testOutput3 = {0,1};

        assertThat(testOutput1, is(equalTo(arraysCodding.zeroFront(testInput1))));
        assertThat(testOutput2, is(equalTo(arraysCodding.zeroFront(testInput2))));
        assertThat(testOutput3, is(equalTo(arraysCodding.zeroFront(testInput3))));
    }

    @Test
    public void checkIfThrowsIllegalArgumentExceptionForNullInputWithoutTenArray() {
        thrown.expect(IllegalArgumentException.class);
        arraysCodding.withoutTen(null);
    }

    @Test
    public void checkIfOutputIsTheSameLengthAndAllTensAreRemovedAndElementAreShiftedLeftAndEmptySpacedOnTheEndAreFilledWithZeros() {
        int[] testInput1 = {};
        int[] testInput2 = {1};
        int[] testInput3 = {10};
        int[] testInput4 = {2,2,2,3,4,5,6};
        int[] testInput5 = {2,10,2,10,4,5,6};
        int[] testInput6 = {10,2,10};

        assertThat(arraysCodding.withoutTen(testInput1), is(equalTo(new int[]{})));
        assertThat(arraysCodding.withoutTen(testInput2), is(equalTo(new int[]{1})));
        assertThat(arraysCodding.withoutTen(testInput3), is(equalTo(new int[]{0})));
        assertThat(arraysCodding.withoutTen(testInput4), is(equalTo(new int[]{2,2,2,3,4,5,6})));
        assertThat(arraysCodding.withoutTen(testInput5), is(equalTo(new int[]{2,2,4,5,6,0,0})));
        assertThat(arraysCodding.withoutTen(testInput6), is(equalTo(new int[]{2,0,0})));
    }

    @Test
    public void checkIfThrowsIllegalArgumentExceptionForNullZeroMax() {
        thrown.expect(IllegalArgumentException.class);
        arraysCodding.zeroMax(null);
    }

    @Test
    public void checkIfOutputIsCorrectForZeroMaxMethodLogic() {
        int[] testInput1 = {};
        int[] testInput2 = {1};
        int[] testInput3 = {0};
        int[] testInput4 = {0,3,4,5,0};
        int[] testInput5 = {10,0,0,0,10,7};

        assertThat(arraysCodding.zeroMax(testInput1), is(equalTo(new int[]{})));
        assertThat(arraysCodding.zeroMax(testInput2), is(equalTo(new int[]{1})));
        assertThat(arraysCodding.zeroMax(testInput3), is(equalTo(new int[]{0})));
        assertThat(arraysCodding.zeroMax(testInput4), is(equalTo(new int[]{5,3,4,5,0})));
        assertThat(arraysCodding.zeroMax(testInput5), is(equalTo(new int[]{10,7,7,7,10,7})));
    }

    @Test
    public void checkIfThrowsIllegalArgumentExceptionForNullEvenOdd() {
        thrown.expect(IllegalArgumentException.class);
        arraysCodding.evenOdd(null);
    }

    @Test
    public void checkIfOutputIsRearrangedEvenFirst() {
        int[] testInput1 = {};
        int[] testInput2 = {1};
        int[] testInput3 = {0,3,4,5,0};
        int[] testInput4 = {10,0,0,5,10,7};

        Stream.of(testInput1, testInput2, testInput3, testInput4).map(arraysCodding::evenOdd).forEach(this::checkIfIsRearranged);
    }

    private void checkIfIsRearranged(int[] input) {
        boolean isEvenSection = true;
        for (int element : input) {
            if (element % 2 == 1) {
                isEvenSection = false;
            } else {
                assertThat(isEvenSection, is(true));
            }
        }

    }

    @Test
    public void checkForWronInputArgumentsThrowsIllegalArgumentException() {
        thrown.expect(IllegalArgumentException.class);
        arraysCodding.fizzBuzz(3,1);
    }

    @Test
    public void checkIfFizzBuzzOutputIsCalculatedAsExpected() {
        String[] testOutput1 = {};
        String[] testOutput2 = {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"};
        String[] testOutput3 = {"Buzz","-4","Fizz","-2","-1","FizzBuzz","1"};

        assertThat(arraysCodding.fizzBuzz(4,4), is(equalTo(testOutput1)));
        assertThat(arraysCodding.fizzBuzz(1, 16), is(equalTo(testOutput2)));
        assertThat(arraysCodding.fizzBuzz(-5, 2), is(equalTo(testOutput3)));
    }
}