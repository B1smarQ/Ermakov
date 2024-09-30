public class House {
    final int stories;

    public House(int stories) {
        this.stories = stories;
    }

    @Override
    public String toString() {
        return "House{" +
                "stories=" + stories +
                '}';
    }
}
