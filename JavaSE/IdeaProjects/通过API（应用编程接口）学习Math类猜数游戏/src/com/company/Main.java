package com.company;
import java.util.Scanner;//导包
/*
分析：A：程序产生一个随机数（被猜的）
      B：键盘录入数据（你猜的）
      C:把你猜的和被猜的进行比较（大啦、小拉、猜中啦
      D:给出多次猜的机会，猜中就结束由于不知道次数故采用while循环break
 */

public class Main {

    public static void main(String[] args) {
        //程序产生随机数random包括0不包括1
        int number=(int)(Math.random()*100)+1;
        System.out.println("程序给出的随机数是："+number);
        while (true){
            //键盘录入对象
         Scanner sc=new Scanner(System.in);
            System.out.println("请输入你要输入的数为（1~100）：");
            int guessNumber=sc.nextInt();
            if(guessNumber>number){
                System.out.println("你猜的数字猜大啦");
            }else if(guessNumber<number) {
                System.out.println("你猜的数字猜小拉");
            }else{
                    System.out.println("猜对啦！");break;
                }
            }


        }


    }
