package random;
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

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

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
