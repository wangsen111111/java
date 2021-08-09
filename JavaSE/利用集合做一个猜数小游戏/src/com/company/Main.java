package com.company;
/*
需求：用户登录注册案例
按照如下操作，可以让我们更符合面向对象思想
  A:有哪些类呢？
  B：每个类有哪些东西呢？
  C:类与类之间的关系是什么呢？
  分析：
      A:有哪些类呢？
         用户类
         测试类
      B:每个类有哪些东西呢？
         用户类：
               成员变量：用户名，密码
               构造方法：无参构造
               成员方法：getXXx（）/setxxx（）

               假如用户类的内容比较多，将来维护起来就比较麻烦，为了更清晰的分类，我们把用户又分为
                   用户基本描述类：
                       成员边量：用户名，密码
                       构造方法：无参构造
                       成员方法：getxxx（）/setxxx（）
                    用户操作类：
                        登录，注册
          测试类：main方法
       C：类与类之间的关系是什么呢？
          在测试类中创建用户操作类和用户基本描述类的对象，并使用其功能
分包：A：按功能分
      B: 按模块分
      C: 先按模块分，再按功能划分
  {今天用按功能分}：
    用户基本描述类包：cn.itcast.pojo（pojo一个实体）
    用户操作接口： cn.itcast.dao（接口）
    用户操作类包： cn.itcast.dao.impl（impl接口实现类）
       今天是集合实现，以后还有IO GUI 数据库 实现
     用户测试类：cn.itcast.test


 */

import java.util.Scanner;

/**
 * 用户测试类
 */

public class Main {
    public static void main(String[] args) {
        //为了能够回来，加个while死循环
        while (true) {
            //欢迎界面，给出选择项
            System.out.println("---------------欢迎光临--------------");
            System.out.println("1登录");
            System.out.println("2注册");
            System.out.println("3退出");
            System.out.println("请输入你的选择：");
            //键盘录入选择，根据选择做不同的操作
            Scanner sc = new Scanner(System.in);
            //为了后面的录入信息的方便，所有的数据录入全用字符串接收
            String choiceString = sc.nextLine();
            //多态，switch语句的多个地方要使用，定义在外面
            User用户接口 ud = new UserImpl实现接口();
            //只有三个选择，所以用switch
            switch (choiceString) {
                case "1":
                    //登录界面，请输入用户名和密码
                    System.out.println("---------------------登录界面-------------------");
                    System.out.println("请输入用户名：");
                    String username = sc.nextLine();
                    System.out.println("请输入密码:");
                    String password = sc.nextLine();
                    //调用登录功能
                    boolean flag = ud.isLogin(username, password);
                    if (flag) {
                        //登录成功，玩一个猜数小游戏
                        System.out.println("登陆成功，可以开始玩游戏啦");
                        System.out.println("你玩吗？ y/n:");
                        while (true){
                        String resultString=sc.nextLine();
                        if(resultString.equalsIgnoreCase("y")) {
                            guessNumberGame.start();
                            System.out.println("你换玩吗？y/n:");
                        }else{
                            break;
                        }
                        }
                        System.out.println("谢谢使用本游戏，欢迎下次再来");
                        System.exit(0);//退出程序
                        //break;这里的break结束的是switch
                    } else {
                        System.out.println("用户名或者密码有误，登陆失败");
                    }

                    break;
                case "2":
                    //注册界面
                    System.out.println("---------------------注册界面-------------------");
                    System.out.println("请输入用户名：");
                    String newusername = sc.nextLine();
                    System.out.println("请输入密码:");
                    String newpassword = sc.nextLine();
                    //把用户名和密码封装到一个对象中
                    用户基本描述类 user = new 用户基本描述类();
                    user.setUsername(newusername);
                    user.setPassword(newpassword);
                    //调用注册功能
                    ud.regist(user);
                    System.out.println("注册成功");
                    break;//这里的break结束的是switch
                case "3":
                    // break;
                default:
                    System.out.println("谢谢使用，欢迎下次再来");
                    //强制退出
                    System.exit(0);
            }
        }

    }
}
