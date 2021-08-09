package com.company;

/*
匿名内部类：
        就是内部类的简化写法。
        前提:存在一个类或者接口
            这里的类可以是具体类也可以是抽象类
        格式:
            new 类名或者接口名(){
                重写方法;
                }
Inter i = new Inter() {   //多态
      public void show() {
             System. out . println ("show") ;
      }
      public void show2()
      System. out .println ("show2") ;
      }
};
i.show() ;
i。show2() ;
匿名内部类的本质是什么呢?
        是一个继承了该类或者实现了该接口的子类匿名对象
 */
/*
视频32
 */
interface Inter {
    void show();
    //public abstract
}
class Outer1 {
    //补齐代码
    public static Inter method() {
        //子类对象--子类匿名对象
        return new Inter() {
            public void show() {
                System.out.println("HelloWorld");
            }
        };
    }
}
class 匿名内部类 {
    public static void main(String[] args) {
        Outer1.method().show();
                        /*
                        1:0uter.method() 可以看出methed() 应该是outer中的一一个静态方法。
                        2 :outer.method().show() 可以看出methad()方法的返回值是个对象
                           又由于接口Inter中有一个show() 方法, 所以我认为method()方法的返回值类型是一个接口
                        */
    }
}

