package inheritance;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Way way = (Way) o;
        return getCost() == way.getCost() && getCityTo() == way.getCityTo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCityTo(), getCost());
    }
}
