package com.company;
//测试Class类的创建方式有哪些
public class ClassCreateTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person=new Student();
        System.out.println("这个人是："+person.name);
        //方式一：通过对象获得
        Class aClass1=person.getClass();
        System.out.println(aClass1.hashCode());
        //方式二：forname获得
        Class aClass2=Class.forName("com.company.Student");
        System.out.println(aClass2.hashCode());
        //方式三：通过类名.class获得
        Class aClass3=Student.class;
        System.out.println(aClass3.hashCode());
        //方式四：基本内置类型的包装类都有一个type属性
        Class aClass4=Integer.TYPE;
        System.out.println(aClass4);
        //获得父类类型
        Class aClass5=aClass1.getSuperclass();
        System.out.println(aClass5);
    }
}
class Person{
    public String name;
    public Person(){
    }
    public Person(String name){
        this.name=name;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Student extends Person{
    public Student(){
        this.name="学生";
    }
}
class Teacher extends Person{
    public Teacher(){
        this.name="老师";
    }
}
