package com.company;
/*
由于字节流操作中文不是特别方便，所以java就提供啦转换流
字符流=字节流+编码表
String (byte[] bytes， String charsetName) :通过指定的字符集解码字节数组
byte[] getBytes (String charsetName) :使用指定的宇符集合把字符串编码为字节数组
编码:把看得懂的变成看不懂的
    String -- byte []
解码:把看不懂的变成看得懂的
    byte[] -- String
举例:谍战片(发电报。接电报)
码表:小本子   （字符 数值）
要发送一段文字:
今天晚上在老地方见
发送端:今天--数值--二进制--发出去
接收端:接收--二进制--十进制--数值--字符--今天
今天晚上在老地方见
编码问题简单，之哟啊编码和解码是一致的

 */

import java.util.Arrays;

public class 字符流 {
    public static void main(String[] args) {
        String s="你好";
        //String-->byte[]
        byte[] bys=s.getBytes();
        System.out.println(Arrays.toString(bys));
        //bytes-->String
        String ss=new String(bys);
        System.out.println(ss);

    }
}
