package com.company;
//测试类什么时候会初始化
public class ClassInitialization {
    static{
        System.out.println("Main类被加载");
    }
    public static void main(String[] args) throws ClassNotFoundException {
        /**
         * 类的主动引用：会发生类的初始化
         * 1,主动引用
         * Son son=new Son();
         * 2,反射也会产生主动引用
         * Class.forName("com.company.Son");
         */
        //类的被动引用：不会发生类的初始化
        //不会产生类的引用的方法
        //1,子类引用父类的静态变量，不会导致子类初始化
        //System.out.println(Son.b);
        //2,通过数组定义类引用，不会触发此类的初始化
        //Son[] array=new Son[5];
        //3,引用常量不会触发此类的初始化，常量在链接阶段就存入调用类的常量池中了
        System.out.println(Son.M);
    }
}
class Father{
    static int b=2;
    static{
        System.out.println("父类被加载");
    }
}
class Son extends Father{
    static{
        System.out.println("子类被加载");
        m=300;
    }
    static int m=100;
    static final int M=1;
}
