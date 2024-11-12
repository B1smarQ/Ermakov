package animals;

public class MeowableDog implements Meowable{
    Dog dog;

    public MeowableDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void Meow() {
        dog.bark();
    }
}
