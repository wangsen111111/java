package com.company;
/**
 * 这是针对数组进行操作的工具类
 * @auther  王森
 * @version  v.10
 */

public class 对数组进行操作的工具类 {
    //把构造方法私有，外界就不能再创建对象啦

    /**
     * 这是私有构造
     */
    private 对数组进行操作的工具类() {
    }

    /**
     * 这是对数组进行遍历的方法,遍历后的格式是:【元素1，元素2.....】
     *
     * @param arr 这是要被遍历的数组
     */
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                System.out.println(arr[x] + "]");
            } else {
                System.out.print(arr[x] + ",");
            }
        }
    }

    /**
     * 这是获取数组中最大值的方法
     *
     * @param arr 这是获取最大值的数组
     * @retrun int[] arr 返回数组中的最大值
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        return max;
    }

    /**
     * 这是获取指定元素在数组中第一次出现位置的索引，如果元素不存在，就返回-1
     *
     * @param arr   被查找的数组
     * @param value 要查找的元素
     */

    public static void getIndex(int[] arr, int value) {
        int index = -1;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == value) {
                index = x;
                break;
            }
        }
    }
}
