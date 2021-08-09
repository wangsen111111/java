package com.company;
/*
存储String和Integer两种类型数据：
     {遍历时，都当做String类型，做啦转换，编译期间没报错，只有黄色警告线，可能会出安全问题
       {数组：String[] strArray=new String[3];
         {集合也模仿着数组这种做法，在创建对象的时候明确啦元素的数据类型------》这个技术就被称为泛型
           {泛型：是一种把类型明确的工作推迟到创建对象或者调用方法的时候才去明确的特殊的类型，参数化类型，把类型当做参数一样的传递（避免啦强制类型转换）
             }
      格式：<数据类型>此处的数据类型只能是引用类型（参数化类型）
      类 接口 抽象类后面跟着有<E>就说要使用泛型，一般在集合中使用
      {
      泛型如果明确写的时候，前后必须一致
      <?>任意的类型都是可以的，如果没明确，那么就是Object类以及任意的java类啦
      }
<?extendsE>向下限定，E及其子类
<?superE>向上限定，E及其父类
 */

import java.util.ArrayList;
import java.util.Iterator;

public class 泛型{
    public static void main(String[] args){
//创建
ArrayList<String> array=new ArrayList<String>();
//添加字符串元素
        array.add("hello");
        array.add("word");
        array.add("java");
        //遍历
        Iterator<String> it=array.iterator();
        while(it.hasNext()){
            String s=it.next();
            System.out.println(s);
        }
        System.out.println("------------------------");
        for(int x=0;x<array.size();x++){
            String s=array.get(x);
            System.out.println(s);
        }
        //创建集合对象
        ArrayList<Student类> array1=new ArrayList<Student类>();
        //创建元素对象
        Student类 s1=new Student类("李知恩",18);
        Student类 s2=new Student类("李知恩",19);
        Student类 s3=new Student类("李知恩",20);
        //添加元素
        array1.add(s1);
        array1.add(s2);
        array1.add(s3);
        System.out.println("-------------------------------");
        //遍历
        Iterator<Student类> it1=array1.iterator();
        while(it1.hasNext()){
            Student类 s=it1.next();
            System.out.println(s.getName()+"----------"+s.getAge());
        }
        System.out.println("------------------------");
        for(int x=0;x<array1.size();x++){
            Student类 s=array1.get(x);
            System.out.println(s.getName()+"---------"+s.getAge());
        }
        /*
        定义泛型方法（接什么就是什么类型）
        public <T> void show(T t){
            System.out.println(t);
        }
         */
        /*
        泛型通配符
             <?>任意类型都是可以的
             <? extends E>向下限定，E及其子类
             <? super E>向上限定，E及其父类
         */

    }
}
