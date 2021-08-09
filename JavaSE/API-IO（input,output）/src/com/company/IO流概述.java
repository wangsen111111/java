package com.company;
/*
IO流概述：
       IO流用来处理设备之间的数据传输
       ●.上传文件和下载文件
       Java对数据的操作是通过流的方式
       Java用于操作流的对象都在IO包中
java中IO流的分类：
       按照数据流向：
                输入流  读入数据
                输出流  写出数据
        按照数据类型：
                 字节流
                      字节输入流：   读取数据  InputStream(abstract抽象类，要学习它具体的子类)


                      字节输出流：   写出数据  OutputStream(abstract抽象类)
                                           字节输出流操作步骤：
                                                        A；创建字节输出流对象
                                                        B:写数据
                                                              public void write (int b) :写一个字节
                                                              public void write (byte[] b) :写-一个字节数组
                                                              public void write (byte[] b, int off,int len) :写一个字节数组的一部分
                                                        C:释放资源
                 字符流
                      字符输入流：    读取数据  Reader(abstract抽象类)
                      字符输出流：    写出数据  Writer(abstract抽象类)
                  注意：一般我们在探讨IO流的时候，如果没有明确说明按哪种分类来说，默认情况下是按照数据类型来分的
            什么情况下使用哪种流呢？
            如果数据所在的文件通过windows自带的笔记本打开并能读懂里面的内容，就用字符流，其他用字节流
            如果什么都不知道，就用字节流


 */

public class IO流概述 {
}
