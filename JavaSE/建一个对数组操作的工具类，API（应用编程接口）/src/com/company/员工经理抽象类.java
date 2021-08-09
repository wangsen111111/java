package com.company;

/*
  假如我们在开发一个系统时需要对员工类进行设计，员工包含三个属性：姓名 工号以及工资
  经理也是员工，除啦含有员工的属性外，另外还有一个奖金属性
  请使用继承的思想设计出员工类和经理类，要求类中提供必要的方法进行属性访问
分析：普通员工类：
               成员变量：姓名  工号以及工资
               成员方法：工作
        经理类：
               成员变量：姓名 工号以及工资，奖金属性
         实现：员工类 ： 普通员工类   经理类
 */
abstract class Employee {
    private String name;
    private String id;
    private int salary;

    public Employee() {
    }

    public Employee(String name, String id, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //工作
    public abstract void work();
}
//普通员工类
class Programmer extends Employee{
public Programmer() {
}
public Programmer(String name,String id,int salary){
    super(name,id,salary);
}
public void work(){
    System.out.println("打代码");
}
}
//经理类
class Manager extends Employee{
    //奖金
    private int money;
    public Manager() {
    }
    public Manager(String name, String id, int salary,int money){
        super(name,id,salary);this.money=money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void work(){
        System.out.println("跟客户谈需求");
    }
}
//测试类
public class 员工经理抽象类 {
    public static void main(String[] args){
        Employee emp=new Programmer();
        emp.setId("007");
        emp.setName("周星驰");
        emp.setSalary(88888888);
        System.out.println(emp.getName()+"-------"+emp.getId()+"------"+emp.getSalary());
        emp.work();
        System.out.println("-----------------------------------");
        emp=new Programmer("周星星","007",88888888);
        System.out.println(emp.getName()+"-------"+emp.getId()+"------"+emp.getSalary());
        emp.work();
        /*
        emp=new Manager();
        由于子类经理类有自己特有的内容，奖金
        public void setMoney(int money) {this.money = money;}
          所以必须用子类来测试具有奖金属性的经理类
         */
        //测试经理类
        Manager m=new Manager("至尊宝","007",88888888,520);
        System.out.println(m.getName()+"-------"+m.getId()+"------"+m.getSalary()+"--------"+m.getMoney());
        m.work();

    }


}
