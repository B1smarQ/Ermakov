package random;

import java.util.Collection;
import java.util.Iterator;

public class CycleIterator<E, C extends Collection<E>> implements Iterator<E> {
    private final C elements;
    private Iterator<E> iterator;

    public CycleIterator(C elements) {
        this.elements = elements;
        this.iterator = elements.iterator();
    }

    @Override
    public boolean hasNext() {
        if (!iterator.hasNext()) {
            this.iterator = this.elements.iterator();
        }
        return iterator.hasNext();
    }

    @Override
    public E next() {
        if (hasNext())
            return iterator.next();
        throw new RuntimeException("Huh?");
    }
}
