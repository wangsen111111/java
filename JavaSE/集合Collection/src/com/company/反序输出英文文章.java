package com.company;
/*
利用List
 */

import java.util.*;

public class 反序输出英文文章 {
    public static void main(String[] args) {

        //创建集合对象
        LinkedList link = new LinkedList();
        //把一组字符串分割，并插入到集合中
        String str = "admin,guest,test,buyer";

        //添加元素
        link.addAll(Arrays.asList(str.split(",")));
        //遍历
        //List集合特有的迭代器：ListIterator listIterator()//列表迭代器
        ListIterator lit=link.listIterator();//子类对象
        while(lit.hasNext()){
            String s=(String)lit.next();
            System.out.println(s);
        }
        /*
        List特有功能：Object previous()获取上一个元素、、倒着遍历
                      boolean hasPrevious()判断是否有元素
               ListIteration可实现逆向遍历，但必须先正向遍历（一般不适用）
         */
        System.out.println("/////////////////////");
        while (lit.hasPrevious()){
            String s=(String)lit.previous();
            System.out.println(s);
        }
    }
}
