package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class DataStream {

    public static <T> List<T> filter(List<T> val, Predicate<T> rule){
        List<T> res = new ArrayList<>();
        for (T v: val){
            if(rule.test(v))
                res.add(v);
        }
        return res;
    }

    public static double storageMax(List<Optional<Number>> storages){
        double res = 0;
        for (Optional<Number> x : storages){
            if(x.isPresent()){
                double num = x.get().doubleValue();
                if(num >res)
                    res = num;
            }
        }
        return res;
    }

    public static void fillNums(List<Number> lst){
        for (int i = 1; i <=100; i++) {
            lst.add(i);
        }
    }
}
