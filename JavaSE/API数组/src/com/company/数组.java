package com.company;
/*
对数组的操作类
 */

public class 数组 {
    public static void main(String[] args){
        int[] arr={1,2,3,};
        fangFa.printArray(arr);
        System.out.println(fangFa.getMax(arr));
        System.out.println(fangFa.getIndex(arr,2));
    }
}
/*
这是获取数组最大值的方法
 */
class fangFa {
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        return max;
    }

    /*
    遍历数组
     */
    public static void printArray(int[] arr) {
        System.out.print("{");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                System.out.println(arr[x] + "}");
            } else {
                System.out.print(arr[x] + ",");
            }
        }
    }

    /*
    获取指定元素在数组中第一次出现的索引
     */
    public static int getIndex(int[] arr, int value) {
        int index = -1;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == value) {
                index = x;
                break;
            }
        }
        return index;
    }
}