package com.company;
/*
Map集合遍历
●方式1:根据键找值:
       获取所有键的集合
       遍历键的集合，获取到每--个键
       根据键找值
●方式2:根据键值对对象找键和值:
       获取所有键值对对象的集合
       遍历键值对对象的集合，获取到每一个键值对对象
       根据键值对对象找键和值
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map集合的遍历 {
    public static void main(String[] args) {
/*
  Map集合的遍历
      Map --夫妻对
          思路:
              A:把所有的丈夫给集中起来。
              B:遍历丈夫的集合，获职得到每-一个丈夫。
              C:让丈夫去找自己的妻子。
          转换:
              A:获取所有的键
              B:遍历键的集合,获取得到每-一个键
              C:根据键去找值
*/
        // 创建集合对象
        Map<String, String> map = new HashMap<String, String>();
        //创建元素并添加到集合
        map.put("杨过", "小龙女");
        map.put("郭靖", "黄蓉");
        map.put("杨康", "穆念慈");
        map.put("陈玄风", "梅超风");
        // 遍历
        //获职所有的键
        Set<String> set = map.keySet();
        //遍历键的集合 ,获职得到每- 一个键
        for (String key : set) {
            //根据键去找值
            String value = map.get(key);
            System.out.println(key + "---" + value);
        }
        /*
 Map集合的遍历。
 Map --夫妻对
     思路:
        A :获取所有结婚证的集合
        B :遍历结婚证的集合,得到每-一个结婚证
        C :根据结婚证获取丈夫和妻子
     转换:
        A :获取所有键值对对象的集合
        B :遍历键值对对象的集合,得到每-一个键值对对象
        C :根据键值对对象获职键和值
        这里面最麻烦的就是键值对对象如何表示呢?entry实体
         Set <Map.Entry<K, v>> entrySet () :返回的是键值对对象的集合
         */
        //获取所有键值对对象的集合
        Set <Map. Entry<String, String>> set1 = map. entrySet () ;
         //遍历键值对对象的集合 ,得到每-一个键值对对象
        for (Map. Entry<String, String> me : set1) {
         //根据键值对对象获取键和值
            String key = me.getKey() ;
            String value = me.getValue () ;
            System. out.println(key+"----------"+value) ;
        }
    }
}
