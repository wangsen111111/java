package com.company;
/*
Calendar类：它为特定瞬间与一组诸如YEAR MONTH DATE等日历字段之间的转换提供啦一些方法 ，并为操作日历字段
        public int get(int field)返回给定的日历字段的值
           日历中的每个字历字段都是静态的成员变量，并且是int类型的
     子类对象：Calendar rightNow=Calendar.getInstance();
              (其日历字段已由当前日期和时间初始化)
      成员方法：
            public void add(int field,int amount)amount加或减功能
            根据给定的日历字段和对应的时间来对当前日历进行操作
            public final void set(int year,int month,int date)设置当前日历的年月日
      得到当前时间的毫秒数：public long getTimeInMillis


 */

import java.util.Calendar;
import java.util.Scanner;

public class Calendar类 {
    public static void main(String[] args){
        /*
        请输出任意一年份中的二月有几天
           分析：1，键盘录入输入的年份
                 2，设置日历对象的年月日
                      年：就是1输入的数据
                       月：2月 //其实是3月1号，因为月份从0开始
                        日：1日

                  3，得到3月1号往前推一天就是2月的最后一天
                  4，获取这一天输出即可

         */
        //1，键盘录入输入的年份
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要查询的年份为：");
        int year=sc.nextInt();
        // 2，设置日历对象的年月日
        //                      年：就是1输入的数据
        //                       月：2月 //其实是3月1号，因为月份从0开始
        //                        日：1日
        //设置日历对象的年月日
        Calendar c= Calendar.getInstance();
        c.set(year,2,1);//其实是3月1号，因为月份从0开始
        //把时间往前推一天就是 2月的最后一天
        c.add(Calendar.DATE,-1);
        //4，获取这一天输出即可
        System.out.println(c.get(Calendar.DATE));
    }
}
