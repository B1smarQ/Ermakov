package main;

import geometry.Line;
import geometry.Point2D;
import geometry.Point3D;
import geometry.PolyLine;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static reflexive.GeneralMethods.lineConnector;

public class Starter {
    public static void main(String[] args) throws FileNotFoundException {
        Line<Point2D> line = new Line<Point2D>(new Point2D(1,1), new Point2D(7,7));
        Line<Point2D> line2 = new Line<Point2D>(new Point2D(8,8), new Point2D(12,12));
        try {
            lineConnector(line, line2);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        System.out.println(line);
        System.out.println(line2);


    }

    public static List<Field> findFields(Class<?> cl){
        List<Field> fields = new ArrayList<>(List.of(cl.getDeclaredFields()));
        if(cl.equals(Object.class)){
            return List.of();
        }
        fields.addAll(findFields(cl.getSuperclass()));
        return fields;
    }
    
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
}
