package com.company;
/*
集合：
    面向对象语言--》对事物描述是通过对象体现的--》为了对多个对象进行操作--》
    必须得把这多个对象进行存储--》存储多个对象就不能是一个基本的变量，而是一个容器类型的变量--》
    集合--装对象（集合长度可变，并且可以存储不同类型的元素）

    容器类型的变量
                  {数组：（对象数组不能适应变化的需求，因为数组长度固定）
                   StringBufffer（线程安全的可变字符串）的结果是一个字符串
                   }
      元素的数据类型问题{
                        数组可以存储基本数据类型，也可以存储引用数据类型
                        集合只能存储引用类型
                        }
        特点：集合只用于存储对象，集合长度可变，集合可存储不同类型的对象

        集合存储多个元素--》多个元素不同需求--》不同的集合类--》
        多个集合类的数据结构（数据的存储方式）不同  结构同不同不重要，重要的是能存储东西，
        并能使用这些东西 功能，比如说 判断，获取等--》
                                           --》那么，多个集合类是有共性内容，把这些集合类
        类的共性内容不断地向上提取，最终就能形成集合的继承体系机构


       Collection{
                  List
                      {
                      ArrayList
                      Vector
                      LinkedLIst
                      }
                  Set
                     {
                      HashSet
                      TreeSet
                     }
                  }
  Collection:是集合的顶层接口，它的子体系有重复的，有唯一的，有有序的，有无序的
 Collection的功能：
  1，添加：{
           boolean add（Object obj）添加一个元素
           boolean addAll(Collection c)添加一个集合的所有元素
           }
  2. 删除：{
           void clear()移除所有元素
           boolean remove(Object o)移除一个元素
           boolean remoove All(Collection c)移除一个集合的元素（只要有一个元素被移除啦就返回true）
           }
 3.判断：
       {
       boolean containsAll(Collection c)判断集合中是否包含指定的集合元素（只有包含所有的元素才叫包含）
       boolean contains(Object o)判断集合中是否包含指定的元素
       boolean isEmpty（）判断集合是否为空
       }
4，长度功能：int size()元素的个数
             {
             针对length属性来获取数组的长度
             针对字符串提供啦length（）方法来获取字符串的长度
             针对泛型集合类提供啦size（）方法来获取元素的个数
             }
5，交集功能：boolean retainAll（Collection c）
           {
           假设有集合A 和B
           A对B做交集，最终的结果保存在A中，B不变
           返回值boolean表示的是A是否发生过改变，只要A改变就返回true
           }
6,把集合转换为数组  Object[] toArray()
7.获取功能：Iterator<E> iterator
         {


         }
 */


import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        //创建集合对象
        Collection c=new ArrayList();
        //添加一个元素
        c.add("hello");
        c.add("word");
        c.add("java");
        System.out.println(c);
        System.out.println(c.remove("word"));
        System.out.println(c);
    }
}
