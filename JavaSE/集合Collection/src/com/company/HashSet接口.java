package com.company;
/*
Set接口：（一个不包含重复元素的集合）
HashSet:它不保证Set的迭代顺序，特别是它不保证该顺序恒定不变
   Set无序，但是作为集合来说，它有它的存储顺序，
   而你的顺序恰好和它的存储顺序一致，这代表不了有序，可以多存储一些数据，就能看到结果
问题：HashSet存储字符串，字符串的内容存储了一个，通过查看add（）方法的源码，我们知道这个方法底层依赖的是
      2个方法：hashCode（）和equals（）方法
 哈希值相当于它的逻辑值，而地址值相当于它的物理值
步骤：
     首先比较哈希值
     如果相同，继续走，比较地址值或者走equals（）
     如果不同，就直接添加到集合中
按照方法步骤来说：
     先看hashCode（）值是否相同
              相同：继续走equals（）方法
                    返回是true：说明元素重复，就不添加
                    返回是false，说明元素不重复，添加到集合
               不同：就直接把元素添加到集合
如果类没有重写这两个方法，默认使用的是Object（），一般来说，哈希值不会相同，根本就不会继续判断，执行啦添加操作
而String重写了hashCode（）和equals（）方法，所以它就可以把内容相同的字符串去掉，只留下一个
（保证元素唯一性）
 */

import java.util.HashSet;

public class HashSet接口 {
   public static void main(String[] args){
//创建集合对象
       HashSet<Student> hs=new HashSet<>();
       //创建集合对象
       Student s1=new Student("王祖贤",18);
       Student s2=new Student("李知恩",19);
       Student s3=new Student("成德善",20);
       Student s4=new Student("李知恩",20);
       Student s5=new Student("李知恩",19);
       //添加元素
       hs.add(s1);
       hs.add(s2);
       hs.add(s3);
       hs.add(s4);
       hs.add(s5);
       //遍历集合
       for(Student s:hs){
           System.out.println(s.getName()+"----------------"+s.getAge());
       }
   }
}
