package main;

import geometry.Point2D;
import geometry.Square;

import legacy.RuleThreeToSix;
import legacy.RuleTwoToFive;
import legacy.Stone;
import legacy.Student;

import java.util.Arrays;

public class Starter {
    public static void main(String[] args) {
      Student s1 = new Student("Jamal", new RuleTwoToFive());
      Student s2 = new Student("Alex", new RuleThreeToSix());

      addToStudents(3, s1, s2);
      addToStudents(2, s1,s2);

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
