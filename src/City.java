import java.util.ArrayList;
import java.util.List;

public class City {
    protected List<Way> ways = new ArrayList<>();
    protected String Name;

    public City(String name) {
        Name = name;
    }

    protected void addWay(Way way){
        if(ways.stream().anyMatch(x->x.getCityTo() == way.getCityTo())) throw new Stone("Way already exists");
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
        return ways;
    }

    @Override
    public String toString() {
        return "City{" +
                "ways=" + ways +
                ", Name='" + Name + '\'' +
                '}';
    }
}
