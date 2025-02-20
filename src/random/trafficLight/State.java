package random.trafficLight;

public interface State {
    void next(TrafficLight tl);
    String getColor();
}
