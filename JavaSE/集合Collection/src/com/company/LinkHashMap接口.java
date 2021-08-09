package com.company;

import java.util.LinkedHashMap;
import java.util.Set;

/*
LinkedHashMap :是Map接口的哈希表和链接列表实现,具有可预知的迭代顺序。
               由哈希表保证键的唯-性
               由链表保证键盘的有序(存储和取出的顺序-致)
 */
public class LinkHashMap接口 {
    public static void main(String[] args) {
        //创建集合对象
        LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();
        //创建并添加元索
        hm.put("2345", "hello");
        hm.put("1234", "world");
        hm.put("3456", "java");
        hm.put("1234", "javaee");
        hm.put("3456", "android");
        //遍历
        Set<String> set = hm.keySet();
        for (String key : set) {
            String value = hm.get(key);
            System.out.println(key + "---" + value);

        }
    }
}
