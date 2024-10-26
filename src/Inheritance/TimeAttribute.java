package Inheritance;

import java.sql.Time;

public class TimeAttribute extends Attribute {
    public TimeAttribute( Time value) {
        super("Time", value);

    }

    public Time getTime(){
        return (Time)super.getValue();
    }
}
