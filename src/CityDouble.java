public class CityDouble extends City{
    public CityDouble(String name) {
        super(name);
    }

    @Override
    protected void addWay(Way way) {
        super.addWay(way);
        if(way.getCityTo().getWays().stream().noneMatch(x->x.getCityTo()==this))
            way.getCityTo().addWay(way);
    }

    @Override
    protected void addWay(Way... way) {
        for(Way w : way){
            addWay(way);
        }
    }
}
