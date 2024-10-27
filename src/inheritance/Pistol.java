package inheritance;

public class Pistol extends Weapon{
    public Pistol(int ammo) {
        super(ammo);
    }

    @Override
    void Shoot() {
        if(this.getAmmo()){
            System.out.println("Pew");
        }
        else{
            System.out.println("Click");
        }
    }
}
