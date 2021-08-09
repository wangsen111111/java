package com.company;//BC10
/*
题目描述
输入3科成绩，然后把三科成绩输出，成绩为整数形式。
输入描述:
一行，3科成绩，用空格分隔，范围（0~100）。
输出描述:
一行，把3科成绩显示出来，输出格式详见输出样例。
 */
        import java.util.Scanner;//导包

public class switchcase写一个成绩判断 {
    public static void main(String[] args) {
        //创建输入流通道
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的成绩为：");
        int score=sc.nextInt();
        //判断成绩并输出
        //写个if语句确保输入的成绩合法
        if(score<0&&score>100) System.out.println("你输入的成绩不合理，请重新输入一个成绩：");
        else{
            switch (score / 10) {
                case 10:
                case 9:
                    System.out.println("A");
                    break;
                case 8:
                case 7:
                    System.out.println("B");
                    break;
                case 6:
                    System.out.println("C");
                    break;
                default:
                    System.out.println("你的成绩不及格");
            }
        }
    }
}


