package random.trafficLight;

public enum Colors implements State{
    GREEN("Green"){
        @Override
        public void next(TrafficLight tl) {
            tl.setState(AFTER_GREEN);
        }

    },
    RED("Red"){
        @Override
        public void next(TrafficLight tl) {
            tl.setState(AFTER_RED);
        }
    },
    AFTER_GREEN("Yellow"){
        @Override
        public void next(TrafficLight tl) {
            tl.setState(RED);
        }
    },
    AFTER_RED("Yellow"){
        @Override
        public void next(TrafficLight tl) {
            tl.setState(GREEN);
        }
    };

    final String color;

    Colors(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }
}
