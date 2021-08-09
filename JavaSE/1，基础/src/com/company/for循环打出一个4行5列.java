package com.company;

import java.util.Scanner;//导包

public class for循环打出一个4行5列 {
    /*输出一个low=x行，line=y列的*
        分析：利用for循环嵌套
     */
    //利用循环嵌套输出*,建一个类来实现这个方法
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行low为：");
        int low = sc.nextInt();
        System.out.println("请输入line为：");
        int line = sc.nextInt();
        //利用循环嵌套输出*
        /*
        外循环控制行数，内循环控制列数
         */
        for (int x = 0; x < low; x++) {
            for (int y = 0; y < line; y++) {
                System.out.print("" + "*");
            }
            System.out.println();
        }
        /*

         */
        System.out.println("------------------------");
        for (int x = 0; x < low; x++) {
            for (int y = 0; y <=x; y++) {
                System.out.print("" + "*");
            }
            System.out.println();
        }

//利用for嵌套打出99乘法表
/*
分析：1*1=1                                   可参考*
      2*1=2  2*2=4                                  * *
      x*y=x*y                                                   for(x=0;x<9;x++){
      for循环嵌套 外循环处理列，内循环处理行
          只需将*换为“x*”+“y”=“x*”+“y”                           for(y=0;y<9;y++){System.out.print("*")//不换行}
            再将九行九列改为乘法表格式，经分析只需将y<x即可
                                                                 System.out.println("")//换行}
 */
System.out.println("-------------------------------");
        for (int x = 1; x <= 9; x++) {
            for (int y = 1; y <= x; y++) {
                //   '\x'x表示任意，这种做法叫转义字符，    '\t'tab键
                /*
                '\r'回车
                ‘\n'换行
                 */
                System.out.print(y + "*" + x + "=" + x * y + "         " + '\t');
            }
            System.out.println();
        }
    }

}
