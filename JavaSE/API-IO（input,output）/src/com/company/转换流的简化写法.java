package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
转换流的名字比较长，而我们常见的操作都是按照本地默认编码实现的，
所以，为了简化我们的书写，转换流提供了对应的子类FileWriter和FileReader

由于我们常见的操作都是使用本地默认编码,所以,不用指定编码。
而转换流的名称有点长，所以，Java就提供了其子类供我们使用。
OutputStreamWriter = FileOutputStream +编码表(GBK)
FileWriter（OutputStreamWriter的子类） = FileOutputStream +编码表(GBK)
InputStreamReader = FileInputStream +编码表(GBK)
FileReader（InputStreamReader） = FileInputStream +编码表(GBK)

 */
/*
需求：把当前目录下的fos1.txt内容复制到当前目录下的fos.txt文件中
数据源：fos1.txt--读取数据--字符转换流--InputStreamReader--FileWriter
目的地：fos.txt--写出数据--字符转换流--OutputStreamWriter--FileReader
 */
public class 转换流的简化写法 {
    public static void main(String[] args) throws IOException {
        //封装数据源
        FileReader fr=new FileReader("fos1.txt");
        //封装目的地
        FileWriter fw=new FileWriter("fos.txt");
        //一次读取一个字符数组
        char[] chs=new char[1024];
        int len=0;
        while((len=fr.read(chs))!=-1){
            fw.write(new String(chs,0,len));
        }
        //释放资源
        fw.close();
        fr.close();
    }
}
