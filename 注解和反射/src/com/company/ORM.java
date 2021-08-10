package com.company;

import java.lang.annotation.*;
import java.lang.reflect.Field;

//练习反射操作注解
public class ORM {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class aClass= Class.forName("com.company.Student2");
        //通过反射获取注解
        Annotation[] annotations=aClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("通过反射获取注解"+annotation);
        }
        //获取注解的value的值
        Tablewang tablewang=(Tablewang)aClass.getAnnotation(Tablewang.class);
        String value=tablewang.value();
        System.out.println("value-->"+value);
        //获取类指定的注解
        System.out.println("----------获得字段的值----------");
        Field f=aClass.getDeclaredField("name");
        Fieldwang annotation=f.getAnnotation(Fieldwang.class);
        System.out.println("columnName-->"+annotation.columnName());
        System.out.println("type-->"+annotation.type());
        System.out.println("length-->"+annotation.length());
    }
}
@Tablewang("db_student")
class Student2{
    @Fieldwang(columnName = "db_id", type = "int", length = 10)
    private int id;
    @Fieldwang(columnName = "db_age",type = "int",length =10)
    private int age;
    @Fieldwang(columnName = "db_name",type = "varchar",length =3)
    private String name;

    public Student2() {
    }

    public Student2(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
//类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Tablewang{
    String value();
}
//属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Fieldwang{
    String columnName();
    String type();
    int length();
}
