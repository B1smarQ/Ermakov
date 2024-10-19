public class CityDouble extends City{
    public CityDouble(String name) {
        super(name);
    }

    @Override
    protected void addWay(Way way) {
        if(ways.stream().anyMatch(x->x.getCityTo() == way.getCityTo())) throw new Stone("Way already exists");
        ways.add(way);
        if(way.getCityTo().ways.stream().noneMatch(x->x.getCityTo() == this))
            way.getCityTo().ways.add(new Way(this,way.getCost()));
    }

    @Override
    protected void addWay(Way... way) {
        for(Way w : way){
            addWay(way);
        }
    }
}
