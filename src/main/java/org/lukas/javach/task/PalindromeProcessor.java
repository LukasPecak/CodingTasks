package org.lukas.javach.task;

/**
 * Created by LPecak on 2016-06-08.
 * @author Lukas Pecak
 */
public class PalindromeProcessor {

    private PalindromeProcessor() {
    }

    public static PalindromeProcessor newPalindromeProcessor() {
        return new PalindromeProcessor();
    }

    public boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }
        String reverse = new StringBuilder(text.toLowerCase()).reverse().toString();
        return reverse.equals(text.toLowerCase());
    }
}
