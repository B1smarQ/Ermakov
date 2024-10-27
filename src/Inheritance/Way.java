package Inheritance;

public class Way {
    private City cityTo;
    private int cost;

    public Way(City cityTo, int cost) {
        this.cityTo = cityTo;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public City getCityTo() {
        return cityTo;
    }

    @Override
    public String toString() {
        return "Inheritance.Way{" +
                "cityTo=" + cityTo.getName() +
                ", cost=" + cost +
                '}';
    }
}
