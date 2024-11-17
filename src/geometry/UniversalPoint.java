package geometry;

import java.util.Arrays;
import java.util.List;

public class UniversalPoint {
    List<Attribute> attributes;

    public UniversalPoint(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public UniversalPoint(Attribute... attributes){
        this(Arrays.stream(attributes).toList());
    }

    @Override
    public String toString() {
        return "ru.makeev.geometry.UniversalPoint{" +
                "attributes=" + attributes +
                '}';
    }
}
