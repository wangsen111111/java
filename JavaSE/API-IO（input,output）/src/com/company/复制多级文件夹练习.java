package com.company;
/*
需求：复制多级文件夹
数据源：D:\\JAVA
目的地：D:\\JAVA这是多级文件夹的复制品
分析：A；封装数据源File
     B:封装目的地File
     C:判断该文件是文件夹换是文件
       是文件夹：
         a:就在目的地下创建该文件夹
         b:获取该原File对象的所有文件或文件夹File对象
         c:遍历得到源文件中的每一个File对象
         d:回到C
       是文件：
        就复制（字节流）
 */

import java.io.*;

public class 复制多级文件夹练习 {
    public static void main(String[] args) throws IOException {
        //封装数据源
        File srcFile = new File("D:\\\\JAVA");
        //封装目的地
        File destFile = new File("D:\\\\JAVA这是多级文件夹的复制品");
        //判断目的地是否存在，不存在就创建一个
        if (!destFile.exists()) {
            destFile.mkdir();
        }
        //写一个功能，来实现复制多层文件夹
        copyFolder(srcFile, destFile);
    }

    private static void copyFolder(File srcFile, File destFile) throws IOException {
        //判断该源文件是文件还是文件夹
        if (srcFile.isDirectory()) {
            //是文件夹,就在目的地下创建该文件夹
            File newFolder = new File(destFile, srcFile.getName());
            newFolder.mkdir();
            //获取原srcFile对象的所有文件或文件夹的File对象
            File[] fileArray = srcFile.listFiles();
            //遍历文件得到原文件夹下的所有File对象
            for (File file : fileArray) {
                //利用递归回到C
                copyFolder(file, newFolder);
            }


        } else {
            //是文件，直接复制
            File newFile = new File(destFile, srcFile.getName());
            copyFile(srcFile, newFile);
        }
    }

    private static void copyFile(File srcFile, File newFile) throws IOException {
        //封装数据源
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        //封装目的地
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile));
        //读写数据
        int len = 0;
        byte[] bys = new byte[1024];
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
        //释放资源
        bos.close();
        bis.close();
    }
}
