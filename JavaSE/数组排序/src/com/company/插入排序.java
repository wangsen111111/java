package com.company;
/*
插入排序也是排序算法的一种，他的排序定义是这样：
把一个数插入到一个有序数列的合理位置，并使插入后数列仍然有序，
不断重复这个过程，就能使整个数组成为有序数列。
插入排序基本思想：每一趟将一个待排序的元素，按其关键字值的大小插入到
已经排过序的有序区中的适当位置，
直到全部插入完成为止。
直接插入排序是依次寻找
1，将第一个数和第二个数排序，然后构成一个有序序列
2，将第三个数插入进去，构成一个新的有序序列。
3，对第四个数、第五个数……直到最后一个数，重复第二步。
 */
public class 插入排序 {
    public static void main(String[] args) {
       int[] arr={4,2,5,1,3};
       //对数组进行插入排序
       insertSort(arr);
        //遍历数组，并将其输出
        printArray(arr);
    }
    //插入排序（直接插入）
    public static void insertSort(int[] arr){
        for(int x=0;x<arr.length-1;x++){//插入的次数
            for(int y=x+1;y>0;y--){//如果这个数比比他前面的数小，则交换位置，y为数组中元素的索引
                if(arr[y-1]>arr[y]){
                    int temp=arr[y-1];
                    arr[y-1]=arr[y];
                    arr[y]=temp;
                }
            }
        }
    }
    //遍历数组功能
    public static void printArray(int[] arr){
        System.out.print("[");
        for(int x=0;x<arr.length;x++){
            if(x==arr.length-1){
                System.out.println(arr[x]+"]");
            }else{
                System.out.print(arr[x]+", ");
            }
        }
    }
}
