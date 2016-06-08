package org.lukas.javach.task;

import java.util.Arrays;

/**
 * Created by LPecak on 2016-06-08.
 *
 * @author Lukas Pecak
 */
public class CyclicCollectionImpl<E> implements CyclicCollection<E> {
    private int size;
    private E[] data;
    private int index;

    public CyclicCollectionImpl(int size) {
        this.size = size;
        data = (E[]) new Object[size];
    }

    public void add(E element) {
        if(element == null) {
            return;
        }
        data[index%size] = element;
        index++;
    }

    public void shift(int offset) {
        offset = offset%size;
        for (int i = 0; i < data.length; i++) {
            E temp = data[offset+i%size];
            data[offset+i%size] = data[i];
            data[i] = temp;
        }
    }

    public E[] getData() {
        E[] result = (E[]) new Object[data.length];
        System.arraycopy(data, 0, result, 0, data.length);
        return result;
    }

    public E getElement(int index) {
        return data[index%size];
    }


    @Override
    public String toString() {
        return "CyclicCollectionImpl{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
