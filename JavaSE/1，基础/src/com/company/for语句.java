package com.company;
/*
for(初始化语句：判断条件语句；控制条件语句){
循环体语句}
 */
/*
利用for语句统计水仙花的个数
水仙花数x：100-1000之内，满足的条件为：ge*ge*ge+shi*shi*shi+bai*bai*bai=x
如何从一个三位数得到每个位的数：
ge=x%10
shi=x/10%10
bai=x/10/10%10
因为要计数所以用count++

*/

public class for语句 {

    public static void main(String[] args) {
        //对count初始化
        int count = 0;
        for (int x = 100; x <= 1000; x++) {
            int ge = x % 10;
            int shi = x / 10 % 10;
            int bai = x / 10 / 10 % 10;
            if (x == ge * ge * ge + shi * shi * shi + bai * bai * bai) {
                count++;
            }
        }
        System.out.println("100-1000之内的水仙花数有" + count + "个");
        System.out.println("...........................");
        /*
        for循环知道次数，while循环适合不知道次数的
        已知珠穆朗玛峰的高度为8848m，一张纸的厚度为0.01m，请问叠多少次基本与珠峰相齐
        为方便珠峰高度为884800，一张纸为1
        因为要计数所以用coun++
         */
        System.out.println("----------------");
        int count1 = 0;
        int start = 1;
        while (start < 884800) {
            count1++;
            start *= 2;
            System.out.println("目前纸叠的厚度为" + start + "米");
        }
        System.out.println("输出执行" + count1 + "次后再不叠加");
    }
}


