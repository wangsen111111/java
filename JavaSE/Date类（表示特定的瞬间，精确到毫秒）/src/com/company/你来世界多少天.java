package com.company;
/*
你来这个世界多少天？
分析：
    A：键盘录入你的出生年月日
    B：把该字符串转换为一个日期
    C：通过该日期得到一个毫秒值
    D：获得当前的毫秒值
    E：用D-C得到一个毫秒值
    F：把E的毫秒值转换为年
      /1000/60/60/24
 */

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class 你来世界多少天 {
    public static void main(String[] args) throws ParseException {
        //键盘录入你的出生年月日
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的出生年月日：");
        String line=sc.nextLine();
        //把该字符串转为一个日期
        Date d=制作一个工具类Date.StringToDate(line,"yyyy年MM月dd日");
        System.out.println(d);
        //通过该日期得到一个毫秒值
        long myTime=d.getTime();
        // D：获得当前的毫秒值System.currentTimeMillis()
        long nowTime=System.currentTimeMillis();
        //通过D-C得到一个毫秒值
        long time=nowTime-myTime;
        //把它的毫秒值转化成年
        long day=time/1000/60/60/24;
        System.out.println("你来到这个世界"+day+"天");
    }
}
