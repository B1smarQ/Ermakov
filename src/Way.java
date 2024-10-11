public class Way {
    private City cityTo;
    private int cost;

    public Way(City cityTo, int cost) {
        this.cityTo = cityTo;
        this.cost = cost;
    }

    public City getCityTo() {
        return cityTo;
    }
}
