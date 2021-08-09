package com.company;

import java.util.Scanner;

/*
类之间的转换：
     A---B的转换 把A转换为B其实是为啦使用B的功能
     B——-A的转换，可能要的结果是A类型，所以得转回来
 */
/*
String和StringBuffer的相互转换
        任何类型调用toString方法都可以转为字符串类型
     把数组拼接成一个字符串
     把字符串反转
     判断一个字符串是否是对称字符串
           例如  aba就是
 */
public class StringBuffer类练习 {
    public static void main(String[] args) {
    //String--StringBuffer
        String s="hello";
        //方式一：通过构造方法：
           StringBuffer sb=new StringBuffer(s);
           System.out.println(sb);
           //方式二：通过append（）方法
             StringBuffer sb2=new StringBuffer();
             sb2.append(s);
             System.out.println(sb2);
             System.out.println("-------------------");
    //StirngBuffer--String
        StringBuffer buffer=new StringBuffer("java");
             //方式一：通过构造方法：
                  String str=new String(buffer);
                  System.out.println(str);
             //方式二：通过toString方法
                   String str2=buffer.toString();
                   System.out.println(str2);
     System.out.println("------------------------------");
     System.out.println("第一题：把数组拼接成一个字符串：");
        //定义一个数组
        int[] arr={11,22,33,44,55};
        //用String接收
        System.out.println(arrayToString(arr));
        //用toString方法接收
        System.out.println(arrToString2(arr));
         /*
    第二题：把字符串反转
         */
         //键盘录入数据
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数据：");
        String ss=sc.nextLine();
        //方式一：用String做拼接
        System.out.println(myReverse(ss));
        //方式二：用StringBuffer的reverse（）功能
        System.out.println(myReverse2(ss));
        System.out.println("--------------------");
        /*
        第三题：：判断一个字符串是否是一个对称字符串
        返回的是boolean型
         */
        System.out.println("请输入数据：");
        String sss=sc.nextLine();
        //把字符转为字符数组
        System.out.println(isSame(sss));
        /*
        StringBuffer反转功能：
                public StringBuffer reverse（）反的是本身
         */
        System.out.println(isSame1(sss));
    }
    /*
    第一题：把数组拼接成一个字符串
     */
    //定义功能 用string拼接的方式
    public static String arrayToString(int[] arr){
        String s="";
        s+="[";
        for(int x=0;x<arr.length;x++){
            if(x==arr.length-1){
                s+=arr[x];
            }else {
                s += arr[x];
                s += ", ";
            }
        }
        s+="]";
        return s;
    }
    //用StingBuffer做拼接
    public static String arrToString2(int[] arr){
        StringBuffer sb=new StringBuffer();
        sb.append("[");
        for(int x=0;x<arr.length;x++){
            if(x==arr.length-1){
                sb.append(arr[x]);
            }else{
                sb.append(arr[x]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    /*
    第二题：把字符串反转
     */
    //方式一：用String做拼接
    public static String myReverse(String ss){
        String result="";
        char[] chs=ss.toCharArray();
        for(int x=chs.length-1;x>=0;x--){
           // char ch=chs[x];
            result+=chs[x];
        }
        return result;
    }
    //方式二：用StringBuffer的reverse（）功能
    public static String myReverse2(String ss){
        StringBuffer sb=new StringBuffer(ss);
        sb.reverse();
        return sb.toString();
        //链式操作
        //return new StringBuffer(ss).reverse().toString();
    }
    /*
        第三题：判断一个字符串是否是一个对称字符串
        返回的是boolean型
        判断一个字符串是否对称：第一个和最后一个比较
                               第二个和倒数第二个比较
                               判断次数  ：长度/2
    */
    public static boolean isSame(String s) {
        //把字符转为字符数组
        char[] chs1 = s.toCharArray();
        for (int start = 0, end = chs1.length - 1; start <= end; start++, end--) {
            if (chs1[start] != chs1[end]) {
                return false;
            }
        }
        return  true;
    }
    //public StringBuffer reverse（）反的是本身
    public static boolean isSame1(String s){
        //反转前和反转后的一样，就表明对称
        return new StringBuffer(s).reverse().toString().equals(s);
    }
}
