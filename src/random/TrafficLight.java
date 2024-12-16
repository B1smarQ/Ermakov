package random;


import java.util.List;


public class TrafficLight {
    private List<String> colors;
    private final CycleIterator<String, List<String>> iter;

    public TrafficLight(List<String> colors) {
        this.colors = colors;
        iter = new CycleIterator<>(colors);
    }

    public TrafficLight() {
        this("Red", "Yellow", "Green", "Yellow");
    }

    public TrafficLight(String... colors) {
        this(List.of(colors));
    }

    public void next() {
        System.out.println(iter.next());
    }
}
