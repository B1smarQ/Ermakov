package legacy;

import generics.ActuallyCloneable;

public class Save<T extends ActuallyCloneable<T>> {
    private final T value;

    public Save(T value) {
        try {
            this.value = value.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public T getValue() {
        return value;
    }
}
