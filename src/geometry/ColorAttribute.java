package geometry;

import java.awt.*;

public class ColorAttribute extends Attribute {
    public ColorAttribute(Color value) {
        super("Color", value);
    }
    public Color getColor(){
        return (Color) super.getValue();
    }

    @Override
    public String toString() {
        return "ru.makeev.geometry.ColorAttribute{" +
                "value=" + value +
                '}';
    }
}
