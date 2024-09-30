import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    List<Integer> grades=  new ArrayList<>();

    public Student(String name, Integer... grades) {
        this.name = name;
        this.grades = List.of(grades);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }
}
