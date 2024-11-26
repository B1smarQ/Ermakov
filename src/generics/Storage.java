package generics;


public class Storage<T> {
    private final T object;
    private static final Storage<Object> EMPTY = new Storage<>(null);
    private Storage(T object) {
        this.object = object;
    }

    public T getObject(T altValue)  {
        if(object == null ) return altValue;
        return object;
    }
    public static Storage<Object> empty(){
        return EMPTY;
    }
    @SuppressWarnings("unchecked")
    public static <T> Storage<T> of(T value){
        if(value == null) return (Storage<T>) empty();;
        return new Storage<>(value);
    }
}
