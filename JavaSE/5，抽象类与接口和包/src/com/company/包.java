package com.company;
/*
包：其实就是文件夹
作用：把相同的类放到不同的包中||对类进行分类管理
举例：
   老师：增删改除
   学生：增删改除
分包：方案1：按照功能分：
                   cn.itcast.add
                       AddStudent
                       AddTeacher
                   cn.itcast.delete
                   cn.itcast.update
                   cn.itcast.find
      方案2：按照模块分：
                    cn.itcast.teacher
                       AddTeacher
                       DeleteTeacher
                       updateTeacher
                       findTeacher
                     cn.itcast.student
包的定义
package 包名;
          多級包用.分开即可
注意事项:
        A:package语句必须是程序的第一条可执行的代码
        B:package语句在个java文件中只能有一个
        c:如果没package默认表示无包名
导包:
格式：import包名;
这种方式导入是到类的名称
同一包下的类可访问private以外的修饰符
protected权限是给子类用的
权限絛饰符:
        本类  同一个包下(子类和无关类)  不同包下(子类)  不同包下 (无关类)
private  Y
默认      Y         Y
protectedY         Y                  Y
public   Y         Y                  Y            Y
构造方法只提供访问权限
修饰符
权限修饰符: private，默认的，protected， public
状态絛饰符: static， final
抽象條饰符：abstract
类：
   权限絛饰符默认絛饰符：public
   状态絛饰符final
   抽象修饰符abstract
   用的最多的就是，public
成员变量:
   权限修饰符private，默认的，protected， public
   状态絛饰符:static， final
   用的最多的就是private
构造方法:
   权限修饰符: private，默认的，protected， public
   用的最多的就是: public
成员方法:
   权限修饰符：private，默认的，protected， public
   状态修饰符: static， final
   抽象修饰符：abstract.
   用的最多的就是public
除此以外的组合规则
   成员变量: public static final
   成员方法：pubic static
           public abstract
           public final









 */

public class 包 {
}
