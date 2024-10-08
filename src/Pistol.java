public class Pistol {
    private int bullets;

    public Pistol(int bullets) {
        this.bullets = bullets;
    }

    public Pistol() {
        this.bullets = 5;
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
