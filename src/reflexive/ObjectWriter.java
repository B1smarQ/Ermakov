package reflexive;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;

public class ObjectWriter {
    public void writeObject(Object obj) throws IOException {
        StringBuilder sb = new StringBuilder();
        writeObject(obj, sb);
        try (FileOutputStream fos = new FileOutputStream(obj.getClass().getName())){
            fos.write(sb.toString().getBytes());
        }
    }

    private void writeObject(Object obj, StringBuilder sb) {
        sb.append(obj.getClass().getName()).append(" \n");
        for (Field field : obj.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            try {
                sb.append("  ").append(field.getName()).append(": ").append(field.get(obj)).append("\n");
            } catch (IllegalAccessException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
