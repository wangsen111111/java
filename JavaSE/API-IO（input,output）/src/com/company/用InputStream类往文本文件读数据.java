package com.company;
/*
字节输入流操作步骤:
               A:创建字节输入流对象
               B:调用read()方法读取数据,并把数据显示在控制台
                 读取数据的方式:
                            A:int read() :一次读取-一个字节
                            B:int read (byte[] b) :一次读取一个字节数组
                            每次可读取多个数据，提高了操作效率
               C:释放资源

 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class 用InputStream类往文本文件读数据 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fis=new FileInputStream("C:\\Users\\王森\\IdeaProjects\\IdeaProjects\\字符串\\src\\com\\company\\反转单词.java");
        //调用read（）方法读取数据据(读取，赋值，判断)，并把数据显示在控制台
        int by=0;
        while((by=fis.read())!=-1){
         System.out.print((char) by);
        }
        //释放资源
        fis.close();
    }
}
