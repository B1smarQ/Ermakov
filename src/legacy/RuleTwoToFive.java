package legacy;

import java.util.function.Predicate;

public class RuleTwoToFive implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        return integer>=2 && integer<=5;
    }
}
