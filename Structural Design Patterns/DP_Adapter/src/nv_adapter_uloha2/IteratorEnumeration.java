package nv_adapter_uloha2;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration implements Enumeration<Object> {

    private Iterator iterator;

    public IteratorEnumeration(Iterator i) {
        this.iterator = i;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
