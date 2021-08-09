package com.company;
/*
内部类概述:
       把类定义在其他类的内部这个类就被称为内部类
       举例:在类A中定义了一个类B，类B就是内部类。
内部的访问特点:
       A:内部类可以直接访问外部类的成员包括私有
       B:外部类要访问内部类的成员必须创建对象
内部类位置
        成员位置:在成员位置定义的类，被称为成员内部类
        局部位置:在局部位置定义的类，被称为局部内部类
成员内部类:
        如何真接访问内部类的成员
         外部类名.内部类名 对象名=外部类对象.内部类对象;
         Outer.Inner oi=new Outer.new Inner();
         一般内部类就是不让外界直接访问的（Body和Heart）
@为什么静态方法不能调用非静态的变量和方法
因为静态是随着累的加载而加载的  也就是说类只要存在了，那么静态就存在了，而静态是优先于对象存在的  ，
你要访问非静态的东西，也就是非静态的成员（包括变量和方法），非静态的东西还没存在你怎么访问的到吗？
@静态方法中不可以定义this，super关键字
  因为静态优先于对象存在，所以静态方法中不可以出现this，super关键字
@静态类和非静态类重要的区别是在于静态类不能被实例化，也就是说不能使用 new 关键字创建静态类类型的变量。
使用static关键字来声明静态类，这样的意义在于：首先，它防止程序员写代码来实例化该静态类；
其次，它防止在类的内部声明任何实例字段或方法
注意：在静态类中只能访问静态成员；
静态类：   调用方式：< 静态类名.静态方法 >
非静态类： < 非静态类名  变量=new 非静态类名();>
@成员内部类的絛饰符:
      private为了保证数据的安全性
      static为了方便访问数据//Outer.Inner.show2();
          注意静态内部类访问的外部类数据必须用静态修饰
     案例我有一个人（人有身体，身体内有心脏)private为了保证数据的安全性
       Body b=new Body();
       b.method(); //private为了保证数据的安全性
     class Body {
         private class Heart {
             public void operator () {
                 System. out.println("心脏搭桥") ;
                 }
                }
          public void method() {
              if(如果你是外科医生) {
                  Heart h = new Heart() ;
                  h. operator() ;
                    }
                   }
    static为了方便访问数据
@内部类用静态修饰是因为内部类可以看成是外部类的成员
静态的东西一般不加私有，静态的东西是为了让别人通过类名去访问，加了私有后无意义所以静态的一般不加private而加的是public
class Outer{
public static class Inner{
}}
new Outer是一个对象，Inner为静态成员，类用静态修饰之后，是不能通过外部的对象访问的，
//错误，Outer.Inner oi=new Outer().new Inner();
成员内部类被静态修饰后的访问方式是：Outer.Inner oi=new Outer.Inner();
//内部类和外部类没有继承关系
//通过外部类名限定this对象   Outer.this

 */
class Outer {
    public int num = 10;
    class Inner {
        public int num = 20;
        public void show() {
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            //System. out . println (new Outer() .num) ;
            System.out.println(Outer.this.num);
        }
    }
}
public class 内部类 {
    public static void main(String[] args) {
     Outer.Inner oi=new Outer().new Inner();
     oi.show();
    }
}
