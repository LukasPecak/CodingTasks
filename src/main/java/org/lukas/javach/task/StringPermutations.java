package org.lukas.javach.task;

/**
 * Created by Lukas on 12.06.2016.
 *
 * @author Lukas Pecak
 */
public class StringPermutations {
    private StringPermutations() {}

    private int outputCounter;

    public static StringPermutations createInstance() {
        return new StringPermutations();
    }

    public void printInerationPermutations(String input) {
        char[] chars = input.toCharArray();
        for(char c : chars) {

        }
    }

    public void permute(String input) {
        if(input == null) {
            throw new IllegalArgumentException("The input String can not be null!");
        }
        permute("", input);
    }

    private void permute(String prefix, String input) {
        if(input.length() == 0){
            System.out.println(++outputCounter + ">" + prefix);
        } else {
            for (int i = 0; i < input.length(); i++) {
                permute(prefix + input.charAt(i), input.substring(0, i) + input.substring(i+1, input.length()));
            }
        }
    }
}
