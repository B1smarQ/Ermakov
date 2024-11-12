package animals;

import org.jetbrains.annotations.NotNull;

public class CatAlert implements Meowable{
    Meowable car;

    public CatAlert(@NotNull Meowable car) {
        this.car = car;
    }

    @Override
    public void Meow() {
        System.out.println("Alert");
        car.Meow();
    }
}
