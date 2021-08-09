package com.company;
/*
字节输出流操作步骤：
A；创建字节输出流对象
B:写数据
public void write (int b) :写一个字节
public void write (byte[] b) :写-一个字节数组
public void write (byte[] b, int off,int len) :写一个字节数组的一部分
C:释放资源
 */
/*
1，如何实现数据的换行?
为什么现在没有换行呢?因为你只写了字节数据,并没有写入换行符号。如何实现呢?写入换行符号即可呗。
刚才我们看到了有写文本文件打开是可以的,通过windows自带的那个不行,为什么呢?
因为不同的系统针对不同的换行符号识别是不-样的?
windows: \r\n
linux: \n
Mac: \r
而一些常见的个高级记事本,是可以识别任意换行符号的。
2如何实现数据的追加写入?
  用构造方法带第二个参数是true的情况即可

 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
需求：我要往文本文件中输入一句话：hello，io。
分析：
    A:这个操作最好是采用字符流来做，但是呢？字符流是在字节流之后才出现的，所以，今天我们先讲字节流如何操作
    B:由于我是要往文件中写一句话，所以我们要采用字节输出流
通过上面的分析后我们知道要使用FileOutputStream
但是通过查看API，我们发现该流对象是一个抽象类，不能实例化。
所以，我们要找一个具体的子类
而我们要找的子类是什么名字的呢？
我们要在文件里写东西  文件时File
然后用的是字节输出流，连起来就是：FileOutputStream
注意：每种基类的子类都是以父类名作为后缀名
     XxxOutputStream
     XXxInputStream
     XxxReader
     XxxWriter
查看FileOutputStream的构造方法:
     FileOutputStream(File file)
     FileOutputStream(String name)


 */
public class 用OutputStream类往文本文件写东西 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        // FileOutputStream(File file)
        /*
         File file = new File("fos. txt") ;
         FileOutputStream fos = new FileOutputStream(file) ;
         */
        // FileOutputStream (String name)

        FileOutputStream fos1 = new FileOutputStream("fos1. txt",true);
            /*
            创建字节输出流对象做了几件事情：
            A:调用系统功能去创建文件
            B:创建fos对象
            C:把fos对象指向这个文件
             */
        //写数据
        fos1.write("hello,IO\r".getBytes());
        //释放资源
        //关闭此文件输出流并释放与此流有关的所有系统资源。
        fos1.close();
        /*
         *为什么一-定要close ()呢?
         * A: 让流对象变成垃圾,这样就可以被垃圾回收器回收了
         * B: 通知系统去释放跟该文件相关的资源
         *    (系统在一开始就帮我们创建了文件，就会帮我们去管理这个文件，
         *     操作完如果不close的话，系统根本就不知道，以为你换用着，一直用着，这个文件就不能关闭
         *     数据一直耗费系统资源，所以要close一下，去通知系统去释放跟文件相关的资源)
         */
        //java.io.IOException: Stream Closed
        /*
        标准的IO流写东西，与异常处理
         */
        //改进版
        //为了在finally里面能够看到该对象就必须定义到外面,为了访问不出问题,还必须给初始化值
        FileOutputStream fos = null;
        try {
            // fos = new FileOutputStream("z: \\fos4.txt") ;
            fos = new FileOutputStream("fos. txt");
            fos.write("java".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();//printStackTrace()方法的意思是：在命令行打印异常信息在程序中出错的位置及原因
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //如果fos不是null,才需要close ()
            if (fos != null)
                //为了保证close ()一定会执行,就放到这里了
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }
}
