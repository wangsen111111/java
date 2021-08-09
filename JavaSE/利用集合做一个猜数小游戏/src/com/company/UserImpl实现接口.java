package com.company;

import java.util.ArrayList;

/**
 * 这是用户操作的具体实现类（集合版）
 * @auther 三木
 * @version V1.0
 * 两个问题：A:两个对象共享同一个成员变量，用静态
 *          B:循环里面如果有switch，并且在switch里面有break，那么结束的不是循环，而是switch
 */
public class UserImpl实现接口 implements User用户接口{
    //为了让多个方法能够使用同一个集合，就按集合定义为成员变量
    //为了让多个对象共享同一个成员变量，用static修饰
    private static ArrayList<用户基本描述类> array=new ArrayList<>();


    @Override
    public boolean isLogin(String username, String password) {
       //遍历集合，获取每一个用户，并判断该用户的用户名和密码是否和传递过来的匹配
       boolean flag=false;
       //增强for
        for(用户基本描述类 u:array){
            if(u.getUsername().equals(username)&&u.getPassword().equals(password)){
                flag=true;
                break;
            }
        }
        return flag;
    }

    @Override
    public void regist(用户基本描述类 user) {
        //把用户信息存储集合
        //ArrayList<User用户接口> array=new ArrayList<>();
        array.add(user);
    }
}
