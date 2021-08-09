/*
方法格式:
絛饰符 返回值类型 方法名(参数类型参数名1,参数类型参数名2...) {
方法体语魚;
return返回值;
}
 */
/*
方法求和
 */
package com.company;
class MyPlus
{
    public String plus(String a, String b)
    {
        String s;
        s =" a" +"b" ;
        return s;
    }

    public String plus(String a, String b, String c)
    {
        String s;
        s = plus("a","b") +"c";    //要求调用两个参数的plus()方法，得到a+b+c的和
        return s;
    }

    public String plus(String a, String b, String c,String d)
    {
        String s;
        s = plus("a", "b", "c") +"d" ; //要求调用三个参数的 plus()方法，得到a+b+c+d的和
        return s;
    }

}
class Main
{
    public static void main(String[ ] args)
    {
        MyPlus p = new MyPlus();
        System.out.println( p.plus("a", "b"));  //调用plus()方法求 1+2 的值并显示
        System.out.println(p.plus("a", "b", "c"));  //调用plus()方法求 1+2+3 的值并显示
        System.out.println(p.plus("a", "b", "c", "d"));//调用plus()方法求 1+2+3+4 的值并显示
    }
}


