package animals;

public class BarkAdapter implements Barkable {
    public Meowable cat;

    public BarkAdapter(Meowable cat) {  
        this.cat = cat;
    }

    @Override
    public void Bark() {
        System.out.println("Bark");
    }
}
