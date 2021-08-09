package com.company;

import java.util.*;

public class List的三个子类 {
    public static void main(String[] args) {
/*
ArrayList的使用： 使用List的任何子类存储字符串或者存储自定义对象并遍历
 */
/*
ArrayList的使用：存储字符串并遍历
 */
//创建集合对象
        ArrayList array=new ArrayList();
        //创建元素对象，并添加元素
        array.add("hello");
        array.add("world");
        array.add("java");
        //遍历(迭代器)
        Iterator it=array.iterator();
        while (it.hasNext()){
            String s=(String)it.next();
            System.out.println(s);
        }
        //遍历（for）
        for(int i=0;i<array.size();i++){
            String s=(String)array.get(i);
            System.out.println(s);
        }
        System.out.println("---------------------");
 /*
ArrayList的使用：存储自定义对象并遍历
 */
 //创建集合对象
        ArrayList array1=new ArrayList();
        //创建学生对象
        Student s1=new Student("成德善",18);
        Student s2=new Student("阿泽",19);
        Student s3=new Student("狗焕",20);
        //添加元素
        array1.add(s1);
        array1.add(s2);
        array1.add(s3);
        //遍历
        Iterator it1=array1.iterator();
        while (it1.hasNext()){
            //ClassCastException 注意：类型转换异常
            Student ss=(Student)it1.next();
            System.out.println(ss.getName()+"-----------"+ss.getAge());
        }
        /*
Vector的特有功能：
     1，添加功能：public void addElement(Object obj)---->add()
     2,获取功能：public Object elementAt(int index)---->get()
     3,public Enumeration elements()//（迭代器）Iterator iterator()
     {
     boolean hasMoreElements()----->hasNext()
     Object nextElement()----->next()
     }

 */
        //创建集合对象
        Vector v=new Vector();
        //添加功能
        v.add("hello");
        v.add("word");
        v.add("java");
        v.addElement("java");
        //遍历
        Enumeration en=v.elements();//返回的是实现类的对象
        while (en.hasMoreElements()){
            String sss=(String)en.nextElement();
            System.out.println(sss);
        }
        /*
        LinkedList()的特有功能：
           1，添加功能
           {
           public void addFirst(Object e)
           public void addLast(Object e)
           }
           2,获取功能：
           {
           public Object getFirst()
           public Object getLast()
           }
           3，
           删除功能
           {
           public Object removeFirst()
           public Object removeLast()
           }
         */
        System.out.println("------------");
        //创建集合对象
        LinkedList link=new LinkedList();
        //添加元素
        link.add("hello");
        link.add("word");
        link.add("java");
        System.out.println(link.removeLast());
        System.out.println("----------");
        System.out.println(link);

    }
}
