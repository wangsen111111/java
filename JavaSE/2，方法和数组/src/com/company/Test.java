package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //创建键盘输入通道
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要输入的数字：");
        int n = sc.nextInt();
        //先定义一个n行n列的数组
        int[][] arr = new int[n][n];
        //按规律给数组里的各个元素赋值
        //给这个数组里的每一行第一个元素和最后一个元素赋值为1
        for (int x = 0; x < arr.length; x++) {
            arr[x][0] = 1;//任一行第一列的元素赋值为1
            arr[x][x] = 1;//任何一行最后一列的元素赋初值为1
        }
        /*(2）给数组各个元素赋值，由图可得，三角形每一行第一个数和最后一个数都为1，故可直接从第三行开始，
          每一个数是它上一行的前一列和它上一行的本列之和
         */
        //由于直接从第三行开始，故x初值为2
        //对数组赋值
        for (int x = 2; x < arr.length; x++) {
            //一维数组的元素
            //由于输出的是一个n行n列的二维数组，而我们需要的是一个杨辉三角形，外循环的行数不变
            //内循环的可以仿照  之前打过的九九乘法表
            //由于最后一列都为1，故这块的y应该小于x-1，第一列也全为一，故y从一开始
            for (int y = 1; y <= x - 1; y++) {
                //每一个数是它上一行的前一列和它上一行的本列之和
                arr[x][y] = arr[x - 1][y - 1] + arr[x - 1][y];
            }
        }

        //遍历数组，利用for循环的嵌套,外层循环控制有几个一维数组，内层循环控制一维数组中的元素
        //二维数组有几个一维数组
        //定义一个方法arr用于遍历数组
        for (int x = 0; x < arr.length; x++) {
            //一维数组的元素
            //由于输出的是一个n行n列的二维数组，而我们需要的是一个杨辉三角形，外循环的行数不变
            //内循环的可以仿照  之前打过的九九乘法表
            for (int y = 0; y <= x; y++) {
                System.out.print(arr[x][y] + "\t");//打印一个一维数组，即不用换行，加个/t水平制表
            }
            System.out.println();//一个一维数组打印完，换行
        }
    }
}
