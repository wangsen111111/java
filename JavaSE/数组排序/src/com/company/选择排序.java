package com.company;
/*
选择排序：从0索引开始，依次和后面的元素比较，小的往前放，第一次完毕，最小值出现在拉最小索引处
         规则：  1，第一次是从0索引开始和其他的进行比较
                 2，第二次是从1索引开始和其他的进行比较
                 3，最后一次是数组长度-2的和数组-1的进行比较
 */

public class 选择排序 {
    public static void main(String[] args) {
      int[] arr={1,2,5,4,3};
        selectSort(arr);
        printArray(arr);
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
    //选择排序功能
    public static void selectSort(int[] arr){
        for(int x=0;x<arr.length-1;x++){
            for(int y=x+1;y<arr.length;y++){
                if(arr[y]<arr[x]){
                    int temp=arr[x];
                    arr[x]=arr[y];
                    arr[y]=temp;
                }
            }
        }
    }
}
