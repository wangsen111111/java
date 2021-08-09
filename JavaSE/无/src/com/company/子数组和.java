package com.company;

public class 子数组和 {
    public static void main(String[] args){
        //定义一个数组
        int[] array={1,2,3,4,5,6};
        System.out.println(array1(array));

    }
        public static int array1(int[] array) {
            //如果数组的长度为0，返回0
            if (array.length == 0) {
                return 0;
            }
            //
            int max = Integer.MIN_VALUE;

            int temp = 0;
            //求子数组的最大和
            for (int i = 0; i < array.length; i++) {
                if (temp<= 0) {
                    temp=array[i];
                } else {
                    temp+=array[i];
                }
                if (temp > max) {
                    max = temp;
                }
            }
            return temp;
        }
    }
