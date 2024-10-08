import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    String name;
    List<Integer> grades=  new ArrayList<>();

    public Student(String name, Integer... grades) {
        this.name = name;
        this.grades = Arrays.asList(grades);
    }
    private float calculateGrades(){
        float result = 0;
        for(Integer i:grades){
            result+=i;
        }
        return result/grades.size();
    }

    public String toGrades(){
        StringBuilder output = new StringBuilder("grades: ");
        float res = calculateGrades();
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
