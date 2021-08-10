package com.company;

import java.util.ArrayList;
import java.util.List;

//什么是注解
public class Main extends Object {
    @Override//重写的注解
    public String toString() {
        return super.toString();
    }
    @Deprecated//Deprecated不推荐使用，但是可以使用，或者存在更好的方式
    public static void test(){
        System.out.println("Deprecated");
    }
    @SuppressWarnings("all")//抑制警告信息
    public void test1(){
        List list=new ArrayList();
    }
    public static void main(String[] args) {
        test();
    }
}
