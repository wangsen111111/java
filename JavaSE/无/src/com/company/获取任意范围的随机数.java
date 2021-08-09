package com.company;

import java.util.Scanner;

public class 获取任意范围的随机数 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("请输入你要获取随机数的范围是：");
    double i=sc.nextDouble();
    System.out.println((Math.random()*Math.pow(10,i))+1);
    }
}
