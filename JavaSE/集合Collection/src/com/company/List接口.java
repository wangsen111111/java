package com.company;
/*
有序的Collection（也称为序列）
此接口的用户可以对列表中每一个元素的插入位置进行精确的控制

特有功能：
添加：void add(int index,Object element)在指定位置添加元素
获取：Object get(int index)获取指定位置的元素
列表迭代器：ListIterator listIterator() List集合特有的迭代器
删除功能：Object remove(int index):根据索引删除元素，返回被删除的元素
修改元素：Object set(int index,Object element)：根据索引修改元素，返回被修改的元素


 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List接口 {
    public static void main(String[] args) {
      //创建集合对象
        List list=new ArrayList();
        //添加元素
        list.add("hello");
        list.add("word");
        list.add("java");
        System.out.println(list);
        //修改元素：Object set(int index,Object element)：根据索引修改元素，返回被修改的元素
        System.out.println(list.set(1,"java"));
        System.out.println(list);
        /*
        List集合特有的迭代器：ListIterator listIterator()//列表迭代器
            Listerator lit=list.listIterator();//子类对象
            （该迭代器继承自Iteration迭代器，所以可直接使用hasNext（）和 next（）方法）
        判断功能和获取功能应该是一个集合遍历所具备的，而每种集合的方式又不太一样，
        所以我们把这两种功能提取出来，并不提供具体实现，这就是接口
        真正具体的实现类在真正的具体的子类中，以内部类的方式体现的
         */
        System.out.println("-----------------");
        for(int x=0;x<list.size();x++){
            String s=(String)list.get(x);
            System.out.println(s);
        }
        System.out.println("*****************");
        //List集合特有的迭代器：ListIterator listIterator()//列表迭代器
        ListIterator lit=list.listIterator();//子类对象
        while(lit.hasNext()){
            String s=(String)lit.next();
            System.out.println(s);
        }
        /*
        List特有功能：Object previous()获取上一个元素、、倒着遍历
                      boolean hasPrevious()判断是否有元素
               ListIteration可实现逆向遍历，但必须先正向遍历（一般不适用）
         */
        System.out.println("/////////////////////");
        while (lit.hasPrevious()){
            String s=(String)lit.previous();
            System.out.println(s);
        }
    }
}
