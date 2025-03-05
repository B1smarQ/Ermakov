package reflexive;

import annotations.Invoke;
import annotations.Test;
import geometry.Line;
import geometry.Point2D;
import lombok.Delegate;
import lombok.SneakyThrows;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneralMethods {

    public static List<Field> fieldCollection(Class<?> clazz){

        List<Field> fields = new ArrayList<>(List.of(clazz.getDeclaredFields()));
        if(clazz.equals(Object.class)){
            return List.of();
        }
        fields.addAll(fieldCollection(clazz.getSuperclass()));
        return fields;
    }

    public static void lineConnector(Line<? extends Point2D> line1, Line<? extends Point2D> line2)
            throws NoSuchFieldException, IllegalAccessException {
        Field line2Start = line2.getClass().getDeclaredField("startPoint");
        Field line1End = line1.getClass().getDeclaredField("endPoint");

        line2Start.setAccessible(true);
        line1End.setAccessible(true);

        if(line2Start.get(line2).getClass() != line1End.get(line1).getClass()){
            throw new IllegalArgumentException("Points must have the same type");
        }
        line2Start.set(line2, line1End.get(line1));
    }

    public static <T,C> void validate(T testObj, Class<C> testClass) throws NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {

        Constructor<C> c = testClass.getDeclaredConstructor();
        c.setAccessible(true);
        C instance = c.newInstance();
        List<Method> methods = List.of(testClass.getDeclaredMethods());
        System.out.println(methods);
        for(Method m : methods){
            if(m.isAnnotationPresent(Test.class)){
                System.out.println("Found annotation");
                try {
                    m.setAccessible(true);
                    m.invoke(instance, testObj);
                }
                catch (InvocationTargetException e){
                    Throwable tt = e.getCause();
                    if(tt instanceof ValidationException tw){
                        throw new ValidationException(tt.getMessage());
                    }
                }
            }
        }
    }

}
