package com.company;
/*
Concurrent(并发的)Modification（修改）Exception[面试题：此异常你见过吗？]
当方法检测到对象的并发修改，但不允许这种修改时，抛出异常
产生的原因：
      迭代器是依赖与集合而存在的，在判断成功后，集合中添加了元素
      而迭代器却不知道，所以就报错啦，这个错误叫：  并发修改异常
      迭代器遍历元素的时候，通过集合是不能修改元素的
解决方法：A：迭代器迭代元素，迭代器修改元素
             而Iteration迭代器却没有添加功能，所以我们使用其子接口ListIterator
                   元素是跟在刚才迭代的元素后面
          B：集合遍历元素，集合修改元素（普通for）
 */

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class 并发修改异常 {
    public static void main(String[] args) {
 //创建List集合对象
        List list=new ArrayList();
        //添加元素
        list.add("hello");
        list.add("word");
        list.add("java");
        /*
        A：迭代器迭代元素，迭代器修改元素
             而Iteration迭代器却没有添加功能，所以我们使用其子接口ListIterator，它有添加功能
         */
        ListIterator lit=list.listIterator();
        while (lit.hasNext()){
            String s=(String)lit.next();
            if("word".equals(s)){
                lit.add("javase");
            }
        }
        System.out.println(list);
        /*
        B：集合遍历元素，集合修改元素（普通for）
         */
        System.out.println("*******************");
        for(int i=0;i<list.size();i++){
            String s=(String)list.get(i);
            if("word".equals(s)){
                list.add("javase");
            }
        }
        System.out.println(list);


    }
}
