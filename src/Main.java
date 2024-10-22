public class Main {
    public static void main(String[] args){
        
        Cat barsik = new Cat("barsik");
        barsik.MeowN(10);

        Student student = new Student("Mohammed",5,5,5,2);
        System.out.println(student.toGrades());

        Square square = new Square(new Point2D(5,5),5);
        System.out.println(square);

        Fraction frac = new Fraction(5,7);
        Fraction result = frac.add(new Fraction(2,7)).multiply(new Fraction(2,2)).divide(new Fraction(3,3)).add(new Fraction(-1,2));

        System.out.println(result);

        Department dpt = new Department("IT");
        Worker employee = new Worker(new Name.NameBuilder().setFirstName("Ivan").setSurname("Kozlov").create(), dpt);
        employee.promoteToBoss();
        //Boss employee1 = new Boss(new Name.NameBuilder().setFirstName("Jonathan").setSurname("Joestar").create(), dpt);

        System.out.println(dpt);

        CityDouble c1 = new CityDouble("A");
        CityDouble c2 = new CityDouble("B");
        c1.addWay(new Way(c2,5));
        System.out.println(c1);
        System.out.println(c2);

        AR ar = new AR();
        ar.shoot(5);
        ar.ShootForTime(3);
        ar.Reload(30);
        ar.shoot(30);

        Point3D point3D = new Point3D(1,2,3);
        System.out.println(point3D);
    }
}
