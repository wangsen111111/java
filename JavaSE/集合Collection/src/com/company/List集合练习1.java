package com.company;
/*
定义一个栈集合类的  测试类
 */
/*
        LinkedList:请用LinkedList模拟栈数据结构的(集合),并测试
       提示： LinkedList的特有添加功能addFirst()和栈的特点先进后出
       题目意思：自己定义一个集合类，在这个集合类内部可以使用LinkedList模拟
*/

import java.util.Iterator;
import java.util.LinkedList;

public class List集合练习1 {
    public static void main(String[] args) {
        /*
    //创建集合对象
        LinkedList link=new LinkedList();
        //添加元素
        link.add("hello");
        link.add("word");
        link.add("java");
        //遍历
        Iterator it=link.iterator();
        while (it.hasNext()){
            String s=(String)it.next();
            System.out.println(s);
        }

         */
        //创建集合对象
        定义一个栈集合类 s = new 定义一个栈集合类();
        //添加元素
        s.add("hello");
        s.add("word");
        s.add("java");
        while (!s.isEmpty()) {
            System.out.println(s.get());
        }
    }
}
