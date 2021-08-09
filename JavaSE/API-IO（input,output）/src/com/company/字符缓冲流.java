package com.company;
/*
字符流为了高效写入，也提供了对应的字符缓冲流
BufferedWriter；字符缓冲输出流
         将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组、和字符串的高效写入
         可以指定缓冲区的大小，或者接受默认的大小，在大多情况下，默认值就足够大了
BufferedReader:字符缓冲输入流

 */

import java.io.*;

public class 字符缓冲流 {
    public static void main(String[] args) throws IOException {
        //BufferedReader：字符缓冲输入流，封装数据源
        BufferedReader br=new BufferedReader(new FileReader("fos1.txt"));
        //BufferedWriter:字符缓冲输出流,封装目的地
        BufferedWriter bw=new BufferedWriter(new FileWriter("fos.txt"));
        //一次读取一个字节数组
        int len=0;
        char[] chs=new char[1024];
        while((len=br.read(chs))!=-1){
            bw.write(new String(chs,0,len));
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
