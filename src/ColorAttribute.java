import java.awt.*;

public class ColorAttribute extends Attribute {
    public ColorAttribute(Color value) {
        super("Color", value);
    }
    public Color getColor(){
        return (Color) super.getValue();
    }
}
