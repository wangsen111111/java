package com.company;
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        int[][] arr=new int[2][3];//创建一个2行3列的数组
        Scanner sc=new Scanner(System.in);  //二维数组的输入,创建键盘录入对象
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print("请输入数组arr["+i+"]["+j+"]:");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("数组元素为：");
        //输入每一行之后换行
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++) {
                System.out.print(arr[i][j]+"   ");
            }
            System.out.println();//一行输完换行
        }
        //输出数组偶数行和偶数列
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                if(i%2==0||j%2==0)
                    System.out.print(arr[i][j]+"   ");
                else System.out.print("   ");
            }
            System.out.println("\t");
        }

    }
}
