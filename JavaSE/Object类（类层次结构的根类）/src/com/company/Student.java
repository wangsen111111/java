package com.company;

public class Student extends Object {
    //标准学生类
    private String name = "薛蒲叶";
    private int age = 18;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    @Override
    /*
public boolean equals(Objects obj)
比较的是地址值是否相同

 */
    public boolean equals(Object obj) {
        System.out.println("这里比较的是name和age：");
        /*
        但是name是String类型的，而String是引用类型的，所以，这里不用==比较而是用equals（）比较
        String的equals（）方法是来自Object类的，比较的是内容是否相同
        this--a1，obj--s2

         */
        //我们使用的是学生类的特有成员变量，所以要向下转型
        if (this == obj) {
            return true;
        }//如果是同一个对象就不需要向下转型，为提高效率
        //地址值相同
        //程序的健壮性：obj是不是学生的一个对象，如果是，再作向下转型，如果不是
        //判断对象是否是某个类的对象：对象名 intanceof 类名
        if (!(obj instanceof Student)) {
            return false;
        }

        Student s = (Student) obj;//s--obj1--s2
        if (this.name.equals(s.name) && this.age == s.age) {
            return true;
        } else {
            return false;
        }

    }


    public static void main(String[] args) {
        /*
        Object类的方法：
                public int hashCode();返回该对象的哈希码值
                注意：哈希值是根据哈希蒜放计算出来的值，这个值和地址有关，可理解为地址值

         */
        Student s1 = new Student();
        System.out.println(s1.hashCode());
        System.out.println("------------------------");
        Student s2 = new Student();
        System.out.println(s2.hashCode());
        System.out.println("-------------------------");
        //对象不同，地址值不同，得到的哈希码值不同
        Student s3 = s1;
        System.out.println(s3.hashCode());
        System.out.println("-------------------------");
         /*
         public final Class getClass();返回此Object运行时类
               Class类的方法：public String getName（）；以String的形式返回此Class对象的实体
          */
        Student s = new Student();
        Class c = s.getClass();
        String str = c.getName();
        System.out.println(str);
        System.out.println("---------------------------");
        //链式编程
        String str2 = s.getClass().getName();
        System.out.println(str2);
        System.out.println("----------------------------");
        Student s6 = new Student("朱茵", 18);
        Student s8 = new Student("周星星", 18);
        System.out.println(s6.equals(s8));


    }
}
