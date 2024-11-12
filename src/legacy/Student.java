package legacy;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Student {
    private String name;
    private List<Integer> grades = new ArrayList<>();
    private Predicate<Integer> rule;

    public Student(String name,Predicate<Integer> rule, Integer... grades) {
        this.name = name;
        this.rule = rule;
        if(name == null || name.isBlank())throw new Stone();
        addGrades(grades);
    }
    private double calculateGrades(){
        return this.grades.stream().mapToInt(x->x).average().orElse(0);
    }
    private void addGrades(Integer... grades){
        for(int grade:grades){
            addGrades(grade);
        }
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades);

    }

    public void removeGrade(int grade){
        if(grades.contains(grade))
            grades.remove((Object)grade);
    }
    public void addGrades(int grade){
        checkValidity(grade);
        this.grades.add(grade);
    }
    private void checkValidity(int grade){
        if(rule.test(grade))
            return;
        throw new Stone("Invalid grade");
    }

    public String toGrades(){
        StringBuilder output = new StringBuilder("grades: ");
        double res = calculateGrades();
        for (int i:grades){
            output.append(i).append(" ");
        }
        if(res == 5){
            output.append("is otlichnick");
        }
        else{
            output.append("ne otlichnick");
        }

        return output.toString();
    }
    @Override
    public String toString() {
        return "legacy.Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }
}
