package legacy;

import java.util.function.Predicate;

public class Rule2To5 implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        return integer>=2&& integer<=5;
    }
}
