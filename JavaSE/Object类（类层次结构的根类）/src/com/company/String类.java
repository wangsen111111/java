package com.company;
/*
字符串（常量）一旦被赋值，就不能改变
字符串直接赋值的方式先到字符串常量池里面去找，如果有就直接返回，如果没有，就直接创建并返回
构造方法：   public String()空构造
             public String（byte[] bytes）把字节数组转换为字符串
           public String（byte[] bytes,int index，int length）把字节数组的一部分转成字符串
           char 字符数组 public String（char[] value）

           字符串如果是变量相加，先开空间，再拼接
           如果是常量相加，是先加，然后在常量池里面找，如果有就直接返回，否则就创建
 */

import java.util.Scanner;

public class String类 {
    public static void main(String[] args) {
        //把字节数组转为字符串
        byte[] byt={97,98,99,100,101};
        String str=new String(byt);
        System.out.println(str);
        System.out.println("------------");
        //得到bcd
        String str1=new String(byt,1,3);
        System.out.println(str1);
        System.out.println("--------------------------------");
        /*
        字符串第一大功能：判断功能
              boolean equals(Object obj)比较字符串内容是否相同，区分大小写
               boolean equals IgnoreCase(String str)比较字符串内容是否相同，
               boolean contains(String str)判断字符串是否包含小字符串
               boolean startWith(String str)判断字符串是否以某个指定的字符串开头

         */
        String s1="Helloword";
        String s2="HelloWord";
        String s3="word";
        System.out.println(s1.equals(s2));//比较字符串内容是否相同，区分大小写
        System.out.println(s1.equalsIgnoreCase(s2));//比较字符串内容是否相同，忽略大小写
        System.out.println(s1.startsWith("H"));
        System.out.println(s1.contains(s3));
        /*
        模拟登陆，给三次机会for（），并提示还有几次机会
           1定义用户名和密码2，键盘录入用户名和密码
           3比较用户名，和密码（如果相同，则登陆成功，如果有一个不同，则登陆失败
         */
        //定义用户名和密码
        String username="用户名";
        String password="密码";
        //比较用户名和密码
        for(int x=0;x<3;x++){
            //请输入用户名和密码
            Scanner sc5=new Scanner(System.in);
            System.out.println("请输入用户名：");
            String name=sc5.nextLine();
            System.out.println("请输入密码为：");
            String word=sc5.nextLine();
            if(name.equals(username)&&word.equals(password)){
                System.out.println("登陆成功！");
            }else if((2-x)==0){System.out.println("您的账号已被冻结！");}
            else{System.out.println("登陆失败，你换有"+(2-x)+"次机会");}
        }






    }
}
