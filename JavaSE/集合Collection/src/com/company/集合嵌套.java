package com.company;
/*
HashMap嵌套HashMap
韩剧
   jc   基础班:
          阿泽    20
          成德善     22
   jy   就业班:
          高清明     21
          满月   23
先存储元素,然后遍历元索
 */

import java.util.HashMap;
import java.util.Set;

public class 集合嵌套 {
    public static void main(String[] args) {
        //创建集合对象
        HashMap<String, HashMap<String, Integer>> hjMap = new HashMap<String, HashMap<String, Integer>>();
        //创建基础班集合对象
        HashMap<String, Integer> jcMap = new HashMap<String, Integer > ();
        //添加元索
        jcMap.put("阿泽", 20);
        jcMap.put("成德善", 22);
        //把基础班添加到大集合
        hjMap.put("jc", jcMap);
        //创建就业班集合对象
        HashMap<String, Integer> jyMap = new HashMap<String, Integer>();
        //添加元素
        jyMap.put("高清明", 21);
        jyMap.put("满月", 23);
        //把就业斑添加到大集合
        hjMap.put("jy", jyMap);
        //遍历集合
        Set<String> hjMapSet = hjMap.keySet();
        for (String hjMapKey : hjMapSet) {
            System.out.println(hjMapKey);
            HashMap<String, Integer> hjMapValue = hjMap.get(hjMapKey);
            Set<String> hjMapValueSet = hjMapValue.keySet();
            for (String hjMapValueKey : hjMapValueSet) {
                Integer hjMapValueValue = hjMapValue.get(hjMapValueKey);
                System.out.println("\t" + hjMapValueKey + "---" + hjMapValueValue);
            }
        }
    }
}
