public class Main {
    public static void main(String[] args){
        Person Lev = new Person("Lev", 170);
        Person Serg = new Person(new Name.NameBuilder().setFirstName("Sergey").setSurname("Pushkin").create(),Lev,168);
        Person Alex = new Person("Alexander",Serg,167);
        System.out.println(Lev);
        System.out.println(Serg);
        System.out.println(Alex);

        Cat barsik = new Cat("barsik");
        barsik.MeowN(10);

        Student student = new Student("Mohammed",5,5,5,2);
        System.out.println(student.toGrades());

        Square square = new Square(new Point2D(5,5),5);
        System.out.println(square);
    }
}
