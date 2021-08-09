package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s;//声明字符串s
        char ziFu;
        int nDig, nChar, nOther;
        nDig = nChar = nOther = 0;
        Scanner reader = new Scanner(System.in);
        System.out.print("请输入字符串：");
        s = reader.nextLine();
        for (int i = 0; i < s.length(); i++) {
            ziFu = s.charAt(i);// 取出第i个位置的字符，赋值给c
            if ('a' <= ziFu && ziFu <= 'z' || 'A' <= ziFu && ziFu <= 'Z') //如果c是字母
                nChar++;
            else if (ziFu >= '0' && ziFu <= '9')
                nDig++;
            else
                nOther++;
        }
        System.out.println("字符串中含有字母：" + nChar + "个");
        System.out.println("字符串中含有数字：" + nDig + "个");
        System.out.println("字符串中含有其他符号：" + nOther + "个");
    }
}
