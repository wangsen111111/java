package com.company;
/*
Java中关键字continue、break和return的区别：

continue：跳出本次循环继续下一次循环

break：   跳出循环体，继续执行循环外的函数体（跳出单层循环）
          跳出多层循环：
                      格式：标签名：语句
return:   跳出整个函数体，函数体后面的部分不再执行
           return关键字不是为了跳转出循环体，更常用的功能是结束一个方法，也就是退出一个方法，跳转到上层调用的方法
 */

public class Main {

    public static void main(String[] args) {
        /*
        continue继续（continue：跳出本次循环继续下一次循环）
         */
        for(int i=0;i<=10;i++){
            System.out.println(i);
            if(i==0){
                continue;
            }

            System.out.println(i);
        }
        /*
        break（ 跳出循环体，继续执行循环外的函数体）
         */
        System.out.println("-----------------");
        for(int i=0;i<=10;i++){
            System.out.println(i);
            if(i==1){
                break;
            }

            System.out.println(i);
        }
        System.out.println(" break（ 跳出循环体，继续执行循环外的函数体）");
        System.out.println(" 格式：标签名：语句");
        wc:for(int x=0;x<3;x++){
           nc: for(int y=0;y<4;y++){
                if(y==2){
                    break wc;
                }
                System.out.println("*");
            }
            System.out.println();
        }
        /*
        return（跳出整个函数体，函数体后面的部分不再执行）
         */
        System.out.println("-----------------");
        for(int i=0;i<=10;i++){
            System.out.println(i);
            if(i==1){
                return;
            }

            System.out.println(i);
        }
        System.out.println("return（跳出整个函数体，函数体后面的部分不再执行）");
    }
}
