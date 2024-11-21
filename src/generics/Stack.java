package generics;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private final List<T> values = new ArrayList<>();

    public void push(T value){
        values.add(value);
    }

    public T pop(){
        T tmp = values.getLast();
        values.removeLast();
        return tmp;
    }

    public T peek(){
        return values.getLast();
    }
}
