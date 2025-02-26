package random;
import java.lang.reflect.Field;
import java.util.stream.Collectors;

import static main.Starter.findFields;

abstract class Entity{
    private String  findFieldValues(Field field) {
        field.setAccessible(true);
        try {
            return field.getName() + " : " + field.get(this);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    public String toString() {
        return getClass().getSimpleName() + " {"+ findFields(getClass())
                .stream()
                .map(this::findFieldValues)
                .collect(Collectors.joining(", ")) + "}";
    }
}