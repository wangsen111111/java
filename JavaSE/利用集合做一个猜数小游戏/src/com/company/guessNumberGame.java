package com.company;

import java.util.Scanner;

/**
 * 这是猜数字小游戏
 *
 * @version V1.0
 * @auther 三木
 */

public class guessNumberGame {
    private guessNumberGame() {
    }

    public static void start() {
        //程序产生随机数random包括0不包括1
        int number = (int) (Math.random() * 100) + 1;
        System.out.println("系统给出的随机数为："+number);
        while (true) {
            //键盘录入对象
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要输入的数为（1~100）：");
            int guessNumber = sc.nextInt();
            if (guessNumber > number) {
                System.out.println("你猜的数字猜大啦");
            } else if (guessNumber < number) {
                System.out.println("你猜的数字猜小拉");
            } else {
                System.out.println("猜对啦！");
                break;
            }
        }
    }
}
