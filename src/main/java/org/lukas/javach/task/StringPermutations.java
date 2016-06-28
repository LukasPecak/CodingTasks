package org.lukas.javach.task;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Lukas on 12.06.2016.
 *
 * @author Lukas Pecak
 */
class StringPermutations {
    private static Logger log = Logger.getLogger(StringPermutations.class.getName());
    private int outputCounter;

    private StringPermutations() {
    }

    /**
     * @return new instance of StringPermutation class
     */
    static StringPermutations createInstance() {
        log.setLevel(Level.INFO);
        return new StringPermutations();
    }

    /**
     * @param input String object that is going to be permuted and printed to the output
     */
    void permute(String input) {
        if (input == null) {
            throw new IllegalArgumentException("\nThe input String can not be null!");
        }
        permute("", input);
    }

    private void permute(String prefix, String input) {
        if (input.length() == 0) {
            log.info(++outputCounter + ">" + prefix);
        } else {
            for (int i = 0; i < input.length(); i++) {
                permute(prefix + input.charAt(i), input.substring(0, i) + input.substring(i + 1, input.length()));
            }
        }
    }
}
