package com.company;
/*
byte范围：-128~127
0  48
A  65
a  97
默认转换：byte,short,char-->int-->long-->float-->double

      long:8个字节
      float:4个字节
      A:它们的底层的存储结构不同
      B:float表示的数据范围比long的范围要大
        long：2^63-1
        float:3.4*10^38>2^63-1
指数有正有负，注意指数位采用移位存储，偏移量为127，假设指数为2，那么指数码表示为129的二进制形式，即10000001
 java语言中的字符char可以存储一个中文汉字，因为java语言中的字符占用两个字节
&逻辑与：有0则0
|逻辑或：有1则1
^逻辑异或：不同为true
！逻辑非
因为是位运算，所以我们必须把数据转算成二进制
     ~ 按位取反运算 -->反码:逐位取反,然后还需要通过得到补码---->原码
     例如：
     ~3(逐位取反)
       00000000        00000000    00000000    00000011
     ~ 11111111        11111111    11111111    11111100 (补码)

    补码--->反码---->原码
 */
/*
E 偏移127的幂，二进制阶码=(EEEEEEEE)-127。
float遵从的是IEEE R32.24 ,而double 遵从的是R64.53
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
