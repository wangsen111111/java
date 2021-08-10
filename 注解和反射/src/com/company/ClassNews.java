package com.company;

import sun.reflect.generics.scope.MethodScope;

import javax.swing.plaf.metal.MetalMenuBarUI;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//获取类的信息
public class ClassNews {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class aClass=Class.forName("com.company.User");
        //获得类的名字
        System.out.println(aClass.getName());//获得包名+类名
        System.out.println(aClass.getSimpleName());//获得简单类名
        //获得类的属性
        Field[] fields=aClass.getFields();//只能找到public属性
        fields=aClass.getDeclaredFields();//找到全部的属性
        for (Field field : fields) {
            System.out.println(field);
        }
        //获得指定属性的值
        Field name=aClass.getDeclaredField("name");
        System.out.println(name);
        System.out.println("---------------");
        //获得类的方法
        Method[] methods=aClass.getMethods();//获得本类及其父类的全部public方法
        for (Method method : methods) {
            System.out.println("正常的"+method);
        }
        methods=aClass.getDeclaredMethods();//获得本类的所有方法public 以及private
        for (Method method : methods) {
            System.out.println("getDeclaredMethods:"+method);
        }
        //获得指定方法  重载
        Method getName=aClass.getMethod("getName", null);
        Method setName=aClass.getMethod("setName", String.class);
        System.out.println(getName);
        System.out.println(setName);
        System.out.println("-------------获得指定的构造器-----------");
        Constructor[] constructors=aClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("public方法："+constructor);
        }
        constructors=aClass.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("获得本类的全部方法"+constructor);
        }
        //获得指定的构造器
        Constructor declaredConstructor = aClass.getDeclaredConstructor(String.class, int.class, int.class);
        System.out.println("指定的构造器"+declaredConstructor);

    }
}
