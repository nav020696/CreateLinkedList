package core.util;

import java.util.Iterator;

public class LinkedIterator<E> implements Iterator<E> {
    private int index;

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public E next() {
        return null;
    }
}
