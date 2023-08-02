package com.gap.sample.practice.custome.annotations;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Animal {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Cat cat  = new Cat("Meow");

        if(cat.getClass().isAnnotationPresent(CustomAnnotation.class)){
            System.out.println("annoation present");
        }else{
            System.out.println("Annoation not present");
        }

       // Dog dog = new Dog();

        for(Field field : cat.getClass().getDeclaredFields()){
            if(field.isAnnotationPresent(CustomAnnotationOnField.class)){
                Object object = field.get(cat);

                if(object instanceof String){
                    System.out.println(object.toString().toUpperCase());
                }
            }


        }


        for(Method method : cat.getClass().getDeclaredMethods()){

            if(method.isAnnotationPresent(CustomerAnnotationOnMethod.class)){
                //System.out.println("Present");
                CustomerAnnotationOnMethod numberOfTimes = method.getAnnotation(CustomerAnnotationOnMethod.class);

                for(int i=0;i<numberOfTimes.times();i++){
                    method.invoke(cat);
                }
            }

        }

    }


}
