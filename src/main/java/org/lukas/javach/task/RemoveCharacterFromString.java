package org.lukas.javach.task;

/**
 * Created by LPecak on 2016-06-10.
 *
 * @author Lukas Pecak
 */
public class RemoveCharacterFromString {

    private RemoveCharacterFromString() {
    }

    public static RemoveCharacterFromString getInstance() {
        return new RemoveCharacterFromString();
    }

    public String removeCharacter(String input, char c) {
        if (input == null) {
            return "";
        }
        char[] chars = input.toCharArray();
        StringBuilder output = new StringBuilder();
        int lastStartIndex = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                output.append(input.substring(lastStartIndex, i));
                lastStartIndex = i + 1;
            }
        }
        if(lastStartIndex < chars.length-1) {
            output.append(input.substring(lastStartIndex, chars.length));
        }
        return output.toString();
    }
}
