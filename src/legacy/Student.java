package legacy;

import generics.ActuallyCloneable;
import generics.Comparable;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.function.Predicate;

public class Student implements Comparable<Student>, ActuallyCloneable<Student> {
    private String name;
    private List<Integer> grades = new ArrayList<>();
    private Predicate<Integer> rule;

    private Deque<UndoOperation> deque = new ArrayDeque();
    public String getName() {
        return name;
    }

    public Predicate<Integer> getRule() {
        return rule;
    }

    public Student(String name, Predicate<Integer> rule, Integer... grades) {
        this.name = name;
        this.rule = rule;
        if(name == null || name.isBlank())throw new Stone();
        addGrades(List.of(grades));
    }
    public Student(String name, Predicate<Integer> rule, List<Integer> grades) {
        this.name = name;
        this.rule = rule;
        if(name == null || name.isBlank())throw new Stone();
        addGrades(grades);
    }

    private double calculateGrades(){
        return this.grades.stream().mapToInt(x->x).average().orElse(0);
    }

    private void addGrades(List<Integer> grades){
        for(int grade:grades){
            addGrades(grade);
        }
    }

    public void setName(String name) {
        String tmpName = this.name;
        deque.push(()->this.name = tmpName);
        this.name = name;
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    public void removeGrade(int grade){
        if(grades.contains(grade))
            grades.remove((Object)grade);
        deque.push(()->this.addGrades(grade));
    }

    public void addGrades(int grade){
        checkValidity(grade);
        this.grades.add(grade);
        deque.push(()->this.grades.removeLast());
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

    @Override
    public int compare(Student other) {
        double currentGrade = calculateGrades();
        double otherGrade = other.calculateGrades();
        return Double.compare(currentGrade, otherGrade);
    }

    public Save<Student> save(){
        return new Save<>(this);
    }

    public void load(Save<Student> save){
        Save tmpSave = save();
        Student tmp = save.getValue();
        this.setName(tmp.getName());
        this.grades = new ArrayList<>(tmp.getGrades());
        this.rule = tmp.getRule();
        deque.add(()->load(tmpSave));
    }

    public void undo(){
        deque.pop().make();
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        return new Student(this.name,this.rule,this.grades);
    }


}
