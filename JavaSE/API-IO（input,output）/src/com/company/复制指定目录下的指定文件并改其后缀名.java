package com.company;
/*
需求：复制指定目录下的指定文件，并修改其后缀名
指定的文件： .java文件
指定的后缀名: .jad文件
指定的目录是：jad
数据源：D:\\JAVA\\A.java
目的地：D:\\JAVA文件的复制品\\A.jad
  分析：A:封装目录
       B：获取该目录下的java文件的File数组
       C:遍历该File数组，得到每一个File对象
       D：把该File进行复制
       E:在目的地目录下改名
 */

import javax.swing.filechooser.FileFilter;
import java.io.*;

public class 复制指定目录下的指定文件并改其后缀名 {
    public static void main(String[] args) throws IOException {
       //封装目录
        File srcFolder=new File("D:\\\\JAVA");
        File destFolder=new File("D:\\\\JAVA文件夹的复制品");
        //判断目的地是否存在，不存在新建一个
        if(!destFolder.exists()){
            destFolder.mkdir();
        }
        //获取源文件下的所有File数组,并判断其是否是以java结尾的File数组（FilenameFilter为接口，文件名称过滤器）
        File[] fileArray=srcFolder.listFiles(new FilenameFilter(){

            @Override//判断其是否是以后缀名为java结尾的File文件
            public boolean accept(File dir, String name) {
                return new File(dir,name).isFile()&&name.endsWith(".java");
            }
        });
        //遍历该File数组，得到每一个File对象
        for(File file:fileArray){
          //System.out.println(file);//D:\JAVA\HelloWorld.java  目的地：D:\JAVA文件夹的复制品\HelloWorld.jad
            //将JAVA换为JAVA文件的复制品
            String name=file.getName();
            File newFile=new File(destFolder,name);
           // System.out.println(newFile);//D:\JAVA文件夹的复制品\HelloWorld.java
            copyFile(file,newFile);
        }
        //将后面的.java改为.jad，在目的地目录下改名
        File[] destFileArray=destFolder.listFiles();
        for(File destFile:destFileArray){
          //System.out.println(destFile);//D:\JAVA文件夹的复制品\HelloWorld.java
            String name=destFile.getName();
           // System.out.println(destFile.getName());//HelloWorld.java
            String newName=name.replace(".java",".jad");
            //File file=new File("E:\\demo","a.txt");根据一个目录和一个子文件得到一个File对象
            File newFile=new File(destFolder,newName);
            destFile.renameTo(newFile);
        }

    }

    private static void copyFile(File file, File newFile) throws IOException{
        //封装数据源
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
        //封装目的地
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(newFile));
        //读写数据，使用字节流
        int len=0;
        byte[] bys=new byte[1024];
        while((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        //释放资源
        bos.close();
        bis.close();
    }

}
