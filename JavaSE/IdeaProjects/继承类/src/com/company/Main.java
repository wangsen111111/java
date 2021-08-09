package com.company;
        abstract class Shape//抽象主类Shape
           {
               abstract float area();//声明一个有返回单精度型的抽象方法area( )
               abstract void printArea();//声明一个没有返回值的抽象方法printArea( )

            }

          class Rectangle extends Shape  //实现类Rectangle继承主类Shape
        {  int width;
            int length;
            public Rectangle(int newWidth,int newLength)
            {    width=newWidth;
                length=newLength;
            }
            float area() //调用主类area方法
            { return width*length; }//实现父类的抽象方法area( )，返回width*length的值
            void printArea()//调用主类printArea方法
            {
              System.out.println("矩形的面积为："+area() );
            }
            //实现父类的抽象方法printArea( )，在屏幕上显示矩形的面积
        }
        class Circle extends Shape//圆类继承主类Shape
        {  final float PI=3.14F;//final定义常量
            int radius;
            public Circle(int newRadius)
            {    radius=newRadius;   }
              float area()
              {
                  return (PI*radius*radius);
              } //实现父类的抽象方法area( )，返回PI*radius*radius的值
            void printArea() {
                System.out.println("圆的面积为："+area());
            }
            //实现父类的抽象方法printArea( )，在屏幕上显示圆的面积
        }
        public class Main
        {  public static void main(String[] args)
        {  Rectangle s1=new Rectangle(1314,1);
            Circle s2=new Circle(2);

            s1.printArea();
            s2.printArea();

        }
        }
