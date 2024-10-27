package animals;

public class Cat implements Meowable{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void Meow() {
        System.out.printf("%s: MEOW%n",name);

    }
}
