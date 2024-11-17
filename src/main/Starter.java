package main;

import animals.BarkAdapter;
import animals.Cat;
import geometry.Point2D;
import geometry.Square;

import legacy.*;

import java.util.Arrays;
import java.util.function.Predicate;

import office.*;
import office.Department;
import office.Employee;

public class Starter {
    public static void main(String[] args) {
        Department dpt = new Department("IT");
        Department dpt2 = new Department("Marketing");
        Employee emp = new Employee(dpt, "james");
        System.out.println(dpt);
        System.out.println(dpt2);
        System.out.println(emp);

        emp.setWorkplace(dpt2);
        System.out.println(dpt);
        System.out.println(dpt2);
        System.out.println(emp);

        dpt.addEmployee(emp);

        System.out.println(dpt);
        System.out.println(dpt2);
        System.out.println(emp);

        Fraction fraction = new Fraction(2,3);
        try {
            Fraction fraction1 = (Fraction) fraction.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
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
