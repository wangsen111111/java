package com.company;
import java.util.Scanner;//导包
public class Main2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};//静态初始化
        /*
        //创建键盘输入通道
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[n];
        System.out.println("请输入你想输入的数组里的元素："+n);
           for(int i=0;i<n;i++) {
               arr[i] = sc.nextInt();
           }
               //数组中的各个元素用空格隔开
               for(int i=0;i<n;i++){
                   System.out.print(arr[i]+" ");
               }
         */



        //逆序前
        System.out.println("逆序前：");
        printArr(arr);
        //逆序后第一种方法
        System.out.println("逆序后第一种方法:");
        reverse(arr);
        printArr(arr);
        //逆序后第二种方法
        System.out.println("逆序后第二种方法：");
        reverse2(arr);
        printArr(arr);
    }
    //逆序
    /*
      分析：逆序：         交换
                       0      arr.length-1
                       1      arr.length-1-1
                       2      arr.length-1-1-1
                       。。。。。。。。。。。。。。。。
                       直到运行到arr,length/2为止
     */

    public static void reverse(int[] arr){
        for (int x = 0; x < arr.length/2; x++) {
            int temp = arr[x];
            arr[x] = arr[arr.length - 1-x];
            arr[arr.length-1-x] = temp;
        }
    }
    //第二种逆序方法
    public static void  reverse2(int[] arr){
        for(int start=0,end=arr.length-1;start<=end;start++,end--){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }
    }
    //遍历数组
    public static void printArr(int[] arr){
        System.out.print("[");
        for(int x = 0;x<arr.length;x++){
            if(x==arr.length-1){
                System.out.println(arr[x]+"]");}
            else{
                System.out.print(arr[x]+",");
            }
        }
    }

}
