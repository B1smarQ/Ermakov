package reflexive;

import geometry.Line;
import geometry.Point2D;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class GeneralMethods {
    public static List<Field> fieldCollection(Class clazz){
        List<Field> fields = new ArrayList<>(List.of(clazz.getDeclaredFields()));
        if(clazz.equals(Object.class)){
            return List.of();
        }
        fields.addAll(fieldCollection(clazz.getSuperclass()));
        return fields;
    }

    public static void lineConnector(Line<? extends Point2D> line1, Line<? extends Point2D> line2) throws NoSuchFieldException, IllegalAccessException {
        Field line2Start = line2.getClass().getDeclaredField("startPoint");

        Field line1End = line1.getClass().getDeclaredField("endPoint");
        line2Start.setAccessible(true);
        line1End.setAccessible(true);
        if(line2Start.get(line2).getClass() != line1End.get(line1).getClass()){
            throw new IllegalArgumentException("Points of the two lines must have the same type");
        }
        line2Start.set(line2, line1End.get(line1));
    }
    public static void validate(Object testObj, Class testClass){
        List<Method> testMethods= new ArrayList<>(List.of(testClass.getDeclaredMethods()));

        for (Method method : testMethods){
            try {
                method.invoke(testObj);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
