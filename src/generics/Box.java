package generics;

import legacy.Stone;

public class Box <T>{
    T obj;

    public Box(T obj) {
        this.obj = obj;
    }

    public void setObj(T obj) {
        if(isFull()) throw new Stone();
        this.obj = obj;
    }


    public boolean isFull(){
        return obj != null;
    }
    public T takeObj(){
        //if(obj == null) return null;
        T tmp = obj;
        obj = null;
        return tmp;
    }
    public static <T> Box<T> of(T value){
        return new Box<>(value);
    }

    @Override
    public String toString() {
        return "Box{" +
                "obj=" + obj +
                '}';
    }
}
