package com.company;

import java.util.Scanner;

/*
题目;打出一个菱形；
分析：1，菱形的边数未告诉，故先要创建键盘输入对象，输入一个数，来打出一个几边菱形
           具体做法：首先得导入用的包,然后创建键盘输入对象，以此来输入一个几边的菱形
      2,   分析如何写一个输出菱形的方法：先画图，再分析。空格用0先代替
       分析：     0（空格）      *（*）      （行数）   由图可得：1，空格数= 总行数-第几行（n）=n-i
       000*       3               1             1                2，（*）号数=2*行数-1
上半部 00***      2               3             2                 3，上半部分由此可得，空格0在前，先输出空格，利用for循环
       0*****     1               5             5                   4，再输出*，也是用个for循环，故需要两个for循环嵌套
       *******    0               7             4
       。。。。。。。。。。。。。。。。。。。。。。。
下半部分0*****     1               5             5
       00***      2               3             6
       000*       3               1             7
 */
public class 菱形2 {
    public static void main(String[] args) {
        //创建键盘输入对象，输入一个n边形
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你所要输出的数字：");
        int n = sc.nextInt();
        //调用lingLing方法
        lingXing(n);

    }

    //写一个lingXing方法
    public static void lingXing(int n) {
        //上半部分菱形利用两个for循环嵌套，外层用个for循环控制循环多少次，即就是行数，外循环控制行（n）
        for (int i = 1; i <= n; i++) {
            //先输空格,一行一行输不用换行
            for (int j = 1; j <= n - i; j++) {
                System.out.print("0");
            }
            //再输出*
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            //一行输完之后换行
            System.out.println();
        }
        //输出下半部分，分析同理可得，只要把上半部分反着输出就行啦
        //由于最多*那一行重复啦，所以下半部分循环次数要-1,
        for (int i = n - 1; i >= 1; i--) {
            //先输空格,一行一行输不用换行
            for (int j = 1; j <= n - i; j++) {
                System.out.print("0");
            }
            //再输出*
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            //一行输完之后换行
            System.out.println();
        }
    }
}
