package com.company;
/*
Scanner：用于键盘录入对象
         导包   创建对象    调用方法
System类下有一个静态的字段：public static final InputStream in;
      InputStream is=System.in;
      成员方法：
      public boolean hasNextxxx();判断是否是某种类型的元素
      public xxx nextxxx();获取该元素
      常用方法：public int nextInt();获取一个int类型的值
                 public String nextline();获取一个string类型的值

 */

import java.util.Scanner;

public class Scanner类 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextInt()){
            int x=sc.nextInt();
            System.out.println(x);
        }
        else{System.out.println("你所输入的数据有误");}
        /*
        Scanner sc1=new Scanner(System.in);
        int a=sc1.nextInt();
        String a2=sc1.nextLine();
        //先获取一个数值，在获取一个String类型的值，
        System.out.println(a+a2);
         */

    }
}
