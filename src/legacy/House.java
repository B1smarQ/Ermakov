package legacy;

public class House {
    final int stories;

    public House(int stories) {
        if(stories<1) throw new Stone("Stories must be >0");
        this.stories = stories;
    }

    @Override
    public String toString() {
        return "ru.makeev.legacy.House{" +
                "stories=" + stories +
                '}';
    }
}
