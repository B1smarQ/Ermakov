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
import random.*;

public class Starter {
    public static void main(String[] args) throws CloneNotSupportedException {
        KarateBoy karateBoy = new KarateBoy("Cat");
        KarateBoyCombo1 combo = new KarateBoyCombo1("super meow",
                new KarateBoyCombo1("MEEEEEOOO", new KaratePunch()),
                new KarateBoyCombo1("MOEEEEEEOW", new KarateKick())
                );
        combo.MeowCombo(karateBoy);
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


}
