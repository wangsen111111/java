package com.company;

class PersonB/*创建父类PersonB*/ {
    String name;
    int age;

    public PersonB() {
        System.out.println("PersonB( )被调用");
    }

    public PersonB(String newName) {
        name = newName;
        System.out.println("PersonB(String newName)被调用");
    }

    public void introduce()//父类成员方法introduce（）
    {
        System.out.println(name + age);
    }
}

class StudentB extends PersonB /*创建子类StudentB，利用 extends 调用父类personB*/ {
    public StudentB() {
        System.out.println("StudentB()被调用");
    } //创建StudentB类的无参构造方法，能显示"StudentB( )被调用"

    public StudentB(String newName, int newAge)//创建子类StudentB的有参构造方法
    {
        super(newName);  //调用父类的public PersonB(String newName)构造方法，传入newName参数，调用父类中带1个参数的调用方法
        age = newAge; //将newAge赋值给age属性或super.age=520
    }
}

public class 父类与子类//主类
{
    public static void main(String[] args) {
        StudentB s1 = new StudentB();//创建子类Student的实例对象S1
        StudentB s2 = new StudentB("阿泽", 520);
        s2.introduce();    //调用s2的introduce( )方法
    }
}
