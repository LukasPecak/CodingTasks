package org.lukas.javach.task;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by LPecak on 2016-06-08.
 *
 * @author Lukas Pecak
 */
public class IncrementArrayPresentedNumberTest {
    private static final int[] TEST_ARRAY_1 = {};
    private static final int[] TEST_ARRAY_2 = {1,2,3};
    private static final int[] TEST_ARRAY_3 = {1,9,9};
    private static final int[] TEST_ARRAY_4 = {9,9,9};

    @Test
    public void incrementAndGet() throws Exception {
        IncrementArrayPresentedNumber iapn = IncrementArrayPresentedNumber.getInstance();
        assertArrayEquals(new int[] {1,2,4}, iapn.incrementAndGet(TEST_ARRAY_2));
        assertArrayEquals(new int[] {1}, iapn.incrementAndGet(TEST_ARRAY_1));
        assertArrayEquals(new int[] {2,0,0}, iapn.incrementAndGet(TEST_ARRAY_3));
        assertArrayEquals(new int[] {1,0,0,0}, iapn.incrementAndGet(TEST_ARRAY_4));
        assertArrayEquals(new int[] {1}, iapn.incrementAndGet(null));
    }

}