package com.company;
import java.util.Scanner;
/*
备注：换行使用转义字符‘\n’
v   v
 v v
  v
 */

public class for循环打出一个空菱形 {

    public static void main(String[] args) {
        //创建输入通道
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入n：");
        int n = sc.nextInt();
        int hang = n;
        //


        for (int i = 1; i <= hang; i++) {//循环次数
            for (int k = hang; k > i; k--) {
                System.out.print(" ");
            }//先划分一个区域
            //v数=2*行数-1，先进入这一部分，先假设它里面都是v，然后再进入内层循环操作
            //输出每一行的元素，j代表列，列一直到2*i-1；
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {//如果它是第一列就直接输出v，或者它是2倍的行数-1列也直接输出v、、即也就是直接输出每一行第一个元素和最后一个元素
                    System.out.print("v");
                } else {
                    System.out.print(" ");//其余部分输出空格
                }
            }
            System.out.println();//一行输出完之后换行
        }


        //
        //下半部分直接将上半部分倒过来
        //外循环控制循环次数
        for (int i = hang; i > 0; i--) {
            //内循环控制列
            for (int k = hang; k > i; k--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("v");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }


    }
}