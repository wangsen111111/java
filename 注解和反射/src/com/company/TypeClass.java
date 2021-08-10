package com.company;

import java.lang.annotation.ElementType;

//所有类型的class
public class TypeClass {
    public static void main(String[] args) {
        Class<Object> objectClass=Object.class;//类的Class
        Class aClass=Comparable.class;//接口的Class
        Class aClass2=String[].class;//数组的Class
        Class aClass3=int[][].class;
        Class aClass4=Override.class;//注解的Class
        Class aClass5= ElementType.class;//枚举类型的Class
        Class aClass6=Integer.class;//基本数据类型
        Class aClass7=void.class;//void类型的Class
        Class aClass8=Class.class;//Class本身的Class
        System.out.println(objectClass);
        System.out.println(aClass);
        System.out.println(aClass2);
        System.out.println(aClass3);
        System.out.println(aClass4);
        System.out.println(aClass5);
        System.out.println(aClass6);
        System.out.println(aClass7);
        System.out.println(aClass8);
    }
}
