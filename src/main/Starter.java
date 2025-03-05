package main;

import annotations.AnnotationProcessors;
import random.Human;
import random.HumanTests;
import reflexive.ObjectReader;
import reflexive.ObjectWriter;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

import static reflexive.GeneralMethods.validate;

public class Starter {

    public static void main(String[] args) throws IOException, NoSuchFieldException,
            ClassNotFoundException, InvocationTargetException, IllegalAccessException, InstantiationException,
            NoSuchMethodException {

        Human t = new Human(10, "Alice", (byte) 0);
        ObjectWriter o = new ObjectWriter();
        o.writeObject(t);
        System.out.println(t.getClass().getName());
        ObjectReader<Human> reader = new ObjectReader<>();
        Human t2 =  reader.readObject("./random.Human");
        Human t3 = new Human(10,"john",(byte) 0);
        System.out.println(t3);
        AnnotationProcessors.reset(t3);
        System.out.println(t3);


        System.out.println(AnnotationProcessors.collect(Human.class));
    }

    public static List<Field> findFields(Class<?> cl){
        List<Field> fields = new ArrayList<>(List.of(cl.getDeclaredFields()));
        if(cl.equals(Object.class)){
            return List.of();
        }
        fields.addAll(findFields(cl.getSuperclass()));
        return fields;
    }
    

}
