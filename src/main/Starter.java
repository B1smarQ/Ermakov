package main;

import functional.DataStream;
import generics.Storage;
import legacy.*;

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
        System.out.println(DataStream.filter(List.of(-1,3,-2,6),(x)->x>=0));
        System.out.println(DataStream.filter(List.of("abc","acd","bcd","fgh"),(x)->x.startsWith("a")));
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
