package random;

public class KarateBoy {
    String name;

    public KarateBoy(String name) {
        this.name = name;
    }
    public void kick (){
        System.out.println(name+":mau");
    }
    public void punch(){
        System.out.println(name+":MAUUU");
    }

    public void jump(){
        System.out.println(name+":maUUUUUU");
    }

    public void kick(KarateBoy karateBoy) {
        kick();
    }
}
