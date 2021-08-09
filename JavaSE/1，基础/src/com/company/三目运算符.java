package com.company;
/*
三目运算符实现的，都可以采用if语句实现，反之则不成立
什么时候if语句实现不能用三元改进？
       当if语句控制的操作是一个输出语句的时候就不能
       因为：三元运算符是一个运算符，运算符操作完毕应该有一个结果，而不是一个输出
 */
import java.util.Scanner;

public class 三目运算符 {
        public static void main(String[] args) {
            //键盘录入两个值x和y，并对这两个比较大小，并输出max
            Scanner ac = new Scanner(System.in);//创建键盘录入对象
            System.out.println("请输入第一个数：");
            int x = ac.nextInt();
            System.out.println("请输入第二个数：");
            int y = ac.nextInt();
            //把键盘录入的对象进行相加即可
            int max=(x>y)?x:y;
            System.out.println("max:"+max);
        }
}
