package com.company;
/*
   题目：某个公司采用公用电话传递数据信息，数据是小于8位的整数，在传递过程中需要加密
   规则如下：首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字
   最后将第一位和最后一位的数字交换，请任意给定一个小于8位的数字
   然后，把加密的结果在控制台打印出来
   分析：1,给定一个小于8位的数字，需要创建键盘输入对象
        2,假设这个数字为123456{
                            1，首先将数据倒序，654321
                            2，然后将每位数字都加上5，再用和除以10的余数代替该数字 109876
                            3，最后将第一位和最后一位的数字交换:609871
                            }
        3,由上面数字的变化可得，必须得把这个数字的每个数字都遍历出来，然后进行操作
        那么遍历一个数字中的每一位不太方便，我们可以将其转化为一个数组
           (1)首先考虑将输入的数字转化为一个数组，由分析可得，可将数字的每一位提取出来，赋给数组
              //由于数据是一个小于8位的整数，所以首先定义一个不可能超出范围的数组int[] arr=new int[8]；
              //然后将数据中的每一位数拿出来给数组中的每一个元素arr[index]代表数组中的哪一个元素，index元素索引从0开始
                然后将数据中的每一位拿出来赋给数组if(number>0){
                                             arr[0]=number%10
                                             arr[1]=number/10%10
                                             //arr[index]=number%10;index++;number=number/10 }
          (2)首先将数据倒序    倒序我们可以用 /(1){  start=0,end=arr.length-1,start++,length--,直到到中间的结束即就是index=arr.length/3,index++;
                                        将数组中的元素换位，引入一个中间变量temp
                                        int temp=arr[start];arr[end]=arr[start];arr[end]=temp}
                                        /(2)简化版倒序一个数组for(int index=0;index<arr.length-1;index++)System.out.println("  "+arr[index]);
                                                              for(index=arr.length;index>=0;index--)System.out.print("  "+arr[index]);
           (3)然后将每位数字都加上5，再用和除以10的余数代替该数字
                 for(index=0;index<arr.length-1;index++){arr[index]+=5;arr[index]=arr[index%10]}
           (4)最后将第一位和最后一位的数字交换
                     int temp=arr[0];arr[length-1]=arr[0];arr[length-1]=temp}
           (5)输出数据
            */
import  java.util.Scanner;//导包
public class 数组加密 {

    public static void main(String[] args) {
//创建键盘输入对象
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要输入的数字：");
        int number=sc.nextInt();
        jiaMi(number);
    }
    //创建方法jiaMi
    public  static void jiaMi(int number) {
        /*首先定义一个数组,因为数字是一个小于8位的数字*/
        int[] arr = new int[8];
        //首先考虑将输入的数字转化为一个数组，由分析可得，可将数字的每一位提取出来，赋给数组
        //由于数据是一个小于8位的整数，所以首先定义一个不可能超出范围的数组int[] arr=new int[8]；
        //然后将数据中的每一位数拿出来给数组中的每一个元素arr[index]代表数组中的哪一个元素，index元素索引从0开始
        //然后将数据中的每一位拿出来赋给数组
        int index=0;
        while(number > 0) {
            arr[index]=number%10;
             index++;number=number/10;
        }//已经将元素倒序
        /*
        // (2)首先将数据倒序    倒序我们可以用 /(1){  start=0,end=arr.length-1,start++,length--,直到到中间的结束即就是index=arr.length/3,index++;
        //将数组中的元素换位，引入一个中间变量temp

         */
    /*(2)简化版倒序一个数组for(int index=0;index<arr.length-1;index++)System.out.println("  "+arr[index]);
       for(index=arr.length;index>=0;index--)System.out.print("  "+arr[index]);
     */
     //(3)然后将每位数字都加上5，再用和除以10的余数代替该数字
                /*for(int index=0;index<arr.length-1; index++){
                   arr[index]+=5;arr[index]=arr[index%10];
                  }
                 */
                for(int x=0;x<index;x++){
                    arr[x]+=5;
                    arr[x]%=10;
                }

     //(4)最后将第一位和最后一位的数字交换
     int temp=arr[0];
        arr[0]=arr[index-1];
        arr[index-1]=temp;

                //输出数据
        for(int x=0;x<index;x++){
            System.out.print(arr[x]);
        }
    }
}
