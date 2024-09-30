public class Main {
    public static void main(String[] args){
        PolyLine line = new PolyLine(new Point2D(3,4), new Point2D(5,8), new Point2D(9, 76));
        System.out.println(line);

        System.out.println(new Person("Jonathan", "Joestar"));

        House house = new House(7);
        System.out.println(house);

        Time time = new Time(40,166);
        System.out.println(time);

        Student student = new Student("Allah");

        System.out.println(student);
    }
}
