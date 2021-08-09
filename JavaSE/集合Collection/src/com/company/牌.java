package com.company;
/*
模拟斗地主洗牌和发牌
分析：A:创建一个牌盒
     B:装牌
     C:洗牌
     D:发牌
     E:看牌
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class 牌 {
    public static void main(String[] args) {
        //创建一个牌盒
        ArrayList<String> array=new ArrayList<>();
        //定义一个花色数组
        String[] colors={"♠", "♥", "♣", "◆"};
        //定义一个点数数组
        String[] numbers= {"A", "2","3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        //装牌
        for(String color:colors){
            for(String number: numbers){
                array.add(color.concat(number));
            }
            array.add("小王");
            array.add("大王");
        }
        //洗牌
        Collections.shuffle(array);
        //洗完牌后为
        System.out.println("洗完后的牌为："+array);
        //发牌
        ArrayList<String> chengdeshan=new ArrayList<>();
        ArrayList<String> lizhie=new ArrayList<>();
        ArrayList<String> wangsen=new ArrayList<>();
        ArrayList<String> dipai=new ArrayList<>();
        for(int x=0;x<array.size();x++){
            if(x>=array.size()-3){
                dipai.add(array.get(x));
            }else if(x%3==0){
                chengdeshan.add(array.get(x));
            }else if(x%3==1){
                lizhie.add(array.get(x));
            }else if(x%3==2){
                wangsen.add(array.get(x));
            }
        }
        //看牌
        lookPoker("成德善",chengdeshan);
        lookPoker("李知恩",lizhie);
        lookPoker("王森",wangsen);
        lookPoker("底牌",dipai);

    }
    //看牌
    public static void lookPoker(String name,ArrayList<String> array){
        System.out.println(name+"的牌是：");
        for(String s:array){
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
