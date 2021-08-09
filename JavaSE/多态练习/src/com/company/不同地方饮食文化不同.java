package com.company;
class Person {
    public void eat() {
        System.out.println("吃饭");
    }
}
    class southPerson extends Person{
        public void eat(){
            System.out.println("吃米饭");
        }
        public void jingShang(){
            System.out.println("经商");
        }
    }
    class northPerson extends Person {
        public void eat() {
            System.out.println("吃面");
        }

        public void xueXi() {
            System.out.println("学习");
        }
    }
//测试
public class 不同地方饮食文化不同 {
    public static void main(String[] args){
        //定义为南方人
        Person p=new southPerson();
        p.eat();
        System.out.println("------------");
        //还原成南方人
        southPerson sp=(southPerson)p;
        sp.eat();
        sp.jingShang();
        System.out.println("-------------");
        //定义为北方人
        p=new northPerson();
        p.eat();
        System.out.println("------------");
        //还原成北方人
        northPerson np=(northPerson)p;
        np.eat();
        np.xueXi();
    }
}
