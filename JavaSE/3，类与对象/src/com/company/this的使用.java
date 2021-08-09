package com.company;

class Cylinder {
    private double radius;
    private int height;
    private double pi = 3.14;
    String color;

    public Cylinder() {
        this(2.5, 5, "红色");//this 调用 public Cylinder(double r, int h, String str)
        System.out.println("即就是无参构造方法被调用了");
    }

    public Cylinder(double r, int h, String str) {
        System.out.println("有参构造方法被调用了");
        radius = r;
        height = h;
        color = str;
    }

    double area() {
        return pi * radius * radius;
    }

    double tiji() {
        return area() * height;
    }
}

public class this的使用 {
    public static void main(String[] args) {
        Cylinder tongdaoming = new Cylinder(); //创建啦一条通道，无参构造方法，调用public Cylinder()
        System.out.println("底面积=" + tongdaoming.area());
        System.out.println("体积=" + tongdaoming.tiji());
    }
}
