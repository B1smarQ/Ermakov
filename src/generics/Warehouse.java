package generics;


public class Warehouse<T> {
    private final T object;
    private final T alternativeValue;
    public Warehouse(T object, T alternativeValue, T alternativeValue1) {
        this.object = object;
        this.alternativeValue = alternativeValue1;
    }

    public T getObject()  {
        if(this.object == null) {
            return alternativeValue;
        }
        return object;
    }


}
