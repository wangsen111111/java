package com.company;
/*
OutputStreamWriter(OutputStream out):根据默认编码把字节流的数据转换为字符流
OutputStreamWriter(OutputStream out,String charsetName):根据指定编码把字节流数据转换为字符流
把字节流转换为字符流
字符流=字节流+编码表
OutputStreamWriter的方法:
public void write(int, c) :写一个字符
public void write (char[] cbuf) :写一个字符数组
public void write (char[] cbuf, int off, int, len) :写一个字符数组的一部分，len几个
public void write (String stx) :写一个字符串
public void write (String stX, int off,int len) :写一个字符串的一部分

 */

import java.io.*;

public class OutputStreamWriter把字节流转换为字符流 {
    public static void main(String[] args) throws IOException {
        //创建对象
        OutputStreamWriter osw=new OutputStreamWriter(
                new FileOutputStream("osw.txt"),"GBK"
        );
        //写数据
        osw.write("中国");
        osw.write('A');//是在缓冲区里面，没有直接到文件中去
        //不释放资源的话，没有写入数据，因为：字符=2字节，文件中数据存储的基本单位是字节
        //要void flush()刷新该流的缓冲
        osw.flush();
        //释放资源
        osw.close();
    }
}
/*
void flush()刷新该流的缓冲的使用及注意事项：
查阅文档可以发现，IO流中每一个类都实现了Closeable接口，它们进行资源操作之后都需要执行close()方法将流关闭
。但字节流与字符流的不同之处在于：字节流是直接与数据产生交互，而字符流在与数据交互之前要经过一个缓冲区 。

使用字符流对资源进行操作的时候，如果不使用close()方法，则读取的数据将保存在缓冲区中，要清空缓冲区中的数据有两种办法：
public abstract void close() throws IOException
关闭流的同时将清空缓冲区中的数据，该抽象方法由具体的子类实现
public abstract void flush() throws IOException
不关闭流的话，使用此方法可以清空缓冲区中的数据，但要注意的是，此方法只有Writer类或其子类拥有，而在Reader类中并没有提供。此方法同样是在具体的子类中进行实现 。

 面试题：close（)和flush（）的区别
 A：close（）关闭流对象，但是要先刷新一次缓冲区，关闭之后，流对象不可以继续再使用了
 B：flush（）仅仅刷新缓冲区，刷新之后，流对象换可以继续使用
 */
