package legacy;

import java.util.function.Predicate;

public class NullRule implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        return true;
    }
}
