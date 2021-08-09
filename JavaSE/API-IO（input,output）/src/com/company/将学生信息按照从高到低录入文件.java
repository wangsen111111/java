package com.company;
/*
题目：键盘录入5个学生信息，（姓名，语文成绩，数学成绩，英语成绩）按照总分从高到低存入到文本文件
分析：创建学生类
     创建集合对象
        TreeSet<String>
     键盘录入学生信息存储到集合
     遍历集合，把数据写到文本文件
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class 将学生信息按照从高到低录入文件 {
    public static void main(String[] args) throws IOException {
        //创建集合对象  TreeSet比较器排序Student 让集合的构造方法接收一个比较器接口的子类对象Comparator
        TreeSet<Student> ts=new TreeSet<Student>(new Comparator<Student>(){
            @Override
            public int compare(Student s1,Student s2) {
                //主要条件
                int num=s2.getSum()-s1.getSum();
                //如果总分相同，比较语文成绩
                int num1=num==0?s1.getChinese()-s2.getChinese():num;
                //如果语文成绩也相同，就比较数学成绩
                int num2=num1==0?s1.getMath()-s2.getMath():num1;
                //成绩都相同，比较名字
                int num3=num2==0?s1.getName().compareTo(s2.getName()):num2;
                return num3;
            }
        });
        //键盘录入学生信息存储到集合
        for(int x=1;x<=5;x++) {
            System.out.println("请输入第"+x+"个学生的信息");
            Scanner sc = new Scanner(System.in);
            //输入名字
            System.out.println("姓名：");
            String name = sc.nextLine();
            //输入语文成绩
            System.out.println("语文成绩：");
            int chinese= sc.nextInt();
            //输入英语成绩
            System.out.println("英语姓名：");
            int english = sc.nextInt();
            //输入数学成绩
            System.out.println("数学姓名：");
            int math= sc.nextInt();
            //创建学生对象
            Student s=new Student();
            s.setName(name);
            s.setChinese(chinese);
            s.setMath(math);
            s.setEnglish(english);
            //把学生对象添加到集合
            ts.add(s);
        }
        //遍历集合，把数据写到文本文件fos.txt
        BufferedWriter bw=new BufferedWriter(new FileWriter("fos.txt"));
        bw.write("学生信息如下：");
        bw.newLine();
        bw.flush();
        bw.write("学生姓名，语文成绩，数学成绩，英语成绩：");
        bw.newLine();
        bw.flush();
        /*
        StringBuilder(线程安全的可变的字符串)，它的内容和长度可变，而String不可变，使用StringBuilder做字符串的拼接，不会浪费太多资源
         */
        for(Student s:ts) {
            StringBuilder sb = new StringBuilder();//创建字符串缓冲区对象
            sb.append(s.getName()).append(",").append(s.getChinese()).append(",")
                    .append(s.getMath()).append(",").append(s.getEnglish());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        //释放资源
        bw.close();
        System.out.println("学生信息输入完毕");


    }
}
