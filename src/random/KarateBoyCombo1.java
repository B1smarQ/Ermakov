package random;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;

public class KarateBoyCombo1 implements Moveable {

    String name;
    List<Moveable> moves = new ArrayList<>();

    public KarateBoyCombo1(String name, Moveable... moves) {
        this.name = name;
        this.moves.addAll(List.of(moves));
    }

    public void MeowCombo(KarateBoy boy){
        for (Moveable moveable:moves){
            moveable.makeMove(boy);
        }

    }
    @Override
    public void makeMove(KarateBoy boy) {
        MeowCombo(boy);
    }
}
