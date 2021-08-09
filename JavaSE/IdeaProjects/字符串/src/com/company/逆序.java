package com.company;
/*
输入: "the sky is blue"
输出: "blue is sky the"
   分析：可以先将此字符串站位字符串数组
 */

import java.util.Arrays;
import java.util.Stack;

import static java.lang.String.valueOf;

public class 逆序 {
    public static void main(String[] args) {
        String str="abcd";
        System.out.println(solve(str));

    }
    public static String solve (String str) {
        char[] stringChar=str.toCharArray();
        StringBuilder stringBuilder=new StringBuilder(str.length());
        Stack stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            stack.push(stringChar[i]);
        }
        while(stack!=null){
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }
}
