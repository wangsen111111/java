package com.company;
/*
InputStreamReader(InputStream is)用默认的编码读取数据
InputStreamReader(InputStream is,String charsetName)用指定的编码读取数据
InputStreamReader的方法：
int read():一次读取一个字符
int read(char[] chs):一次读取一个字符数组
 */

import java.io.*;

public class InputStreamWriter把字节流转换为字符流 {
    public static void main(String[] args) throws IOException {
        //创建对象
        InputStreamReader isr = new InputStreamReader(
                new FileInputStream("fos1.txt")
        );
        //读取数据，一次读取一个字符
        int ch = -0;
        while ((ch = isr.read()) != -1) {
            System.out.print((char) ch);
        }


        //一次读取一个字符数组
        char[] chs = new char[1024];
        int len = 0;
        while ((len = isr.read(chs)) != -1) {
            System.out.println(new String(chs, 0, len));
        }
        //释放资源
        isr.close();
    }
}
