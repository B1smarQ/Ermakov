public class AR extends Pistol{
    private final int fireRate;

    public AR(int bullets, int maxBullets, int fireRate) {
        super(bullets, maxBullets);
        if(fireRate<=0) throw new Stone("Fire rate can't be <=0");
        this.fireRate = maxBullets/2;
    }

    public AR() {
        this(30,30,30);
    }

    public void Shoot(int amount) {
        if(amount <0) return;
        if(amount > this.bullets) {
            Shoot(bullets);
            return;
        }
        bullets-=amount;
        System.out.println("Pew ".repeat(amount));

    }
    public void ShootForTime(int seconds){
        Shoot(fireRate*seconds);
    }
}
