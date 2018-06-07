package org.lukas.javach.task;

import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.*;

/**
 * Created by Lukas on 06.07.2016.
 *
 * @author Lukas Pecak
 */
public class PalindromeSearchTest {

    private final Logger log = Logger.getLogger(PalindromeSearchTest.class.getSimpleName());

    private static final String TEST_INPUT_TEXT = "nihollohewiemcot otakie goahajuz wiem   alboniekajakdsf";

    @Test
    public void findMaxPalindrome() throws Exception {
        PalindromeSearch ps = PalindromeSearch.getInstance();
        log.info("Longest palindrome in the given text is : " + ps.findMaxPalindrome(TEST_INPUT_TEXT));
    }

}