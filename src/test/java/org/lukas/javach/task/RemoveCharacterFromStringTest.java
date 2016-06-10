package org.lukas.javach.task;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by LPecak on 2016-06-10.
 *
 * @author Lukas Pecak
 */
public class RemoveCharacterFromStringTest {
    private static final String TEST_TEXT_1 = "some text";
    private static final String TEST_TEXT_2 = "";
    private static final String TEST_TEXT_3 = "wwwwwwwwwwww";
    private static final String TEST_TEXT_4 = "        ";
    private static final String TEST_TEXT_5 = "ERTESdfdsfs";

    @Test
    public void removeCharacter() throws Exception {
        RemoveCharacterFromString rc = RemoveCharacterFromString.getInstance();
        assertEquals(TEST_TEXT_1, rc.removeCharacter("somea teaxt", 'a'));
    }

}