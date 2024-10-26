package Inheritance;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Cuckoo extends Bird{

    @Override
    public void Chirp() {
        System.out.println("Cu-ckoo ".repeat(ThreadLocalRandom.current().nextInt(1,10)));
    }
}
