package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 这是日期和字符串相互转换的工具类
 * @author 王森
 */

public class 制作一个工具类Date {
    /**
     * 这个方法：把一个日期转换为字符串
     * @param d  被转换的日期对象
     * @param format 传递过来要被转换的格式
     * @return格式后的字符串
     */
 public static String dateToString(Date d, String format){
     SimpleDateFormat sdf=new SimpleDateFormat(format);
     return sdf.format(d);
 }

    /**
     * 这个方法就是把一个字符串转换为一个日期对象
     * @param s 被解析的字符串
     * @param format 传递过来要被转换的格式
     * @return 解析后的日期对象
     * @throws ParseException
     */
 public static Date StringToDate(String s,String format)throws ParseException {
     SimpleDateFormat sdf=new SimpleDateFormat(format);
     return sdf.parse(s);
 }

}