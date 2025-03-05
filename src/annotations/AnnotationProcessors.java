package annotations;

import lombok.SneakyThrows;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationProcessors {

    public static String collect(Class<?> clazz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Method[] methods = clazz.getDeclaredMethods();
        Constructor<?> c = clazz.getDeclaredConstructor();
        c.setAccessible(true);
        Object obj = c.newInstance();
        StringBuilder builder = new StringBuilder("{");
        for(Method m : methods){
            if(m.isAnnotationPresent(Invoke.class)){
                m.setAccessible(true);
                builder.append(m.getName()).append("=").append(m.invoke(obj));
            }
        }
        return builder.toString();
    }

    public static void reset(Object... objs) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        for(Object obj : objs){
            Class<?> clazz = obj.getClass();
            Field[] fields = clazz.getDeclaredFields();
            for(Field f : fields){
                if(f.isAnnotationPresent(Default.class)){
                    f.setAccessible(true);
                    if(f.getAnnotation(Default.class).value() != null){
                       f.set(obj, f.getAnnotation(Default.class).value());
                    }
                    else {
                       f.set(obj, f.get(obj).getClass().getDeclaredConstructor().newInstance());
                   }
                }
            }
        }
    }


}
