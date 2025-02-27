package reflexive;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("unchecked")
public class ObjectReader<T> {
    public T readObject(String fileName) throws
            ClassNotFoundException, IllegalAccessException, InstantiationException,
             NoSuchMethodException, InvocationTargetException, IOException {
        try (Scanner scanner = new Scanner(new FileInputStream(fileName))) {
            String className = scanner.nextLine().trim();

            Class<?> clazz;
            clazz = Class.forName(className);

            System.out.println("Class loaded: " + clazz.getName());

            Object object = clazz.getDeclaredConstructor().newInstance();

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":", 2);
                if (parts.length != 2) {
                    continue;
                }
                String fieldName = parts[0].trim();
                String fieldValue = parts[1].trim();

                try {
                    Field field = clazz.getDeclaredField(fieldName);
                    field.setAccessible(true);
                    field.set(object, convertValue(field.getType(), fieldValue));
                } catch (NoSuchFieldException e) {
                    System.err.println("Field not found: " + fieldName);
                } catch (IllegalArgumentException e) {
                    System.err.println("Error setting field " + fieldName + ": " + e.getMessage());
                }
            }
            return (T)object;
        }
    }

    private Object convertValue(Class<?> type, String fieldValue) {
        if (type == String.class) {
            return fieldValue;
        } else if (type == int.class) {
            return Integer.parseInt(fieldValue);
        } else if (type == Double.class) {
            return Double.parseDouble(fieldValue);
        } else if(type == byte.class){
            return Byte.parseByte(fieldValue);
        }
        else {
            throw new IllegalArgumentException("Unsupported type: " + type);
        }

    }
}
