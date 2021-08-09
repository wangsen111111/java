package com.company;
/*
while循环：
         初始化语句
         while(判断语句){
         循环体语句；
         控制条件语句；}
 */

/*题目：小芳的妈妈每天给她2.5元，她都会存起来，但是，每当这一天是存钱的第5天或者5的倍数的话，
她都会去花6元钱，
请问：经过多少天，小芳才可以存到100元钱
分析：小芳的妈妈每天给她2.5元
      int DayManey=2.5；
      每当这一天是存钱的第5天或者5的倍数的话，她都会去花6元钱，
      选择结构：   int dayCount=1   if（day%5==0）{sum=sum-6}
      经过多少天，小芳才可以存到100元钱
      对天计数 计数dayCount++，初始化dayCount=0
      用while语句判断（因为不知道具体执行多少次）while（sum<=100）{}
 */

public class while循环题 {
    //每天給2.5，当时存钱的第5天或者5的倍数的时候，就会去花6元
    public static void getDay() {
        int money = 0;
        int day = 0;
        while (money < 100) {
            day++;
            if (day % 5 == 0) {
                money -= 6;
            }
            money += 2.5;
        }
        System.out.println("徐文算的：第" + day + "天时money：" + money);
    }

    public static void main(String[] args) {
        int dayCount = 0;
        int sumManey = 0;//dayCount++一进去就变成第一天，所以dayCount不能赋初值为1
        while (sumManey < 100) {
            dayCount++;
            if (dayCount % 5 != 0) {
                sumManey += 2.5;
            } else {
                sumManey -= 6;
                sumManey += 2.5;
            }
        }
        System.out.println("小芳经过：" + dayCount + "天，才可存到100块");
        getDay();
    }


}
