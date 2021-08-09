package com.company;
/*
增强for：简化数组和Collection集合的遍历(是用来替代迭代器的)
   格式：for(元素数据类型  变量：数组或Collection集合){
   使用变量即可，该变量就是元素}

   增强for其实是用来替代迭代器的
   好处：简化（数组和集合）遍历
   弊端：增强for的目标不能为null
   解决办法：对增强for的目标进行不为null的判断
         List<String> list=null;    //list底层封装了判断和获取功能
         for(String s:list){
         System.out.println(s);}  //s是list里面获取出来的，在获取前，先要做一个判断
 */

import java.util.ArrayList;
import java.util.Iterator;

public class 增强for {
    public static void main(String[] args) {
        //定义一个int数组
        int[] arr = {1, 2, 3, 4, 5};
        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);
        }
        System.out.println("----------------------");
        //增强for
        for (int x : arr) {
            System.out.println(x);//x为依次从数组arr中拿出的元素
        }
        System.out.println("----------------");
        //增强for遍历
        /*
        遍历：（
               迭代器
               普通for
               增强for
               ）
         */
        //定义一个集合
        ArrayList<String> array = new ArrayList<String>();
        array.add("李知恩");
        array.add("成德善");
        //增强for，这个s是我们从list里面获取出来的，在获取前，他换要做一个判断
        if (array != null) {
            for (String s : array) {
                System.out.println(s);
            }
        }
        //NullPointerException空指针异常 List<String>List=null;
        //增强for的目标不能为空
        /*
        ArrayList存储字符串并遍历，要求加入泛型，并用for遍历
         */
        //创建集合对象
        ArrayList<String> array1=new ArrayList<String>();
        //创建并添加元素
        array1.add("hello");
        array1.add("word");
        array1.add("java");
        /*
        遍历集合
         */
        //迭代器
        Iterator<String> it=array1.iterator();
        while (it.hasNext()){
            String s=it.next();
            System.out.println(s);
        }
        System.out.println("迭代器--------------------------");
        //普通for
        for(int x=0;x<array1.size();x++){
            String s=array1.get(x);
            System.out.println(s);
        }
        System.out.println("普通for--------------");
        //增强for
        for(String s:array1){
            System.out.println(s);
        }
    }
}
