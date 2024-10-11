import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    String name;
    List<Integer> grades=  new ArrayList<>();

    public Student(String name, Integer... grades) {
        this.name = name;
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
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }
}
