package com.company;
/*
String类获取功能
      int length（）获取字符串长度
      char charAt（int index）获取指定索引位置的字符
      int indexOf（int ch）返回指定字符在此字符串中第一次出现的索引
        int：a 和 97都是97
        int indefOf（String str）返回指定字符在此字符中第一次出现的索引
        int indexOf（int ch，int fromIndex）返回指定字符在此字符串中在指定位置后第一次出现的索引
         int indexOf（String str，String fromIndex）返回指定字符串在此字符串中在指定位置后第一次出现的索引
         String substring（int start，int end）截取字符串
 */
/*
   String类中的其他功能
        替换：String replace（char old，char new ）
              String replace（String old，String new）
         去除字符串两端空格 String trim（）
          按AcSIIs码值比较两个字符串，相同返回0，不同 用前面减后面
          int compareTo（String str）
          int  compareToIgnoreCase（String str）
 */

import javax.lang.model.element.NestingKind;

public class String类1 {
    public static void main(String[] args) {
        String s = "helloword ";
        //int length()获取字符串长度
        System.out.println(s.length());
        //char charAt（int index）获取指定索引位置的字符
        System.out.println(s.charAt(1));
        //int indexOf（int ch）返回指定字符在此字符串中第一次出现的索引
        System.out.println(s.indexOf("h"));
        //int indefOf（String str）返回指定字符在此字符中第一次出现的索引
        System.out.println(s.indexOf("llo"));
        System.out.println("-------------------------------");
        //int indexOf（int ch，int fromIndex）返回指定字符在此字符串中在指定位置后第一次出现的索引
        System.out.println(s.indexOf("w", 4));
        //int indexOf（String str，String fromIndex）返回指定字符串在此字符串中在指定位置后第一次出现的索引
        System.out.println(s.indexOf("word", 5));
        //String substring（int start，int end）截取字符串
        System.out.println("---------------------------------");
        /*
        小练习：遍历数组的每一个字符
               分析：1，如何拿到每一个字符呢
                      char charAt（int index）
                      2，字符个数有多少个
                          int length

         */
        //定义字符串
        String s1 = "helloword";
        for (int x = 0; x < s1.length(); x++) {
            System.out.println(s1.charAt(x));
        }
        /*
        统计一个字符 大写几个 小写几个 数字几个
                  1， bigcount
                      smallcount
                       numbercount
                  2，遍历字符串，得到每一个字符
                     大：bigcount
                      小：smallcount
                      字符：numbercount
                   3，如何判断这个字符是哪种类型：
                         char ch=s。charAt（x）；
                         ch>="0"&&ch<="9"//数字字符
                         ch>="a"&&ch<="z"//小
                         ch>="A"&&ch<="Z"//大
         */
        //定义一个字符串
        String s3 = "helloWord111";
        //定义三个统计变量
        int bigcount = 0;
        int smallcount = 0;
        int numbercount = 0;
        //遍历字符串，获取每个字符
        for (int x = 0; x < s3.length(); x++) {
            System.out.println(s3.charAt(x));

            //判断该字符是哪种类型的
            if (s3.charAt(x) >= 'a' && s3.charAt(x) <= 'z') {
                smallcount++;
            } else if (s3.charAt(x) >= 'A' && s3.charAt(x) <= 'Z') {
                bigcount++;
            } else if (s3.charAt(x) >= '0' && s3.charAt(x) <= '9') {
                numbercount++;
            }
        }
        //输出结果
        System.out.println(smallcount++ + "-----" + bigcount++ + "------" + numbercount++ + "----");
        /*
        String 类的转换功能
             byte[] getByte[] 把字符串转为字节数组
             char[] toCharArray()把字符串转为字符数组
             注意：valueOf方法可把任意类型的转换为字符串
             static String valueOf（char[] chs ）把字符数组转换为字符串
             static String valueOf(int i)把int类型的数据转成字符串
             String toLowerCase()把字符串转成小写     //它本身不变
             String toUpperCase（）把字符串改成大写
             String concat（String str）把字符串拼接
         */
        //定义一个字符串
        String s4 = "JavaSE";
        // byte[] getByte[] 把字符串转为字节数组
        for (int x = 0; x < s.getBytes().length; x++) {
            System.out.println(s.getBytes()[x]);
        }
        //char[] toCharArray()把字符串转为字符数组
        for (int x = 0; x < s4.toCharArray().length; x++) {
            System.out.println(s4.toCharArray()[x]);
        }
        //static String valueOf（char[] chs ）把字符数组转换为字符串
        System.out.println(String.valueOf(s4.toCharArray()));
        //static String valueOf(int i)把int类型的数据转成字符串
        int i = 100;
        System.out.println(String.valueOf(i));
        /*
    需求：把一个字符串的首字母转大写，其余全小写
         内容：helloWord
         需求：Helloword
     */
        //定义一个字符串
        String sss="helloWord";
        //先获取第一个字符
        String sss1=sss.substring(0,1);
        //获取除啦第一个字符以外的其他字符
        String sss2=sss.substring(1);//管头不管尾
        //将第一个字符转为大写
        String sss3=sss1.toUpperCase();
        //把其他字符转成小写
        String sss4=sss2.toLowerCase();
        //把其他字符拼接到第一个字符上
        String sss5=sss3.concat(sss4);
        System.out.println(sss5);

    }

}