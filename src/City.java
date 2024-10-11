import java.util.List;

public class City {
    private List<Way> ways;
    private String Name;

    private void addWay(Way way){
        if(ways.stream().anyMatch(x->x.getCityTo() == way.getCityTo())) throw new Stone("Way already exists");
        ways.add(way);
    }

    private void addWay(Way... way){
        for (Way x:way){
            addWay(x);
        }
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
