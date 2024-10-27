package inheritance;

import java.util.ArrayList;
import java.util.List;

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
                ", legacy.Name='" + Name + '\'' +
                '}';
    }
}
