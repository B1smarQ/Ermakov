package Inheritance;

public class MainInheritance {
    public static void main(String[] args) {
        System.out.println(lengthSum(new Line(new Point2D(5,5), new Point2D(7,5))));
    }
    static double lengthSum(Measurable... measurables){
        double res = 0;
        for(Measurable measurable:measurables){
            res+= measurable.getLength();
        }
        return res;
    }
}
