package org.lukas.javach.task;

/**
 * Created by Lukas on 03.07.2016.
 *
 * @author Lukas Pecak
 */
public class PalindromeSearch {

    private PalindromeSearch() {
    }

    public static PalindromeSearch getInstance() {
        return new PalindromeSearch();
    }

    String findMaxPalindrome(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            String palindrome = checkPalindromeForPosition(input, i);
            if (palindrome.length() > result.length()) {
                result = palindrome;
            }
        }
        return result;
    }

    private String checkPalindromeForPosition(String input, int mainIndex) {
        if ((input == null) || (mainIndex < 0) || (mainIndex > input.length())) {
            throw new IllegalArgumentException("Wrong input data.");
        }
        String result = "";
        int offset = 1;
        while (mainIndex - offset >= 0 && mainIndex + offset < input.length() &&
                (input.charAt(mainIndex - offset) == input.charAt(mainIndex + offset))) {
            result = input.substring(mainIndex - offset, mainIndex + offset + 1);
            offset++;
        }
        return result;
    }

}
