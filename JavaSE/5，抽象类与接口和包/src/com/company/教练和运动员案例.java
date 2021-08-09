
package com.company;

/*
教练和运动员案例：
      乒乓球运动员和篮球运动员
      乒乓球教练和篮球教练
      为了出国交流，跟乒乓球相关的人员都需要学习英语
   分析：有抽象类 接口 具体类
 */
//定义一个说英语的接口
interface SpeakEnglish {
    public abstract void speak();
}

//定义人的抽象类
abstract class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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

    //睡觉
    public void sleep() {
        System.out.println("人都要睡觉");
    }

    public abstract void eat();
}

//定义运动员抽象类
abstract class Player extends Person {
    public Player() {
    }

    public Player(String name, int age) {
        super(name, age);
    }

    //学习
    public abstract void study();
}

//定义教练抽象类
abstract class Coach extends Person {
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    //教
    public abstract void teach();
}

//定义乒乓球运动员具体类
class PingPangPlayer extends Player implements SpeakEnglish {
    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    //吃
    public void eat() {
        System.out.println("乒乓球运动员吃乒乓球");
    }

    //学习
    public void study() {
        System.out.println("乒乓球运动员学习如何打乒乓球");
    }

    //说英语
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }
}

//定义篮球运动员具体类
class BasketBallPlayer extends Player {
    public BasketBallPlayer() {
    }

    public BasketBallPlayer(String name, int age) {
        super(name, age);
    }

    //吃
    public void eat() {
        System.out.println("篮球运动员吃篮球");
    }

    //学习
    public void study() {
        System.out.println("篮球运动员学习如何打篮球");
    }
}

//定义乒乓球教练
class PingPangCoach extends Player implements SpeakEnglish {
    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    public void study() {

    }

    //吃
    public void eat() {
        System.out.println("乒乓球教练吃乒乓球");
    }

    //教
    public void teach() {
        System.out.println("乒乓球教练研究如何教运动员打乒乓球");
    }

    //说英语
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }
}

//定义篮球教练
class BasketBallCoach extends Player {
    public BasketBallCoach() {
    }

    public BasketBallCoach(String name, int age) {
        super(name, age);
    }

    public void study() {

    }

    //吃
    public void eat() {
        System.out.println("篮球教练吃篮球");
    }

    //教
    public void teach() {
        System.out.println("篮球教练研究如何教运动员打篮球球");
    }
}

//测试  具体的
public class 教练和运动员案例 {

    public static void main(String[] args) {
        //测试乒乓运动员
        PingPangPlayer play = new PingPangPlayer();
        play.setName("毛不易");
        play.setAge(18);
        System.out.println(play.getName() + "-------" + play.getAge());
        play.eat();
        play.sleep();
        play.study();
        play.speak();
        System.out.println("-------------------------------------");
        //测试篮球运动员
        BasketBallPlayer bp = new BasketBallPlayer();
        bp.setName("姚明");
        bp.setAge(18);
        System.out.println(bp.getName() + "------------" + bp.getAge());
        bp.eat();
        bp.study();
        bp.sleep();
    }
}
