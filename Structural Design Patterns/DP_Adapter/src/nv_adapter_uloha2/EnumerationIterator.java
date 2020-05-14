package nv_adapter_uloha2;

import java.util.Enumeration;
import java.util.Iterator;

/**
 *
 * @author KI
 */

// adapter
public class EnumerationIterator implements Iterator {

    private Enumeration e;

    public EnumerationIterator(Enumeration e) {
        this.e = e;
    }

    @Override
    public boolean hasNext() {
        return e.hasMoreElements();
    }

    @Override
    public Object next() {
        return e.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

}

