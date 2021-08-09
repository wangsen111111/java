package com.company;
/*
★
HashMap:是基于哈希表的Map接口实现。
        哈希表的作用是用来保证键的唯一性的。
1, HashMap<String, String>
   键: String
   值: String
2,HashMap<Integer, String>
   键: Integer
   值: String
3,HashMap<String,Student>
   键: String
   值：Student
4，HashMap<Student, String>
   键: Student
   要求:如果两个对象的成员变量值都相同,则为同一个对象。
   值: String
*/

import java.util.HashMap;
import java.util.Set;

public class HashMap接口 {
    public static void main(String[] args) {
        //创建集合对象
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        //创建元索并添加元索
        // Integer i = new Integer (27) ; .
        // Integer i = 27;
        // String s = "林青霞";
        // hm.put(i, s) ;
        hm.put(27, "林青霞");
        hm.put(30, "风洁扬");
        hm.put(28, "刘意");
        hm.put(29, "林青霞");
        //下面的写法是八进制 ,但是不能出现8以 上的单个数据
        // hm.put (003， "hello") ;
        // hm.put(006， "hello") ;
        // hm.put (007， "hello") ;
        // hm.put(008， "hello") ;
        // 遍历
        Set<Integer> set = hm.keySet();
        for (Integer key : set) {
            String value = hm.get(key);
            System.out.println(key + "------" + value);

        }
        //创建集合对象
        HashMap<Student, String> hm1 = new HashMap<Student, String>() ;
        //创建学生对象
        Student s1 = new Student ("貂蝉",27) ;
        Student s2 = new Student ("王昭君",30) ;
        Student s3 = new Student("西施", 33) ;
        Student s4 = new Student("杨玉环",35) ;
        Student s5 = new Student ("貂蝉",27) ;
        //添加元素
        hm1.put (s1, "8888") ;
        hm1.put (s2,"6666") ;
        hm1.put(s3,"5555") ;
        hm1.put (s4, "7777") ;
        hm1.put(s5,"9999") ;
        //遍历
        Set<Student> set1 = hm1. keySet () ;
        for (Student key : set1) {
            String value = hm1.get (key) ;
            System. out. println (key .getName() +"------"+  key.getAge() +"------"+ value) ;
        }

    }
}
