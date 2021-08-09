package com.company;
/*
需求：
   数据源：fos.txt--读取数据--字符转换流--InputStreamReader--FileReader--BufferedReader
   目的地：fos1.txt--写出数据--字符转换流--OutputStreamWriter--FileWriter--BufferedWriter
 */

import java.io.*;

public class 用字符缓冲流的特殊方法来复制文件 {
    public static void main(String[] args) throws IOException {
        //封装数据源
        BufferedReader br = new BufferedReader(new FileReader("fos.txt"));
        //封装目的地
        BufferedWriter bw = new BufferedWriter(new FileWriter("fos1.txt"));
        //读数据
        /*
        BufferedReader:
        public String readLine():一次读取一行数据
        包含该运行内容的字符串，不包含任何终止符，如果已达到流末尾，则返回null
         */
        String line = null;
        while ((line = br.readLine()) != null) {

            /*
            BufferedWriter:
                     public void newLine():根据系统来决定换行符
             */
            bw.write(line);
            bw.newLine();
            bw.flush();

        }
        //释放资源
        bw.close();
        br.close();

    }
}
