package com.company;
/*
正则表达式：符合一定规则的字符串
public boolean maches（String regex）告知此字符串是否匹配给定的正则表达式
        是指一个用来描述或者匹配一系列符合某个语法规则的字符串的单个字符串
  字符：   x 字符x             \n换行符
           \\反斜杠字符        \r回车符
   字符类：   [abc] a b或c（简单类）     [0-9]0-9的字符都包括
              [^abc]任何字符，除abc除外（否定）
              [a-zA-Z]a到z或A到Z，z头的字母包括在内（范围）
    预定字符类： .任意字符 它本身：（\.）
                 \d数字：【0-9】  --》java中\是转义字符前导符
                 \w单词字符[a-zA-Z_0-9]
                    在正则表达式里面组成单词的东西必须由这些东西组成
     边界匹配器：  ^行的开头
                  &行的结尾
                  \b单词边界（就是不是单词的地方）
      Greedy数量词： x？  x一次或一次也没有
                     x*   x0次或多次
                     x+    x一次或多次
                     x{n}   x恰好nci
                     x{n,]   x至少n次
                     x{n，m}   x至少n次，但是不超过m次
       判断功能：public boolean matches(String regex)
       分割功能：public String[] split(String regex)
       替换功能：public String replaceAll(String regex,String replacement)
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    /*
    判断功能：public boolean matches(String regex)
    校验邮箱：1813024293@qq。com
    分析； 1，键盘录入一个邮箱
            2，写一个功能实现
            3，调用功能输出结果
     */
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的邮箱：");
        String email=sc.nextLine();
        //定义邮箱的规则
        String regex="[a-zA-Z_0-9]+@[a-zA-Z_0-9]{2,6}\\.[a-zA-Z_0-9]{2,3}";
        //调用功能，判断即可
        boolean flag=email.matches(regex);
        //输出结果
        System.out.println(flag);
        /*
        分割功能：public String[] split(String regex)
             将“aa bb cc”分割开
         */
        //定义一个字符串
        String s1="aa bb cc";
        //直接分割
        String[] strArray=s1.split(" +");
        for(int x=0;x<strArray.length;x++){
            System.out.println(strArray[x]);
        }
        /*
    要求如下：“91 27 46 38 50”请用代码实现：“27 38 46 50 91”
    分析：1，定义一个字符串
          2，把字符串进行分割，得到一个字符串数组
          3，把字符串数组转为int类型数组
          4，把排序后的int类型数组转成一个字符串
          5，输出字符串
     */
        //1，定义一个字符串
        String s = "91 27 46 38 50";
        //把字符串进行分割，得到一个字符串数组
        String[] strArray1=s.split(" +");
        //把字符串数组变成int类型数组
        int[] arr = new int[strArray1.length];
        for(int x=0;x<arr.length;x++){
            arr[x]=Integer.parseInt(strArray1[x]);
        }
        //对int数组排序
        Arrays.sort(arr);
        //把排序后的int数组组装成一个字符串
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]).append(" ");
        }
        //转换为字符串
        String result=sb.toString().trim();
        //输出字符串
        System.out.println(result);
        /*
        替换功能：
            public String replaceAll（String regex，String replacement）
         */
        //定义一个字符串
        String ss="hello12345678910word";
        //去除所有数字，用*号替代
        String regex1="\\d";
        String sss="*";
        String result1=ss.replaceAll(regex1,sss);
        System.out.println(result1);
    }


}
