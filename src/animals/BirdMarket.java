package animals;

public class BirdMarket {

    public void makeChirp(Chirpable... birb){
        for (Chirpable bird: birb){
            bird.Chirp();
        };
    }
}
