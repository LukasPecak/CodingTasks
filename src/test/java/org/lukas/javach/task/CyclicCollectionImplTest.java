package org.lukas.javach.task;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by LPecak on 2016-06-08.
 *
 * @author Lukas Pecak
 */
public class CyclicCollectionImplTest {

    @Test
    public void addMoreElementsThenCollectionSize() throws Exception {
        CyclicCollection<Integer> cyclic = new CyclicCollectionImpl<Integer>(4);
        cyclic.add(1);
        cyclic.add(2);
        cyclic.add(3);
        cyclic.add(4);
        cyclic.add(5);
        cyclic.add(6);
        int[] test = {5,6,3,4};
        Integer[] data = cyclic.getData();
        for (int i = 0; i < test.length; i++) {
            assertEquals(test[i], new Integer(data[i]));
        }
    }

    @Test
    public void shift() throws Exception {

    }

}