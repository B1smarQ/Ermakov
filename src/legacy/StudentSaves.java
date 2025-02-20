package legacy;

import java.util.ArrayList;
import java.util.List;

public class StudentSaves {
    public static List<Student> saves = new ArrayList<>();

    public static void makeSave(Student student){
        saves.add(new Student(student.getName(),student.getRule(),  student.getGrades()));
    }

    public static Student loadSave(int ind){
        return saves.get(ind);
    }
}
