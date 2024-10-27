package Inheritance;

public class MainInheritance {
    public static void main(String[] args) {
        BirdMarket market = new BirdMarket();
        market.makeChirp(new Cuckoo());

        CityDouble A = new CityDouble("A");
        City B = new City("B");
        City C = new City("C");
        CityDouble D = new CityDouble("D");
        City E = new City("E");

        A.addWay(new Way(B,1));
        A.addWay(new Way(C, 1));
        B.addWay(new Way(C, 1));
        D.addWay(new Way(B, 1));
        D.addWay(new Way(E,1));
        E.addWay(new Way(C, 1));

        CityGraph graph = new CityGraph(A,B,C,D,E);
        System.out.println(graph);
    }
    static double lengthSum(Measurable... measurables){
        double res = 0;
        for(Measurable measurable:measurables){
            res+= measurable.getLength();
        }
        return res;
    }
    static double numberSum(Number... numbers){
        double res = 0;
        for(Number number:numbers){
            res+=number.doubleValue();
        }
        return res;
    }
}
