package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class IO练习 {
    public static void main(String[] args)throws IOException {
        /*
        1，把ArrayList集合中的字符串数据，存储到文本文件a.txt
           分析:ArrayList集合中存储的是字符串
               遍历ArrayList集合，获取数据
               然后将数据写到文本文件中
               文本文件说明使用字符流
           数据源：ArrayList<String>--遍历得到每一个字符串数据
           目的地：a.txt--FileWriter--BufferedWriter
         */
        //封装数据源(创建集合对象)
        ArrayList<String> array=new ArrayList<>();
        //给集合添加元素
        array.add("hello");
        array.add("word");
        array.add("java");
        //封装目的地
        BufferedWriter bw=new BufferedWriter(new FileWriter("a.txt"));
        //遍历集合，得到数据，将数据写到文件中
        for(String s:array){
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        //释放资源
        bw.close();
        /*
        2,从文本文件中读取数据（每一行为一个字符串数据）到集合中，并遍历集合
        分析： 数据源是一个文本文件
              目的地是一个集合
              而且元素是字符串
        数据源：
             fos.txt--FileReader--BufferedReader
        目的地：
             ArrayList<String>
         */
        //封装数据源
        BufferedReader br=new BufferedReader(new FileReader("fos.txt"));
        //封装目的地
        ArrayList<String> array1=new ArrayList<String>();
        //读取文件，并存储到集合中
        String line=null;
        while((line=br.readLine())!=null){
            array1.add(line);
        }
        //释放资源
        br.close();
        //遍历集合
        for(String s:array1){
            System.out.println(s);
        }
        /*
        3，需求：我有一个文本文件中存储了几个名称，请大家写一个程序来随机获取一个人的名称
           分析：把文本文件中的数据存储到集合中
                随机产生一个索引
                根据索引拿这个名称
           数据源：a,txt--FileReader--BufferedReader
           目的地：ArrayList<String>
         */
        //封装数据源
        BufferedReader br11=new BufferedReader(new FileReader("a.txt"));
        //封装目的地
        ArrayList<String> array11=new ArrayList<String>();
        //读取文件，并把文本文件中的数据存储到集合中
        String line1=null;
        while((line1=br11.readLine())!=null){
            array11.add(line1);
        }
        //释放资源
        br11.close();
        //产生一个随机数
        Random r=new Random();
        //public int nextInt(int n)返回的是[0,n]范围内的随机数
        int index=r.nextInt(array11.size());
        //根据索引拿这个值
        System.out.println("hello word java中获取的是："+array11.get(index));
        /*
        4，需求：复制单级文件夹
           数据源：C:\\Intel
           目的地：C；\\copyFolder
           分析：封装目录
                获取该目录下的所有文本的File数组
                遍历该File数组，得到每一个File对象
                把该File进行复制
         */
        //封装目录
        File srcFolder=new File("D:\\JAVA");
        File destFolder=new File("D:\\copyFolder");
        //判断目标文件夹是否存在不存在的话，新建一个
        if(!destFolder.exists()){
            destFolder.mkdir();
        }
        //获取数据源文件的所有File数组
        File[] fileArray=srcFolder.listFiles();
        //遍历该File数组，得到每一个File对象
        for(File file:fileArray){
            //获取数据源文件夹中的所欲文件名称
            String name=file.getName();
            //根据File的构造方法  File file=new File("e:\\demo","a.txt");根据一个目录和一个子文件得到一个File对想
            File newFile=new File("D:\\copyFolder",name);
            copyFolder(file,newFile);
        }


    }

    private static void copyFolder(File file, File newFile)throws IOException {
        //封装数据源
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(file));
        //封装目的地
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(newFile));
        //读写数据
        //因为其中不只有文本文件，所以我们使用字节流
        byte[] bys=new byte[1024];
        int len=0;
        while((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        //释放资源
        bos.close();
        bis.close();
    }
}
