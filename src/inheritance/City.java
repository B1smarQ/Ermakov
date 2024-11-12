package inheritance;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class City {
    protected List<Way> ways = new ArrayList<>();
    protected String Name;

    public City(String name) {
        Name = name;
    }

    protected void addWay(Way way){
        if(ways.stream().noneMatch(x->x.getCityTo() == way.getCityTo()))
            ways.add(way);
    }

    protected void addWay(Way... way){
        for (Way x:way){
            addWay(x);
        }
    }

    public String getName() {
        return Name;
    }

    public List<Way> getWays() {
        return new ArrayList<>(ways);
    }

    @Override
    public String toString() {
        return "City{" +
                "ways=" + ways +
                ", ru.makeev.legacy.Name='" + Name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City city)) return false;
        return new HashSet<>(getWays()).containsAll(city.getWays()) && getWays().size()==city.getWays().size();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getWays());
    }
}
