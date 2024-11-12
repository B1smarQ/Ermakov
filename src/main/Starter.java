package main;

import animals.*;
import legacy.Stone;
import legacy.Student;

public class Starter {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik");
        Counter counter = new Counter(cat);
        CatAlert catAlert = new CatAlert(counter);
        test(new CatAlert(new MeowableDog(new Dog("Donald Gav"))));
        System.out.println(counter.getCount());
    }
    public static void test(Meowable car){
        car.Meow();
        car.Meow();
        car.Meow();
    }
    public static void addToStudents(int grade, Student... students){
        int i = 0;
        for (; i < students.length; i++) {
            try{
                students[i].addGrades(grade);
            }
            catch (Stone s){
                removeFromStudents(grade,i,students);
                throw (s);
            }
        }
    }
    public static void removeFromStudents(int grade,int amount,  Student... students){
        for (int i = 0; i < amount; i++) {
            students[i].removeGrade(grade);
        }
    }


}
