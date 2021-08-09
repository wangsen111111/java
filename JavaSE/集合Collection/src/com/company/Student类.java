package com.company;
/*
练习：用集合存储5个学生对象，并把学生对象进行遍历
分析：1，创建学生类
      2，创建集合对象
      3，创建学生对象
      4，把学生添加到集合
      5.把集合转成数组
      6.遍历数组
 */
/*
不要多次使用it.next()方法，因为每次使用都是访问一个对象
 */

import java.util.*;

public class Student类 {
    public static void main(String[] args) {
//2，创建学生对象
        Student s1 = new Student("王", 18);
        Student s2 = new Student("姚", 19);
        Student s3 = new Student("李", 20);
        //2，创建集合对象
        Collection c = new ArrayList();
        //4，把学生添加到集合
        c.add(s1);
        c.add(s2);
        c.add(s3);
        /*
       // 5.把集合转成数组
        //遍历   Object[] toArray()把集合转成数组，可以实现集合的遍历

         */
        Object[] obj=c.toArray();

        for(int i=0;i<obj.length;i++){
            // System.out.println(obj[i]);
            //Systrm.out.println(obj[i].length) Object没有length（）方法
            //我们要想使用字符串的方法，就必须把元素还原成字符串
            //向下转型
            Student s=(Student) obj[i];
            System.out.println(s.getName()+"------"+s.getAge());
        }
        /*
        遍历：集合专用的遍历方式：Iterator iterator()   、、Iterator 接口
         */
        Iterator it1=c.iterator();//这里返回的是子类对象，这里是多态
        while(it1.hasNext()){
            Student ss=(Student) it1.next();
            System.out.println(ss);
        }
        /*
        存储自定义对象并遍历
         */
        //创建集合对象
        System.out.println("--------------------------------");
        List list=new ArrayList();
        //创建集合对象
        Student ss1=new Student("德善",18);
        Student ss2=new Student("狗焕",18);
        Student ss3=new Student("阿泽",18);
        //把学生对象添加到集合中
        list.add(ss1);
        list.add(ss2);
        list.add(ss3);
        //遍历
        Iterator it=list.iterator();
        while (it.hasNext()){
            Student sss=(Student)it.next();
            System.out.println(sss);
        }
        System.out.println("*****************************");
        //普通for循环
        for(int i=0;i<list.size();i++){
            Student sss=(Student)list.get(i);
            System.out.println(sss.getName()+"----"+sss.getAge());
        }


    }
}
/*
如果一个类的元素要想能够进行自然排序，就必须实现自然排序接口
 */
//1，创建学生类
 class Student implements Comparable<Student>{
     private String Name;
     private String Chinese;
     private String Math;
     private String English;
     private String Sum;

    public void setChinese(String chinese) {
        Chinese = chinese;
    }

    public String getSum() {
        return Sum;
    }

    public void setSum(String sum) {
        Sum = sum;
    }

    public void setMath(String math) {
        Math = math;
    }

    public String getEnglish() {
        return English;
    }

    public void setEnglish(String english) {
        English = english;
    }

    private String name;
    private int age;

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    /*
    HashSet集合的add()方法的部分源码
     */
    /*
    问题：HashSet存储字符串，字符串的内容存储了一个，通过查看add（）方法的源码，我们知道这个方法底层依赖的是
      2个方法：hashCode（）和equals（）方法
 哈希值相当于它的逻辑值，而地址值相当于它的物理值
步骤：
     首先比较哈希值
     如果相同，继续走，比较地址值或者走equals（）
     如果不同，就直接添加到集合中
按照方法步骤来说：
     先看hashCode（）值是否相同
              相同：继续走equals（）方法
                    返回是true：说明元素重复，就不添加
                    返回是false，说明元素不重复，添加到集合
               不同：就直接把元素添加到集合
     */
    /*
    class HashMap implements Map{
    public V put （K key，V value）{
    //k=e=hello,word
    //看哈希表是否为空，如果为空，就开辟空间
    if(table==EMPTY_TABLE）{
    inflateTable（threshold）;
    }
    //判断对象是否为空
    if(key==null){
    return putForNullKey(value);
    int hash=hash(key);//和对象的hashCode()方法相关
    //在哈希表中查找hash值
    int i=indexFor(hash，table。length)；
    for(Entry<k,v> e=table[i];e!null;e=e.next){
    //这里的e其实是第一次的word
    Object k；
    if(e.hash==hash&&((k=e.key)==key||key.equals(k)){
    }//走这里其实没有添加元素}}
    modCount++;
    addEntry(hash.key,value,i);把元素添加
    return Null;}
     */

    public String getChinese() {
        return Chinese;
    }

    public String getMath() {
        return Math;
    }

    @Override//重写啦Object类的equals（）方法
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age &&
                name.equals(student.name);
    }

    @Override//重写啦Object()类的hashCode（）方法
    public int hashCode() {
        /*
        //return 0;
        //因为成员变量影响哈希值，所以我们把成员变量值相加即可
        return this.name.hashCode()+this.age
        s1:name.hashCode()=40,age=30
        s2:name.hashCode()=20,age=50
        由上可得，尽可能的区分，我们可以把它们乘以一些整数
        return this.name.hashCode()j+this.age*15;
         */
        return Objects.hash(name, age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student s) {
        //这里返回什么 ,其实应该根据我的排序规则来做
        // 按照年龄排序,主要条件
        int num = this.age - s.age;
        //次要条件
        //年龄相同的时候 ,还得去看姓名是否也相同
        //如果年龄和姓名都相同, 才是同一个元素
        int num2 =num == 0 ? this.name.compareTo(s.name) : num;
        return num2 ;

    }
}
