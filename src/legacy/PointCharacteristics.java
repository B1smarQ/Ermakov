package legacy;

import java.awt.*;
import java.sql.Time;

public class PointCharacteristics {
    private Color color;
    private Time time;

    public PointCharacteristics(Color color, Time time) {
        this.color = color;
        this.time = time;
    }

    public PointCharacteristics(Color color) {
        this.color = color;
    }

    public PointCharacteristics(Time time) {
        this.time = time;
    }

    public PointCharacteristics() {
    }

    public Color getColor() {
        return color;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
