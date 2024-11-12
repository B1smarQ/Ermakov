package inheritance;

import animals.*;
import geometry.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainInheritance {
    public static void main(String[] args) {
        System.out.println(numberSum(new Fraction(5,8),5,2.2));
        System.out.println("_________________________________________________________");

        makeChirp(new Cuckoo(), new Sparrow(), new Cuckoo());
        System.out.println("_________________________________________________________");

        AreaSummer summer = new AreaSummer();
        System.out.println(summer.areaSumm(new Square(new Point2D(1, 1), 5)));
        System.out.println("_________________________________________________________");

        CityDouble A = new CityDouble("A");
        City B = new City("B");
        City C = new City("C");
        CityDouble D = new CityDouble("D");
        City E = new City("E");

        A.addWay(new Way(B, 1));
        A.addWay(new Way(C, 1));
        B.addWay(new Way(C, 1));
        D.addWay(new Way(B, 1));
        D.addWay(new Way(E, 1));
        E.addWay(new Way(C, 1));

        CityGraph graph = new CityGraph(A, B, C, D, E);
        System.out.println(graph);
        System.out.println("_________________________________________________________");
        Square square = new Square(new Point2D(1, 1), 5);
        System.out.println(square.getArea());
        System.out.println("_________________________________________________________");
        makeMeow(new Cat("Kurwa kot"),
                new Cat("Kot"),
                new Cat("Barsik"),
                new Lynx("Lynx"));
        System.out.println("_________________________________________________________");

        System.out.println(lengthSum(new Line(new Point2D(1,1), new Point2D(5,5))));
        System.out.println("_________________________________________________________");

        System.out.println(new Square(new Point2D(1,1),5));

        System.out.println("_________________________________________________________");

        Student student = new Student("Mohamad",new RangeRuleRU(2,5),3,3,3,3,3,5);

        List<String> s = new ArrayList<>(List.of("qew444444","qeweee","rewt"));
        s.sort(new StringComparator());
        System.out.println(s);

    }

    static double lengthSum(Measurable... measurables) {
        double res = 0;
        for (Measurable measurable : measurables) {
            res += measurable.getLength();
        }
        return res;
    }

    static double numberSum(Number... numbers) {
        double res = 0;
        for (Number number : numbers) {
            res += number.doubleValue();
        }
        return res;
    }
    public static void makeChirp(Chirpable... birb){
        for (Chirpable bird: birb){
            bird.Chirp();
        };
    }
    public static void makeMeow(Meowable... cat){
        makeMeow(Arrays.asList(cat));
    }

    public static void makeMeow(List<Meowable> cats){
        cats.forEach(Meowable::Meow);
    }
    static PolyLine getCommonLine(PolyLine... shapes) {
        PolyLine result = new PolyLine();
        for (PolyLine line : shapes) {
            result.addPoint(line.getPolyLine());
        }
        return result;
    }
}

class StringComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
}


