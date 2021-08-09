package com.company;
import java.util.Scanner;
import java.lang.String;
public class 将字符串大写转小写{
    public static void main(String[] args){
        //创建键盘录入对象
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        //创建字符串缓冲区对象
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            System.out.println("请输入你要输入的大写字符：");
            //拿到数组中的元素
            char ch=s.charAt(i);
            ch+=('a'-'A');
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}
