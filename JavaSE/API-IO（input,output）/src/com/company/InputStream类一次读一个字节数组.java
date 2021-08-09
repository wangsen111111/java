package com.company;
/*
有的文件占的字节太大，一次读一个太慢，效率太低--》  A:int read() :一次读取一个字节
                                          B:int read (byte[] b) :一次读取一个字节数组（int 为实际读取的字节个数）
                                             返回值其实是实际读取的字节个数
                                             明确两件事情:
        1.方法的参数byte[]的作用?
            起到缓冲作用,存储每次读取到的多个字节
            数组的长度一把定义为1024(1kb)或者1024的整数倍
        2.方法的返回值int是什么?
            每次读取的有效字节个数

 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStream类一次读一个字节数组 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fis=new FileInputStream("C:\\Users\\王森\\IdeaProjects\\API-IO（input,output）\\src\\com\\company\\fos.txt");
        //数组的长度一般是1024或者1024的整数倍
        byte[] bys=new byte[1024];
        int len=0;
        while((len=fis.read(bys))!=-1){
            /*
            String类的构造方法:
                         String(byte[] bytes) :把字节数组转换为字符串
                         String(byte[] bytes, int offset, int length) 把字节数组的一部分转换为字符串 offset:数组的开始索引 length:转换的字节个数
             */
            System.out.println(new String(bys,0,len));//0~len返回值其实是实际读取的字节个数
        }
        //释放资源
        fis.close();
    }
}
