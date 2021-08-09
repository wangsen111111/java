package com.company;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
//创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要输入的字符为：");

        String s = sc.nextLine();
        System.out.println("start:"+s);
        System.out.println("end："+getLowerLow(s));

    }
    public static String getLowerLow(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a'&&ch<='z'){
                ch-=('a'-'A');
                sb.append(ch);
            }else if(ch>='A'&&ch<='Z'){
                ch+=('a'-'A');
                sb.append(ch);
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}