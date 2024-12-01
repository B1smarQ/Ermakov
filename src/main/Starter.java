package main;

import functional.DataStream;
import generics.Box;
import generics.Storage;
import geometry.Line;
import geometry.Point2D;
import geometry.Point3D;
import legacy.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import office.*;
import office.Department;
import office.Employee;
import random.*;

public class Starter {
    public static void main(String[] args)  {
        Line<Point3D> l1 = Line.of(new Point3D(1,2,3),new Point3D(2,2,2));
        l1.moveX();
        System.out.println(l1);
        Line<Point2D> l2 = Line.of(new Point2D(1,2),new Point2D(5,5));
        l2.moveX();
        System.out.println(l2);

        System.out.println(DataStream.storageMax(List.of(Optional.of(5),
                Optional.of(22.2),
                Optional.of(1),
                Optional.of(5.1))));

        Box<Point3D> box = Box.of(null);
        System.out.println(box);
        addPointOptional(1,2,3,box);
        System.out.println(box);
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
