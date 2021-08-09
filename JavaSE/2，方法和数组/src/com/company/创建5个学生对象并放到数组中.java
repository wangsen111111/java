package com.company;
/*
有5个学生对象，把5个学生对象的信息存储到数组中，遍历数组，得到每一个学生的信息
    学生：Student
    成员变量：name，age
    构造方法：无参和带参
    成员方法：getxxx（）/setxxx（）
    分析：A创建学生类
    B创建学生数组（对象数组）
    C创建5个学生对象，并赋值
    D把C步骤的元素放到数组中
    E遍历学生数组
 */

public class 创建5个学生对象并放到数组中 {
    public 创建5个学生对象并放到数组中(String[] args) {
    }

    public static void main(String[] args) {
        //创建学生数组(对象数组)
        /*
        如果这个学生对象是变化的，java提供啦集合（类似于集合）
         */
        创建Student类[] students = new 创建Student类[5];

        //创建5个学生对象，并赋值
        创建Student类 s1=new 创建Student类("王某",18);
        创建Student类 s2=new 创建Student类("李某",18);
         //D把C步骤的元素放到数组中
        students[0]=s1;
        students[1]=s2;
        //E遍历学生数组
        for(int i=0;i<students.length;i++){
            System.out.println(students[i]);
        }
    }
}
