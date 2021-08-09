package com.company;
/*
List集合：(Arrays工具类中的asList（）方法)
        public static<T> List<T> asList(T...a):把数组转成集合
        List<Stirng> list=Arrays.asList("hello","word","java");
        本质上是一个数组，长度一定
            所以：add（）或remove（）增加或删除  //UnsupportedOperationException不支持的操作异常
            set（）可修改

 */

import java.util.Arrays;
import java.util.List;

public class asList方法把数组转成集合 {
    public static void main(String[] args){
        /*
//定义一个数组
        String[] strArray={"hello","word","java"};
        List<String> list= Arrays.asList(strArray);
         */
        List<String> list= Arrays.asList("hello","word","java");
        list.set(2,"javaSE");
        //遍历集合
        for(String s:list){
            System.out.println(s);
        }
    }
}
