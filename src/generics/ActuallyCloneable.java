package generics;

public interface ActuallyCloneable<T> extends Cloneable{

    T clone() throws CloneNotSupportedException;
}
