package inheritance;

public abstract class Weapon {
    private int ammo;

    public Weapon(int ammo) {
        if(ammo <0) throw  new Stone("Ammo can't be less than 0");
        this.ammo = ammo;
    }

    abstract void Shoot();

    public int ammo() {
        return ammo;
    }

    public boolean getAmmo(){
        if (ammo ==0) return false;
        ammo--;
        return true;
    }

    public void load (int ammo){
        if (ammo<0) throw new Stone("Can't load less than 0 bullets");
        this.ammo+=ammo;
    }
}
