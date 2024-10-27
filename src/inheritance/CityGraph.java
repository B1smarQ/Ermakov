package inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CityGraph {
    private List<City> cities = new ArrayList<>();

    public CityGraph(List<City> cities) {
        this.cities.addAll(cities);
    }
    public CityGraph(City... cities){
        this(Arrays.asList(cities));
    }

    public void addCity(City city) {
        cities.remove(city);
        cities.add(city);
    }

    @Override
    public String toString() {
        return "CityGraph{" +
                "cities=" + cities +
                '}';
    }
}
