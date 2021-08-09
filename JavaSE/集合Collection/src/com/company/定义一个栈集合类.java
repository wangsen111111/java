package com.company;

import java.util.LinkedList;

/**
 * 自定义的栈集和
 * @auther 三木
 * @version V1.0
 */

public class 定义一个栈集合类 {
    //定义成员边量，默认值是null
    private LinkedList link;
    //构造方法初始化成员边量,使用这个集合造对象时，造的是LinkedList link的对象
    public 定义一个栈集合类(){
    link=new LinkedList();
    }
    public void add(Object obj){
     link.addFirst(obj);
    }
    public Object get(){
        return link.removeFirst();
    }
    //判断元素是否为空
    public boolean isEmpty(){
        return link.isEmpty();
    }
}
