import java.util.List;

public class City {
    private List<Way> ways;
    private String Name;

    private void addWay(Way way){
        ways.add(way);
    }

    private void addWay(Way... way){
        ways.addAll(List.of(way));
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
