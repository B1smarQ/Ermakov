package animals;

public class Counter implements Meowable{
    int count = 0;
    Meowable cat;

    public Counter(Meowable cat) {
        this.cat = cat;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void Meow() {
        cat.Meow();
        count++;
    }
}
