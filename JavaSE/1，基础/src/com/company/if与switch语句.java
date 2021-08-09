package com.company;
/*if语句和switch语句的区别：
if语句：a：针对结果是布尔类型的判断
       b;针对一个范围的判断
       c：针对几个常量值的判断
switch语句：针对几个常量值的判断
 */
/*
switch语句和if语句的区别有：if语句，表达式的结果是boolean类型常用于区间判断。
break 中断   continue 继续   return 返回
switch：表达式类型不能是boolean类型，可byte，int，char，String，枚举。

常用于等值判断选择语句的选择。能用switch语句实现的就一定可以使用if实现，但是反之不一定。如果是区间范围就采用if，如果是等值判断使用switch。
 */
import  java.util.Scanner; //导包
public class if与switch语句 {

    public static void main(String[] args) {
        //利用switch语句写一个星期几的语句
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入周几：");
        //录入数据
        int week = sc.nextInt();
        //switch语句
        {
            switch (week) {
                case 1:
                    System.out.println("今天是周一");
                    break;
                case 2:
                    System.out.println("今天是周二");
                    break;
                case 3:
                    System.out.println("今天是周三");
                    break;
                case 4:
                    System.out.println("今天是周四");
                    break;
                case 5:
                    System.out.println("今天是周五");
                    break;
                case 6:
                    System.out.println("今天是周六");
                    break;
                default:
                    System.out.println("今天是周天");
            }
        }
        //用if选择结构写一个成绩划分，90-100a，80-90b，70-80c，60-70d，
        // 小于60请输出不及格
        //score必须大于0
        System.out.println("请输入score：");
        int score=sc.nextInt();
        //if语句
        if(90<=score&&score<100){System.out.print("成绩等级为a");}
        else if(80<=score&&score<90){System.out.print("成绩等级为b");}
        else if(70<=score&&score<80){System.out.print("成绩等级为c");}
        else if(60<=score&&score<70){System.out.print("成绩等级为d");}
        else {System.out.print("不及格");}
    }
}