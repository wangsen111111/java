package com.company;
/*
输入：
        [2, 3, 1, 0, 2, 5, 3]
        输出：2 或 3
        输出数组中重复的元素
        分析：1，输入一个数组int[] arr
              2,遍历数组中的每一个元素

 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //输入一个数组arr
        int[] arr = {1, 1, 2, 3, 4, 5, 6};

        //遍历数组中的每一个元素
        printArray(arr);
    }

    /*
遍历数组,并判断是否数组中是否有相同的，有的话输出这个数
 */
    public static int printArray(int[] arr) {
        System.out.print("{");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
            } else {
            }
            //得到每一个元素并判断如果有相同的，有的话就输出
            //把第一个数拿出来和后面的数比较，有相同的输出
            for (int i = 0; i < x; i++) {
                if (arr[x] != arr[i]) {
                } else {
                    return arr[x];
                }
            }

        }
    }


}
