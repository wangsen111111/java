package com.company;
/*
思路:
    A:创建-一个HashMap集合
    B:创建-一个ArrayList集合
    C :创建花色数组和点数数组
    D:从0开始往HashMap里面存储编号,并存储对应的牌
     同时往ArrayList里面存储编号即可。
    E:洗牌(洗的是编号)
    F:发牌(发的也是编号,为了保证编号是排序的,就创建TreeSet集合接收)
    G:看牌(遍历TreeSet集合,获职编号,到HashMap集合找对应的牌)

 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class 发到的牌按大小排序 {
    public static void main(String[] args) {
        // A:创建-一个HashMap集合
        HashMap<Integer, String> hm = new HashMap<>();
        //B:创建-一个ArrayList集合
        ArrayList<Integer> array = new ArrayList<>();
        //定义一个花色数组
        String[] colors = {"♠", "♥", "♣", "◆"};
        //定义一个点数数组
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        // D:从0开始往HashMap里面存储编号,并存储对应的牌
        //     同时往ArrayList里面存储编号即可。
        //从0开始往HashMap里 面存储编号,并存储对应的牌,同时往ArrayLi s t里面存储编号即可。
        int index = 0;
        for (String number : numbers) {
            for (String color : colors) {
                String poker = color.concat(number);
                hm.put(index, poker);
                array.add(index);
                index++;
            }
        }
        hm.put(index, "小王");
        array.add(index);
        index++;
        hm.put(index, "大王");
        array.add(index);
        //洗牌(洗的是编号)
        Collections.shuffle(array);
        //发牌(发的也是编号,为了保证编号是排序的,就创建TreeSet集合接收)
        TreeSet<Integer> fengQingYang = new TreeSet<Integer>();
        TreeSet<Integer> linQingXia = new TreeSet<Integer>();
        TreeSet<Integer> liuYi = new TreeSet<Integer>();
        TreeSet<Integer> diPai = new TreeSet<Integer>();
        for (int x = 0; x < array.size(); x++) {
            if (x >= array.size() - 3) {
                diPai.add(array.get(x));
            } else if (x % 3 == 0) {
                fengQingYang.add(array.get(x));
            } else if (x % 3 == 1) {
                linQingXia.add(array.get(x));
            } else if (x % 3 == 2) {
                liuYi.add(array.get(x));
            }
        }
        //看牌
        lookPoker("风清扬", fengQingYang, hm);
        lookPoker("林青霞", linQingXia, hm);
        lookPoker("刘毅", liuYi, hm);
        lookPoker("底牌", diPai, hm);

    }

    //写看牌的功能
    public static void lookPoker(String name, TreeSet<Integer> ts, HashMap<Integer, String> hm) {
        System.out.print(name + "的牌是: ");
        for (Integer key : ts) {
            String value = hm.get(key);
            System.out.print(value + " ");
        }
        System.out.println();

    }
}
