package Inheritance;

public class AreaSummer {

    public double areaSumm(Shape... shapes){
        double res = 0 ;
        for(Shape s:shapes){
            res+=s.getArea();
        }
        return res;
    }
}
