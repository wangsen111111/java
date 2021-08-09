package com.company;

public class MyComparator implements Comparable<Student>{
   public int compare(Student s1,Student s2){
       //这里返回什么 ,其实应该根据我的排序规则来做
       // 按照年龄排序,主要条件
       int num = s1.getAge() - s2.getAge();
       //次要条件
       //年龄相同的时候 ,还得去看姓名是否也相同
       //如果年龄和姓名都相同, 才是同一个元素
       int num2 =num == 0 ? s1.getName().compareTo(s2.getName()) : num;
       return num2 ;
   }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
