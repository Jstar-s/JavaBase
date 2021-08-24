package com.jstar;

import javax.annotation.Resource;
import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Jstar
 * @version 1.0
 * @date 2021/7/1 11:10 下午
 */
public class ReflectTest {
    @MyAnnotation(name = "Tom")
    public void test() {
    }

    @Deprecated
    @MyAnnotation(name = "jam")
    public void test2() {

    }


    public static void main(String[] args) throws ClassNotFoundException {
        // get Class object
        ReflectTest reflectTest = new ReflectTest();
        Class<?> aClass = reflectTest.getClass();

        // get annotation from object.method
        Method[] methods = aClass.getMethods();
        HashMap<String, String> MethodAnnotations = new HashMap<>();

        for (Method method : methods) {
            String annotation = "";
            //  filter condition of My own annotation
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation methodAnnotation = method.getAnnotation(MyAnnotation.class);
                annotation = methodAnnotation.name();
                MethodAnnotations.put(method.getName(), annotation);
            }

        }

        // Stream out
        MethodAnnotations.forEach((s, v) -> System.out.println( "Method name " + s + "annotation name " +  v));


        //  entrySet use test
        for (Map.Entry<String, String> stringStringEntry : MethodAnnotations.entrySet()) {
            System.out.println(stringStringEntry.getKey() + stringStringEntry.getValue());
        }
    }

    @Target({ElementType.METHOD, ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @interface MyAnnotation {

        // 参数
        String name();

    }

}
