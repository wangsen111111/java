package com.company;
/*
猫狗案例：先找到具体的事物，然后发现具体的事物有共性，才提取出一个父类
猫;     成员变量：姓名，年龄，颜色
         构造方法：无参，带参
         成员方法:getxxx/setxxx
                  eat()
                  playGame()
狗：      成员变量：姓名，年龄，颜色
           构造方法:无参，有参
           成员方法：getxxx/setxxx
                    eat()
                    lookDoor()
 共性：成员变量：姓名，年龄，颜色
        构造方法：无参，有参
        成员方法：getxxx（）/setxxx（）
                 eat（）
 把共性定义到一个类中，这个类的名字叫：动物。
 动物类：
        成员变量：姓名，年龄，颜色
        构造方法：无参，有参
        成员方法：getxxx（）/setxxx（）
                 eat（）
         构造方法：猫playGame（），狗lookDoor（）
 ............................................................

父类中如果没有无参构造方法(也即父类中只给了带参构造方法)，子类的构造方法怎么办？
　　法1:子类的构造方法通过 super(...); 去显示调用父类的带参构造方法。
　　法2:子类的构造方法通过 this();/this(...); 调用本类的其他的构造方法，但是子类的其他的构造方法中一定会有一个去访问了父类的带参构造方法。
　　法3:让父类提供无参构造。
　　注意事项： this();/this(...);/super(...); 这三个语句访问子类或父类的构造方法的时候，必须放在第一句语句上。
　　　　　　　 否则，就可能会对父类数据进行多次初始化。

 */
class Animal{
    public Animal() {
    }

    private String name;
    private int age;
    private String colour;
    public Animal(String name,int age,String colour){
        this.age=age;
        this.colour=colour;
        this.name=name;

    }

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

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public void eat(){
        System.out.println("该吃饭啦！");
    }
}
//定义猫类
class Cat extends Animal{
    public Cat(){

    }
    public Cat(String name,int age,String colour){
        //super(name, age, colour);
    }
    public void playGame(){
        System.out.println("猫玩游戏");
    }
}
class Dog extends Animal{
    public Dog(){

    }
    public Dog(String name,int age,String colour){
        // super(name, age, colour);
    }
    public void lookDoor(){
        System.out.println("狗会看门");
    }

}

public class 继承写猫狗 {

    public static void main(String[] args) {
        //测试猫类方法1
        Cat c1=new Cat();
        c1.setName("Tom");
        c1.setAge(3);
        c1.setColour("白色");
        System.out.println(c1.getName()+"....."+c1.getAge()+"....."+c1.getColour());
        c1.eat();
        c1.playGame();
        //测试猫类方法2
        Cat c2=new Cat("杰瑞",5,"白色");
        c2.eat();
        c2.playGame();
    }
}
