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
    public void addLessElementsThanCollectionSize() throws Exception {
        CyclicCollection<Integer> cyclic = new CyclicCollectionImpl<Integer>(4);
        cyclic.add(1);
        cyclic.add(2);
        Integer[] test = {1,2,null,null};
        Object[] data = cyclic.getData();
        for (int i = 0; i < test.length; i++) {
            assertEquals(test[i], ((Integer) data[i]) != null ? ((Integer) data[i]) : null);
        }
    }

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
        Object[] data = cyclic.getData();
        for (int i = 0; i < test.length; i++) {
            assertEquals(test[i],((Integer) data[i]).intValue());
        }
    }

    @Test
    public void shift() throws Exception {
        CyclicCollection<Integer> cyclic = new CyclicCollectionImpl<Integer>(5);
        cyclic.add(1);
        cyclic.add(2);
        cyclic.add(3);
        cyclic.add(4);
        cyclic.add(5);
        System.out.println(cyclic.toString());
        cyclic.shift(2);
        System.out.println(cyclic.toString());
        int[] test = {4,5,1,2,3};
        Object[] data = cyclic.getData();
        for (int i = 0; i < test.length; i++) {
            assertEquals(test[i],((Integer) data[i]).intValue());
        }
    }
}