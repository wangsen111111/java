package com.company;
/*
需求：把C:\Users\王森\IdeaProjects\API-IO（input,output）\fos. txt
     复制到C:\Users\王森\IdeaProjects\API-IO（input,output）\fos1.txt
      字节流四种方式复制文件：
            基本字节流一次读写一个数据  //共耗时：291毫秒
            基本字节流一次读写一个字节数组   //共耗时：2毫秒
            高效字节流一次读写一个字节   //共耗时：5毫秒
            高效字节流一次读写一个字节数组  //共耗时：2毫秒
 */

import java.io.*;

public class 四种读写操作效率的比较 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        // method1("C:\\Users\\王森\\IdeaProjects\\API-IO（input,output）\\fos. txt",
        //     "C:\\Users\\王森\\IdeaProjects\\API-IO（input,output）\\fos1.txt");
        //method2("C:\\Users\\王森\\IdeaProjects\\API-IO（input,output）\\fos. txt",
        //        "C:\\Users\\王森\\IdeaProjects\\API-IO（input,output）\\fos1.txt");
        //method3("C:\\Users\\王森\\IdeaProjects\\API-IO（input,output）\\fos. txt",
        //      "C:\\Users\\王森\\IdeaProjects\\API-IO（input,output）\\fos1.txt");
        method4("C:\\Users\\王森\\IdeaProjects\\API-IO（input,output）\\fos. txt",
                "C:\\Users\\王森\\IdeaProjects\\API-IO（input,output）\\fos1.txt");
        long end = System.currentTimeMillis();
        System.out.println("共耗时：" + (end - start) + "毫秒");
    }

    //基本字节流一次读写一个字节
    public static void method1(String srcString, String destString) throws IOException {
        FileInputStream fis = new FileInputStream(srcString);
        FileOutputStream fos = new FileOutputStream(destString);
        int by = 0;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }
        //释放资源
        fos.close();
        fis.close();
    }

    //基本字节流一次读写一个字节数组
    public static void method2(String srcString, String destString) throws IOException {
        FileInputStream fis = new FileInputStream(srcString);
        FileOutputStream fos = new FileOutputStream(destString);
        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }
        //释放资源
        fos.close();
        fis.close();
    }

    //高效字节流一次读写1一个字节
    public static void method3(String srcString, String destString) throws IOException {
        BufferedInputStream fis = new BufferedInputStream(new FileInputStream(srcString));
        BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(destString));
        int by = 0;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }
        //释放资源
        fos.close();
        fis.close();
    }

    //高效字节一次读取一个字节数组
    public static void method4(String srcString, String destString) throws IOException {
        BufferedInputStream fis = new BufferedInputStream(new FileInputStream(srcString));
        BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(destString));
        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }
        //释放资源
        fos.close();
        fis.close();
    }
}
