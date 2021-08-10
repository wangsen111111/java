package com.company;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//动态的创建对象，通过反射
public class DynamicCreateObject {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //获得Class对象
        Class aClass=Class.forName("com.company.User");
        //构造一个对象
        User user=(User)aClass.newInstance();//本质上是调用了类的无参构造器
        System.out.println(user);
        //通过构造器创建对象
        Constructor constructor=aClass.getDeclaredConstructor(String.class,int.class,int.class);
        User user2=(User)constructor.newInstance("王某某",007,18);
        System.out.println(user2);
        System.out.println("-----------通过反射调用普通方法----------");
        User user3=(User)aClass.newInstance();
        //通过反射获取一个方法
        Method setName=aClass.getDeclaredMethod("setName", String.class);
        //invoke；激活的意思(对象，“方法的值”)
        setName.invoke(user3,"王某某");
        System.out.println(user3.getName());

        System.out.println("-----------通过反射操作属性----------");
        User user4=(User)aClass.newInstance();
        Field name=aClass.getDeclaredField("name");
        //User with modifiers "private"属性私有，不能直接访问
        //取消安全检测
        //不能直接操作私有属性，需要先关闭程序的安全检测，属性或者方法的setAccessible(true)
        name.setAccessible(true);
        name.set(user4,"王某某某");
        System.out.println(user4.getName());




    }
}
