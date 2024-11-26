package functional;

import java.util.ArrayList;
import java.util.List;

public class DataStream {

    public static <T> List<T> filter(List<T> val, Rule<T> rule){
        List<T> res = new ArrayList<>();
        for(T x:val){
            if(rule.checked(x))
                res.add(x);
        }
        return res;
    }
}
