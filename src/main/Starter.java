package main;

import functional.DataStream;
import generics.Box;
import geometry.Line;
import geometry.Point2D;
import geometry.Point3D;
import geometry.PolyLine;
import legacy.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class Starter {
    public static void main(String[] args)  {
        List<Point2D> point2DS = List.of(new Point2D(1,2), new Point2D(-3,6), new Point2D(8,9));
        PolyLine line = DataStream.of(point2DS)
                .filter((p)->p.getX()>0)
                .map(p->new Point2D(p.getX()+5, p.getY()))
                .collect(PolyLine::new, PolyLine::addPoint);
    }

    public static void addPointOptional(int x, int y, int z, Box<Point3D> point3DOptional){
        point3DOptional.setObj(new Point3D(x,y,z));
    }
    public static void addToStudents(int grade, Student... students){
        int i = 0;
        for (; i < students.length; i++) {
            try{
                students[i].addGrades(grade);
            }
            catch (Stone s){
                removeFromStudents(grade,i,students);
                System.out.println("removed all grades");
                break;
            }
        }
        
        System.out.println(Arrays.toString(students));


    }

    public static void removeFromStudents(int grade,int amount,  Student... students){
        for (int i = 0; i < amount; i++) {
            students[i].removeGrade(grade);
        }
    }

    public static Optional<Number> listSum(List<Number> numberList){
        if(numberList == null || numberList.isEmpty()) return Optional.empty();
        return Optional.of(numberList.stream().mapToDouble(Number::doubleValue).sum());
    }
}
