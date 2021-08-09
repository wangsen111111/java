package com.company;
import java.util.Scanner;
public class 数组偶数行和偶数列的输出 {
    //三行三列数组的输入
    public static int[][] getArr(int low,int lie){
        int[][] arr = new int[low][lie];//创建一个2行3列的数组
        Scanner sc = new Scanner(System.in);  //二维数组的输入,创建键盘录入对象
        for (int i = 0; i <low; i++) {
            for (int j = 0; j < lie; j++) {
                System.out.print("请输入数组arr[" + i + "][" + j + "]:");
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int low = 3;
        int lie = 3;
        int[][] arr = getArr(low,lie);
        System.out.println("数组元素为：");
        //输入每一行之后换行
        for (int i = 0; i < low; i++) {
            for (int j = 0; j < lie; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();//一行输完换行
        }

        //输出数组偶数行和偶数列
        System.out.println("偶数行和偶数列的元素如下：");
        for (int i = 0; i < low; i++) {
            for (int j = 0; j < lie; j++) {
                {
                    if (i % 2 == 1 || j % 2 == 1) {
                        System.out.print(arr[i][j]+" ");
                    } else System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
