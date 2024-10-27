package legacy;

public class Cat {
    private final String name;

    public Cat(String name) {
        this.name = name;
    }

    public void Meow(){
        System.out.printf("%s: meow",name);
    }

    public void MeowN(int n){
        System.out.printf("%s: "+" meow ".repeat(Math.max(0, n))+"\n",name);
    }
}
