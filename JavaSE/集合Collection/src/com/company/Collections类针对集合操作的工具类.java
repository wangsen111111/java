package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Collections :是针对集合进行操作的工具类,都是静态方法。
面试题:
      Collection和Collections的区别?
          Collection :是单列集合的顶层接口,有子接口List和Set.
          Collections :是针对集合操作的工具类，有对集合进行排序和二分查找的方法
要知道的方法：
public static <T> void sort (List<T> list) :排序，默认情况下是自然顺序。
public static <T> int binarySearch(List<?> list,T key) :二分查找
public static <T> T max (Collection<?> col1) :最大值
public static void reverse (List<?> list) :反转
public static void shuffle (List<?> list) :随机置换（shuffle 洗牌）


 /*
  Collections可以针对ArrayList存储基本包装类的元索排序,
  存储自定义对象可不可以排序呢?
 */
public class Collections类针对集合操作的工具类 {
    public static void main(String[] args) {
        //创建集合对象
        List<Student> list = new ArrayList<Student>();
        //创建学生对象
        Student s1 = new Student("林青霞",27);
        Student s2 = new Student("李知恩",30);
        Student s3 = new Student("成德善",28);
        Student s4 = new Student("金正八",29);
        Student s5 = new Student("林青霞",27);
        //添加元索对象
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        //排序
        //自然排序
        // Collections.sort (list) ;
        //比较器排序.
        //如果同时有自然排序和比较器排序, 以比较器排序为主
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s2.getAge() - s1.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName())
                        : num;
                return num2;
            }
        });
        //遍历集合
        for (Student s : list) {
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}
