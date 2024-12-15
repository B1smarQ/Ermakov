package main;

import functional.DataStream;
import generics.Box;
import geometry.Line;
import geometry.Point2D;
import geometry.Point3D;
import geometry.PolyLine;
import legacy.*;
import random.TrafficLight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class Starter {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("Yellow");
        light.next();
        light.next();
        light.next();
        light.next();
        light.next();
        light.next();
    }

    public static void addPointOptional(int x, int y, int z, Box<Point3D> point3DOptional) {
        point3DOptional.setObj(new Point3D(x, y, z));
    }

    public static void addToStudents(int grade, Student... students) {
        int i = 0;
        for (; i < students.length; i++) {
            try {
                students[i].addGrades(grade);
            } catch (Stone s) {
                removeFromStudents(grade, i, students);
                System.out.println("removed all grades");
                break;
            }
        }

        System.out.println(Arrays.toString(students));


    }

    public static void removeFromStudents(int grade, int amount, Student... students) {
        for (int i = 0; i < amount; i++) {
            students[i].removeGrade(grade);
        }
    }

    public static Optional<Number> listSum(List<Number> numberList) {
        if (numberList == null || numberList.isEmpty()) return Optional.empty();
        return Optional.of(numberList.stream().mapToDouble(Number::doubleValue).sum());
    }
}
