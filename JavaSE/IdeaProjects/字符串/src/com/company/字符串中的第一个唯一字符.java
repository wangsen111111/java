package com.company;
/*
给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。

示例：

s = "leetcode"
返回 0

s = "loveleetcode"
返回 2
 */
/*
分析：
     1，输入一个字符串
     2，将字符串转为字符数组，并遍历数组
     3，
         分析：可以用循环嵌套，先拿出第一个数与后面的数依次比较，如果没有与之相同的，则返回它的索引，然后以此类推，直到倒数第二个，如果没有的话返回-1
     4，
     5，
 */

import java.util.Scanner;

import static java.lang.String.valueOf;

public class 字符串中的第一个唯一字符 {
    public static void main(String[] args) {
        //输入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你所要输入的字符串：");
        String s = sc.nextLine();
        System.out.println(printArr(s));
    }

    //分析：可以用循环嵌套，先拿出第一个数与后面的数依次比较，有相同的跳出循环，进行下一次循环如果没有与之相同的，则返回它的索引，然后以此类推，直到倒数第二个，如果没有的话返回-1
    //可以顺序比较如果相同的话跳出此次循环，让接下来的数进行比较，直到顺序找到不相同的两个数，返回它的索引
    public static int printArr(String s) {
        for (int x = 0; x < s.length(); x++) {
            //获取字符串中的每一个字符
            char c1 = s.charAt(x);
            //将取出的字符和字符串里面的其他元素作比较
            for (int y = 0; y < s.length(); y++) {
                //获取字符串中的每一个字符
                char c2 = s.charAt(y);
                //如果两个数相同，并且两个元素怒索引不相同，直接就跳出循环，进行下一次循环
                if (c1 == c2 && x != y) {
                    break;
                } else if (y == s.length() - 1) {//如果没有相同，并且比到啦最后一个的就返回拿的值的索引，说明其中没有与它相同的元素
                    return x;
                }
            }
        }
        return -1;
    }
}