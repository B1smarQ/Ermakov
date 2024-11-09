package legacy;

import java.util.function.Predicate;

public class RuleThreeToSix implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        return integer>=3 && integer<=6;
    }
}
