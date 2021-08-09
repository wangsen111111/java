package com.company;
/*
●字节流一次读写一个数组的速度明显比一次读写一个字节的速度快很多，
这是加入了数组这样的缓冲区效果，java本身在设计的时候，也
考虑到了这样的设计思想(装饰设计模式后面讲解)，就专门提供啦带缓冲区的字节类，这种类被称为：缓冲区类（高效类）
所以提供了字节缓冲区流
    ●字节缓冲输出流（写数据）
        BufferedOutputStream
    ●字节缓冲输入流（读数据）
        BufferedInputStream
 构造方法可以指定缓冲区的大小，但是我们一般用不上，因为默认缓冲区大小就足够了
//BufferedOutputStream-水杯(OutputStream out-水的来源)
为什么不传递一个具体的文件或者文件路径，而是传递一个OutputStream对象呢？
  因为字节缓冲区流仅仅提供缓冲区，为高效设计的，但是，真正的读写操作换得靠基本的流对象实现
  创建BufferedInputStream和BufferedOutputStream两个缓冲流对象，
  这两个流都对应了一个大小为8192的字节数组，当调用read()或者write()方法读写数据时，首先将读写的数据存入定义好的字节流数组，然后将字节数组的数据一次性的读写到文件中。


 */

import java.io.*;

public class 字节缓冲流 {
    public static void main(String[] args)throws IOException {
        //BufferedOutputStream(OutputStream out)
        BufferedOutputStream bos=new BufferedOutputStream(
                new FileOutputStream("fos1. txt",true)
        );
        //写数据
        bos.write("hello".getBytes());
        //释放资源
        bos.close();
        //BufferedInputStream(OutputStream out)读数据
        //注意：虽然我们有两种方式可以读取，但是，请注意，这两种方式针对同一个对象在一个代码中只能使用一个
        BufferedInputStream bis=new BufferedInputStream(
                new FileInputStream("fos1. txt")
        );
        /*
        //一次读取一个字节
        int by=0;
        while((by=bis.read())!=-1){
            System.out.print((char)by);
        }
        System.out.println("--------------");

         */
        //一次获取一个字节数组
        byte[] bys=new byte[1024];
        int len=0;
        while((len=bis.read(bys))!=-1){
            System.out.println(new String(bys,0,len));
        }
        //释放资源
        bis.close();
    }
}
