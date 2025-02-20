package random.trafficLight;

public class TrafficLight {
    private State state;

    public TrafficLight(State state) {
        this.state = state;
    }

    public void next(){
        state.next(this);
        System.out.println(state.getColor());
    }

    public void setState(Colors state) {
        this.state = state;
    }
}
