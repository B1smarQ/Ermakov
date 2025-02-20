package random.trafficLight;

public class RedLight implements State{
    public static final State RED = new RedLight();
    @Override
    public void next(TrafficLight tl) {
    }

    @Override
    public String getColor() {
        return "red";
    }
}
