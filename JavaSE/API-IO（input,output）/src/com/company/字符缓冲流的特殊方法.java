package com.company;
/*
字符缓冲流的特殊方法：
BufferedWriter:
   public void newLine():（写换行符）根据系统来决定换行符
   public void write(String s, int off,int len)写入字符串的某一部分
BufferedReader:
   public String readLine():一次读取一行数据
   包含该运行内容的字符串，不包含任何终止符，如果已达到流末尾，则返回null
 */

import java.io.*;

public class 字符缓冲流的特殊方法 {
    public static void main(String[] args)throws IOException {
        write();
        read();
    }

    private static void read()throws IOException {
        //创建字符缓冲输入流对象
        BufferedReader br=new BufferedReader(new FileReader("fos.txt"));
        String line=null;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
        //释放资源
        br.close();
    }

    private static void write() throws IOException  {
        //创建字符缓冲输出流对象
        BufferedWriter bw=new BufferedWriter(new FileWriter("fos2.txt"));
        for(int x=0;x<10;x++){
            bw.write("hello"+x);
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
