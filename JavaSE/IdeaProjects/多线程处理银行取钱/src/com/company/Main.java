package com.company;
        class Main//主方法
        {
            public static void main(String[] args)
            {
                Customer c = new Customer();
                new Thread(c::run).start();
//                new Thread(()->{
//                    System.out.println("asdas");
//                }).start();
            Customer c1=new Customer();
            Customer c2=new Customer();//Customer对象就是线程对象，创建对象c1和c2，相当于两个线程
            c1.start();
            c2.start();//启动两个线程
            }
        }

        class Mbank//Mbank类
            {
            private static int sum=2000;    //初始存款额2000，共享变量应设为private，否则其他方法可以直接操作共享变量，synchronized的保护会失去意义
            public synchronized static void take(int k)   //同步方法，take方法，只有当一个线程执行完它所调用的synchronized块或方法时，才会释放互斥锁
                {  int temp=sum;
                    temp-=k;       //temp中保存的是每个线程处理的值
                     try
                       { Thread.sleep((int)(1000*Math.random()));//随机休息一个随机数，Thead线程类 .方法名，sleep方法为当前执行线程指定睡眠时间
                       }
                     catch(InterruptedException e)
                       {  System.out.println(e.toString());   }//try catch处理异常
                sum=temp;
                System.out.println("sum="+sum+" "+Thread.currentThread().getName());
                 }
            }
        class Customer extends Thread//Customer类继承Thread类
        {     public void run()//run方法执行线程体
               {    for(int i=1;i<=4;i++)
                    Mbank.take(100);//循环体每次取款100，取四次，类名.方法名
               }
        }

