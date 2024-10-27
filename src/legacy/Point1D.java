package legacy;

import java.awt.*;
import java.sql.Time;

public class Point1D extends PointCharacteristics {
    int x;

    public Point1D(Color color, Time time, int x) {
        super(color, time);
        this.x = x;
    }

    public Point1D(Color color, int x) {
        super(color);
        this.x = x;
    }

    public Point1D(Time time, int x) {
        super(time);
        this.x = x;
    }

    public Point1D(int x) {
        this.x = x;
    }
}
