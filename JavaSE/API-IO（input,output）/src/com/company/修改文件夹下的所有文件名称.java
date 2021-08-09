package com.company;
/*
需求;
E: \评书\三国演义\三国演义_ 001_ [评书网-今天很高兴 ,明天就I0了]_桃园三结义.avi
改后: E: \评书\三国演义\001_桃园三结义.avi,
思路：
    A:封装目录
    B；获取该目录下所有的文件的File数组
    C:遍历该File数组，得到每一个File对象
    D:拼接一个新的名称，然后重命名即可
 */

import java.io.File;

public class 修改文件夹下的所有文件名称 {
    public static void main(String[] args) {
        //封装目录
        File srcFolder=new File("E:\\王森\\三国演义");
        //获取该目录下的所有的文件的File数组
        File[] fileArray=srcFolder.listFiles();
        //遍历该File数组，得到每一个File对象
        for(File file:fileArray){
           /*
           E: \王森\三国演义\三国演义_ 001_ [评书网-今天很高兴, 明天就I0了]_桃园三结义.avi
           改后: E: \王森\三国演义\001_桃园三结义.avi
            */
            String name=file.getName();//三国演义_ 001_ [评书网-今天很高兴, 明天就I0了]_桃园三结义.avi
            //截001
            int startIndex1=name.indexOf("_");
            String numberString=name.substring(startIndex1+1,startIndex1+5);
            //截桃园三结义
            int startIndex=name.lastIndexOf("_");
            int endIndex=name.lastIndexOf(".");
            String nameString=name.substring(startIndex+1,endIndex);
            //拼接
            String newName=numberString.concat("_").concat(nameString);
             System.out.println(newName);
            //拼路径
            File newFile=new File(srcFolder,newName);//E: \王森\三国演义\001_桃园三结义.avi
            //重命名即可
            file.renameTo(newFile);
        }

    }
}
