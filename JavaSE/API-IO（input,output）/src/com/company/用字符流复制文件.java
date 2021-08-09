package com.company;
/*
需求：把当前目录下的fos1.txt内容复制到当前目录下的fos.txt文件中
数据源：fos1.txt--读取数据--字符转换流--InputStreamReader
目的地：fos.txt--写出数据--字符转换流--OutputStreamWriter
 */

import java.io.*;

public class 用字符流复制文件 {
    public static void main(String[] args) throws IOException{
        //封装数据源
        InputStreamReader isr=new InputStreamReader(new FileInputStream("fos1.txt"));
        //封装目的地
        OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("fos.txt"));
        //读写数据
        //一次读取一个字符数组
        char[] chs=new char[1024];
        int len=0;
        while((len=isr.read(chs))!=-1){
            osw.write(new String(chs,0,len));
        }
        //释放资源
        osw.close();
        isr.close();

    }
}
