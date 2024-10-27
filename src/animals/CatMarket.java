package animals;

import java.util.Arrays;
import java.util.List;

public class CatMarket {

    public void makeMeow(Meowable... cat){
        makeMeow(Arrays.asList(cat));
    }

    public void makeMeow(List<Meowable> cats){
        cats.forEach(Meowable::Meow);
    }
}
