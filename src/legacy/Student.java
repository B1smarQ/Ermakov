package legacy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name, Integer... grades) {
        if(name == null || name.isBlank())throw new Stone();
        if(Arrays.stream(grades).anyMatch(x->x<2||x>5))throw new Stone("Grades must be [2,5]");
        this.grades = Arrays.asList(grades);
    }
    private double calculateGrades(){
        return this.grades.stream().mapToInt(x->x).average().orElse(0);
    }
    private void addGrades(Integer... grades){
        if(Arrays.stream(grades).anyMatch(x->x<2 || x>5)) throw new Stone("Grades must be [2,5]");
        this.grades.addAll(List.of(grades));
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades);

    }

    private void removeGrade(int index){
        if(index>this.grades.size())throw new Stone();
        this.grades.remove(index);
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
