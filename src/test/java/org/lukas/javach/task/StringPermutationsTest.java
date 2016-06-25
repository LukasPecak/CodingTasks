package org.lukas.javach.task;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lukas on 21.06.2016.
 */
public class StringPermutationsTest {
    private static final String TEST_TEXT = "abcd";

    @Test
    public void printInerationPermutations() throws Exception {

    }

    @Test
    public void printRecursivePermutations() throws Exception {
        long startTime = System.currentTimeMillis();
        StringPermutations sp = StringPermutations.createInstance();
        sp.permute(TEST_TEXT);
        System.out.println("Execution time : " + (System.currentTimeMillis() - startTime) + "[ms]");
    }

}