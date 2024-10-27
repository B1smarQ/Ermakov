package legacy;

public class Pistol {
    protected int bullets;
    protected int maxBullets;
    public Pistol(int bullets, int maxBullets) {
        if(bullets>maxBullets) throw new Stone("womp womp");
        this.bullets = bullets;
        this.maxBullets = maxBullets;
    }

    public Pistol() {
        this.bullets = 5;
        this.maxBullets = 5;
    }
    public int Reload(int bullets){
        if(bullets<0) throw new Stone();

        if(bullets > this.maxBullets-this.bullets){
            this.bullets+=this.maxBullets-bullets;
            return this.maxBullets - bullets;
        }
        this.bullets+=bullets;
        return 0;

    }
    public int Unload(){
        int tmp = this.bullets;
        this.bullets = 0;
        return tmp;
    }
    public boolean IsLoaded(){
        return bullets>0;
    }
    public boolean IsUnloaded(){
        return bullets ==0;
    }

    public int getBullets() {
        return bullets;
    }

    public void Shoot(){
        if(bullets>0){
            System.out.println("Phew");
            bullets--;
        }
        else{
            System.out.println("Click");
        }
    }
}
