package com.company;

import java.util.*;

/*
迭代器源码：
         public interface Inteator
 List集合特有的迭代器：ListIterator listIterator()//列表迭代器
            Listerator lit=list.listIterator();//子类对象
           （该迭代器继承自Iteration迭代器，所以可直接使用hasNext（）和 next（）方法）
 */
/*
        真正具体的实现类在真正的具体的子类中，以内部类的方式体现的
*/



/*
public interface Inteator{
            public abstract boolean hasNext();
            public abstract Object next();
}
 */
/*
iterator为Java中的迭代器对象，是能够对List这样的集合进行迭代遍历的底层依赖。
  而iterable接口里定义了返回iterator的方法，相当于对iterator的封装，
  同时实现了iterable接口的类可以支持for each循环。
 */
/*
public interface Iterable{
            Iterator iterator();
}
public interface Collection extends Iterable{

}
public interface List extends Collection{

}

    /具体类，真正具体的实现类在真正的具体的子类中，以内部类的方式体现的

public class ArrayList implements List{
    public Iterator iterator(){
        return new Itr();
    }
    private class Itr implements Iterator{
        public boolean hasNext(){
            return cursor!=size;
        }
        public abstract Object next(){
            checkForComodification();
            int i=cursor;
            if(i>=size)throw new NoSuchElementException();
            Object[] elementData=ArrayList.this.elementData;
            if(i>=elementData.length)
                throw new ConcurrentModificationException();
            cursor=i+1;
            return (E)elementData[lastRet=i];
            }
    }
}
//实现：
      1.创建集合对象
      Collection c=new ArrayList（）；
      2，创建元素对象
      3，把元素添加到集合
         c.add("");
         c.add("");
         c.add("");
      4，遍历集合
 a:通过集合对象获取迭代器对象
      Iterator it=c.iterator();//new Itr();
 b:通过迭代对象的hasNext（）方法判断是否有元素
      while(it.hasNext()){
 C;通过迭代器对象的next（）方法获取元素并移动到下一个位置
      String s=(String)it.next();
      System.out.println(s);
      }
*/
/*
一个完整集合类的遍历
 */
public class Iterator接口迭代器的使用和原理 {
    public static void main(String[] args) {
        //1.创建集合对象Collection c=new ArrayList（）；
        Collection c=new ArrayList();
        //2，创建元素对象
        Student s1=new Student("王",18);
        Student s2=new Student("姚",19);
        Student s3=new Student("成德善",20);
        Student s4=new Student();
        s4.setName("李知恩");
        s4.setAge(18);
        /*
        3，把元素添加到集合
         c.add("");
         c.add("");
         c.add("");
         */
        c.add(s1);
        c.add(s2);
        c.add(s3);
        c.add(s4);
        c.add(new Student("阿泽",18));
        /*
          4，遍历集合
 a:通过集合对象获取迭代器对象
      Iterator it=c.iterator();//new Itr();
 b:通过迭代对象的hasNext（）方法判断是否有元素
      while(it.hasNext()){
 C;通过迭代器对象的next（）方法获取元素并移动到下一个位置
      String s=(String)it.next();
      System.out.println(s);
      }
         */
        Iterator it=c.iterator();//new Itr();
        while(it.hasNext()) {
            Student s = (Student) it.next();
            System.out.println(s);
        }
    }
}
