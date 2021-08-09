package com.company;
import java.util.*;
        public class 求数组最大值
           {
               public static void main(String[ ] args)
             {  int i,max;
                int[]a=new int[5]; //定义一个整型数组a，含5个元素，并为之分配内存空间
               Scanner Shuru = new Scanner(System.in);
               System.out.println("请输入5个数字："); //提示从键盘输人5个整数，并将其存储到对应的数组元素中
               max=a[0];
            for(i=0;i<5;i++)
            {
                a[i]=Shuru.nextInt();
               if(a[i]>max) max=a[i];    //如果a[ i ]大于max，则把a[ i ]赋值给max
            }
            System.out.println("你说的数字是"+max);
        }
        }
