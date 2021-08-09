package com.company;
/*
题目：小易去附近的商店买苹果，奸诈的商贩使用了捆绑交易，只提供6个每袋和8个每袋的包装(包装不可拆分)。
 可是小易现在只想购买恰好n个苹果，小易想购买尽量少的袋数方便携带。如果不能购买恰好n个苹果，小易将不会购买。
输入描述：输入一个整数n，表示小易想购买n(1 ≤ n ≤ 100)个苹果
输出描述：输出一个整数表示最少需要购买的袋数，如果不能买恰好n个苹果则输出-1
举例：  输入：20    输出：3
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //键盘输入小易一共买的苹果
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小易一共买的苹果为：");
        int sum = sc.nextInt();
        if (sum == 5) {
            System.out.println(-1);
        }
        canBuy(sum);
        for (int i = sum; i > 0; i--) {
            if ((i == 7 && 6 < sum && sum < 13) || (i == 13 && sum > 13) || (i == 5 && 0 < sum && sum < 6)) {
                System.out.println(-1);
            }
        }

    }

    public static void canBuy(int sum) {
        for (int a = 0; a <= sum / 6; a++) {
            //内循环控制大袋
            for (int A = 0; A <= sum / 8; A++) {
                if (sum == 6 * a + 8 * A) {
                    System.out.println(a + A);System.exit(0);
                }
            }
        }
    }

}
