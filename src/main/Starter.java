package main;

import animals.BarkAdapter;
import animals.Cat;
import geometry.Line;
import geometry.Point2D;
import geometry.Point3D;
import geometry.Square;

import legacy.*;

import java.util.Arrays;
import java.util.function.Predicate;

import office.*;
import office.Department;
import office.Employee;

public class Starter {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point2D p1 = new Point2D(1,2);
        Point2D p2 = p1.clone();
        System.out.println(p1);
        System.out.println(p2);
        Line<Point2D> line = new Line<Point2D>(p1,p2);
        Line<Point2D> line1 = line.clone();

        Line<Point3D> line2 = new Line<Point3D>(new Point3D(4,2,3), new Point3D(2,7,6));
        Line<Point3D> line3 = line2.clone();

        System.out.println(line);
        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
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

        new BarkAdapter(new Cat("Gami")).Bark();

    }

    public static void removeFromStudents(int grade,int amount,  Student... students){
        for (int i = 0; i < amount; i++) {
            students[i].removeGrade(grade);
        }
    }


}
