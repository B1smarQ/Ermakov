package legacy;

import animals.BirdMarket;
import animals.Cuckoo;


public class Main {
    public static void main(String[] args){
        
        BirdMarket market = new BirdMarket();
        Cuckoo cuckoo = new Cuckoo();
        market.makeChirp(cuckoo);

    }
}
