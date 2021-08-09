package com.company;
import java.util.Scanner;
import java.lang.String;
public class 字符串大写转小写{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //迭代器（集合）
        System.out.println("请输入你要输入的字符串为：");
        while(sc.hasNext())
        {
            String s=sc.next();
            //将字符串中的大写字母转为小写
            System.out.println(s.toLowerCase());
        }
    }
}

