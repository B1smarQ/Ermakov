package Inheritance;

public class Shooter {
    private String name;
    private Weapon weapon;

    public Shooter(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void Shoot(){
        if(weapon == null){
            System.out.println("Can't shoot");
            return;
        }
        weapon.Shoot();
    }
}
