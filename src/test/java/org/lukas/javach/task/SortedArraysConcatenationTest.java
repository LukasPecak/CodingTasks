package org.lukas.javach.task;

import org.junit.Test;
import org.lukas.javach.task.SortedArraysConcatenation;

import static org.junit.Assert.*;

/**
 * Created by LPecak on 2016-06-08.
 */
public class SortedArraysConcatenationTest {
    private static final int[] TEST_ARRAY_1 = {1,2,3};
    private static final int[] TEST_ARRAY_2 = {};
    private static final int[] TEST_ARRAY_3 = {7,9,13};
    private static final int[] TEST_ARRAY_4 = {4,8,9,15};
    private static final int[] TEST_ARRAY_5 = {7,7,7,7};

    @Test
    public void concatenateArrays() throws Exception {
        SortedArraysConcatenation sac = SortedArraysConcatenation.getInstance();
        assertArrayEquals(new int[] {1,2,3} , sac.concatenateArrays(TEST_ARRAY_1, TEST_ARRAY_2));
        assertArrayEquals(new int[] {} , sac.concatenateArrays(TEST_ARRAY_2, TEST_ARRAY_2));
        assertArrayEquals(new int[] {1,2,3,7,9,13} , sac.concatenateArrays(TEST_ARRAY_1, TEST_ARRAY_3));
        assertArrayEquals(new int[] {4,7,8,9,9,13,15} , sac.concatenateArrays(TEST_ARRAY_3, TEST_ARRAY_4));
        assertArrayEquals(new int[] {7,7,7,7,7,9,13} , sac.concatenateArrays(TEST_ARRAY_3, TEST_ARRAY_5));
        assertArrayEquals(TEST_ARRAY_1 , sac.concatenateArrays(null, TEST_ARRAY_1));
        assertArrayEquals(TEST_ARRAY_1 , sac.concatenateArrays(TEST_ARRAY_1, null));
        assertArrayEquals(new int[] {} , sac.concatenateArrays(null, null));
    }

}