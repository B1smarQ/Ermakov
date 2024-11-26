package functional;

public interface Rule<T> {
    boolean checked(T arg);
}
