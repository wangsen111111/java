package com.company;

//补齐代码
interface Inter {
    public abstract void show();
}

class Outer {
    //补齐代码
    public static Inter method() {
        //子类对象--子类匿名对象,实现啦该接口的子类匿名对象
        return new Inter() {
            public void show() {
                System.out.println("匿名内部类");
            }
        };
    }
}

public class Main {
    public static void main(String[] args) {
        Outer.method().show();
	/*
	分析：Outer.method().show();可以看出method（）应该是Outer中的一个静态方法
	      method（）方法的返回值是一个对象
	      又由于接口Inter中有一个show（）方法，所以method（）方法的返回值是一个接口
	 */
    }
}
