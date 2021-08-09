package com.company;

public interface A extends B{
    int a = 2;
    default void method(){
        System.out.println("asdsd");
    }
    //public abstract void method2();
    default void method2(){
        System.out.println("奥术大师大所");
    }

}
//静态代码块、局部代码块、构造方法
interface B{

    public static final int a=1;
    public abstract void method2();
}
class Demo implements A{

    public final void To(){
        System.out.println("ssadasd");
    }
    public static void main(String[] args) {


        B a = new Demo();
        a.method2();

//        a.To();

    }
}
class DemoParent {

}


