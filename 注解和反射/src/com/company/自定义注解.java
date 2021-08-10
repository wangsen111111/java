package com.company;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class 自定义注解 {
    //注解可以显示赋值，如果没有赋值，我们必须给注解赋值
    @MyAnnotation2(age = 18,name = "某某")
    public void test(){

    }
    @MyAnnotation3("某某某")
    public void test2(){}
    public static void main(String[] args) {
    }
}
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
    //注解的参数： 参数类型+参数名();
    String name() default"";
    int age();
    int id() default -1;//如果默认值为-1，代表不存在
    String[] school() default{"大学","大大学"};
}
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3{
    String value();
}
