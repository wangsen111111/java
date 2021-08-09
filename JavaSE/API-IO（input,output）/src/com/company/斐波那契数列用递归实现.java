package com.company;
/*
有一对兔子,从出生后第3个月起每个月都生一对免子,小兔子长到第三个月后每个月又生一对兔子,假如兔子都不死,问第二十个月的兔子对数为多少?
分析:我们要想办法找规律
           兔子对数
第一个月:      1
第二个月:      1
第三个月:      2  =1+1
第四个月:      3  =2+1
第五个月:      5  =3+1+1
第六个月:      8  =5+1+1+1
由此可见兔子对象的数据是:
1,1,2,3,5,8...
规则:
A:从第三项开始,每一项是前两项之和
B:而且说明前两项是已知的
如何实现这个程序呢?
A:数组实现
B :变量的变化实现
C :递归实现
 */

public class 斐波那契数列用递归实现 {
    public static void main(String[] args) {
        /*
        定义一个数组实现
         */
        //定义一个数组
        int[] arr=new int[20];
        arr[0]=1;
        arr[1]=1;
        for(int x=2;x<arr.length;x++){
            arr[x]=arr[x-2]+arr[x-1];
        }
        System.out.println("数组实现;"+arr[19]);
        /*
        变量的变化实现：
           假如两个相邻的两个月的兔子对数是a，b
           第一个相邻的数据：a=1，b=1
           第二个相邻的数据：a=1，b=2
           第三个相邻的数据：a=2，b-3
           第四个相邻的数据：a=3，b=5
           看到了：下一次的a是以前的b，下一次的b是以前的a+b
         */
        int a=1;
        int b=1;
        for(int x=0;x<18;x++){
            //临时变量存储上一次的a
            int temp=a;
            a=b;
            b=temp+b;
        }
        System.out.println("变量的变化实现："+b);
    System.out.println("递归实现："+fib(20));
    }
    /*
    递归实现：
       方法： 返回值类型：int    参数列表：int n
       出口条件：第一个月是1，第二个月是1，规律：从第三个月开始，。每一个月是前两个月之和
     */
    public static int fib(int n){
        if(n==1||n==2){
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }
}
