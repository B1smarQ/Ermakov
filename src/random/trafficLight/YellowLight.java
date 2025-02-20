package random.trafficLight;

public class YellowLight implements State {
    public static final State YELLOW = new YellowLight();
    @Override
    public void next(TrafficLight tl) {

    }

    @Override
    public String getColor() {
        return "yellow";
    }
}
