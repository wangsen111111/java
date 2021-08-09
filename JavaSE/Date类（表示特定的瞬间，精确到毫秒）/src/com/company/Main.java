package com.company;

import java.text.ParseException;
import java.util.Date;

/*
构造方法:
       Date()根据当前的默认毫秒值创建日期对象
       Date(long date)根据给定的毫秒值创建日期对象
 成员方法：
         public long getTime()获取时间，以毫秒为单位
         public void setTime(long time)设置时间
           从Date得到一个毫秒值：Date d=new Date();
                                long time=s.getTime（）；
          把一个毫秒值转换为Date：构造方法
                                 setTime（long time）
DateFormat类(日期格式化)：可以进行日期和字符串的格式化和解析，
                  但是由于是抽象类，所以要使用具体子类SimpleDateFormat
                   SimpleDateFormat的构造方法：
                   SimpleDateFormat（）    默认模式
          1, Date-->String格式化
           public final String format(Date date)[默认模式]
           SmipleDateFormat(String pattern)【给定模式】
           y年 M月 d日 H时 m分 s秒
           2,String-->Date解析
  //在把一个字符串解析为日期的时候，请注意格式必须和给定的字符串格式匹配
             public Date parse(String source)解析
 */
/*
检测工具类
 */
public class Main {

    public static void main(String[] args) throws ParseException {
        Date d=new Date();
        //yyyy-MM-dd HH:mm:ss
        String s=制作一个工具类Date.dateToString(d,"yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s);
        System.out.println("--------------");
        String str="2020年11月03日 18:33:08";
        Date dd=制作一个工具类Date.StringToDate(str,"yyyy年MM月dd日 HH:mm:ss");
                System.out.println(dd);
    }
}
