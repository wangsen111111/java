package com.company;
import java.util.*;
public class 最大数在第几行第几列{
    public static void main(String[] args) {
        Scanner shuzu = new Scanner(System.in);
        int[][] array = {{1,2,3},{4,5,6}};
        int i = 0, j = 0, max;
        System.out.print("输入一个两行三列的矩阵:");
        System.out.println("请输入6个数：");    //从键盘读入6个数据，放入矩阵中
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                array[i][j] = shuzu.nextInt();
                System.out.println();
            }
        }    //以矩阵的形式输出读入的数据

        max = Integer.MIN_VALUE;
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                array[i][j] = shuzu.nextInt();
                if (array[i][j] > max) max = array[i][j];   //拿每个数和max比较，如果比它大，修正max，并记下行列号
                System.out.println("最大的数为" + max);
            }
        }
    }
}
