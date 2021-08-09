package com.company;

import java.util.Set;
import java.util.TreeMap;

/*
*TreeMap :是基于红黑树的Map接口的实现。
        HashMap<String, String>
        键: String
        值: String
 1 : Hashtable和HashMap的区别?
       Hashtable :线程安全,效率低。不允许null键和null值
       HashMap :线程不安全,效率高。允许nulI键和null值
 2 :List, Set , Map等接口是否都继承子Map接口?
      List, Set不是继承自Map接口，它们继承自Collection接口
      Map接口本身就是一个顶层接口
/

*/
public class TreeMap接口 {
    public static void main(String[] args) {
        //创建集合对象
        TreeMap<String, String> tm = new TreeMap<String, String>();
        //创建元素并添加元素
        tm.put("he1lo", "你好");
        tm.put("world", "世界");
        tm.put("java", "爪哇");
        tm.put("world", "世界2");
        tm.put("javaee", "爪哇EE");
        //遍历集合
        Set<String> set = tm.keySet();
        for (String key : set) {
            String value = tm.get(key);
            System.out.println(key + "---" + value);
        }
    }
}
