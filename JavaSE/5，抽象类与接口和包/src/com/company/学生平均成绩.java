package com.company;

interface Achievement//定义一个接口Achievement
{
    float average();
}    //声明一个返回float型的方法average( )

class Person1//创建一个类Person
{
    String name;
    int age;

    public Person1(String newName, int newAge) //构造方法Person
    {
        name = newName;
        age = newAge;
    }

    public void introduce()//定义一个有返回值方法introduce()
    {
        System.out.println("你好，我是"+name + age+"岁" );
    }
}

class Student extends Person1 implements Achievement //继承Person类并实现Achievement接口
{
    int chinese, math, english;

    public Student(String newName, int newAge) {
        super(newName, newAge);
    }   //调用父类的构造方法Person(String newName, int newAge)

    public void setScore(int c, int m, int e) {
        chinese = c;
        math = m;
        english = e;
    }

    public float average() {
        return (chinese + math + english) / 3;
    }
}

class 学生平均成绩 {
    public static void main(String[] args) {
        Student s1 = new Student("李知恩", 6);
        s1.introduce();  //调用s1的introduce( )方法
        s1.setScore(1314, 1314, 1314);
        System.out.println(s1.average());//显示s1的平均分
    }
}
