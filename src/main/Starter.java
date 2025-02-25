package main;

import geometry.Point2D;
import geometry.Point3D;
import geometry.PolyLine;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Starter {
    public static void main(String[] args) throws FileNotFoundException {
        List<Point2D> points = List.of(new Point2D(1,1), new Point2D(5,7),
                new Point2D(1,1), new Point2D(5,-19), new Point2D(7,12));
        Scanner scanner = new Scanner(new File("C:\\Users\\Egor\\IdeaProjects\\Ermakov\\src\\Points.txt"));
        List<PolyLine> line = Stream.generate(scanner::nextLine)
                .peek(System.out::println)
                .takeWhile(x-> scanner.hasNextLine())
                .map(s->s.split(" "))
                .map(strings -> new Point2D(Integer.parseInt(strings[0]), Integer.parseInt(strings[1])))
                .distinct()
                .map(p-> new Point2D(p.getX(), p.getY()<0?-p.getY():p.getY()))
                .sorted()
                .collect(Collectors.groupingBy(Point2D::getY))
                .values()
                .stream()
                .map(PolyLine::new)
                .toList();
        System.out.println(line);
        System.out.println(findFields(line.getFirst().getClass()));
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
