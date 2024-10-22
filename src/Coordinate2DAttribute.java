public class Coordinate2DAttribute extends Attribute{

    public Coordinate2DAttribute( int x, int y) {
        super("Coordinates 2D", new int[]{x,y});
    }

    public int getX(){
        return ((int[])super.getValue())[0];
    }

    public int getY(){
        return  ((int[])super.getValue())[0];
    }
}
