package Inheritance;

public class Cat implements Meowable{
    private String name;


    @Override
    public void Meow() {
        System.out.printf("%s: MEOW%n",name);

    }
}
