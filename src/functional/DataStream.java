package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DataStream<T> {
    List<T> initList;

    private  DataStream(List<T> initList) {
        this.initList = new ArrayList<>(initList);
    }

    public DataStream<T> filter(Predicate<T> rule){
        //TODO: O(1)
        List<T> res = new ArrayList<>();
        for (T v: this.initList){
            if(rule.test(v))
                res.add(v);
        }
        this.initList = res;
        return this;
    }
    public static <T> DataStream<T> of(List<T> initList){
        return new DataStream<T>(initList);
    }

    public <R> R collect(Supplier<R> supplier, BiConsumer<R,T> consumer){
        R res = supplier.get();
        for(T x: this.initList){
            consumer.accept(res,x);
        }
        return res;
    }
    @SuppressWarnings({"unchecked"})

    public <R> DataStream<R> map(Function<T,R> fun){
        //TODO: O(1)
        List res = new ArrayList<>();
        for(T x: this.initList){
            res.add(fun.apply(x));
        }
        this.initList = res;
        return (DataStream<R>)this;

    }
}
