package org.lukas.javach.task;

import org.junit.Test;
import org.lukas.javach.task.PalindromeProcessor;

import static org.junit.Assert.*;

/**
 * Created by LPecak on 2016-06-08.
 * @author Lukas Pecak
 */
public class PalindromeProcessorTest {
    private static final String TEST_TEXT_1 = "KAJAK";
    private static final String TEST_TEXT_2 = "kaJAK";
    private static final String TEST_TEXT_3 = "";
    private static final String TEST_TEXT_4 = " ";
    private static final String TEST_TEXT_5 = "sometext";
    private static final String TEST_TEXT_6 = "a";

    @Test
    public void isPalindromeTest() throws Exception {
        PalindromeProcessor pp = PalindromeProcessor.newPalindromeProcessor();
        assertEquals(false, pp.isPalindrome(null));
        assertEquals(true, pp.isPalindrome(TEST_TEXT_1));
        assertEquals(true, pp.isPalindrome(TEST_TEXT_2));
        assertEquals(true, pp.isPalindrome(TEST_TEXT_3));
        assertEquals(true, pp.isPalindrome(TEST_TEXT_4));
        assertEquals(false, pp.isPalindrome(TEST_TEXT_5));
        assertEquals(true, pp.isPalindrome(TEST_TEXT_6));
    }

}