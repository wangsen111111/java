package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class List集合练习 {
    public static void main(String[] args) {
        /*
        ArrayList去除集合中的重复值(字符串的内容相同)
        分析：1，创建集合对象
              2，添加多个字符串对象
              3,创建新集合对象
              4，遍历旧集合，获取到每一个元素
              5，拿这个元素到新集合中去找，看有没有
                   有的话，就不管了
                   没有的话，就把这个元素添加到新集合中
              6，遍历新集合

         */
        //创建集合对象
        ArrayList array = new ArrayList();
        //添加多个字符串元素（包含内容相同）
        array.add("hello");
        array.add("word");
        array.add("java");
        array.add("java");
        array.add("java");
        //创建新集合
        ArrayList newArray = new ArrayList();
        //遍历旧集合,获得每一个元素
        Iterator it = array.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            //拿这个元素到新集合中去找看有没有
            if (!newArray.contains(s)) {
                newArray.add(s);
            }

        }
        //遍历新集合
        for (int x = 0; x < newArray.size(); x++) {
            String s = (String) newArray.get(x);
            System.out.println(s);
        }
        /*
          ArrayList去除集合中的重复值(字符串的内容相同)
          要求：不能创建新的集合，就在以前的集合上做
        由选择排序思想引入，拿0索引的依次和后面的比较，有就把后面的移除
        //移除的元素由于在栈中，所以后面的元素弹栈，补上啦它的位置，所以后面相同的没被删除还跟啦一个一样的
        //解决办法：可以将去除的先y--再进入for循环y++相当于不变
         */
        System.out.println("--------------------------");
        for (int x = 0; x < array.size() - 1; x++) {
            for (int y = x + 1; y < array.size(); y++) {
                if (array.get(x).equals(array.get(y))) {
                    array.remove(y);
                    y--;
                }
            }
        }
        //遍历集合
        Iterator it1 = array.iterator();
        while (it1.hasNext()) {
            String ss = (String) it1.next();
            System.out.println(ss);
        }
        /*
        需求：去除集合中自定义对象的重复值（对象成员变量值都相同）
         */
        //创建集合对象
        ArrayList array1 = new ArrayList();
        //创建学生对象
        Student s1 = new Student("李知恩", 18);
        Student s2 = new Student("王祖贤", 19);
        Student s3 = new Student("成德善", 20);
        Student s4 = new Student("李知恩", 18);
        //添加元素
        array1.add(s1);
        array1.add(s2);
        array1.add(s3);
        array1.add(s4);
        /*
          ArrayList去除集合中的重复值(字符串的内容相同)
          要求：不能创建新的集合，就在以前的集合上做
        由选择排序思想引入，拿0索引的依次和后面的比较，有就把后面的移除
        //移除的元素由于在栈中，所以后面的元素弹栈，补上啦它的位置，所以后面相同的没被删除还跟啦一个一样的
        //解决办法：可以将去除的先y--再进入for循环y++相当于不变
         */
        System.out.println("--------------------------");
        for (int x = 0; x < array1.size() - 1; x++) {
            for (int y = x + 1; y < array1.size(); y++) {
                /*
                出问题啦，相同的照样输出（原因在判断上）
                而这个判断是集合自己提供的，contains（）方法的底层依赖的是equals（）方法
                 而我们的学生类里面并没有equals()方法，这个时候，默认使用的是Object的equals（）方法
                 Object（）的equals（）默认的是比较的是地址值，因为new的东西地址值都不同
                 解决办法：重写equals（）方法
                 */
                if (array1.get(x).equals(array1.get(y))) {
                    array1.remove(y);
                    y--;
                }
            }
        }
        //遍历集合
        Iterator it2 = array1.iterator();
        while (it2.hasNext()) {
            Student ss = (Student) it2.next();
            System.out.println(ss);
        }


    }
}
