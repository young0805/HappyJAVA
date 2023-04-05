package com.example;

import java.lang.reflect.Method;

public class ClassLoderMain {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//        Bus b1 = new Bus();
//        b1.a();  ==> 결과값: a

        // a() 메소드를 가지고 있는 클래스가 있다
        // 이 클래스 이름이 아직 무엇인지 모르겠다
        // 나중에 이 클래스 이름을 알려주겠다
        // a() 메소드를 실행할 수 있도록 코드를 작성해라

        // className에 해당하는 클래스 정보를 CLASSPATH에서 읽어들이고,
        // 그 정보를 clazz가 참조하도록 한다
        String className = "com.example.SuperCar";
        Class clazz = Class.forName(className);
//        Method[] declaredMethods = clazz.getDeclaredMethods();
//        for(Method m: declaredMethods){
//            System.out.println(m.getName());
//            //  String className = "com.example.Bus"; 결과값: b c a
//        }
//        Object o = clazz.newInstance();
//        Bus b = (Bus)o;
//        b.a(); //   String className = "com.example.Bus"; 결과값: a

        Object o = clazz.newInstance();
        Car b = (Car)o;
        b.a();

    }
}
