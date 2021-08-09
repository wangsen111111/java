package com.company;
/*
要求：  必须是5-15的数字  不能以0开头
      分析； 1，键盘录入一个qq号码
            2，写一个功能实现
            3，调用功能输出结果
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 检验qq号 {
    public static void main(String[] args) {
        //键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个qq号码：");
        String qq = sc.nextLine();
        System.out.println(chechQQ(qq));
        System.out.println(chechQQ1(qq));



        /*
    获取功能：Pattern 和Macher类的使用
    获取以下字符串中带三个字符的
     aa ss ddd ggg vv zz
     */
        //定义字符串
        String s2 = "aa ss ddd ggg vv zz";
        //规则
        String regex1 = "\\b\\w{3}\\b";
        //把正则表达式编译成模式对象
        Pattern p = Pattern.compile(regex1);
        //通过模式对象得到匹配器对象
        Matcher m = p.matcher(s2);
        //通过find方法查找有没有符合条件的子串
        //boolean flag=m.find();
        while(m.find())

        {
            System.out.println(m.group());
        }
        //注意：一定要先find（）找到，然后才能group（）返回

    }

    /*
    正则表达式：
     */
    public static boolean chechQQ1(String qq) {
        //public boolean maches(String regex)告知此字符串是否匹配给定的正则表达式
        String regex = "[1-9][0-9]{4,14}";
        boolean flag = qq.matches(regex);
        return flag;
    }

    /*
    一般做法：明确返回值类型：boolean
              参数类型：String qq
     */
    public static boolean chechQQ(String qq) {
        boolean flag = true;
        //检验长度
        if (qq.length() > -5 && qq.length() <= 15) {
            //不能以0开头
            if (!qq.startsWith("0")) {
                //必须是数字
                char[] arr = qq.toCharArray();
                for (int x = 0; x < arr.length; x++) {
                    char array = arr[x];
                    if (!Character.isDigit(array)) {
                        flag = false;
                        break;
                    }
                }
            } else {
                flag = false;
            }

        } else {
            flag = false;
        }
        return flag;
    }
}