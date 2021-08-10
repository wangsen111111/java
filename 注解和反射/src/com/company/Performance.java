package com.company;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//分析性能问题
public class Performance {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        test1();
        test2();
        test3();
    }
    //普通方式调用
    public static void test1(){
        User user1=new User();
        long startTime=System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            user1.getName();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("普通方式调用执行1亿次时间为："+(endTime-startTime)+"ms");
    }
    //反射方式调用
    public static void test2() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //获得Class对象
        Class aClass=Class.forName("com.company.User");
        //构造一个对象
        User user2=(User)aClass.newInstance();//本质上是调用了类的无参构造器
        //通过反射获取一个方法
        Method getName=aClass.getDeclaredMethod("getName");
        long startTime=System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            getName.invoke(user2,null);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("反射方式调用执行1亿次时间为："+(endTime-startTime)+"ms");
    }
    //反射方式调用，关闭检测
    public static void test3() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //获得Class对象
        Class aClass=Class.forName("com.company.User");
        //构造一个对象
        User user3=(User)aClass.newInstance();//本质上是调用了类的无参构造器
        //通过反射获取一个方法
        Method getName=aClass.getDeclaredMethod("getName");
        getName.setAccessible(true);
        long startTime=System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            getName.invoke(user3,null);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("关闭检测后反射方式调用执行1亿次时间为："+(endTime-startTime)+"ms");
    }
}
