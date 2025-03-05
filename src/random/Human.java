package random;

import annotations.Default;
import annotations.Invoke;
import lombok.Delegate;

public class Human {

    private  int age;
    
    private  String name;
    private  byte gender;

    public Human(int age, String name, byte gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public Human() {
    }
    @Invoke
    public int getAge() {
        return age;
    }
    @Invoke
    public String getName() {
        return name;
    }
    @Invoke
    public byte getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
