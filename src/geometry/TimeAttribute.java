package geometry;

import java.sql.Time;

public class TimeAttribute extends Attribute {
    public TimeAttribute( Time value) {
        super("legacy.Time", value);

    }

    public Time getTime(){
        return (Time)super.getValue();
    }
}
