package com.company;
/*
二分查找：
   基本查找：数组元素无序
   二分查找：（折半查找）：数组元素有序
   A定义最大索引  定义最小索引
   B计算出中间索引
   C拿中间索引的值和要查找的值进行比较
       相等：直接返回当前的中间索引的值
       不相等：   大啦：在左边找  max=mid-1；
                  小拉：在右边找  min=mid+1；
   D重新计算中能索引
       相等：直接返回当前的中间索引的值
       不相等：   大啦：在左边找  max=mid-1；
                  小拉：在右边找  min=mid+1；
    E:回到B
 */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr={11,22,33,44,55};
      System.out.println(getIndex(arr,55));
      /*
      Arrays类(针对数组进行操作的工具类比如排序和查找)
            的三种方法；（把数组转为字符串）public static String toString(int[] a)
                         (对数组进行排序)public static void sort(int[] a)
                        (对数组二分查找)public static int binarySearch(int[] a,int value)
       */
      //（把数组转为字符串）public static String toString(int[] a)
        System.out.println("排序前："+ Arrays.toString(arr));
        //(对数组进行排序)public static void sort(int[] a)
        Arrays.sort(arr);
        System.out.println("排序后：" + Arrays.toString(arr));
        // (对数组二分查找)public static int binarySearch(int[] a,int value)
        System.out.println("二分查找："+Arrays.binarySearch(arr,55));
    }

    /*
    二分查找功能：
    返回值类型：int
    参数列表：int[] arr,int value
     */
    public static int getIndex(int[] arr, int value) {
        //A定义最大索引  定义最小索引
        int max = arr.length - 1;
        int min = 0;
        //B计算出中间索引
        int mid = (max + min) / 2;
        /*
        C拿中间索引的值和要查找的值进行比较
        相等：直接返回当前的中间索引的值
        不相等：   大啦：在左边找  max=mid-1；
        小拉：在右边找  min=mid+1；
         */
        while (arr[mid] != value) {
             if(arr[mid]>value){
                 max=mid-1;
             }else if(arr[mid]<value){
                 min=min+1;
             }
             //加入判断，最小索引必须必最大索引要小
            if(min>max){
                return -1;
            }
             mid=(max+min)/2;
        }
        return mid;
    }
}
