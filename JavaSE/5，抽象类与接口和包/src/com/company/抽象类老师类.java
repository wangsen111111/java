package com.company;
/*
老师案例：具体事物：基础班老师  就业班老师
        共性：姓名，年龄，讲课
      实现：；老师类：
              基础班老师：
              就业班老师：
 */
//定义抽象的老师类
abstract class Teacher{
    //姓名
    private String name;
    //年龄
    private int age;
    //get set fngfa  alt加insert
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //无参构造方法
    public Teacher(){}
    //带参构造方法
    public Teacher(String name,int age){
        this.age=age;
        this.name=name;
    }
    //定义抽象方法
    public abstract void teach();//抽象方法：强制要求子类做的
}
//基础班老师
class BasicTeacher extends Teacher{
    //无参构造
    public BasicTeacher(){
    }
    //有参构造
    public BasicTeacher(String name,int age){
        super(name,age);
    }
    public void teach(){
        System.out.println("基础班老师讲解Java SE");
    }
}
//就业班老师
class WorkTeacher extends Teacher{
    //无参构造
    public WorkTeacher(){
    }
    //有参构造
    public WorkTeacher(String name,int age){
        super(name,age);
    }
    public void teach(){
        System.out.println("就业班老师讲解Java EE");
    }
}

public class 抽象类老师类{

    public static void main(String[] args) {
        //多态测试
        Teacher t=new BasicTeacher();
        /*
        多态：向上转型：Fu f=new Zi（）；
                        孔子爹 k爹=new 孔子（）；
              向下转型：Zi z=（Zi）f；要求f必须能转换为Zi的
                          孔子 k爹=（孔子）k爹；
         //定义为狗
        Animal a=new Dog();//向上转型 fu f=new Zi；
        a.eat();
        System.out.println("-------------");
        //还原成狗
        Dog d=(Dog)a;
        d.eat();
        d.lookDoor();
        System.out.println("--------------");
        //变成猫
        a=new Cat();
        a.eat();
        System.out.println("---------------");
        //还原成猫
        Cat c=(Cat)a;
        c.eat();
        c.playGame();
        System.out.println("----------------");
         */
        t.setName("薛蒲叶");
        t.setAge(56);
        System.out.println(t.getName()+"........"+t.getAge());
        t.teach();
        System.out.println("-------------------------");
        t=new BasicTeacher("薛蒲叶",26);
        System.out.println(t.getName()+"........"+t.getAge());
        t.teach();
        System.out.println("-------------------------");
        //就业班老师
        t=new WorkTeacher("薛老师",16);
        System.out.println(t.getName()+"........"+t.getAge());
        t.teach();
    }
}
