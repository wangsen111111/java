package com.company;
import java.util.Comparator;
import java.util.TreeSet;

/*
TreeSet集合保证元素排序和唯一性的原理:
              唯一性:是根据比较的返回是否是0来决定。
              排序:
                  A:自然排序(元索具备比较性)
                    让元素所属的类实现自然排序接口Comparable
                  B:比较器排序(集合具备比较性)
                    让集合的构造方法接收一一个比较器接口的子类对象Comparator
/

TreeSet :能够对元索按照某种规则进行排序。
排序有两种方式:
           A:自然排序
           B:比较器排序
TreeSet集合的特点:排序和唯一
通过观察TreeSet的add（）方法，我们知道最终要看TreeMap的put()方法，
真正的比较是依赖于元素的compareTo ()方法，而这个方法是定义在Comparable里面的。
所以，你要想重写该方法，就必须实现Comparable接口。这个接口表示的就是自然排序。
I

 */
public class TreeSet1 {
    public static void main(String[] args) {
        //创建集合对象
        //TreeSet<Student> ts = new TreeSet<Student>();
        //TreeSey<Student> ts=new Treeset<Student>(new MyComparator());
        //如果一个方法的参数是接口,那么真正要的是接口的实现类的对象
        //而匿名内部类就可以实现这个东西
        TreeSet<Student> ts=new TreeSet<Student>(new Comparator<Student>(){

            @Override
            public int compare(Student s1, Student s2) {
                    //这里返回什么 ,其实应该根据我的排序规则来做
                    // 按照年龄排序,主要条件
                    int num = s1.getAge() - s2.getAge();
                    //次要条件
                    //年龄相同的时候 ,还得去看姓名是否也相同
                    //如果年龄和姓名都相同, 才是同一个元素
                    int num2 =num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                    return num2 ;
                }
            }
        );
        //创建元素
        Student s1=new Student("lingqingxia",18);
        Student s2=new Student("lingqing",19);
        Student s3=new Student("lingqingxiade",20);
        Student s4=new Student("lingqingxiadede",21);
        Student s5=new Student("lingqingxiade",22);
        //添加元素
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        //遍历
        for(Student s:ts){
            System.out.println(s.getName()+"---------"+s.getAge());
        }
    }
}

