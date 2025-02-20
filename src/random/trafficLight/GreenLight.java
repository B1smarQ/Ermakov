package random.trafficLight;

public class GreenLight implements State{
    public static final State GREEN = new GreenLight();

    @Override
    public void next(TrafficLight tl) {


    }

    @Override
    public String getColor() {
        return "green";
    }
}
