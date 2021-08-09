package com.company;
/*
public String toString();返回该对象的字符串表示
 */

public class Tostring方法 extends Student {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args){
        Student s=new Student();

        System.out.println(s.hashCode());
        System.out.println(s.getClass().getName());
        System.out.println("---------------------");
        System.out.println(s.toString());//无意义，重写该方法
        //to String方法等价于
        //this.getClass().getName()+'@'+Integerr.to HexString(this.hashCode())
        //                               类Inter.静态方法
        //public static String toHexstring(int i);把一个整数转换成一个16进制表示的字符串
        System.out.println("---------");
        System.out.println(s.getClass().getName()+'@'+Integer.toHexString(s.hashCode()));
        System.out.println("----------------------");
        //所有子类重写该方法，--》把该类的所有成员变量值组成返回即可
        //直接输出一个对象的名称，其实就是调用该对象的toString（）方法





    }
}
