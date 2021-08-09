package com.company;
/*
集合遍历：依次获取集合中的每一个元素
         Object[] toArray()把集合转成数组，可以实现集合的遍历
迭代器：集合专用的遍历方式：Iterator iterator()
         Object next()获取元素，并移动到下一个位置
         //NoSuchElementException没有这样的元素，已到最后
         boolean hasNext()如果仍有元素可迭代，返回为true
         创建集合对象：
                 Collection c=new ArrayList();
    //集合专用的遍历方式：Iterator iterator()   、、Iterator 接口
    Iterator it=c.iterator();//实际返回的肯定是子类对象，这里是多态
    while(it.hasNext()){
    String s=(String)it.next();
    System.out.println(s);
    }
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class 集合的遍历  {
    public static void main(String[] args) {
        //创建集合对象
        Collection c=new ArrayList();
        //添加元素
        c.add("hello");
        c.add("word");
        c.add("java");
        /*
        //遍历   Object[] toArray()把集合转成数组，可以实现集合的遍历
        */
        Object[] obj=c.toArray();

        for(int i=0;i<obj.length;i++){
           // System.out.println(obj[i]);
            //Systrm.out.println(obj[i].length) Object没有length（）方法
             //我们要想使用字符串的方法，就必须把元素还原成字符串
            //向下转型
            String s=(String)obj[i];
            System.out.println(s+"------"+s.length());
        }
        /*
        遍历：集合专用的遍历方式：Iterator iterator()   、、Iterator 接口
         */
        Iterator it1=c.iterator();//这里返回的是子类对象，这里是多态
        while(it1.hasNext()){
            String s1=(String)it1.next();
            System.out.println(s1);
        }
    }
}
