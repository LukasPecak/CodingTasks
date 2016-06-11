package org.lukas.javach.task;

/**
 * Created by LPecak on 2016-06-08.
 *
 * @author Lukas Pecak
 */
public interface CyclicCollection<E> extends Iterable<E> {
    void add(E element);

    void shift(int offest);

    E[] getData();

    E getElement(int index);
}
