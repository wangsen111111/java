package com.company;

import java.util.Scanner;

public class String练习 {

    public static void main(String[] args) {
        /*
        test1:
              需求：把数组中的数据按照指定格式拼接成一个字符串
                    int【】 arr={1,2,3}；
                    输出： "[1,2,3]"
                    分析；1，定义一个字符串对象，只不过内容为空
                          2，先把字符串拼接一个[
                          3，遍历int数组，得到每一个元素
                          4，先判断元素是否是最后一个
                              是：就直接输出元素和“]”
                              不是：就拼接元素和逗号以及空格
                          5，输出拼接后的字符串
         */
        //字符串数组已存在
        int[] arr = {1, 2, 3};
        //定义一个字符串对象，只不过内容为空
        String s = "";
        //遍历int数组，得到每一个数组
        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            //先判断该元素是否为最后一个
            if (x == arr.length - 1) {
                //是的话就直接输出元素和“]”
                s += arr[x];
                s += "]";
            } else {
                //如果不是最后一个元素
                s += arr[x];
                s += ", ";
            }
        }
        //输出拼接后的字符串
        System.out.println(s);
        System.out.println("------------------------");
        //写一个功能实现结果
        String result = arrayToString(arr);
        System.out.println(result);
        System.out.println("----------------------------");
        /*
        第二题：字符串反转
                 举例：键盘录入“abc”   键盘输出“cba”
                 分析：1，键盘录入一个字符串
                       2，遍历字符串，得到每一个字符
                       3，用新字符串把每一个字符拼接起来
                           把字符串转为字符数组
                       4，输出新字符串
         */
        //键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        //定义一个新字符串
        String result1 = "";
        //把字符串转为字符数组
        char[] chs = line.toCharArray();
        //遍历字符串，得到每一个字符
        for (int x = chs.length - 1; x >= 0; x--) {
            result1 += chs[x];
        }
        //输出新字符串
        System.out.println(result1);
        System.out.println("---------------------");
        //用方法来实现
        String s1=myReverse(line);
        System.out.println("实现功能后的为："+s1);
        System.out.println("-----------------------------");
        /*
        第三题：统计大串中小串出现的次数
        举例：在字符串：javaabcdefghigkmiopqrstuvwsyzjava
                        java出现啦几次（2）
               1，定义一个统计变量初始值为0；
               2，先判断一次看java是否在大串中存在
                     先获取java在这个大串中第一次出现的索引
                          如果索引是-1  就说明不存在，返回统计变量
                          如果索引值不是-1，就说明存在，统计变量+1
                3，把刚才的索引+小串的长度作为起始位置截取传给大串，得到一个新的字符串，并把该字符串赋值给大串
                4，回到 【 2 】  即可
         */
        //定义大字符串和小字符串
        String maxString="javajavajavajava";
        String minString="java";
        //写功能实现
        int count=getCount(maxString,minString);
        System.out.println("小字符串在大字符串中出现的次数为："+count);


    }

    //改进版   这个方法用功能来实现
    /*
    功能：把数组中的数据按照指定格式拼接成一个字符串
    返回值类型  String
    参数类型    int[] arr
     */
    public static String arrayToString(int[] arr) {
        //字符串数组已存在
        int[] arr1 = {1, 2, 3, 4, 5};
        //定义一个字符串对象，只不过内容为空
        String s1 = "";
        //遍历int数组，得到每一个数组
        System.out.print("[");
        for (int x = 0; x < arr1.length; x++) {
            //先判断该元素是否为最后一个
            if (x == arr1.length - 1) {
                //是的话就直接输出元素和“]”
                s1 += arr1[x];
                s1 += "]";
            } else {
                //如果不是最后一个元素
                s1 += arr1[x];
                s1 += ", ";
            }
        }
        //输出拼接后的字符串
        return s1;
    }

    /*
    功能：反转
    返回值类型：String   参数类型：String
     */
    public static String myReverse(String s) {
        //键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        //定义一个新字符串
        String result1 = "";
        //把字符串转为字符数组
        char[] chs = line.toCharArray();
        //遍历字符串，得到每一个字符
        for (int x = chs.length - 1; x >= 0; x--) {
            result1 += chs[x];
        }
        //输出新字符串
        return result1;
    }
    /*
        第三题：统计大串中小串出现的次数
        举例：在字符串：javaabcdefghigkmiopqrstuvwsyzjava
                        java出现啦几次（2）
               1，定义一个统计变量初始值为0；
               2，先判断一次看java是否在大串中存在
                     先获取java在这个大串中第一次出现的索引
                          如果索引是-1  就说明不存在，返回统计变量
                          如果索引值不是-1，就说明存在，统计变量+1
                3，把刚才的索引+小串的长度作为起始位置截取传给大串，得到一个新的字符串，并把该字符串赋值给大串
                4，回到 【 2 】  即可
         */
    /*
    返回值类型：int   参数类型：两个字符串
    功能：统计大串中小串出现的次数
     */
    public static  int getCount(String maxString,String minString){
        //定义一个统计变量，初始化值为0
        int count=0;
        //先在大串中查找这个小串第一次出现的索引
        int index=maxString.indexOf(minString);
        //索引不是-1，说明小字符串存在，统计变量++
        while (index!=-1) {
            count++;
            //把刚才的索引+小串的长度作为开始位置截取上一次的大串，返回一个新的字符串，并把该字符串的值赋给大串
            int startInndex=index+minString.length();
            maxString=maxString.substring(startInndex);
            //继续查
            index=maxString.indexOf(minString);
        }
        return count;
    }
}
