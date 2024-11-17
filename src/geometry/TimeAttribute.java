package geometry;

import java.sql.Time;

public class TimeAttribute extends Attribute {
    public TimeAttribute( Time value) {
        super("ru.makeev.legacy.Time", value);

    }

    public Time getTime(){
        return (Time)super.getValue();
    }
}
