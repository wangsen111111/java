package com.company;
/*
输入: "the sky is blue"
输出: "blue is sky the"
   分析：可以先将此字符串站位字符串数组
 */

import java.util.Scanner;

public class 反转单词 {
    public static void main(String[] args) {
        //输入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你所要输入的字符串：");
        String s = sc.nextLine();
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {

        //按空格进行切割
        String[] arr = s.split(" ");

        //创建需要的长度StringBuilder//StringBuilder sb=new StringBuilder();创建缓冲区对象
        StringBuilder sb =  new StringBuilder(arr.length);

        //循环添加进去
        for (int i = arr.length - 1; i >= 0; i--) {
            //判断如果不是""就添加进去,并且加个空格
            if (!arr[i].equals("")) {//从最后一个开始向前遍历，并将其拼接
                sb.append(arr[i]).append(" ");
            }
        }
        //删除前后所有的空格trim()   //toString把字符串数组转换为字符串输出
        return sb.toString().trim();

    }
}