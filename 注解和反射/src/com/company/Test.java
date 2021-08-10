package com.company;

import javax.xml.bind.Element;
import java.lang.annotation.*;

//测试元注解
@MyAnnotation
public class Test {
    public static void main(String[] args) {

    }
}

//Target表示我们的注解可以用在哪些地方
@Target(value = {ElementType.METHOD, ElementType.TYPE})

//@Retention在什么地方有效
//RUNTIME>CLASS>SOURCES
@Retention(value = RetentionPolicy.RUNTIME)

//@Documented 表示是否将我们的注解生成在Javadoc文档中
@Documented

//@Inherited 子类可以继承父类的注解
@Inherited
//定义一个注解
@interface MyAnnotation{

}
