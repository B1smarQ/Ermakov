package main;

import geometry.Line;
import geometry.Point2D;
import random.Human;
import random.HumanTests;
import reflexive.ObjectReader;
import reflexive.ObjectWriter;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import java.util.stream.Collectors;

import static reflexive.GeneralMethods.lineConnector;
import static reflexive.GeneralMethods.validate;
public class Starter {

    public static void main(String[] args) throws IOException, NoSuchFieldException, ClassNotFoundException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchMethodException {

        Human t = new Human(10, "Alice", (byte) 0);
        ObjectWriter o = new ObjectWriter();
        o.writeObject(t);
        System.out.println(t.getClass().getName());
        ObjectReader reader = new ObjectReader();
        Human t2 = (Human) reader.readObject("./random.Human");

        System.out.println(t2);
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
